package cn.edu.nwafu.hjpg.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Element {
    private String id;
    private String casNo;
    private String displayName;
    private String lhsxbBhzqyKeyValue;
    private String lhsxbSrjdKeyValue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCasNo() {
        return casNo;
    }

    public void setCasNo(String casNo) {
        this.casNo = casNo;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLhsxbBhzqyKeyValue() {
        return lhsxbBhzqyKeyValue;
    }

    public void setLhsxbBhzqyKeyValue(String lhsxbBhzqyKeyValue) {
        this.lhsxbBhzqyKeyValue = lhsxbBhzqyKeyValue;
    }

    public String getLhsxbSrjdKeyValue() {
        return lhsxbSrjdKeyValue;
    }

    public void setLhsxbSrjdKeyValue(String lhsxbSrjdKeyValue) {
        this.lhsxbSrjdKeyValue = lhsxbSrjdKeyValue;
    }
}
