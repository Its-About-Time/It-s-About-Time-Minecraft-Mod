package iat.client.render.blocks;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import iat.client.models.blocks.ModelTimeRift;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderTimeRift extends TileEntitySpecialRenderer {
	public static final ResourceLocation texture = new ResourceLocation("iat:textures/blocks/models/time_Rift.png");
	public static final ResourceLocation texture_Pass = new ResourceLocation("iat:textures/blocks/models/time_Rift_Pass.png");

	private ModelTimeRift model;

	public RenderTimeRift(){
		this.model = new ModelTimeRift();
	}
	private void doDragonEffect(float rot){
        Tessellator tessellator = Tessellator.instance;
        RenderHelper.disableStandardItemLighting();
        float f1 = ((float)rot) / 200.0F;
        float f2 = 0.0F;

        if (f1 > 0.8F)
        {
            f2 = (f1 - 0.8F) / 0.2F;
        }
        Random random = new Random(432L);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glShadeModel(GL11.GL_SMOOTH);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_CULL_FACE);
        GL11.glDepthMask(false);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, -1.0F, -2.0F);

        for (int i = 0; (float)i < (f1 + f1 * f1) / 2.0F * 60.0F; ++i)
        {
            GL11.glRotatef(random.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(random.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(random.nextFloat() * 360.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(random.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(random.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(random.nextFloat() * 360.0F + f1 * 90.0F, 0.0F, 0.0F, 1.0F);
            tessellator.startDrawing(6);
            float f3 = random.nextFloat() * 20.0F + 5.0F + f2 * 10.0F;
            float f4 = random.nextFloat() * 2.0F + 1.0F + f2 * 2.0F;
            tessellator.setColorRGBA_I(0, (int)(255.0F * (1.0F - f2)));
            tessellator.addVertex(0.0D, 0.0D, 0.0D);
            tessellator.setColorRGBA_I(0, 0);
            tessellator.addVertex(-0.866D * (double)f4, (double)f3, (double)(-0.5F * f4));
            tessellator.addVertex(0.866D * (double)f4, (double)f3, (double)(-0.5F * f4));
            tessellator.addVertex(0.0D, (double)f3, (double)(1.0F * f4));
            tessellator.addVertex(-0.866D * (double)f4, (double)f3, (double)(-0.5F * f4));
            tessellator.draw();
        }

        GL11.glPopMatrix();
        GL11.glDepthMask(true);
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glShadeModel(GL11.GL_FLAT);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
	}

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
			float rot = 0.0F;
			if (tileentity.getWorldObj() != null)
			{
				rot = tileentity.getWorldObj().getWorldTime() % 360L;
			}
			RenderHelper.disableStandardItemLighting();
			GL11.glPushMatrix();
			GL11.glTranslatef(0f, 0f,0f);
			GL11.glTranslated((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
			GL11.glRotatef(180, 0F, 0F, 1F);
			doDragonEffect(rot);
			GL11.glPushMatrix();
			GL11.glRotatef(-1 * rot, 0.00F, 0.50F, 0.00F);
			GL11.glTranslatef(0, 0.5F, 0);
			GL11.glScalef(0.5F, 0.5F, 0.5F);
			this.bindTexture(texture);
			this.model.render(0.0625F);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glRotatef(rot, 0.00F, 0.50F, 0.00F);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

			this.bindTexture(texture_Pass);
			this.model.render(0.0625F);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glPopMatrix();
			GL11.glPopMatrix();	
		}
	}

