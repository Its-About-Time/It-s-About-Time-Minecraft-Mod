package itsabouttime.common.entities.ai;

import itsabouttime.common.entities.prehistoric.technical.EntityTamablePrehistoric;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityTameable;

public class EntityAIPrehistoricSit extends EntityAIBase
{
    private EntityTamablePrehistoric theEntity;
    /** If the EntityTameable is sitting. */
    private boolean isSitting;
    private static final String __OBFID = "CL_00001613";

    public EntityAIPrehistoricSit(EntityTamablePrehistoric entityTamablePrehistoric)
    {
        this.theEntity = entityTamablePrehistoric;
        this.setMutexBits(5);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.theEntity.isTamed())
        {
            return false;
        }
        else if (this.theEntity.isInWater())
        {
            return false;
        }
        else if (!this.theEntity.onGround)
        {
            return false;
        }
        else
        {
            EntityLivingBase entitylivingbase = this.theEntity.getOwner();
            return entitylivingbase == null ? true : (this.theEntity.getDistanceSqToEntity(entitylivingbase) < 144.0D && entitylivingbase.getAITarget() != null ? false : this.isSitting);
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.theEntity.getNavigator().clearPathEntity();
        this.theEntity.setSitting(true);
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        this.theEntity.setSitting(false);
    }

    /**
     * Sets the sitting flag.
     */
    public void setSitting(boolean p_75270_1_)
    {
        this.isSitting = p_75270_1_;
    }
}