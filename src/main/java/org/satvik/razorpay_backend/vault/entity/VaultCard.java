package org.satvik.razorpay_backend.vault.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "vault_card")
public class VaultCard {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false,length = 4)
    private String lastFour;

    @Column(nullable = false,length = 6)
    private String bin;//first 6 digits of card number

    @Column(nullable = false)
    private byte[] encryptedPan;
    //after hashing this its getting converted to byte[] so we are storing like that only

    @Column(nullable = false)
    private byte[] encryptedDek;
    //string by which we are encrypting the card details,we are encrypting this also
    // and it will be decrypted using a centralized key stored on a safe place in razorpay

    @Column(nullable = false)
    private String brand;
    //card brand like visa,mastercard,amex etc

    @Column(nullable = false)
    private String expiryMonth;

    @Column(nullable = false)
    private String expiryYear;

    @Column(nullable = false)
    private String cardHolderName;

    private LocalDateTime deletedAt;
}
