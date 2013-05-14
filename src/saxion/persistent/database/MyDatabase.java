package saxion.persistent.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabase extends SQLiteOpenHelper{
	/**
	 * Variabelen die de database layout weergeven.
	 */
	public static final String TABLE_TAAK = "Taak";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_GENRE_ID = "title";
	public static final String COLUMN_TITLE = "content";
	public static final String COLUMN_COMMENT = "comment";
	public static final String COLUMN_IS_DONE = "isDone";
	public static final String COLUMN_PARENT_ID = "parentId";
	public static final String COLUMN_CREATED = "created";
	public static final String COLUMN_END_DATE = "end_date";
	public static final String COLUMN_REMINDER = "reminder";
	public static final String COLUMN_REPEAT = "repeat";
	/**
	 * Variabelen die de bestandsnaam van de SQLite database en het versienummer bewaren.
	 */
	private static final String DATABASE_FILENAME = "taak.db";	
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
		database.execSQL("create table "+  TABLE_TAAK + 
				"(" + COLUMN_ID + " integer primary key autoincrement, "
				+ COLUMN_GENRE_ID + " integer, "						
				+ COLUMN_TITLE + " text not null, "
				+ COLUMN_COMMENT + " text, "	
				+ COLUMN_IS_DONE + " boolean not null, "	
				+ COLUMN_PARENT_ID + " integer not null, "	
				+ COLUMN_CREATED + " datetime not null, "	
				+ COLUMN_END_DATE + " datetime, "	
				+ COLUMN_REMINDER + " text, "	
				+ COLUMN_REPEAT + " text);");					
	}

	/**
	 * Bij een upgrade: Gooi de oude tabel weg en maak een nieuwe aan.
	 */
	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
		database.execSQL("DROP TABLE IF EXISTS " + TABLE_TAAK);
		onCreate(database);
	}
	
}
