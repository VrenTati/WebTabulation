package com.example.webtabulation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tabulation {
    private double start;
    private double end;
    private double step;
    public double funcTabulation(double x){
        if(x > 3.4){
            return Math.sin(x) * Math.log(x);
        }
        return Math.cos(x) * Math.cos(x);
    }
    public int countOfSteps(){
        if(start >= end){
            return 0;
        }

        return (int) Math.ceil((end - start) / step);
    }
    public List<Point> getPoints(){
        List<Point> lst = new ArrayList<>();
        for(double x = start; x <= end; x += step){
            lst.add(new Point(x, funcTabulation(x)));
        }
        return lst;
    }
    public int minIndex(List<Point> lst){
        int minIndex = 0;
        double minNum = lst.get(0).getY();
        for(int i = 1; i < lst.size(); ++i){
            if(lst.get(i).getY() < minNum){
                minNum = lst.get(i).getY();
                minIndex = i;
            }
        }
        return minIndex;
    }
    public int maxIndex(List<Point> lst){
        int maxIndex = 0;
        double maxNum = lst.get(0).getY();
        for(int i = 1; i < lst.size(); ++i){
            if(lst.get(i).getY() > maxNum){
                maxNum = lst.get(i).getY();
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public double sum(List<Point> lst){
        double summ = 0;
        for(Point p : lst){
            summ += p.getY();
        }
        return summ;
    }
    public double middleArithmetic(List<Point> lst){
        return sum(getPoints())/getPoints().size();
    }
    public double minElem(List<Point> lst){
        int index = minIndex(lst);
        return lst.get(index).getY();
    }
    public double maxElem(List<Point> lst){
        int index = maxIndex(lst);
        return lst.get(index).getY();
    }

}
