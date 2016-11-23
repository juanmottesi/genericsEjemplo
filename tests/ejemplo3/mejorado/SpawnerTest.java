package ejemplo3.mejorado;

import static org.mockito.Mockito.*;

import org.junit.Test;

import ejemplo3.Screen;
import ejemplo3.Seed;
import ejemplo3.mejora.Spawner;

public class SpawnerTest {

	@Test
	public void test() {
		Screen mockScreen = mock(Screen.class);
		Spawner<Seed> seedSpawner = new Spawner<Seed>(Seed.class,mockScreen);
		//Spawner<String> stringSpawner = new Spawner<String>(String.class,mockScreen);
		seedSpawner.update(10f);
		seedSpawner.update(11f);
		verify(mockScreen).addComponent(any(Seed.class));
	}

}
