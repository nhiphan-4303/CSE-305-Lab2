public class Property {
    private String propertyId;
    private String description;
    private String ownerId;

    // Constructor
    public Property(String propertyId, String description, String ownerId) {
        this.propertyId = propertyId;
        this.description = description;
        this.ownerId = ownerId;
    }

    // Method to return the property details as a string
    @Override
    public String toString() {
        return "Property " + propertyId + ": " + description + " (Owner: " + ownerId + ")";
    }

    // Getters and Setters
    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}