package com.craftless.tutorial.init;

import com.craftless.tutorial.Tutorial;
import com.craftless.tutorial.entities.HogEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes
{
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Tutorial.MOD_ID);
	
	
	//Entity Types
	public static final RegistryObject<EntityType<HogEntity>> HOG = ENTITY_TYPES.register("hog",
			() -> EntityType.Builder.create(HogEntity::new, EntityClassification.CREATURE)
				.size(1.0f, 1.0f)
				.build(new ResourceLocation(Tutorial.MOD_ID, "hog").toString()));

}
