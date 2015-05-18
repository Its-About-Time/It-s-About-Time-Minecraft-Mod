package iat.client.models.entities;

import iat.client.models.MowzieModelBase;
import iat.client.models.MowzieModelRenderer;
import iat.entities.mob.EntityCompsognathus;
import iat.entities.mob.EntityVelociraptor;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

/**
 * iat  velo.tcn - TechneToTabulaImporter
 * Created using Tabula 4.1.1
 */
public class ModelVelociraptor extends MowzieModelBase {
	public MowzieModelRenderer body;
	public MowzieModelRenderer lefthip;
	public MowzieModelRenderer righthip;
	public MowzieModelRenderer tail1;
	public MowzieModelRenderer neck1;
	public MowzieModelRenderer leftarm1;
	public MowzieModelRenderer rightarm1;
	public MowzieModelRenderer tail2;
	public MowzieModelRenderer tail3;
	public MowzieModelRenderer tail4;
	public MowzieModelRenderer tail5;
	public MowzieModelRenderer tailfeathers;
	public MowzieModelRenderer neck2;
	public MowzieModelRenderer neck3;
	public MowzieModelRenderer neck4;
	public MowzieModelRenderer head;
	public MowzieModelRenderer headfeather;
	public MowzieModelRenderer snout;
	public MowzieModelRenderer bottomjaw;
	public MowzieModelRenderer leftarm2;
	public MowzieModelRenderer leftarmfeather1;
	public MowzieModelRenderer leftarmfeather2;
	public MowzieModelRenderer rightarm2;
	public MowzieModelRenderer rightarmfeather1;
	public MowzieModelRenderer rightarmfeather2;
	public MowzieModelRenderer leftleg1;
	public MowzieModelRenderer leftleg2;
	public MowzieModelRenderer lfoot;
	public MowzieModelRenderer leftsickleclaw;
	public MowzieModelRenderer leftsickleclaw2;
	public MowzieModelRenderer rightleg;
	public MowzieModelRenderer rightleg2;
	public MowzieModelRenderer rightfoot;
	public MowzieModelRenderer rightsickleclaw;
	public MowzieModelRenderer rightsickleclaw2;

	public ModelVelociraptor() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.tail5 = new MowzieModelRenderer(this, 49, 51);
		this.tail5.setRotationPoint(0.0F, -0.4F, 6.4F);
		this.tail5.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 6, 0.0F);
		this.setRotateAngle(tail5, -0.06335545184739416F, -0.0F, 0.0F);
		this.rightleg = new MowzieModelRenderer(this, 67, 39);
		this.rightleg.setRotationPoint(-1.7F, 4.5F, -0.3F);
		this.rightleg.addBox(-1.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F);
		this.setRotateAngle(rightleg, 0.875631685725555F, -0.0F, 0.0F);
		this.head = new MowzieModelRenderer(this, 77, 1);
		this.head.setRotationPoint(0.0F, 0.3F, -1.3F);
		this.head.addBox(-2.0F, -2.5F, -4.0F, 4, 4, 4, 0.0F);
		this.setRotateAngle(head, 0.36425021489121656F, -0.0F, 0.0F);
		this.tail2 = new MowzieModelRenderer(this, 1, 23);
		this.tail2.setRotationPoint(-0.5F, 0.0F, 6.8F);
		this.tail2.addBox(-2.5F, -3.0F, 0.0F, 5, 5, 7, 0.0F);
		this.righthip = new MowzieModelRenderer(this, 46, 37);
		this.righthip.setRotationPoint(-2.5F, 9.0F, 4.0F);
		this.righthip.addBox(-3.0F, -1.0F, -2.5F, 3, 7, 5, 0.0F);
		this.setRotateAngle(righthip, -0.2602285914723545F, -0.0F, 0.0F);
		this.headfeather = new MowzieModelRenderer(this, 94, 41);
		this.headfeather.setRotationPoint(0.0F, -2.1F, -1.3F);
		this.headfeather.addBox(0.0F, -4.0F, -2.0F, 0, 5, 4, 0.0F);
		this.setRotateAngle(headfeather, -0.6319837221471467F, -0.0F, 0.0F);
		this.neck4 = new MowzieModelRenderer(this, 101, 1);
		this.neck4.setRotationPoint(0.5F, 0.3F, -4.5F);
		this.neck4.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 4, 0.0F);
		this.setRotateAngle(neck4, -0.045553093477052F, 0.0F, 0.0F);
		this.rightleg2 = new MowzieModelRenderer(this, 81, 38);
		this.rightleg2.setRotationPoint(0.1F, 4.3F, 0.7F);
		this.rightleg2.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
		this.setRotateAngle(rightleg2, -0.8651597102135892F, -0.0F, 0.0F);
		this.leftarm1 = new MowzieModelRenderer(this, 2, 51);
		this.leftarm1.setRotationPoint(3.0F, 3.0F, -4.5F);
		this.leftarm1.addBox(0.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
		this.setRotateAngle(leftarm1, -0.11152653920243764F, -0.0F, -0.03717551306747922F);
		this.leftleg1 = new MowzieModelRenderer(this, 67, 39);
		this.leftleg1.setRotationPoint(1.7F, 4.6F, -0.3F);
		this.leftleg1.addBox(-1.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F);
		this.setRotateAngle(leftleg1, 0.875631685725555F, -0.0F, 0.0F);
		this.tail3 = new MowzieModelRenderer(this, 27, 22);
		this.tail3.setRotationPoint(0.0F, 0.0F, 5.2F);
		this.tail3.addBox(-2.0F, -2.5F, 0.0F, 4, 4, 8, 0.0F);
		this.rightarm2 = new MowzieModelRenderer(this, 14, 51);
		this.rightarm2.setRotationPoint(0.0F, 2.5F, 0.3F);
		this.rightarm2.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
		this.setRotateAngle(rightarm2, -0.7435102613495843F, -0.0F, 0.0F);
		this.body = new MowzieModelRenderer(this, 2, 1);
		this.body.setRotationPoint(0.0F, 8.3F, 0.0F);
		this.body.addBox(-3.5F, -3.5F, -6.0F, 7, 8, 11, 0.0F);
		this.setRotateAngle(body, 0.045553093477052F, -0.0F, 0.0F);
		this.lefthip = new MowzieModelRenderer(this, 46, 37);
		this.lefthip.setRotationPoint(2.5F, 9.0F, 4.0F);
		this.lefthip.addBox(0.0F, -1.0F, -2.5F, 3, 7, 5, 0.0F);
		this.setRotateAngle(lefthip, -0.2602285914723545F, -0.0F, 0.0F);
		this.leftarm2 = new MowzieModelRenderer(this, 14, 51);
		this.leftarm2.setRotationPoint(1.0F, 2.5F, 0.3F);
		this.leftarm2.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
		this.setRotateAngle(leftarm2, -0.7435102613495843F, -0.0F, 0.0F);
		this.snout = new MowzieModelRenderer(this, 42, 1);
		this.snout.setRotationPoint(0.0F, -0.8F, -3.8F);
		this.snout.addBox(-1.5F, -1.5F, -5.0F, 3, 3, 5, 0.0F);
		this.setRotateAngle(snout, 0.07435102613495843F, -0.0F, 0.0F);
		this.tail4 = new MowzieModelRenderer(this, 80, 26);
		this.tail4.setRotationPoint(0.0F, -0.8F, 8.0F);
		this.tail4.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 7, 0.0F);
		this.setRotateAngle(tail4, -0.040317105721069016F, -0.0F, 0.0F);
		this.rightfoot = new MowzieModelRenderer(this, 94, 39);
		this.rightfoot.setRotationPoint(0.0F, 6.0F, -0.1F);
		this.rightfoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
		this.setRotateAngle(rightfoot, 0.22759093446006054F, 0.0F, 0.0F);
		this.neck1 = new MowzieModelRenderer(this, 79, 12);
		this.neck1.setRotationPoint(0.0F, 1.1F, -2.1F);
		this.neck1.addBox(-3.0F, -3.5F, -5.0F, 6, 7, 5, 0.0F);
		this.setRotateAngle(neck1, -0.27314402793711257F, -0.0F, 0.0F);
		this.rightarm1 = new MowzieModelRenderer(this, 2, 51);
		this.rightarm1.setRotationPoint(-4.0F, 3.0F, -4.5F);
		this.rightarm1.addBox(-1.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
		this.setRotateAngle(rightarm1, -0.11152653920243764F, -0.0F, 0.03717551306747922F);
		this.rightsickleclaw = new MowzieModelRenderer(this, 114, 39);
		this.rightsickleclaw.setRotationPoint(1.0F, 0.5F, -2.5F);
		this.rightsickleclaw.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rightsickleclaw, 0.2602285914723545F, -0.0F, 0.0F);
		this.tail1 = new MowzieModelRenderer(this, 102, 11);
		this.tail1.setRotationPoint(0.5F, 0.0F, 4.0F);
		this.tail1.addBox(-3.5F, -3.5F, 0.0F, 6, 6, 7, 0.0F);
		this.setRotateAngle(tail1, 0.11152653920243764F, -0.0F, 0.0F);
		this.leftarmfeather1 = new MowzieModelRenderer(this, 25, 51);
		this.leftarmfeather1.setRotationPoint(1.0F, 2.0F, 0.5F);
		this.leftarmfeather1.addBox(0.0F, -2.0F, 0.0F, 0, 4, 3, 0.0F);
		this.setRotateAngle(leftarmfeather1, -0.11152653920243764F, -0.0F, 0.0F);
		this.rightsickleclaw2 = new MowzieModelRenderer(this, 114, 39);
		this.rightsickleclaw2.setRotationPoint(0.0F, -1.6F, 0.3F);
		this.rightsickleclaw2.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(rightsickleclaw2, -0.40980330836826856F, -0.0F, 0.0F);
		this.leftsickleclaw2 = new MowzieModelRenderer(this, 114, 39);
		this.leftsickleclaw2.setRotationPoint(0.0F, -1.6F, 0.3F);
		this.leftsickleclaw2.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(leftsickleclaw2, -0.40980330836826856F, -0.0F, 0.0F);
		this.neck2 = new MowzieModelRenderer(this, 59, 10);
		this.neck2.setRotationPoint(0.0F, 0.1F, -3.27F);
		this.neck2.addBox(-2.5F, -3.0F, -5.0F, 5, 5, 4, 0.0F);
		this.setRotateAngle(neck2, -0.091106186954104F, -0.0F, 0.0F);
		this.leftarmfeather2 = new MowzieModelRenderer(this, 38, 51);
		this.leftarmfeather2.setRotationPoint(-0.1F, 1.6F, -0.6F);
		this.leftarmfeather2.addBox(0.0F, -2.0F, 0.0F, 0, 4, 4, 0.0F);
		this.setRotateAngle(leftarmfeather2, 0.091106186954104F, -0.0F, 0.0F);
		this.leftsickleclaw = new MowzieModelRenderer(this, 114, 39);
		this.leftsickleclaw.setRotationPoint(-1.0F, 0.5F, -2.5F);
		this.leftsickleclaw.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(leftsickleclaw, 0.2602285914723545F, 0.0F, 0.0F);
		this.tailfeathers = new MowzieModelRenderer(this, 1, 37);
		this.tailfeathers.setRotationPoint(0.0F, -0.5F, 2.0F);
		this.tailfeathers.addBox(-4.5F, 0.0F, 0.0F, 9, 0, 14, 0.0F);
		this.setRotateAngle(tailfeathers, -0.07435102613495843F, -0.0F, 0.0F);
		this.lfoot = new MowzieModelRenderer(this, 94, 39);
		this.lfoot.setRotationPoint(0.0F, 6.0F, -0.1F);
		this.lfoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
		this.setRotateAngle(lfoot, 0.22759093446006054F, -0.0F, 0.0F);
		this.rightarmfeather2 = new MowzieModelRenderer(this, 38, 51);
		this.rightarmfeather2.setRotationPoint(0.1F, 1.6F, -0.6F);
		this.rightarmfeather2.addBox(0.0F, -2.0F, 0.0F, 0, 4, 4, 0.0F);
		this.setRotateAngle(rightarmfeather2, 0.091106186954104F, -0.0F, 0.0F);
		this.bottomjaw = new MowzieModelRenderer(this, 61, 1);
		this.bottomjaw.setRotationPoint(0.0F, 0.9F, -3.0F);
		this.bottomjaw.addBox(-1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F);
		this.setRotateAngle(bottomjaw, -0.03717551306747922F, -0.0F, 0.0F);
		this.neck3 = new MowzieModelRenderer(this, 41, 11);
		this.neck3.setRotationPoint(-0.5F, -1.1F, -3.6F);
		this.neck3.addBox(-1.5F, -1.5F, -4.0F, 4, 4, 4, 0.0F);
		this.setRotateAngle(neck3, 0.006806784082777885F, -0.0F, 0.0F);
		this.leftleg2 = new MowzieModelRenderer(this, 81, 38);
		this.leftleg2.setRotationPoint(-0.1F, 4.3F, 0.7F);
		this.leftleg2.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
		this.setRotateAngle(leftleg2, -0.8651597102135892F, -0.0F, 0.0F);
		this.rightarmfeather1 = new MowzieModelRenderer(this, 25, 51);
		this.rightarmfeather1.setRotationPoint(0.5F, 2.0F, 0.5F);
		this.rightarmfeather1.addBox(0.0F, -2.0F, 0.0F, 0, 4, 3, 0.0F);
		this.setRotateAngle(rightarmfeather1, -0.11152653920243764F, 0.0F, 0.0F);
		this.tail4.addChild(this.tail5);
		this.righthip.addChild(this.rightleg);
		this.neck4.addChild(this.head);
		this.tail1.addChild(this.tail2);
		this.head.addChild(this.headfeather);
		this.neck3.addChild(this.neck4);
		this.rightleg.addChild(this.rightleg2);
		this.body.addChild(this.leftarm1);
		this.lefthip.addChild(this.leftleg1);
		this.tail2.addChild(this.tail3);
		this.rightarm1.addChild(this.rightarm2);
		this.leftarm1.addChild(this.leftarm2);
		this.head.addChild(this.snout);
		this.tail3.addChild(this.tail4);
		this.rightleg2.addChild(this.rightfoot);
		this.body.addChild(this.neck1);
		this.body.addChild(this.rightarm1);
		this.rightfoot.addChild(this.rightsickleclaw);
		this.body.addChild(this.tail1);
		this.leftarm1.addChild(this.leftarmfeather1);
		this.rightsickleclaw.addChild(this.rightsickleclaw2);
		this.leftsickleclaw.addChild(this.leftsickleclaw2);
		this.neck1.addChild(this.neck2);
		this.leftarm2.addChild(this.leftarmfeather2);
		this.lfoot.addChild(this.leftsickleclaw);
		this.tail5.addChild(this.tailfeathers);
		this.leftleg2.addChild(this.lfoot);
		this.rightarm2.addChild(this.rightarmfeather2);
		this.head.addChild(this.bottomjaw);
		this.neck2.addChild(this.neck3);
		this.leftleg1.addChild(this.leftleg2);
		this.rightarm1.addChild(this.rightarmfeather1);

		body.setInitValuesToCurrentPose();
		lefthip.setInitValuesToCurrentPose();
		righthip.setInitValuesToCurrentPose();
		tail1.setInitValuesToCurrentPose();
		neck1.setInitValuesToCurrentPose();
		leftarm1.setInitValuesToCurrentPose();
		rightarm1.setInitValuesToCurrentPose();
		tail2.setInitValuesToCurrentPose();
		tail3.setInitValuesToCurrentPose();
		tail4.setInitValuesToCurrentPose();
		tail5.setInitValuesToCurrentPose();
		tailfeathers.setInitValuesToCurrentPose();
		neck2.setInitValuesToCurrentPose();
		neck3.setInitValuesToCurrentPose();
		neck4.setInitValuesToCurrentPose();
		head.setInitValuesToCurrentPose();
		headfeather.setInitValuesToCurrentPose();
		snout.setInitValuesToCurrentPose();
		bottomjaw.setInitValuesToCurrentPose();
		leftarm2.setInitValuesToCurrentPose();
		leftarmfeather1.setInitValuesToCurrentPose();
		leftarmfeather2.setInitValuesToCurrentPose();
		rightarm2.setInitValuesToCurrentPose();
		rightarmfeather1.setInitValuesToCurrentPose();
		rightarmfeather2.setInitValuesToCurrentPose();
		leftleg1.setInitValuesToCurrentPose();
		leftleg2.setInitValuesToCurrentPose();
		lfoot.setInitValuesToCurrentPose();
		leftsickleclaw.setInitValuesToCurrentPose();
		leftsickleclaw2.setInitValuesToCurrentPose();
		rightleg.setInitValuesToCurrentPose();
		rightleg2.setInitValuesToCurrentPose();
		rightfoot.setInitValuesToCurrentPose();
		rightsickleclaw.setInitValuesToCurrentPose();
		rightsickleclaw2.setInitValuesToCurrentPose();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.righthip.render(f5);
		this.body.render(f5);
		this.lefthip.render(f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{

		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		EntityVelociraptor mob = (EntityVelociraptor) entity;
		setAngles();
		if(!mob.isSitting()){
			float scale = 1F;
			float height = 2F * f1;
			bob(body, 1F, height, false, f, f1);
			bob(lefthip, 1F, height, false, f, f1);
			bob(righthip, 1F, height, false, f, f1);
			bob(neck4, 1F, height / 3, false, f, f1);
			bob(neck3, 1F, height / 2, false, f, f1);
			walk(neck2, 1F, 0.25F, false, 1F, 0.4F, f, f1);
			walk(head, 1F, 0.25F, true, 1F, -0.4F, f, f1);
			walk(lefthip, 0.5F, 0.8F, false, 0F, 0.4F, f, f1);
			walk(leftleg1, 0.5F, 0.5F, true, 1F, 0F, f, f1);
			walk(leftleg2, 0.5F, 0.5F, false, 0F, 0F, f, f1);
			walk(lfoot, 0.5F, 1.5F, true, 0.5F, 1F, f, f1);
			walk(righthip, 0.5F, 0.8F, true, 0F, 0.4F, f, f1);
			walk(rightleg, 0.5F, 0.5F, false, 1F, 0F, f, f1);
			walk(leftleg2, 0.5F, 0.5F, true, 0F, 0F, f, f1);
			walk(rightfoot, 0.5F, 1.5F, false, 0.5F, 1F, f, f1);
			faceTarget(head, 3, f3, f4);
			faceTarget(neck4, 5, f3, f4);
			faceTarget(neck3, 7, f3, f4);
			faceTarget(neck2, 10, f3, f4);
			MowzieModelRenderer[] rightArmParts = {this.rightarm1, this.rightarm2};
			MowzieModelRenderer[] leftArmParts = {this.leftarm1, this.leftarm2};
			MowzieModelRenderer[] tailParts = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
			tailSwing(tailParts, 1F, 0.1F * f1, 2, f);
			chainWave(tailParts, 1F, -0.05F, 2, f, f1);
			chainWave(rightArmParts, 1F, -0.3F, 4, f, f1);
			chainWave(leftArmParts, 1F, -0.3F, 4, f, f1);
			chainWave(tailParts, 0.1F, -0.05F, 2, mob.frame, 1F);
			walk(neck2, 0.1F, 0.4F, false, -1F, 0F, mob.frame, 1F);
			walk(head, 0.1F, 0.4F, true, 0F, 0F, mob.frame, 1F);
			walk(body, 0.1F, 0.4F, false, 0F, 0F, mob.frame, 1F);
			chainWave(rightArmParts, 0.1F, -0.4F, 4, mob.frame, 1F);
			chainWave(leftArmParts, 0.1F, -0.4F, 4, mob.frame, 1F);
		}else{
	        this.setRotateAngle(rightarmfeather1, -0.11152653920243764F, 0.0F, 0.0F);
	        this.setRotateAngle(leftleg2, -0.8651597102135892F, -0.0F, 0.0F);
	        this.setRotateAngle(neck3, 0.006806784082777885F, -0.0F, 0.0F);
	        this.setRotateAngle(bottomjaw, -0.03717551306747922F, -0.0F, 0.0F);
	        this.setRotateAngle(rightarmfeather2, 0.091106186954104F, -0.0F, 0.0F);
	        this.setRotateAngle(lfoot, 0.22759093446006054F, -0.0F, 0.0F);
	        this.setRotateAngle(tailfeathers, -0.07435102613495843F, -0.0F, 0.0F);
	        this.setRotateAngle(leftsickleclaw, 0.2602285914723545F, 0.0F, 0.0F);
	        this.setRotateAngle(neck2, -0.091106186954104F, -0.0F, 0.0F);
	        this.setRotateAngle(leftsickleclaw2, -0.40980330836826856F, -0.0F, 0.0F);
	        this.setRotateAngle(rightsickleclaw2, -0.40980330836826856F, -0.0F, 0.0F);
	        this.setRotateAngle(leftarmfeather1, -0.11152653920243764F, -0.0F, 0.0F);
	        this.setRotateAngle(rightsickleclaw, 0.2602285914723545F, -0.0F, 0.0F);
	        this.setRotateAngle(rightarm1, -0.11152653920243764F, -0.0F, 0.03717551306747922F);
	        this.setRotateAngle(neck1, -0.27314402793711257F, -0.0F, 0.0F);
	        this.setRotateAngle(rightfoot, 0.22759093446006054F, 0.0F, 0.0F);
	        this.setRotateAngle(tail4, -0.040317105721069016F, -0.0F, 0.0F);
	        this.setRotateAngle(snout, 0.07435102613495843F, -0.0F, 0.0F);
	        this.setRotateAngle(leftarm2, -0.7435102613495843F, -0.0F, 0.0F);
	        this.setRotateAngle(lefthip, -0.2602285914723545F, -0.0F, 0.0F);
	        this.setRotateAngle(body, 0.045553093477052F, -0.0F, 0.0F);
	        this.setRotateAngle(rightarm2, -0.7435102613495843F, -0.0F, 0.0F);
	        this.setRotateAngle(leftleg1, 0.875631685725555F, -0.0F, 0.0F);
	        this.setRotateAngle(leftarm1, -0.11152653920243764F, -0.0F, -0.03717551306747922F);
	        this.setRotateAngle(rightleg2, -0.8651597102135892F, -0.0F, 0.0F);
	        this.setRotateAngle(neck4, -0.045553093477052F, 0.0F, 0.0F);
	        this.setRotateAngle(headfeather, -0.6319837221471467F, -0.0F, 0.0F);
	        this.setRotateAngle(righthip, -0.2602285914723545F, -0.0F, 0.0F);
	        this.setRotateAngle(head, 0.36425021489121656F, -0.0F, 0.0F);
	        this.setRotateAngle(rightleg, 0.875631685725555F, -0.0F, 0.0F);
	        this.setRotateAngle(tail5, -0.06335545184739416F, -0.0F, 0.0F);
	        this.body.setRotationPoint(0.0F, 8.3F, 0.0F);
	        this.lefthip.setRotationPoint(2.5F, 9.0F, 4.0F);
	        this.righthip.setRotationPoint(-2.5F, 9.0F, 4.0F);
	        faceTarget(head, 3, f3, f4);
			faceTarget(neck4, 5, f3, f4);
			faceTarget(neck3, 7, f3, f4);
			faceTarget(neck2, 10, f3, f4);
			MowzieModelRenderer[] tailParts = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
			tailSwing(tailParts, 0.1F, -0.05F, 0, ((EntityVelociraptor)entity).frame);
		}
	}
	public void setAngles(){
		body.setCurrentPoseToInitValues();
		lefthip.setCurrentPoseToInitValues();
		righthip.setCurrentPoseToInitValues();
		tail1.setCurrentPoseToInitValues();
		neck1.setCurrentPoseToInitValues();
		leftarm1.setCurrentPoseToInitValues();
		rightarm1.setCurrentPoseToInitValues();
		tail2.setCurrentPoseToInitValues();
		tail3.setCurrentPoseToInitValues();
		tail4.setCurrentPoseToInitValues();
		tail5.setCurrentPoseToInitValues();
		tailfeathers.setCurrentPoseToInitValues();
		neck2.setCurrentPoseToInitValues();
		neck3.setCurrentPoseToInitValues();
		neck4.setCurrentPoseToInitValues();
		head.setCurrentPoseToInitValues();
		headfeather.setCurrentPoseToInitValues();
		snout.setCurrentPoseToInitValues();
		bottomjaw.setCurrentPoseToInitValues();
		leftarm2.setCurrentPoseToInitValues();
		leftarmfeather1.setCurrentPoseToInitValues();
		leftarmfeather2.setCurrentPoseToInitValues();
		rightarm2.setCurrentPoseToInitValues();
		rightarmfeather1.setCurrentPoseToInitValues();
		rightarmfeather2.setCurrentPoseToInitValues();
		leftleg1.setCurrentPoseToInitValues();
		leftleg2.setCurrentPoseToInitValues();
		lfoot.setCurrentPoseToInitValues();
		leftsickleclaw.setCurrentPoseToInitValues();
		leftsickleclaw2.setCurrentPoseToInitValues();
		rightleg.setCurrentPoseToInitValues();
		rightleg2.setCurrentPoseToInitValues();
		rightfoot.setCurrentPoseToInitValues();
		rightsickleclaw.setCurrentPoseToInitValues();
		rightsickleclaw2.setCurrentPoseToInitValues();
	}
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	 public void setRotateAngle(MowzieModelRenderer MowzieModelRenderer, float x, float y, float z) {
		MowzieModelRenderer.rotateAngleX = x;
		MowzieModelRenderer.rotateAngleY = y;
		MowzieModelRenderer.rotateAngleZ = z;
	}
}