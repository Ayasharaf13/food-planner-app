package com.example.foodplanner.db;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.foodplanner.models.Day;
import com.example.foodplanner.models.RandomMeal;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FoodDAO_Impl implements FoodDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RandomMeal> __insertionAdapterOfRandomMeal;

  private final EntityInsertionAdapter<Day> __insertionAdapterOfDay;

  private final EntityDeletionOrUpdateAdapter<RandomMeal> __deletionAdapterOfRandomMeal;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRepeatedWeeks;

  public FoodDAO_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRandomMeal = new EntityInsertionAdapter<RandomMeal>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `Meals_table` (`idMeal`,`date`,`day_id`,`isPlanner`,`isSave`,`strMeal`,`strMealThumb`,`strYoutube`,`strInstructions`,`strCategory`,`strArea`,`strTags`,`strIngredient1`,`strIngredient2`,`strIngredient3`,`strIngredient4`,`strIngredient5`,`strIngredient6`,`strIngredient7`,`strIngredient8`,`strIngredient9`,`strIngredient10`,`strIngredient11`,`strIngredient12`,`strIngredient13`,`strIngredient14`,`strIngredient15`,`strIngredient16`,`strIngredient17`,`strIngredient18`,`strIngredient19`,`strIngredient20`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          final RandomMeal entity) {
        if (entity.idMeal == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.idMeal);
        }
        if (entity.date == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.date);
        }
        statement.bindLong(3, entity.id);
        final int _tmp = entity.isPlanner ? 1 : 0;
        statement.bindLong(4, _tmp);
        final int _tmp_1 = entity.isSave ? 1 : 0;
        statement.bindLong(5, _tmp_1);
        if (entity.strMeal == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.strMeal);
        }
        if (entity.strMealThumb == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.strMealThumb);
        }
        if (entity.strYoutube == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.strYoutube);
        }
        if (entity.strInstructions == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.strInstructions);
        }
        if (entity.strCategory == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.strCategory);
        }
        if (entity.strArea == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.strArea);
        }
        if (entity.strTags == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.strTags);
        }
        if (entity.strIngredient1 == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.strIngredient1);
        }
        if (entity.strIngredient2 == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.strIngredient2);
        }
        if (entity.strIngredient3 == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.strIngredient3);
        }
        if (entity.strIngredient4 == null) {
          statement.bindNull(16);
        } else {
          statement.bindString(16, entity.strIngredient4);
        }
        if (entity.strIngredient5 == null) {
          statement.bindNull(17);
        } else {
          statement.bindString(17, entity.strIngredient5);
        }
        if (entity.strIngredient6 == null) {
          statement.bindNull(18);
        } else {
          statement.bindString(18, entity.strIngredient6);
        }
        if (entity.strIngredient7 == null) {
          statement.bindNull(19);
        } else {
          statement.bindString(19, entity.strIngredient7);
        }
        if (entity.strIngredient8 == null) {
          statement.bindNull(20);
        } else {
          statement.bindString(20, entity.strIngredient8);
        }
        if (entity.strIngredient9 == null) {
          statement.bindNull(21);
        } else {
          statement.bindString(21, entity.strIngredient9);
        }
        if (entity.strIngredient10 == null) {
          statement.bindNull(22);
        } else {
          statement.bindString(22, entity.strIngredient10);
        }
        if (entity.strIngredient11 == null) {
          statement.bindNull(23);
        } else {
          statement.bindString(23, entity.strIngredient11);
        }
        if (entity.strIngredient12 == null) {
          statement.bindNull(24);
        } else {
          statement.bindString(24, entity.strIngredient12);
        }
        if (entity.strIngredient13 == null) {
          statement.bindNull(25);
        } else {
          statement.bindString(25, entity.strIngredient13);
        }
        if (entity.strIngredient14 == null) {
          statement.bindNull(26);
        } else {
          statement.bindString(26, entity.strIngredient14);
        }
        if (entity.strIngredient15 == null) {
          statement.bindNull(27);
        } else {
          statement.bindString(27, entity.strIngredient15);
        }
        if (entity.strIngredient16 == null) {
          statement.bindNull(28);
        } else {
          statement.bindString(28, entity.strIngredient16);
        }
        if (entity.strIngredient17 == null) {
          statement.bindNull(29);
        } else {
          statement.bindString(29, entity.strIngredient17);
        }
        if (entity.strIngredient18 == null) {
          statement.bindNull(30);
        } else {
          statement.bindString(30, entity.strIngredient18);
        }
        if (entity.strIngredient19 == null) {
          statement.bindNull(31);
        } else {
          statement.bindString(31, entity.strIngredient19);
        }
        if (entity.strIngredient20 == null) {
          statement.bindNull(32);
        } else {
          statement.bindString(32, entity.strIngredient20);
        }
      }
    };
    this.__insertionAdapterOfDay = new EntityInsertionAdapter<Day>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `day_table` (`day_id`,`dayName`) VALUES (nullif(?, 0),?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final Day entity) {
        statement.bindLong(1, entity.id);
        if (entity.dayName == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.dayName);
        }
      }
    };
    this.__deletionAdapterOfRandomMeal = new EntityDeletionOrUpdateAdapter<RandomMeal>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `Meals_table` WHERE `idMeal` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          final RandomMeal entity) {
        if (entity.idMeal == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.idMeal);
        }
      }
    };
    this.__preparedStmtOfDeleteRepeatedWeeks = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM DAY_TABLE WHERE day_id Not IN (SELECT MIN (day_id) FROM day_table GROUP BY dayName)";
        return _query;
      }
    };
  }

  @Override
  public void insertMeal(final List<RandomMeal> meal) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRandomMeal.insert(meal);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertDays(final List<Day> days) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDay.insert(days);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMeal(final List<RandomMeal> meal) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfRandomMeal.handleMultiple(meal);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteRepeatedWeeks() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRepeatedWeeks.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteRepeatedWeeks.release(_stmt);
    }
  }

  @Override
  public LiveData<List<RandomMeal>> getAllMealsSaved(final int id) {
    final String _sql = "SELECT * FROM Meals_table WHERE isSave = 1 AND day_id=? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[] {"Meals_table"}, false, new Callable<List<RandomMeal>>() {
      @Override
      @Nullable
      public List<RandomMeal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "idMeal");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "day_id");
          final int _cursorIndexOfIsPlanner = CursorUtil.getColumnIndexOrThrow(_cursor, "isPlanner");
          final int _cursorIndexOfIsSave = CursorUtil.getColumnIndexOrThrow(_cursor, "isSave");
          final int _cursorIndexOfStrMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeal");
          final int _cursorIndexOfStrMealThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strMealThumb");
          final int _cursorIndexOfStrYoutube = CursorUtil.getColumnIndexOrThrow(_cursor, "strYoutube");
          final int _cursorIndexOfStrInstructions = CursorUtil.getColumnIndexOrThrow(_cursor, "strInstructions");
          final int _cursorIndexOfStrCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "strCategory");
          final int _cursorIndexOfStrArea = CursorUtil.getColumnIndexOrThrow(_cursor, "strArea");
          final int _cursorIndexOfStrTags = CursorUtil.getColumnIndexOrThrow(_cursor, "strTags");
          final int _cursorIndexOfStrIngredient1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient1");
          final int _cursorIndexOfStrIngredient2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient2");
          final int _cursorIndexOfStrIngredient3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient3");
          final int _cursorIndexOfStrIngredient4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient4");
          final int _cursorIndexOfStrIngredient5 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient5");
          final int _cursorIndexOfStrIngredient6 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient6");
          final int _cursorIndexOfStrIngredient7 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient7");
          final int _cursorIndexOfStrIngredient8 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient8");
          final int _cursorIndexOfStrIngredient9 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient9");
          final int _cursorIndexOfStrIngredient10 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient10");
          final int _cursorIndexOfStrIngredient11 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient11");
          final int _cursorIndexOfStrIngredient12 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient12");
          final int _cursorIndexOfStrIngredient13 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient13");
          final int _cursorIndexOfStrIngredient14 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient14");
          final int _cursorIndexOfStrIngredient15 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient15");
          final int _cursorIndexOfStrIngredient16 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient16");
          final int _cursorIndexOfStrIngredient17 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient17");
          final int _cursorIndexOfStrIngredient18 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient18");
          final int _cursorIndexOfStrIngredient19 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient19");
          final int _cursorIndexOfStrIngredient20 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient20");
          final List<RandomMeal> _result = new ArrayList<RandomMeal>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final RandomMeal _item;
            _item = new RandomMeal();
            if (_cursor.isNull(_cursorIndexOfIdMeal)) {
              _item.idMeal = null;
            } else {
              _item.idMeal = _cursor.getString(_cursorIndexOfIdMeal);
            }
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _item.date = null;
            } else {
              _item.date = _cursor.getString(_cursorIndexOfDate);
            }
            _item.id = _cursor.getInt(_cursorIndexOfId);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPlanner);
            _item.isPlanner = _tmp != 0;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSave);
            _item.isSave = _tmp_1 != 0;
            if (_cursor.isNull(_cursorIndexOfStrMeal)) {
              _item.strMeal = null;
            } else {
              _item.strMeal = _cursor.getString(_cursorIndexOfStrMeal);
            }
            if (_cursor.isNull(_cursorIndexOfStrMealThumb)) {
              _item.strMealThumb = null;
            } else {
              _item.strMealThumb = _cursor.getString(_cursorIndexOfStrMealThumb);
            }
            if (_cursor.isNull(_cursorIndexOfStrYoutube)) {
              _item.strYoutube = null;
            } else {
              _item.strYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
            }
            if (_cursor.isNull(_cursorIndexOfStrInstructions)) {
              _item.strInstructions = null;
            } else {
              _item.strInstructions = _cursor.getString(_cursorIndexOfStrInstructions);
            }
            if (_cursor.isNull(_cursorIndexOfStrCategory)) {
              _item.strCategory = null;
            } else {
              _item.strCategory = _cursor.getString(_cursorIndexOfStrCategory);
            }
            if (_cursor.isNull(_cursorIndexOfStrArea)) {
              _item.strArea = null;
            } else {
              _item.strArea = _cursor.getString(_cursorIndexOfStrArea);
            }
            if (_cursor.isNull(_cursorIndexOfStrTags)) {
              _item.strTags = null;
            } else {
              _item.strTags = _cursor.getString(_cursorIndexOfStrTags);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient1)) {
              _item.strIngredient1 = null;
            } else {
              _item.strIngredient1 = _cursor.getString(_cursorIndexOfStrIngredient1);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient2)) {
              _item.strIngredient2 = null;
            } else {
              _item.strIngredient2 = _cursor.getString(_cursorIndexOfStrIngredient2);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient3)) {
              _item.strIngredient3 = null;
            } else {
              _item.strIngredient3 = _cursor.getString(_cursorIndexOfStrIngredient3);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient4)) {
              _item.strIngredient4 = null;
            } else {
              _item.strIngredient4 = _cursor.getString(_cursorIndexOfStrIngredient4);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient5)) {
              _item.strIngredient5 = null;
            } else {
              _item.strIngredient5 = _cursor.getString(_cursorIndexOfStrIngredient5);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient6)) {
              _item.strIngredient6 = null;
            } else {
              _item.strIngredient6 = _cursor.getString(_cursorIndexOfStrIngredient6);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient7)) {
              _item.strIngredient7 = null;
            } else {
              _item.strIngredient7 = _cursor.getString(_cursorIndexOfStrIngredient7);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient8)) {
              _item.strIngredient8 = null;
            } else {
              _item.strIngredient8 = _cursor.getString(_cursorIndexOfStrIngredient8);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient9)) {
              _item.strIngredient9 = null;
            } else {
              _item.strIngredient9 = _cursor.getString(_cursorIndexOfStrIngredient9);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient10)) {
              _item.strIngredient10 = null;
            } else {
              _item.strIngredient10 = _cursor.getString(_cursorIndexOfStrIngredient10);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient11)) {
              _item.strIngredient11 = null;
            } else {
              _item.strIngredient11 = _cursor.getString(_cursorIndexOfStrIngredient11);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient12)) {
              _item.strIngredient12 = null;
            } else {
              _item.strIngredient12 = _cursor.getString(_cursorIndexOfStrIngredient12);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient13)) {
              _item.strIngredient13 = null;
            } else {
              _item.strIngredient13 = _cursor.getString(_cursorIndexOfStrIngredient13);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient14)) {
              _item.strIngredient14 = null;
            } else {
              _item.strIngredient14 = _cursor.getString(_cursorIndexOfStrIngredient14);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient15)) {
              _item.strIngredient15 = null;
            } else {
              _item.strIngredient15 = _cursor.getString(_cursorIndexOfStrIngredient15);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient16)) {
              _item.strIngredient16 = null;
            } else {
              _item.strIngredient16 = _cursor.getString(_cursorIndexOfStrIngredient16);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient17)) {
              _item.strIngredient17 = null;
            } else {
              _item.strIngredient17 = _cursor.getString(_cursorIndexOfStrIngredient17);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient18)) {
              _item.strIngredient18 = null;
            } else {
              _item.strIngredient18 = _cursor.getString(_cursorIndexOfStrIngredient18);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient19)) {
              _item.strIngredient19 = null;
            } else {
              _item.strIngredient19 = _cursor.getString(_cursorIndexOfStrIngredient19);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient20)) {
              _item.strIngredient20 = null;
            } else {
              _item.strIngredient20 = _cursor.getString(_cursorIndexOfStrIngredient20);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<RandomMeal>> getAllMealsSavedById(final String id) {
    final String _sql = "SELECT * FROM Meals_table WHERE idMeal=? AND isSave =1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return __db.getInvalidationTracker().createLiveData(new String[] {"Meals_table"}, false, new Callable<List<RandomMeal>>() {
      @Override
      @Nullable
      public List<RandomMeal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "idMeal");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "day_id");
          final int _cursorIndexOfIsPlanner = CursorUtil.getColumnIndexOrThrow(_cursor, "isPlanner");
          final int _cursorIndexOfIsSave = CursorUtil.getColumnIndexOrThrow(_cursor, "isSave");
          final int _cursorIndexOfStrMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeal");
          final int _cursorIndexOfStrMealThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strMealThumb");
          final int _cursorIndexOfStrYoutube = CursorUtil.getColumnIndexOrThrow(_cursor, "strYoutube");
          final int _cursorIndexOfStrInstructions = CursorUtil.getColumnIndexOrThrow(_cursor, "strInstructions");
          final int _cursorIndexOfStrCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "strCategory");
          final int _cursorIndexOfStrArea = CursorUtil.getColumnIndexOrThrow(_cursor, "strArea");
          final int _cursorIndexOfStrTags = CursorUtil.getColumnIndexOrThrow(_cursor, "strTags");
          final int _cursorIndexOfStrIngredient1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient1");
          final int _cursorIndexOfStrIngredient2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient2");
          final int _cursorIndexOfStrIngredient3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient3");
          final int _cursorIndexOfStrIngredient4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient4");
          final int _cursorIndexOfStrIngredient5 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient5");
          final int _cursorIndexOfStrIngredient6 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient6");
          final int _cursorIndexOfStrIngredient7 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient7");
          final int _cursorIndexOfStrIngredient8 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient8");
          final int _cursorIndexOfStrIngredient9 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient9");
          final int _cursorIndexOfStrIngredient10 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient10");
          final int _cursorIndexOfStrIngredient11 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient11");
          final int _cursorIndexOfStrIngredient12 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient12");
          final int _cursorIndexOfStrIngredient13 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient13");
          final int _cursorIndexOfStrIngredient14 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient14");
          final int _cursorIndexOfStrIngredient15 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient15");
          final int _cursorIndexOfStrIngredient16 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient16");
          final int _cursorIndexOfStrIngredient17 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient17");
          final int _cursorIndexOfStrIngredient18 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient18");
          final int _cursorIndexOfStrIngredient19 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient19");
          final int _cursorIndexOfStrIngredient20 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient20");
          final List<RandomMeal> _result = new ArrayList<RandomMeal>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final RandomMeal _item;
            _item = new RandomMeal();
            if (_cursor.isNull(_cursorIndexOfIdMeal)) {
              _item.idMeal = null;
            } else {
              _item.idMeal = _cursor.getString(_cursorIndexOfIdMeal);
            }
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _item.date = null;
            } else {
              _item.date = _cursor.getString(_cursorIndexOfDate);
            }
            _item.id = _cursor.getInt(_cursorIndexOfId);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPlanner);
            _item.isPlanner = _tmp != 0;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSave);
            _item.isSave = _tmp_1 != 0;
            if (_cursor.isNull(_cursorIndexOfStrMeal)) {
              _item.strMeal = null;
            } else {
              _item.strMeal = _cursor.getString(_cursorIndexOfStrMeal);
            }
            if (_cursor.isNull(_cursorIndexOfStrMealThumb)) {
              _item.strMealThumb = null;
            } else {
              _item.strMealThumb = _cursor.getString(_cursorIndexOfStrMealThumb);
            }
            if (_cursor.isNull(_cursorIndexOfStrYoutube)) {
              _item.strYoutube = null;
            } else {
              _item.strYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
            }
            if (_cursor.isNull(_cursorIndexOfStrInstructions)) {
              _item.strInstructions = null;
            } else {
              _item.strInstructions = _cursor.getString(_cursorIndexOfStrInstructions);
            }
            if (_cursor.isNull(_cursorIndexOfStrCategory)) {
              _item.strCategory = null;
            } else {
              _item.strCategory = _cursor.getString(_cursorIndexOfStrCategory);
            }
            if (_cursor.isNull(_cursorIndexOfStrArea)) {
              _item.strArea = null;
            } else {
              _item.strArea = _cursor.getString(_cursorIndexOfStrArea);
            }
            if (_cursor.isNull(_cursorIndexOfStrTags)) {
              _item.strTags = null;
            } else {
              _item.strTags = _cursor.getString(_cursorIndexOfStrTags);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient1)) {
              _item.strIngredient1 = null;
            } else {
              _item.strIngredient1 = _cursor.getString(_cursorIndexOfStrIngredient1);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient2)) {
              _item.strIngredient2 = null;
            } else {
              _item.strIngredient2 = _cursor.getString(_cursorIndexOfStrIngredient2);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient3)) {
              _item.strIngredient3 = null;
            } else {
              _item.strIngredient3 = _cursor.getString(_cursorIndexOfStrIngredient3);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient4)) {
              _item.strIngredient4 = null;
            } else {
              _item.strIngredient4 = _cursor.getString(_cursorIndexOfStrIngredient4);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient5)) {
              _item.strIngredient5 = null;
            } else {
              _item.strIngredient5 = _cursor.getString(_cursorIndexOfStrIngredient5);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient6)) {
              _item.strIngredient6 = null;
            } else {
              _item.strIngredient6 = _cursor.getString(_cursorIndexOfStrIngredient6);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient7)) {
              _item.strIngredient7 = null;
            } else {
              _item.strIngredient7 = _cursor.getString(_cursorIndexOfStrIngredient7);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient8)) {
              _item.strIngredient8 = null;
            } else {
              _item.strIngredient8 = _cursor.getString(_cursorIndexOfStrIngredient8);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient9)) {
              _item.strIngredient9 = null;
            } else {
              _item.strIngredient9 = _cursor.getString(_cursorIndexOfStrIngredient9);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient10)) {
              _item.strIngredient10 = null;
            } else {
              _item.strIngredient10 = _cursor.getString(_cursorIndexOfStrIngredient10);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient11)) {
              _item.strIngredient11 = null;
            } else {
              _item.strIngredient11 = _cursor.getString(_cursorIndexOfStrIngredient11);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient12)) {
              _item.strIngredient12 = null;
            } else {
              _item.strIngredient12 = _cursor.getString(_cursorIndexOfStrIngredient12);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient13)) {
              _item.strIngredient13 = null;
            } else {
              _item.strIngredient13 = _cursor.getString(_cursorIndexOfStrIngredient13);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient14)) {
              _item.strIngredient14 = null;
            } else {
              _item.strIngredient14 = _cursor.getString(_cursorIndexOfStrIngredient14);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient15)) {
              _item.strIngredient15 = null;
            } else {
              _item.strIngredient15 = _cursor.getString(_cursorIndexOfStrIngredient15);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient16)) {
              _item.strIngredient16 = null;
            } else {
              _item.strIngredient16 = _cursor.getString(_cursorIndexOfStrIngredient16);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient17)) {
              _item.strIngredient17 = null;
            } else {
              _item.strIngredient17 = _cursor.getString(_cursorIndexOfStrIngredient17);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient18)) {
              _item.strIngredient18 = null;
            } else {
              _item.strIngredient18 = _cursor.getString(_cursorIndexOfStrIngredient18);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient19)) {
              _item.strIngredient19 = null;
            } else {
              _item.strIngredient19 = _cursor.getString(_cursorIndexOfStrIngredient19);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient20)) {
              _item.strIngredient20 = null;
            } else {
              _item.strIngredient20 = _cursor.getString(_cursorIndexOfStrIngredient20);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<RandomMeal>> getAllMealsSavedPlanner() {
    final String _sql = "SELECT * FROM Meals_table WHERE isPlanner =1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"Meals_table"}, false, new Callable<List<RandomMeal>>() {
      @Override
      @Nullable
      public List<RandomMeal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "idMeal");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "day_id");
          final int _cursorIndexOfIsPlanner = CursorUtil.getColumnIndexOrThrow(_cursor, "isPlanner");
          final int _cursorIndexOfIsSave = CursorUtil.getColumnIndexOrThrow(_cursor, "isSave");
          final int _cursorIndexOfStrMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeal");
          final int _cursorIndexOfStrMealThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strMealThumb");
          final int _cursorIndexOfStrYoutube = CursorUtil.getColumnIndexOrThrow(_cursor, "strYoutube");
          final int _cursorIndexOfStrInstructions = CursorUtil.getColumnIndexOrThrow(_cursor, "strInstructions");
          final int _cursorIndexOfStrCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "strCategory");
          final int _cursorIndexOfStrArea = CursorUtil.getColumnIndexOrThrow(_cursor, "strArea");
          final int _cursorIndexOfStrTags = CursorUtil.getColumnIndexOrThrow(_cursor, "strTags");
          final int _cursorIndexOfStrIngredient1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient1");
          final int _cursorIndexOfStrIngredient2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient2");
          final int _cursorIndexOfStrIngredient3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient3");
          final int _cursorIndexOfStrIngredient4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient4");
          final int _cursorIndexOfStrIngredient5 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient5");
          final int _cursorIndexOfStrIngredient6 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient6");
          final int _cursorIndexOfStrIngredient7 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient7");
          final int _cursorIndexOfStrIngredient8 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient8");
          final int _cursorIndexOfStrIngredient9 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient9");
          final int _cursorIndexOfStrIngredient10 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient10");
          final int _cursorIndexOfStrIngredient11 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient11");
          final int _cursorIndexOfStrIngredient12 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient12");
          final int _cursorIndexOfStrIngredient13 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient13");
          final int _cursorIndexOfStrIngredient14 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient14");
          final int _cursorIndexOfStrIngredient15 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient15");
          final int _cursorIndexOfStrIngredient16 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient16");
          final int _cursorIndexOfStrIngredient17 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient17");
          final int _cursorIndexOfStrIngredient18 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient18");
          final int _cursorIndexOfStrIngredient19 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient19");
          final int _cursorIndexOfStrIngredient20 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient20");
          final List<RandomMeal> _result = new ArrayList<RandomMeal>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final RandomMeal _item;
            _item = new RandomMeal();
            if (_cursor.isNull(_cursorIndexOfIdMeal)) {
              _item.idMeal = null;
            } else {
              _item.idMeal = _cursor.getString(_cursorIndexOfIdMeal);
            }
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _item.date = null;
            } else {
              _item.date = _cursor.getString(_cursorIndexOfDate);
            }
            _item.id = _cursor.getInt(_cursorIndexOfId);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPlanner);
            _item.isPlanner = _tmp != 0;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSave);
            _item.isSave = _tmp_1 != 0;
            if (_cursor.isNull(_cursorIndexOfStrMeal)) {
              _item.strMeal = null;
            } else {
              _item.strMeal = _cursor.getString(_cursorIndexOfStrMeal);
            }
            if (_cursor.isNull(_cursorIndexOfStrMealThumb)) {
              _item.strMealThumb = null;
            } else {
              _item.strMealThumb = _cursor.getString(_cursorIndexOfStrMealThumb);
            }
            if (_cursor.isNull(_cursorIndexOfStrYoutube)) {
              _item.strYoutube = null;
            } else {
              _item.strYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
            }
            if (_cursor.isNull(_cursorIndexOfStrInstructions)) {
              _item.strInstructions = null;
            } else {
              _item.strInstructions = _cursor.getString(_cursorIndexOfStrInstructions);
            }
            if (_cursor.isNull(_cursorIndexOfStrCategory)) {
              _item.strCategory = null;
            } else {
              _item.strCategory = _cursor.getString(_cursorIndexOfStrCategory);
            }
            if (_cursor.isNull(_cursorIndexOfStrArea)) {
              _item.strArea = null;
            } else {
              _item.strArea = _cursor.getString(_cursorIndexOfStrArea);
            }
            if (_cursor.isNull(_cursorIndexOfStrTags)) {
              _item.strTags = null;
            } else {
              _item.strTags = _cursor.getString(_cursorIndexOfStrTags);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient1)) {
              _item.strIngredient1 = null;
            } else {
              _item.strIngredient1 = _cursor.getString(_cursorIndexOfStrIngredient1);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient2)) {
              _item.strIngredient2 = null;
            } else {
              _item.strIngredient2 = _cursor.getString(_cursorIndexOfStrIngredient2);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient3)) {
              _item.strIngredient3 = null;
            } else {
              _item.strIngredient3 = _cursor.getString(_cursorIndexOfStrIngredient3);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient4)) {
              _item.strIngredient4 = null;
            } else {
              _item.strIngredient4 = _cursor.getString(_cursorIndexOfStrIngredient4);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient5)) {
              _item.strIngredient5 = null;
            } else {
              _item.strIngredient5 = _cursor.getString(_cursorIndexOfStrIngredient5);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient6)) {
              _item.strIngredient6 = null;
            } else {
              _item.strIngredient6 = _cursor.getString(_cursorIndexOfStrIngredient6);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient7)) {
              _item.strIngredient7 = null;
            } else {
              _item.strIngredient7 = _cursor.getString(_cursorIndexOfStrIngredient7);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient8)) {
              _item.strIngredient8 = null;
            } else {
              _item.strIngredient8 = _cursor.getString(_cursorIndexOfStrIngredient8);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient9)) {
              _item.strIngredient9 = null;
            } else {
              _item.strIngredient9 = _cursor.getString(_cursorIndexOfStrIngredient9);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient10)) {
              _item.strIngredient10 = null;
            } else {
              _item.strIngredient10 = _cursor.getString(_cursorIndexOfStrIngredient10);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient11)) {
              _item.strIngredient11 = null;
            } else {
              _item.strIngredient11 = _cursor.getString(_cursorIndexOfStrIngredient11);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient12)) {
              _item.strIngredient12 = null;
            } else {
              _item.strIngredient12 = _cursor.getString(_cursorIndexOfStrIngredient12);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient13)) {
              _item.strIngredient13 = null;
            } else {
              _item.strIngredient13 = _cursor.getString(_cursorIndexOfStrIngredient13);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient14)) {
              _item.strIngredient14 = null;
            } else {
              _item.strIngredient14 = _cursor.getString(_cursorIndexOfStrIngredient14);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient15)) {
              _item.strIngredient15 = null;
            } else {
              _item.strIngredient15 = _cursor.getString(_cursorIndexOfStrIngredient15);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient16)) {
              _item.strIngredient16 = null;
            } else {
              _item.strIngredient16 = _cursor.getString(_cursorIndexOfStrIngredient16);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient17)) {
              _item.strIngredient17 = null;
            } else {
              _item.strIngredient17 = _cursor.getString(_cursorIndexOfStrIngredient17);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient18)) {
              _item.strIngredient18 = null;
            } else {
              _item.strIngredient18 = _cursor.getString(_cursorIndexOfStrIngredient18);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient19)) {
              _item.strIngredient19 = null;
            } else {
              _item.strIngredient19 = _cursor.getString(_cursorIndexOfStrIngredient19);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient20)) {
              _item.strIngredient20 = null;
            } else {
              _item.strIngredient20 = _cursor.getString(_cursorIndexOfStrIngredient20);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<RandomMeal>> getAllMealsSavedByIdPlanner(final String id) {
    final String _sql = "SELECT * FROM Meals_table WHERE idMeal=? AND isPlanner =1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return __db.getInvalidationTracker().createLiveData(new String[] {"Meals_table"}, false, new Callable<List<RandomMeal>>() {
      @Override
      @Nullable
      public List<RandomMeal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "idMeal");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "day_id");
          final int _cursorIndexOfIsPlanner = CursorUtil.getColumnIndexOrThrow(_cursor, "isPlanner");
          final int _cursorIndexOfIsSave = CursorUtil.getColumnIndexOrThrow(_cursor, "isSave");
          final int _cursorIndexOfStrMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeal");
          final int _cursorIndexOfStrMealThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strMealThumb");
          final int _cursorIndexOfStrYoutube = CursorUtil.getColumnIndexOrThrow(_cursor, "strYoutube");
          final int _cursorIndexOfStrInstructions = CursorUtil.getColumnIndexOrThrow(_cursor, "strInstructions");
          final int _cursorIndexOfStrCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "strCategory");
          final int _cursorIndexOfStrArea = CursorUtil.getColumnIndexOrThrow(_cursor, "strArea");
          final int _cursorIndexOfStrTags = CursorUtil.getColumnIndexOrThrow(_cursor, "strTags");
          final int _cursorIndexOfStrIngredient1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient1");
          final int _cursorIndexOfStrIngredient2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient2");
          final int _cursorIndexOfStrIngredient3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient3");
          final int _cursorIndexOfStrIngredient4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient4");
          final int _cursorIndexOfStrIngredient5 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient5");
          final int _cursorIndexOfStrIngredient6 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient6");
          final int _cursorIndexOfStrIngredient7 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient7");
          final int _cursorIndexOfStrIngredient8 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient8");
          final int _cursorIndexOfStrIngredient9 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient9");
          final int _cursorIndexOfStrIngredient10 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient10");
          final int _cursorIndexOfStrIngredient11 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient11");
          final int _cursorIndexOfStrIngredient12 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient12");
          final int _cursorIndexOfStrIngredient13 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient13");
          final int _cursorIndexOfStrIngredient14 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient14");
          final int _cursorIndexOfStrIngredient15 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient15");
          final int _cursorIndexOfStrIngredient16 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient16");
          final int _cursorIndexOfStrIngredient17 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient17");
          final int _cursorIndexOfStrIngredient18 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient18");
          final int _cursorIndexOfStrIngredient19 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient19");
          final int _cursorIndexOfStrIngredient20 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient20");
          final List<RandomMeal> _result = new ArrayList<RandomMeal>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final RandomMeal _item;
            _item = new RandomMeal();
            if (_cursor.isNull(_cursorIndexOfIdMeal)) {
              _item.idMeal = null;
            } else {
              _item.idMeal = _cursor.getString(_cursorIndexOfIdMeal);
            }
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _item.date = null;
            } else {
              _item.date = _cursor.getString(_cursorIndexOfDate);
            }
            _item.id = _cursor.getInt(_cursorIndexOfId);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPlanner);
            _item.isPlanner = _tmp != 0;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSave);
            _item.isSave = _tmp_1 != 0;
            if (_cursor.isNull(_cursorIndexOfStrMeal)) {
              _item.strMeal = null;
            } else {
              _item.strMeal = _cursor.getString(_cursorIndexOfStrMeal);
            }
            if (_cursor.isNull(_cursorIndexOfStrMealThumb)) {
              _item.strMealThumb = null;
            } else {
              _item.strMealThumb = _cursor.getString(_cursorIndexOfStrMealThumb);
            }
            if (_cursor.isNull(_cursorIndexOfStrYoutube)) {
              _item.strYoutube = null;
            } else {
              _item.strYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
            }
            if (_cursor.isNull(_cursorIndexOfStrInstructions)) {
              _item.strInstructions = null;
            } else {
              _item.strInstructions = _cursor.getString(_cursorIndexOfStrInstructions);
            }
            if (_cursor.isNull(_cursorIndexOfStrCategory)) {
              _item.strCategory = null;
            } else {
              _item.strCategory = _cursor.getString(_cursorIndexOfStrCategory);
            }
            if (_cursor.isNull(_cursorIndexOfStrArea)) {
              _item.strArea = null;
            } else {
              _item.strArea = _cursor.getString(_cursorIndexOfStrArea);
            }
            if (_cursor.isNull(_cursorIndexOfStrTags)) {
              _item.strTags = null;
            } else {
              _item.strTags = _cursor.getString(_cursorIndexOfStrTags);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient1)) {
              _item.strIngredient1 = null;
            } else {
              _item.strIngredient1 = _cursor.getString(_cursorIndexOfStrIngredient1);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient2)) {
              _item.strIngredient2 = null;
            } else {
              _item.strIngredient2 = _cursor.getString(_cursorIndexOfStrIngredient2);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient3)) {
              _item.strIngredient3 = null;
            } else {
              _item.strIngredient3 = _cursor.getString(_cursorIndexOfStrIngredient3);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient4)) {
              _item.strIngredient4 = null;
            } else {
              _item.strIngredient4 = _cursor.getString(_cursorIndexOfStrIngredient4);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient5)) {
              _item.strIngredient5 = null;
            } else {
              _item.strIngredient5 = _cursor.getString(_cursorIndexOfStrIngredient5);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient6)) {
              _item.strIngredient6 = null;
            } else {
              _item.strIngredient6 = _cursor.getString(_cursorIndexOfStrIngredient6);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient7)) {
              _item.strIngredient7 = null;
            } else {
              _item.strIngredient7 = _cursor.getString(_cursorIndexOfStrIngredient7);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient8)) {
              _item.strIngredient8 = null;
            } else {
              _item.strIngredient8 = _cursor.getString(_cursorIndexOfStrIngredient8);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient9)) {
              _item.strIngredient9 = null;
            } else {
              _item.strIngredient9 = _cursor.getString(_cursorIndexOfStrIngredient9);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient10)) {
              _item.strIngredient10 = null;
            } else {
              _item.strIngredient10 = _cursor.getString(_cursorIndexOfStrIngredient10);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient11)) {
              _item.strIngredient11 = null;
            } else {
              _item.strIngredient11 = _cursor.getString(_cursorIndexOfStrIngredient11);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient12)) {
              _item.strIngredient12 = null;
            } else {
              _item.strIngredient12 = _cursor.getString(_cursorIndexOfStrIngredient12);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient13)) {
              _item.strIngredient13 = null;
            } else {
              _item.strIngredient13 = _cursor.getString(_cursorIndexOfStrIngredient13);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient14)) {
              _item.strIngredient14 = null;
            } else {
              _item.strIngredient14 = _cursor.getString(_cursorIndexOfStrIngredient14);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient15)) {
              _item.strIngredient15 = null;
            } else {
              _item.strIngredient15 = _cursor.getString(_cursorIndexOfStrIngredient15);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient16)) {
              _item.strIngredient16 = null;
            } else {
              _item.strIngredient16 = _cursor.getString(_cursorIndexOfStrIngredient16);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient17)) {
              _item.strIngredient17 = null;
            } else {
              _item.strIngredient17 = _cursor.getString(_cursorIndexOfStrIngredient17);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient18)) {
              _item.strIngredient18 = null;
            } else {
              _item.strIngredient18 = _cursor.getString(_cursorIndexOfStrIngredient18);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient19)) {
              _item.strIngredient19 = null;
            } else {
              _item.strIngredient19 = _cursor.getString(_cursorIndexOfStrIngredient19);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient20)) {
              _item.strIngredient20 = null;
            } else {
              _item.strIngredient20 = _cursor.getString(_cursorIndexOfStrIngredient20);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<RandomMeal>> getAllMealsSavedPlannerBySelectDay(final int id) {
    final String _sql = "SELECT * FROM Meals_table WHERE day_id=? AND isPlanner =1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[] {"Meals_table"}, false, new Callable<List<RandomMeal>>() {
      @Override
      @Nullable
      public List<RandomMeal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "idMeal");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "day_id");
          final int _cursorIndexOfIsPlanner = CursorUtil.getColumnIndexOrThrow(_cursor, "isPlanner");
          final int _cursorIndexOfIsSave = CursorUtil.getColumnIndexOrThrow(_cursor, "isSave");
          final int _cursorIndexOfStrMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeal");
          final int _cursorIndexOfStrMealThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strMealThumb");
          final int _cursorIndexOfStrYoutube = CursorUtil.getColumnIndexOrThrow(_cursor, "strYoutube");
          final int _cursorIndexOfStrInstructions = CursorUtil.getColumnIndexOrThrow(_cursor, "strInstructions");
          final int _cursorIndexOfStrCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "strCategory");
          final int _cursorIndexOfStrArea = CursorUtil.getColumnIndexOrThrow(_cursor, "strArea");
          final int _cursorIndexOfStrTags = CursorUtil.getColumnIndexOrThrow(_cursor, "strTags");
          final int _cursorIndexOfStrIngredient1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient1");
          final int _cursorIndexOfStrIngredient2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient2");
          final int _cursorIndexOfStrIngredient3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient3");
          final int _cursorIndexOfStrIngredient4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient4");
          final int _cursorIndexOfStrIngredient5 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient5");
          final int _cursorIndexOfStrIngredient6 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient6");
          final int _cursorIndexOfStrIngredient7 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient7");
          final int _cursorIndexOfStrIngredient8 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient8");
          final int _cursorIndexOfStrIngredient9 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient9");
          final int _cursorIndexOfStrIngredient10 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient10");
          final int _cursorIndexOfStrIngredient11 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient11");
          final int _cursorIndexOfStrIngredient12 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient12");
          final int _cursorIndexOfStrIngredient13 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient13");
          final int _cursorIndexOfStrIngredient14 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient14");
          final int _cursorIndexOfStrIngredient15 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient15");
          final int _cursorIndexOfStrIngredient16 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient16");
          final int _cursorIndexOfStrIngredient17 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient17");
          final int _cursorIndexOfStrIngredient18 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient18");
          final int _cursorIndexOfStrIngredient19 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient19");
          final int _cursorIndexOfStrIngredient20 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient20");
          final List<RandomMeal> _result = new ArrayList<RandomMeal>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final RandomMeal _item;
            _item = new RandomMeal();
            if (_cursor.isNull(_cursorIndexOfIdMeal)) {
              _item.idMeal = null;
            } else {
              _item.idMeal = _cursor.getString(_cursorIndexOfIdMeal);
            }
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _item.date = null;
            } else {
              _item.date = _cursor.getString(_cursorIndexOfDate);
            }
            _item.id = _cursor.getInt(_cursorIndexOfId);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPlanner);
            _item.isPlanner = _tmp != 0;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSave);
            _item.isSave = _tmp_1 != 0;
            if (_cursor.isNull(_cursorIndexOfStrMeal)) {
              _item.strMeal = null;
            } else {
              _item.strMeal = _cursor.getString(_cursorIndexOfStrMeal);
            }
            if (_cursor.isNull(_cursorIndexOfStrMealThumb)) {
              _item.strMealThumb = null;
            } else {
              _item.strMealThumb = _cursor.getString(_cursorIndexOfStrMealThumb);
            }
            if (_cursor.isNull(_cursorIndexOfStrYoutube)) {
              _item.strYoutube = null;
            } else {
              _item.strYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
            }
            if (_cursor.isNull(_cursorIndexOfStrInstructions)) {
              _item.strInstructions = null;
            } else {
              _item.strInstructions = _cursor.getString(_cursorIndexOfStrInstructions);
            }
            if (_cursor.isNull(_cursorIndexOfStrCategory)) {
              _item.strCategory = null;
            } else {
              _item.strCategory = _cursor.getString(_cursorIndexOfStrCategory);
            }
            if (_cursor.isNull(_cursorIndexOfStrArea)) {
              _item.strArea = null;
            } else {
              _item.strArea = _cursor.getString(_cursorIndexOfStrArea);
            }
            if (_cursor.isNull(_cursorIndexOfStrTags)) {
              _item.strTags = null;
            } else {
              _item.strTags = _cursor.getString(_cursorIndexOfStrTags);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient1)) {
              _item.strIngredient1 = null;
            } else {
              _item.strIngredient1 = _cursor.getString(_cursorIndexOfStrIngredient1);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient2)) {
              _item.strIngredient2 = null;
            } else {
              _item.strIngredient2 = _cursor.getString(_cursorIndexOfStrIngredient2);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient3)) {
              _item.strIngredient3 = null;
            } else {
              _item.strIngredient3 = _cursor.getString(_cursorIndexOfStrIngredient3);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient4)) {
              _item.strIngredient4 = null;
            } else {
              _item.strIngredient4 = _cursor.getString(_cursorIndexOfStrIngredient4);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient5)) {
              _item.strIngredient5 = null;
            } else {
              _item.strIngredient5 = _cursor.getString(_cursorIndexOfStrIngredient5);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient6)) {
              _item.strIngredient6 = null;
            } else {
              _item.strIngredient6 = _cursor.getString(_cursorIndexOfStrIngredient6);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient7)) {
              _item.strIngredient7 = null;
            } else {
              _item.strIngredient7 = _cursor.getString(_cursorIndexOfStrIngredient7);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient8)) {
              _item.strIngredient8 = null;
            } else {
              _item.strIngredient8 = _cursor.getString(_cursorIndexOfStrIngredient8);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient9)) {
              _item.strIngredient9 = null;
            } else {
              _item.strIngredient9 = _cursor.getString(_cursorIndexOfStrIngredient9);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient10)) {
              _item.strIngredient10 = null;
            } else {
              _item.strIngredient10 = _cursor.getString(_cursorIndexOfStrIngredient10);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient11)) {
              _item.strIngredient11 = null;
            } else {
              _item.strIngredient11 = _cursor.getString(_cursorIndexOfStrIngredient11);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient12)) {
              _item.strIngredient12 = null;
            } else {
              _item.strIngredient12 = _cursor.getString(_cursorIndexOfStrIngredient12);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient13)) {
              _item.strIngredient13 = null;
            } else {
              _item.strIngredient13 = _cursor.getString(_cursorIndexOfStrIngredient13);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient14)) {
              _item.strIngredient14 = null;
            } else {
              _item.strIngredient14 = _cursor.getString(_cursorIndexOfStrIngredient14);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient15)) {
              _item.strIngredient15 = null;
            } else {
              _item.strIngredient15 = _cursor.getString(_cursorIndexOfStrIngredient15);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient16)) {
              _item.strIngredient16 = null;
            } else {
              _item.strIngredient16 = _cursor.getString(_cursorIndexOfStrIngredient16);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient17)) {
              _item.strIngredient17 = null;
            } else {
              _item.strIngredient17 = _cursor.getString(_cursorIndexOfStrIngredient17);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient18)) {
              _item.strIngredient18 = null;
            } else {
              _item.strIngredient18 = _cursor.getString(_cursorIndexOfStrIngredient18);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient19)) {
              _item.strIngredient19 = null;
            } else {
              _item.strIngredient19 = _cursor.getString(_cursorIndexOfStrIngredient19);
            }
            if (_cursor.isNull(_cursorIndexOfStrIngredient20)) {
              _item.strIngredient20 = null;
            } else {
              _item.strIngredient20 = _cursor.getString(_cursorIndexOfStrIngredient20);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
