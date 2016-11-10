package com.example.pms.inventoryapp.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by pms on 2016. 11. 10..
 */

public final class InventoryContract {

    private InventoryContract() {}

    public static final String CONTENT_AUTHORITY = "com.example.pms.inventoryapp";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_INVENTORIES = "inventories";

    public static final class InventoryEntry implements BaseColumns {

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_INVENTORIES);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENTORIES;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENTORIES;

        public final static String TABLE_NAME = "inventories";

        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_INVENTORY_NAME = "name";

        public final static String COLUMN_INVENTORY_QUANTITY = "quantity";

        public final static String COLUMN_INVENTORY_PRICE = "price";

        public final static String COLUMN_INVENTORY_IMAGE = "image";

        public final static String COLUMN_INVENTORY_SELECTED = "selected";

        public static final int SELECTED_TRUE = 1;
        public static final int SELECTED_FALSE = 0;

        public static boolean isValidSelected(int selected) {
            if (selected == SELECTED_FALSE || selected == SELECTED_TRUE) {
                return true;
            }
            return false;
        }
    }
}
