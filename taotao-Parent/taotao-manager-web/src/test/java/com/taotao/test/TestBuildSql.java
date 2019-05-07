package com.taotao.test;

import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/7 16:29
 */
public class TestBuildSql {


    public static void main(String[] args) {
        String tableName = "RC_RES_DETAIL";
        Map<String,Object> params = new HashMap<String, Object>(2);
        List<Long> list = new ArrayList<Long>();
        params.put("RS_NAME","华为");
        params.put("ORDER_ID",list);
        params.put("RES_BRAND_CODE","pro");
        List<String> columns = new ArrayList<String>(2);
        columns.add("ORDER_ID");
        buildSql(tableName,params,columns);
    }


    private static String buildSql(String tableName, Map<String, Object> params, List<String> columns) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("select ");
        if (!CollectionUtils.isEmpty(columns)) {
            for(int i = 0; i < columns.size(); ++i) {
                sqlBuilder.append((String)columns.get(i));
                if (i < columns.size() - 1) {
                    sqlBuilder.append(" , ");
                }
            }
        } else {
            sqlBuilder.append("* ");
        }

        sqlBuilder.append(" from " + tableName + " where ");
        Iterator<Map.Entry<String, Object>> it = params.entrySet().iterator();
        boolean andFlag = false;

        while(it.hasNext()) {
            Map.Entry<String, Object> entry = (Map.Entry)it.next();
            if (andFlag) {
                sqlBuilder.append(" and ");
            } else {
                andFlag = true;
            }

            Object entryValue = entry.getValue();
            if ("RS_NAME".equals(entry.getKey())) {
                sqlBuilder.append((String)entry.getKey() + " like:" + (String)entry.getKey());
            }
            else if (entryValue instanceof List) {
                sqlBuilder.append((String)entry.getKey() + " in(:" + (String)entry.getKey() + ")");
            } else {
                sqlBuilder.append((String)entry.getKey() + "=:" + (String)entry.getKey());
            }
        }
        System.out.println(sqlBuilder.toString());
        return sqlBuilder.toString();
    }
}
