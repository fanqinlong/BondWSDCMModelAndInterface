package com.ibond.dcm.utils;

import java.util.HashMap;
import java.util.Map;

public class Constant {
    public enum Deleted {
        NO(-1),
        YES(1);
        private static Map<Integer, Deleted> map = new HashMap<>();

        static {
            for (Deleted deleted : Deleted.values()) {
                map.put(deleted.value, deleted);
            }
        }

        public static boolean contains(Integer key){
            return map.containsKey(key);
        }

        private Integer value;

        Deleted(Integer value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }
}
