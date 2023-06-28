package com.developer.keystone.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "resident")
public class Resident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pid")
    private Integer pid;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "room")
    private Integer room;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private Integer age;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "haspet")
    private String hasPet;

    @Column(name = "weight_lbs")
    private Integer weightLbs;

    @Column(name = "photo")
    private String photo;

    @Column(name = "emmergencycontact1")
    private String emergencyContact1;

    @Column(name = "telephone_emc1")
    private String telephoneEmc1;

    @Column(name = "relationship_emc1")
    private String relationshipEmc1;

    @Column(name = "emmergencycontact2")
    private String emergencyContact2;

    @Column(name = "telephone_emc2")
    private String telephoneEmc2;

    @Column(name = "relationship_emc2")
    private String relationshipEmc2;

    @Column(name = "isambulatory")
    private String isAmbulatory;

    @Column(name = "isabletocommunicate")
    private String isAbleToCommunicate;

    @Column(name = "medicalinformation")
    private String medicalInformation;

    @Column(name = "isvacinnatedforcovid19")
    private String isVaccinatedForCovid19;

    @Column(name = "lastfall")
    private LocalDate lastFall;

    @Column(name = "lastervisit")
    private LocalDate lastErVisit;

    @Column(name = "dischargedfromovernighthospitalstay")
    private String dischargedFromOvernightHospitalStay;

    @Column(name = "isfallrisk")
    private String isFallRisk;

    @Column(name = "iswanderrisk")
    private String isWanderRisk;

    @Column(name = "iselopementrisk")
    private String isElopementRisk;

    @Column(name = "physician")
    private String physician;

    @Column(name = "physician_telephone")
    private String physicianTelephone;

    @Column(name = "ispet")
    private String isPet;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getHasPet() {
        return hasPet;
    }

    public void setHasPet(String hasPet) {
        this.hasPet = hasPet;
    }

    public Integer getWeightLbs() {
        return weightLbs;
    }

    public void setWeightLbs(Integer weightLbs) {
        this.weightLbs = weightLbs;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmergencyContact1() {
        return emergencyContact1;
    }

    public void setEmergencyContact1(String emergencyContact1) {
        this.emergencyContact1 = emergencyContact1;
    }

    public String getTelephoneEmc1() {
        return telephoneEmc1;
    }

    public void setTelephoneEmc1(String telephoneEmc1) {
        this.telephoneEmc1 = telephoneEmc1;
    }

    public String getRelationshipEmc1() {
        return relationshipEmc1;
    }

    public void setRelationshipEmc1(String relationshipEmc1) {
        this.relationshipEmc1 = relationshipEmc1;
    }

    public String getEmergencyContact2() {
        return emergencyContact2;
    }

    public void setEmergencyContact2(String emergencyContact2) {
        this.emergencyContact2 = emergencyContact2;
    }

    public String getTelephoneEmc2() {
        return telephoneEmc2;
    }

    public void setTelephoneEmc2(String telephoneEmc2) {
        this.telephoneEmc2 = telephoneEmc2;
    }

    public String getRelationshipEmc2() {
        return relationshipEmc2;
    }

    public void setRelationshipEmc2(String relationshipEmc2) {
        this.relationshipEmc2 = relationshipEmc2;
    }

    public String getIsAmbulatory() {
        return isAmbulatory;
    }

    public void setIsAmbulatory(String isAmbulatory) {
        this.isAmbulatory = isAmbulatory;
    }

    public String getIsAbleToCommunicate() {
        return isAbleToCommunicate;
    }

    public void setIsAbleToCommunicate(String isAbleToCommunicate) {
        this.isAbleToCommunicate = isAbleToCommunicate;
    }

    public String getMedicalInformation() {
        return medicalInformation;
    }

    public void setMedicalInformation(String medicalInformation) {
        this.medicalInformation = medicalInformation;
    }

    public String getIsVaccinatedForCovid19() {
        return isVaccinatedForCovid19;
    }

    public void setIsVaccinatedForCovid19(String isVaccinatedForCovid19) {
        this.isVaccinatedForCovid19 = isVaccinatedForCovid19;
    }

    public LocalDate getLastFall() {
        return lastFall;
    }

    public void setLastFall(LocalDate lastFall) {
        this.lastFall = lastFall;
    }

    public LocalDate getLastErVisit() {
        return lastErVisit;
    }

    public void setLastErVisit(LocalDate lastErVisit) {
        this.lastErVisit = lastErVisit;
    }

    public String getDischargedFromOvernightHospitalStay() {
        return dischargedFromOvernightHospitalStay;
    }

    public void setDischargedFromOvernightHospitalStay(String dischargedFromOvernightHospitalStay) {
        this.dischargedFromOvernightHospitalStay = dischargedFromOvernightHospitalStay;
    }

    public String getIsFallRisk() {
        return isFallRisk;
    }

    public void setIsFallRisk(String isFallRisk) {
        this.isFallRisk = isFallRisk;
    }

    public String getIsWanderRisk() {
        return isWanderRisk;
    }

    public void setIsWanderRisk(String isWanderRisk) {
        this.isWanderRisk = isWanderRisk;
    }

    public String getIsElopementRisk() {
        return isElopementRisk;
    }

    public void setIsElopementRisk(String isElopementRisk) {
        this.isElopementRisk = isElopementRisk;
    }

    public String getPhysician() {
        return physician;
    }

    public void setPhysician(String physician) {
        this.physician = physician;
    }

    public String getPhysicianTelephone() {
        return physicianTelephone;
    }

    public void setPhysicianTelephone(String physicianTelephone) {
        this.physicianTelephone = physicianTelephone;
    }

    public String getIsPet() {
        return isPet;
    }

    public void setIsPet(String isPet) {
        this.isPet = isPet;
    }
// getters and setters
}
