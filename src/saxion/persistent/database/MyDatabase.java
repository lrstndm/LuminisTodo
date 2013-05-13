package saxion.persistent.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabase extends SQLiteOpenHelper{
	/**
	 * Variabelen die de database layout weergeven. Zie ook de opdrachtsomschrijving.
	 * De tabel zelf heet "notes" en kent de kolommen: "_id", "title" en "content".
	 */
	public static final String TABLE_NOTES = "notes";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_TITLE = "title";
	public static final String COLUMN_CONTENT = "content";
	
	/**
	 * Variabelen die de bestandsnaam van de SQLite database en het versienummer bewaren.
	 */
	private static final String DATABASE_FILENAME = "notes.db";	
	private static int DATABASE_VERSION = 1;
	
	/**
	 * Constructor to create SQLiteHelper. Do not change!
	 * @param context
	 */
	public MyDatabase(Context context) {
		super(context, DATABASE_FILENAME, null, DATABASE_VERSION);
	}
	
	/**
	 * Maak een nieuwe tabel aan met de kolommen met COLUMN_ID, COLUMN_TITLE en 
	 * COLUMN_CONTENT
	 */
	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL("create table "+  TABLE_NOTES + 
				"(" + COLUMN_ID + " integer primary key autoincrement, "
				+ COLUMN_TITLE + " text not null, "						
				+ COLUMN_CONTENT + " text not null);");					
	}

	/**
	 * Bij een upgrade: Gooi de oude tabel weg en maak een nieuwe aan.
	 */
	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
		database.execSQL("DROP TABLE IF EXISTS " + TABLE_NOTES);
		onCreate(database);
	}
}
