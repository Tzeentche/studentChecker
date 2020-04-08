package by.sugako.lesson22;

import java.util.Date;
import java.util.Objects;

public class Education {

    private EducationLevel level;
    private EducationForm form;
    private Date startDate;
    private Date endDate;

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null) {
            result = ((Education)obj).getLevel().equals(this.getLevel());
        }
        return result;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public EducationLevel getLevel() {
        return level;
    }

    public void setLevel(EducationLevel level) {
        this.level = level;
    }

    public EducationForm getForm() {
        return form;
    }

    public void setForm(EducationForm form) {
        this.form = form;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
