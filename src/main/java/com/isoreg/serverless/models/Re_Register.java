package com.isoreg.serverless.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

//@Table(name = "re_register")
@Entity
// @Table(name = "organization")
public class RE_Register {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "uuid")
    private UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String contentsummary;

    public String getContentsummary() {
        return contentsummary;
    }

    public void setContentsummary(String contentsummary) {
        this.contentsummary = contentsummary;
    }

    private Date dateoflastchange;

    public Date getdateoflastchange() {
        return dateoflastchange;
    }

    public void setDateoflastchange(Date dateoflastchange) {
        this.dateoflastchange = dateoflastchange;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Date versiondate;

    public Date getVersiondate() {
        return versiondate;
    }

    public void setVersiondate(Date versiondate) {
        this.versiondate = versiondate;
    }

    private Date versionnumber;

    public Date getVersionnumber() {
        return versionnumber;
    }

    public void setVersionnumber(Date versionnumber) {
        this.versionnumber = versionnumber;
    }

    private UUID citation_uuid;

    public UUID getCitation_uuid() {
        return citation_uuid;
    }

    public void setCitation_uui(UUID citation_uuid) {
        this.citation_uuid = citation_uuid;
    }

    private UUID operatinglanguage_uuid;

    public UUID getOperatinglanguage_uuid() {
        return operatinglanguage_uuid;
    }

    public void setOperatinglanguage_uuid(UUID operatinglanguage_uuid) {
        this.operatinglanguage_uuid = operatinglanguage_uuid;
    }

    private UUID owner_uuid;

    public UUID getOwner_uuid() {
        return owner_uuid;
    }

    public void setOwner_uuid(UUID owner_uuid) {
        this.owner_uuid = owner_uuid;
    }

    private UUID uniformresourceidentifier_uuid;

    public UUID getUniformresourceidentifier_uuid() {
        return uniformresourceidentifier_uuid;
    }

    public void setUniformresourceidentifier_uuid(UUID uniformresourceidentifier_uuid) {
        this.uniformresourceidentifier_uuid = uniformresourceidentifier_uuid;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    private RE_RegisterManager manager;

    public RE_RegisterManager getManager() {
        return manager;
    }

    public void setManager(RE_RegisterManager manager) {
        this.manager = manager;
    }

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(name = "re_register_itemclasses", joinColumns = @JoinColumn(name = "registerid"), inverseJoinColumns = @JoinColumn(name = "itemclassid"))
    private Set<RE_ItemClass> containedItemClasses;

    public Set<RE_ItemClass> getContainedItemClasses() {
        if (this.containedItemClasses == null) {
            this.containedItemClasses = new LinkedHashSet<RE_ItemClass>();
        }

        List<RE_ItemClass> temp = new ArrayList<RE_ItemClass>();
        temp.addAll(this.containedItemClasses);

        Collections.sort(temp, new Comparator<RE_ItemClass>() {
            @Override
            public int compare(RE_ItemClass o1, RE_ItemClass o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Set<RE_ItemClass> result = new LinkedHashSet<RE_ItemClass>();
        result.addAll(temp);

        return result;
    }

    protected void setContainedItemClasses(Set<RE_ItemClass> containedItemClasses) {
        this.containedItemClasses = containedItemClasses;
    }

}