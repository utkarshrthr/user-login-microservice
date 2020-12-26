package app.utk.ms.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDateTime;

@Embeddable
public class EntityMetaData {

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creationTimeStamp;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updationTimeStamp;

    private String createdBy;

    private String updatedBy;

    public LocalDateTime getCreationTimeStamp() {
        return creationTimeStamp;
    }

    public void setCreationTimeStamp(LocalDateTime creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
    }

    public LocalDateTime getUpdationTimeStamp() {
        return updationTimeStamp;
    }

    public void setUpdationTimeStamp(LocalDateTime updationTimeStamp) {
        this.updationTimeStamp = updationTimeStamp;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
