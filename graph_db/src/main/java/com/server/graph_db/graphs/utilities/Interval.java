package com.server.graph_db.graphs.utilities;

public class Interval {
    private int start;
    private int end;

    public Interval(int start, int end){
        this.start = start;
        this.end = end;
    }

    public Interval(String interval){
        String[] parts = new StringBuilder(interval).delete(0, 1).delete(interval.length() - 1, interval.length()).toString().split(",");
        this.start = Integer.parseInt(parts[0].substring(1));
        this.end = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));
    }

    public int getStart(){
        return start;
    }

    public int getEnd(){
        return end;
    }

    public void setStart(int start){
        this.start = start;
    }

    public void setEnd(int end){
        this.end = end;
    }

    public boolean overlaps(Interval interval){
        return this.start <= interval.getEnd() && interval.getStart() <= this.end;
    }

    public boolean contains(Interval interval){
        return this.start <= interval.getStart() && interval.getEnd() <= this.end;
    }

    public boolean contains(int point){
        return this.start <= point && point <= this.end;
    }

    public boolean equals(Interval interval){
        return this.start == interval.getStart() && this.end == interval.getEnd();
    }

    public boolean isBefore(Interval interval){
        return this.end < interval.getStart();
    }

    public boolean isAfter(Interval interval){
        return this.start > interval.getEnd();
    }

    public int length(){
        return end - start;
    }

    public Interval intersection(Interval interval){
        if(!this.overlaps(interval))
            return null;
        return new Interval(Math.max(this.start, interval.getStart()), Math.min(this.end, interval.getEnd()));
    }

    public Interval union(Interval interval){
        if(!this.overlaps(interval))
            return null;
        return new Interval(Math.min(this.start, interval.getStart()), Math.max(this.end, interval.getEnd()));
    }

    public Interval difference(Interval interval){
        if(!this.overlaps(interval))
            return null;
        if(this.contains(interval))
            return new Interval(this.start, interval.getStart());
        if(interval.contains(this))
            return new Interval(interval.getEnd(), this.end);
        if(this.start < interval.getStart())
            return new Interval(this.start, interval.getStart());
        return new Interval(interval.getEnd(), this.end);
    }

    public Interval symmetricDifference(Interval interval){
        if(this.contains(interval) || interval.contains(this))
            return null;
        if(this.overlaps(interval))
            return new Interval(Math.min(this.start, interval.getStart()), Math.max(this.end, interval.getEnd()));
        return new Interval(this.start, this.end);
    }

    public boolean isAdjacent(Interval interval) {
        return this.start == interval.getEnd() + 1 || this.end == interval.getStart() - 1;
    }

    public String toString(){
        return "[" + start + "," + end + "]";
    }
}
