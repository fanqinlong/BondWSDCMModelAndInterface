package com.ibond.dcm.utils;

import com.ibond.common.utils.StringUtils;
import com.ibond.dcm.entity.ComboEntity;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<ComboEntity> generateItemList(String id, String name) {
        List<ComboEntity> result = new ArrayList<>();
        List<String> idList = StringUtils.splitStringWithSign(id, ",");
        List<String> nameList = StringUtils.splitStringWithSign(name, ",");
        for (int i = 0; i < idList.size(); i++) {
            ComboEntity item = new ComboEntity();
            item.setId(idList.get(i));
            item.setName(nameList.get(i));
            result.add(item);
        }
        return result;
    }
}
