package it.bway.salami;


    public class SalamiConstants
    {
        //region basic URLs
        public static final String RECIPE_URL = "/SalamiTOIKitchen/recipe/my.recipe";
        public static final String RECEIVER_URL = "/SalamiTOIKitchen/logic/RetrieveMessages.php";
        public static final String ADVERTISER_URL = "/SalamiTOIKitchen/logic/SaveMessage.php";
        //endregion
        //region message expiration delay
        public static final int MESSAGE_EXPIRATION_DELAY = 5000;
        //endregion
        //region TOIKitchen interface commands
        public static final int CMD_MASTERCHEF_START = 0xF1;
        public static final int CMD_MASTERCHEF_STOP = 0xF2;
        public static final int CMD_RECIPE_UPDATED = 0xF3;
        public static final int CMD_REFRESH_ALL = 0xF5;
        public static final int CMD_ADVERTISE_MC = 0xD1; // comunication code used by MC to inform of its presence and status
        public static final int CMD_ADVERTISE_SLICE = 0xD2; //comunication code used by a AC to inform of its connected slice's presence and status
        public static final int CMD_DO_GPIO_ACTION = 0xD3; //MC sends this comunication when it asks the AC to do something
        public static final int CMD_DO_MESSAGE_ACTION = 0xD4; //MC sends this comunication when it asks the AC to do something
        public static final int CMD_SEND_DATA_EVENT_AC = 0xC3; //DATA EVENT UPDATES SENT BY slice to its AC
        public static final int ERR_AC_UNKNOWN = 0xE1;
        public static final int CMD_ADD_INGREDIENT = 0x1A;
        public static final int CMD_SET_TIMEFRAME = 0x31;
        public static final int CMD_SET_CALENDAR = 0x40;
        public static final int CMD_ADD_STR_COND = 0x42;
        public static final int CMD_ADD_NUM_COND = 0x43;
        public static final int CMD_ADD_BOOL_COND = 0x44;
        public static final int CMD_ADD_GPIO_ACTION = 0x51;
        public static final int CMD_ADD_MESSAGE_ACTION = 0x52;
        public static final int CMD_ADD_MESSAGE_ACTION_DATAFIELD = 0x60;
        public static final int CMD_NOTIFY_TASK_DONE = 0x70;
        public static final int CMD_NOTIFY_TASK_TIMEOUT = 0x71;
        //endregion
        //region CONSTANT TABLE same as COSTANT.JS
        public static final int FIXED_CHECK_CONDITION = 0;
        public static final int INTERVAL_CHECK_CONDITION = 1;
        //endregion
        //region CHECK TYPES
        public static final int CHECK_TYPE_EQ = 0;
        public static final int CHECK_TYPE_GT = 1;
        public static final int CHECK_TYPE_LT = 2;
        public static final int CHECK_TYPE_DIFF = 3;
        //endregion
        //region INGREDIENT DATA
        public static final int DATA_INGREDIENT_CLASS = 1;
        public static final int DATA_TYPE_NUMERIC = 11;
        public static final int DATA_TYPE_BOOLEAN = 12;
        public static final int DATA_TYPE_String = 13;
        //endregion
        //region INGREDIENT EVENT
        public static final int EVENT_INGREDIENT_CLASS = 2;
        public static final int MANAGED_GPIO_EVENT_TYPE = 21;
        public static final int MESSAGE_EVENT_TYPE = 22;
        //endregion
        //region INGREDIENT ACTION
        public static final int ACTION_INGREDIENT_CLASS = 3;
        public static final int GPIO_ACTION_TYPE = 31;
        public static final int MESSAGE_ACTION_TYPE = 32;
        public static final String GPIO_ACTION_FIELD_CSS_CLASS = "gpio-action-textbox";
        //endregion
        //region INGREDIENT'S BEHAVIOR
        //STATIC (00), POLL (01), NOTIFY On CHANGE(10)
        public static final int DATA_BEHAVIOR_STATIC = 0;
        public static final int DATA_BEHAVIOR_ON_REQUEST = 1;
        public static final int DATA_BEHAVIOR_ON_CHANGE = 2;
        //endregion
        //region INGREDIENT SALAMI RESERVED
        public static final int SALAMI_INGREDIENT_CLASS = 4;
        public static final int SALAMI_INGREDIENT_TYPE_CALENDAR = 401;
        public static final int SALAMI_INGREDIENT_TYPE_SLEEP = 402;
        //endregion
        //region POLLING_BEHAVIOR
        public static final int POLLING_BEHAVIOR_LAZY = 5;
        public static final int POLLING_BEHAVIOR_NORMAL = 3;
        public static final double POLLING_BEHAVIOR_ACTIVE = 0.5;
        public static final double POLLING_BEHAVIOR_MANIAC = 0.1;
        //endregion
        //region CLOCK RATE
        public static final double CLOCK_RATE = 0.1;
        //endregion
        //region CONDITION CHECKING
        public static final int CONDITION_CHECKED = 1;
        public static final int CONDITION_NOT_CHECKED = 0;
        //endregion
        //region CHANNEL
        public static final String CH_TASK_MONITOR = "TASK_MONITOR";
        //endregion
        //region LOGGING
        public static final String LOG_FILE = "/opt/salamiiot/salami.log";
        public static final int DEFAULT_LOG_LEVEL = 20;  // INFO
        public static final String LOG_FORMAT = "%(levelname) -10s %(asctime)s %(module)s:%(lineno)s %(funcName)s %(message)s";
        public static final  boolean FILE_LOG_ENABLED = false;
        //endregion
        //region Assistant chef internal commands
        public static final String JOIN_KITCHEN = "join_kitchen";
        public static final String UPDATE_INGREDIENT = "update_ingredient";
        //endregion
    }
