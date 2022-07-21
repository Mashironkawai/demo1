package com.ma2.admin;
import com.ma2.admin.bean.Car;
import com.ma2.admin.bean.Champion;
import com.ma2.admin.bean.Student;

import java.util.*;

public class T1{
    public static void main(String[] args) {
        HashMap<Integer, Champion> maps = new HashMap<>();
        maps.put(1930, new Champion(1, 1930, "乌拉圭", "乌拉圭"));
        maps.put(1934, new Champion(2, 1934, "意大利", "意大利"));
        maps.put(1938, new Champion(3, 1938, "法国", "意大利"));
        maps.put(1950, new Champion(4, 1950, "巴西", "乌拉圭"));
        maps.put(1954, new Champion(5, 1954, "瑞士", "西德"));
        maps.put(1958, new Champion(6, 1958, "瑞典", "巴西"));
        maps.put(1962, new Champion(7, 1962, "智利", "巴西"));
        maps.put(1966, new Champion(8, 1966, "英格兰", "英格兰"));
        maps.put(1970, new Champion(9, 1970, "墨西哥", "巴西"));
        maps.put(1974, new Champion(10, 1974, "前西德", "西德"));
        maps.put(1978, new Champion(11, 1978, "阿根廷", "阿根廷"));
        maps.put(1982, new Champion(12, 1982, "西班牙", "意大利"));
        maps.put(1986, new Champion(13, 1986, "墨西哥", "阿根廷"));
        maps.put(1990, new Champion(14, 1990, "意大利", "西德"));
        maps.put(1994, new Champion(15, 1994, "美国", "巴西"));
        maps.put(1998, new Champion(16, 1998, "法国", "法国"));
        maps.put(2002, new Champion(17, 2002, "韩日", "巴西"));
        maps.put(2006, new Champion(18, 2006, "德国", "意大利"));
        maps.put(2010, new Champion(19, 2010, "南非", "西班牙"));
        maps.put(2014, new Champion(20, 2014, "巴西", "德国"));

        Set<Map.Entry<Integer, Champion>> entrySet = maps.entrySet();

        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份");
        int year = sc.nextInt();
        int find = 0;
        for (Map.Entry<Integer, Champion> entry : entrySet) {
            if (entry.getKey() == year) {
                find = 1;
                System.out.println("世界冠军:" + entry.getValue().getCountry());
            }
        }
        if (find == 0) {
            System.out.println("没有举办世界杯");
        }

        System.out.println("输入球队名称");
        String name = sc.next();

        List<Integer> yearlist = new ArrayList<>();
        int b=0;
        for (Map.Entry<Integer, Champion> entry : entrySet) {
            if(entry.getValue().getCountry().equals(name)){
                b=1;
                yearlist.add(entry.getValue().getYear());
            }
        }

        if(b==0){
            System.out.println(name+"没有获得冠军");
        }else{
            System.out.println(yearlist);
        }
    }
}

