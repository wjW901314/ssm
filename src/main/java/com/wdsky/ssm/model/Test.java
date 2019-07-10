package com.wdsky.ssm.model;

public class Test {
    private Integer id;
    private String context;
    private Integer viewCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", context='" + context + '\'' +
                ", viewCount=" + viewCount +
                '}';
    }
}
