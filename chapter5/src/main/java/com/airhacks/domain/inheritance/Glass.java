package com.airhacks.domain.inheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
    @AttributeOverride(name = "name", column = @Column(name = "description"))
})
public class Glass extends Item {

    private Float height;

    private Float radius;

    private String color;

    public Glass(Float height, Float radius, String color) {
	this.height = height;
	this.radius = radius;
	this.color = color;
    }

    public Glass() {
    }

    public Float getHeight() {
	return height;
    }

    public void setHeight(Float height) {
	this.height = height;
    }

    public Float getRadius() {
	return radius;
    }

    public void setRadius(Float radius) {
	this.radius = radius;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

}
