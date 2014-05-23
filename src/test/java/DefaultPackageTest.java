import cz.posvic.MainActivity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class DefaultPackageTest {

	private MainActivity activity;

	@Before
	public void setup() {
		activity = Robolectric.buildActivity(MainActivity.class).create().resume().get();
	}

	@Test
	public void shouldBeTrue() throws Exception {
		Assert.assertTrue(true);
		Assert.assertTrue(activity.negative(10) == -10);
	}

	@Test
	public void shouldNotBeNull() throws Exception {
		Assert.assertNotNull(activity);
	}
}