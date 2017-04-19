package org.egordorichev.lasttry.entity;

import org.egordorichev.lasttry.LastTry;

public class Entity {
	protected boolean active = false;

	public Entity() {

	}

	public void render() {

	}

	public void update(int dt) {

	}

	public void spawn(int x, int y) {
		if (this.active) {
			return;
		}

		this.active = true;
		this.onSpawn();
	}

	public void die() {
		if (!this.active) {
			return;
		}

		this.active = false;
		this.onDeath();

		LastTry.entityManager.markForRemoval(this);
	}

	protected void onSpawn() {

	}

	protected void onDeath() {

	}

	public boolean isActive() {
		return this.active;
	}
}