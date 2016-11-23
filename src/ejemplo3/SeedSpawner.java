package ejemplo3;

import java.util.Random;

public class SeedSpawner {

	private Float cooldown;
	private Float timer;
	private Screen screen;

	public SeedSpawner(Screen screen) {
		this.screen = screen;
		timer = 0.0f;
		cooldown = this.generateCooldown() * 2;
	}

	public void update(Float delta) {
		if (timer >= cooldown) {
			this.spawnBall();
			timer = 0f;
			cooldown = this.generateCooldown() * 2;
		} else {
			timer += delta;
		}
	}

	private void spawnBall() {
		Seed seed = new Seed(this.screen);
		this.screen.addComponent(seed);
	}

	public float generateCooldown() {
		float newNumber = new Random().nextFloat();
		return (newNumber * 0.5f) + 0.2f;
	}

}
