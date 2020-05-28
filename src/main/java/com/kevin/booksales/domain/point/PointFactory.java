package com.kevin.booksales.domain.point;

public class PointFactory {
    private PointFactory (){}

    public static Point  createPoint(int customerId, String serial, PointAcrtion pointAcrtion, int gainPoint){
        Point point = new Point();
        point.setSerialid(serial);
        point.setActioncode(pointAcrtion.getCode());
        point.setCustomerid(customerId);
        point.setPoint(gainPoint);
        return point;
    }
}
