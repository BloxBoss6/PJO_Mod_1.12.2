package com.bloxboss6.pjomod.items.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TestArmorModel2 extends ModelBiped {
	// fields
	public ModelRenderer mohawk;
	public ModelRenderer rightshoulder;
	public ModelRenderer leftshoulder;

	public TestArmorModel2() {
		textureWidth = 64;
		textureHeight = 64;

		mohawk = new ModelRenderer(this, 0, 32);
		mohawk.addBox(-0.5F, -9F, -4.5F, 1, 2, 9, 0.0F);
		mohawk.setRotationPoint(0F, 0F, 0F);
		this.bipedHead.addChild(mohawk);

		rightshoulder = new ModelRenderer(this, 40, 32);
		rightshoulder.addBox(-3.5F, -2.5F, -2.5F, 5, 4, 5, 0.0F);
		rightshoulder.setRotationPoint(-5F, 2F, 0F);
		this.bipedRightArm.addChild(rightshoulder);

		leftshoulder = new ModelRenderer(this, 40, 32);
		leftshoulder.addBox(-1.5F, -2.5F, -2.5F, 5, 4, 5, 0.0F);
		leftshoulder.setRotationPoint(5F, 2F, 0F);
		this.bipedLeftArm.addChild(leftshoulder);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
	}

	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}
