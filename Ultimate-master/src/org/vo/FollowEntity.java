package org.vo;

/**
 * Created by miaol on 2016/5/16 0016.
 */
public class FollowEntity {
    private int id;
    private int userid;
    private int followUserid;

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

    public int getFollowUserid() {
        return followUserid;
    }

    public void setFollowUserid(int followUserid) {
        this.followUserid = followUserid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FollowEntity that = (FollowEntity) o;

        if (id != that.id) return false;
        if (userid != that.userid) return false;
        if (followUserid != that.followUserid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userid;
        result = 31 * result + followUserid;
        return result;
    }
}
