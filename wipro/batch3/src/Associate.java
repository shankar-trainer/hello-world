public class Associate {
    private int associateId;
    private String associateName;
    private String workStatus;

    public Associate() {
    }

    public int getAssociateId() {
        return associateId;
    }

    public void setAssociateId(int associateId) {
        this.associateId = associateId;
    }

    public String getAssociateName() {
        return associateName;
    }

    public void setAssociateName(String associateName) {
        this.associateName = associateName;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public void trackAssociateStatus(int day) {
        if (day >= 1 && day <= 20)
            setWorkStatus("Core Skills");
        else if (day >= 21 && day <= 40)
            setWorkStatus("Advanced Modules");
        else if (day >= 41 && day <= 60)
            setWorkStatus("Project Phase");
        else if (day >= 60)
            setWorkStatus("Deployed In project ");

    }
}
