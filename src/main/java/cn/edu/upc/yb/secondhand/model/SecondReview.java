package cn.edu.upc.yb.secondhand.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "secondhand_review")
public class SecondReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int articleId;

    private String detail;
    private int ybid;
    private String ybname;
    private String ybhead;

    private Date createtime;
    private Date updatatime;
    private int isdelete = 0; //0为正常显示 -1为用户删除 -2为管理员删除
    private boolean isRead=false;

    public SecondReview() {
    }

    public SecondReview(int articleId, int reviewId, String detail, int ybid, String ybname, String ybhead, Date createtime) {
        this.articleId = articleId;
        this.detail = detail;
        this.ybid = ybid;
        this.ybname = ybname;
        this.ybhead = ybhead;
        this.createtime = createtime;
    }

    public int getId() {
        return id;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getYbid() {
        return ybid;
    }

    public void setYbid(int ybid) {
        this.ybid = ybid;
    }

    public String getYbname() {
        return ybname;
    }

    public void setYbname(String ybname) {
        this.ybname = ybname;
    }

    public String getYbhead() {
        return ybhead;
    }

    public void setYbhead(String ybhead) {
        this.ybhead = ybhead;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatatime() {
        return updatatime;
    }

    public void setUpdatatime(Date updatatime) {
        this.updatatime = updatatime;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}
