package org.vo;

/**
 * Created by miaol on 2016/5/16 0016.
 */
public class AssessEntity {
    private int id;
    private int articleId;
    private int userId;
    private int assess;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAssess() {
        return assess;
    }

    public void setAssess(int assess) {
        this.assess = assess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssessEntity that = (AssessEntity) o;

        if (id != that.id) return false;
        if (articleId != that.articleId) return false;
        if (userId != that.userId) return false;
        if (assess != that.assess) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + articleId;
        result = 31 * result + userId;
        result = 31 * result + assess;
        return result;
    }
}
