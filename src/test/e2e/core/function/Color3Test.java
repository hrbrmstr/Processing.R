
// Generated by hack/generate-e2e-test.py
package test.e2e.core.function;

import static org.junit.Assert.fail;
import org.junit.Test;
import test.e2e.core.E2eTestBase;

public class Color3Test extends E2eTestBase {

  public Color3Test() {
    coreCodeTemplate = "noStroke()  # Don't draw a stroke around shapes\n\n# If no colorMode is specified, then the default of RGB with scale of 0-255 is\n# used.\nc = color(50, 55, 100)  # Create a color for 'c'\nfill(c)  # Use color variable 'c' as fill color\nrect(0, 10, 45, 80)  # Draw left rect\n\ncolorMode(HSB, 100)  # Use HSB with scale of 0-100\nc = color(50, 55, 100)  # Update 'c' with new color\nfill(c)  # Use updated 'c' as fill color\nrect(55, 10, 45, 80)  # Draw right rect\n\nsaveFrame(\"%s\")\nexit()\n";
    referenceURI = "https://processing.org/reference/images/color_2.png";
  }

  @Test
  public void test() {
    try {
      defaultOperation();
    } catch (Exception exception) {
      System.err.println(exception);
      fail("Should not have thrown any exception");
    }
  }
}