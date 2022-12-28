package caseStudy.Utils;

import caseStudy.Models.Booking;
import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class DateComparatorUtil implements Comparable<Booking>, Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        try {
            long startOne = new SimpleDateFormat("dd/MM/yyyy").parse(o1.getStartDay()).getTime();
            long startSecond = new SimpleDateFormat("dd/MM/yyyy").parse(o2.getStartDay()).getTime();
            if (startOne > startSecond){
                return 1;
            }
            if (startOne < startSecond){
                return -1;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            long endOne = new SimpleDateFormat("dd/MM/yyyy").parse(o1.getEndDay()).getTime();
            long endSecond = new SimpleDateFormat("dd/MM/yyyy").parse(o2.getEndDay()).getTime();
            if (endOne > endSecond){
                return 1;
            }
            if (endOne < endSecond){
                return -1;
            }
        }catch (ParseException e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Comparator<Booking> reversed() {
        return null;
    }

    @Override
    public Comparator<Booking> thenComparing(Comparator<? super Booking> other) {
        return null;
    }

    @Override
    public <U> Comparator<Booking> thenComparing(Function<? super Booking, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Booking> thenComparing(Function<? super Booking, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Booking> thenComparingInt(ToIntFunction<? super Booking> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Booking> thenComparingLong(ToLongFunction<? super Booking> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Booking> thenComparingDouble(ToDoubleFunction<? super Booking> keyExtractor) {
        return null;
    }

    @Override
    public int compareTo(@NotNull Booking o) {
        return 0;
    }
}