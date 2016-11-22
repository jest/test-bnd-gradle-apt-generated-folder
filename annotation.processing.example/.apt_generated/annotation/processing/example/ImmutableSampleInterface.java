package annotation.processing.example;

import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SampleInterface}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSampleInterface.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SampleInterface"})
public final class ImmutableSampleInterface implements SampleInterface {

  private ImmutableSampleInterface(ImmutableSampleInterface.Builder builder) {
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSampleInterface} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSampleInterface
        && equalTo((ImmutableSampleInterface) another);
  }

  private boolean equalTo(ImmutableSampleInterface another) {
    return true;
  }

  /**
   * Returns a constant hash code value.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    return -708640914;
  }

  /**
   * Prints the immutable value {@code SampleInterface}.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SampleInterface{}";
  }

  /**
   * Creates an immutable copy of a {@link SampleInterface} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SampleInterface instance
   */
  public static ImmutableSampleInterface copyOf(SampleInterface instance) {
    if (instance instanceof ImmutableSampleInterface) {
      return (ImmutableSampleInterface) instance;
    }
    return ImmutableSampleInterface.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSampleInterface ImmutableSampleInterface}.
   * @return A new ImmutableSampleInterface builder
   */
  public static ImmutableSampleInterface.Builder builder() {
    return new ImmutableSampleInterface.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSampleInterface ImmutableSampleInterface}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SampleInterface} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SampleInterface instance) {
      Objects.requireNonNull(instance, "instance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableSampleInterface ImmutableSampleInterface}.
     * @return An immutable instance of SampleInterface
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSampleInterface build() {
      return new ImmutableSampleInterface(this);
    }
  }
}
