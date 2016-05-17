package org.vo;

import java.sql.Timestamp;

/**
 * Created by miaol on 2016/5/16 0016.
 */
public class ArticleEntity {
    private int articleId;
    private String title;
    private String content;
    private String text;
    private String download;
    private int authorId;
    private Timestamp publishtime;
    private boolean check;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Timestamp getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Timestamp publishtime) {
        this.publishtime = publishtime;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleEntity that = (ArticleEntity) o;

        if (articleId != that.articleId) return false;
        if (authorId != that.authorId) return false;
        if (check != that.check) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (download != null ? !download.equals(that.download) : that.download != null) return false;
        if (publishtime != null ? !publishtime.equals(that.publishtime) : that.publishtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (download != null ? download.hashCode() : 0);
        result = 31 * result + authorId;
        result = 31 * result + (publishtime != null ? publishtime.hashCode() : 0);
        result = 31 * result + (check ? 1 : 0);
        return result;
    }
}
