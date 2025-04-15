package ss7.thuc_hanh.th_3;

import ss6.thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}
