package org.vo;

/**
 * Created by miaol on 2016/5/16 0016.
 */
public class CollectEntity {
    private int id;
    private int userid;
    private int articleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CollectEntity that = (CollectEntity) o;

        if (id != that.id) return false;
        if (userid != that.userid) return false;
        if (articleId != that.articleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userid;
        result = 31 * result + articleId;
        return result;
    }
}
