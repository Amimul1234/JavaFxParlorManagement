package entities;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class CustomerInvoice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private UUID invoiceNumber;
    @Column(nullable = false)
    private String serviceTaken;
    @Column(nullable = false)
    private Double serviceCharge;
    @Column(nullable = false)
    private String invoiceDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private Customer customer;

    public CustomerInvoice() {
    }

    public CustomerInvoice(Integer Id, UUID invoiceNumber, String serviceTaken, Double serviceCharge, String invoiceDate) {
        this.Id = Id;
        this.invoiceNumber = invoiceNumber;
        this.serviceTaken = serviceTaken;
        this.serviceCharge = serviceCharge;
        this.invoiceDate = invoiceDate;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public UUID getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(UUID invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getServiceTaken() {
        return serviceTaken;
    }

    public void setServiceTaken(String serviceTaken) {
        this.serviceTaken = serviceTaken;
    }

    public Double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getDate() {
        return invoiceDate;
    }

    public void setDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
