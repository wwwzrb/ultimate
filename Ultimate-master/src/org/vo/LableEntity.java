package org.vo;

/**
 * Created by miaol on 2016/5/16 0016.
 */
public class LableEntity {
    private int id;
    private int articleId;
    private String lable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LableEntity that = (LableEntity) o;

        if (id != that.id) return false;
        if (articleId != that.articleId) return false;
        if (lable != null ? !lable.equals(that.lable) : that.lable != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + articleId;
        result = 31 * result + (lable != null ? lable.hashCode() : 0);
        return result;
    }
}
