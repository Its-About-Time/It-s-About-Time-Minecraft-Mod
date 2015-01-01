// Date: 9/9/2014 4:46:23 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package itsabouttime.client.model.prehistoric;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelConodont extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer eye1;
    ModelRenderer eye2;
  
  public ModelConodont()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 34, 0);
      head.addBox(-1.5F, -1.5F, -3F, 3, 3, 3);
      head.setRotationPoint(0F, 22.5F, -4.453333F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      tail1 = new ModelRenderer(this, 21, 0);
      tail1.addBox(-1F, -1F, 0F, 2, 2, 4);
      tail1.setRotationPoint(0F, 22F, -4.5F);
      tail1.setTextureSize(64, 32);
      tail1.mirror = true;
      setRotation(tail1, 0F, 0F, 0F);
      tail2 = new ModelRenderer(this, 10, 0);
      tail2.addBox(-0.5F, -23F, 4.5F, 1, 2, 4);
      tail2.setRotationPoint(0F, 22F, -0.5F);
      tail2.setTextureSize(64, 32);
      tail2.mirror = true;
      setRotation(tail2, 0F, 0F, 0F);
      tail3 = new ModelRenderer(this, 1, 0);
      tail3.addBox(-0.5F, -23F, 4.5F, 1, 1, 3);
      tail3.setRotationPoint(0F, 22.5F, 3.5F);
      tail3.setTextureSize(64, 32);
      tail3.mirror = true;
      setRotation(tail3, 0F, 0F, 0F);
      eye1 = new ModelRenderer(this, 47, 4);
      eye1.addBox(-1F, -1F, -1F, 2, 2, 2);
      eye1.setRotationPoint(-1.5F, 22.5F, -7F);
      eye1.setTextureSize(64, 32);
      eye1.mirror = true;
      setRotation(eye1, 0F, 0F, 0F);
      eye2 = new ModelRenderer(this, 47, 0);
      eye2.addBox(-1F, -1F, -1F, 2, 2, 2);
      eye2.setRotationPoint(1.5F, 22.5F, -7F);
      eye2.setTextureSize(64, 32);
      eye2.mirror = true;
      setRotation(eye2, 0F, 0F, 0F);
      tail1.addChild(tail2);
      tail1.addChild(tail3);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    tail1.render(f5);
  
    eye1.render(f5);
    eye2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.tail1.rotateAngleY = 0.2F * MathHelper.sin(f2 * (float)0.35F + f1);
	 
  }

}