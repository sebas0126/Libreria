package AccesoDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Sebas on 16/04/2016.
 */
public class LibreriaDAL extends SQLiteOpenHelper {

    private static final String DATABASE_NOMBRE = "DBLibreria";
    private static final int DATABASE_VERSION = 1;

    private LibreriaDAL(Context context){
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
