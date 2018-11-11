package models;

import java.util.Date;

public class Promotion {
    private String promotionName;
    private Date promotionDate;
    private User[] affectedUsers;
    private String promotionContent;

    public Promotion(String promotionName, Date promotionDate, User[] affectedUsers, String promotionContent){
        this.promotionName  = promotionName;
        this.promotionDate = promotionDate;
        this.affectedUsers = affectedUsers;
        this.promotionContent = promotionContent;
    }

    @Override
    public String toString(){
        return "Promotion Name: " + getPromotionName() +
                "\nPromotion Date: " + getPromotionDate() +
                "\nPromotion Content: " + getPromotionContent();
    }

    public String getPromotionName() {
        return promotionName;
    }

    public Date getPromotionDate() {
        return promotionDate;
    }

    public User[] getAffectedUsers() {
        return affectedUsers;
    }

    public String getPromotionContent() {
        return promotionContent;
    }

}
