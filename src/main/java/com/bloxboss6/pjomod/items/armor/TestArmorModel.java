package com.bloxboss6.pjomod.items.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TestArmorModel extends ModelBiped {
	// fields
	ModelRenderer head;
	ModelRenderer mohawk;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer rightshoulder;
	ModelRenderer leftarm;
	ModelRenderer leftshoulder;
	ModelRenderer rightleg;
	ModelRenderer leftleg;

	public TestArmorModel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4F, -8F, -4F, 8, 8, 8);
		head.setRotationPoint(0F, 0F, 0F);
		head.setTextureSize(64, 64);
		head.mirror = true;
		this.bipedHead.addChild(head);

		mohawk = new ModelRenderer(this, 0, 32);
		mohawk.addBox(-0.5F, -9F, -4.5F, 1, 2, 9);
		mohawk.setRotationPoint(0F, 0F, 0F);
		mohawk.setTextureSize(64, 64);
		mohawk.mirror = true;
		this.bipedHead.addChild(mohawk);

		body = new ModelRenderer(this, 16, 16);
		body.addBox(-4F, 0F, -2F, 8, 12, 4);
		body.setRotationPoint(0F, 0F, 0F);
		body.setTextureSize(64, 64);
		body.mirror = true;
		this.bipedBody.addChild(body);

		rightarm = new ModelRenderer(this, 40, 16);
		rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
		rightarm.setRotationPoint(-5F, 2F, 0F);
		rightarm.setTextureSize(64, 64);
		rightarm.mirror = true;
		this.bipedRightArm.addChild(rightarm);

		rightshoulder = new ModelRenderer(this, 40, 32);
		rightshoulder.addBox(-3.5F, -2.5F, -2.5F, 5, 4, 5);
		rightshoulder.setRotationPoint(-5F, 2F, 0F);
		rightshoulder.setTextureSize(64, 64);
		rightshoulder.mirror = true;
		this.bipedRightArm.addChild(rightshoulder);

		leftarm = new ModelRenderer(this, 40, 16);
		leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
		leftarm.setRotationPoint(5F, 2F, 0F);
		leftarm.setTextureSize(64, 64);
		leftarm.mirror = true;
		this.bipedLeftArm.addChild(leftarm);

		leftshoulder = new ModelRenderer(this, 40, 32);
		leftshoulder.addBox(-1.5F, -2.5F, -2.5F, 5, 4, 5);
		leftshoulder.setRotationPoint(5F, 2F, 0F);
		leftshoulder.setTextureSize(64, 64);
		leftshoulder.mirror = true;
		this.bipedLeftArm.addChild(leftshoulder);

		rightleg = new ModelRenderer(this, 0, 16);
		rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
		rightleg.setRotationPoint(-2F, 12F, 0F);
		rightleg.setTextureSize(64, 64);
		rightleg.mirror = true;
		this.bipedRightLeg.addChild(rightleg);

		leftleg = new ModelRenderer(this, 0, 16);
		leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
		leftleg.setRotationPoint(2F, 12F, 0F);
		leftleg.setTextureSize(64, 64);
		leftleg.mirror = true;
		this.bipedLeftLeg.addChild(leftleg);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
