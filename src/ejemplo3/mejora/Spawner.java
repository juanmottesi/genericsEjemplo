package ejemplo3.mejora;

import java.util.Random;

import ejemplo3.Component;
import ejemplo3.Screen;

public class Spawner<E extends Component> {

	private Float cooldown;
	private Float timer;
	private Screen screen;
	private Class<E> spawnClass;

	public Spawner(Class<E> spawnElement, Screen screen) {
		this.screen = screen;
		timer = 0.0f;
		cooldown = this.generateCooldown() * 2;
		this.spawnClass = spawnElement;
	}

	public void update(Float delta) {
		if (timer >= cooldown) {
			this.spawnElement();
			timer = 0f;
			cooldown = this.generateCooldown() * 2;
		} else {
			timer += delta;
		}
	}

	private void spawnElement() {
		
		try {
			E element = this.spawnClass.newInstance();
			element.setScreen(this.screen);
			this.screen.addComponent(element);
		} catch (InstantiationException e) {
			throw new RuntimeException();
		} catch (IllegalAccessException e) {
			throw new RuntimeException();
		}

	}

	public float generateCooldown() {
		float newNumber = new Random().nextFloat();
		return (newNumber * 0.5f) + 0.2f;
	}

}
