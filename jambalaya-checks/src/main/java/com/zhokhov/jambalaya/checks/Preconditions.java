package com.zhokhov.jambalaya.checks;

import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;

import static java.util.Objects.requireNonNull;

/**
 * Preconditions provide static methods to check that a method or a constructor is invoked with proper parameter or not.
 * It checks the pre-conditions. Its methods throw {@link IllegalArgumentException} on failure.
 *
 * @author Alexey Zhokhov
 */
public final class Preconditions {

    private Preconditions() {
    }

    // Object

    /**
     * Ensures that the parameter being validated is {@code null}.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkNull(@Nullable Object value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value != null) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be null");
        }
    }

    /**
     * Ensures that the parameter being validated is not {@code null}.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkNotNull(@Nullable Object value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null) {
            throw new IllegalArgumentException("The \"" + argument + "\" must not be null");
        }
    }

    // Boolean

    /**
     * Ensures that the parameter being validated is {@code true}.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkTrue(@Nullable Boolean value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (!Boolean.TRUE.equals(value)) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be true");
        }
    }

    /**
     * Ensures that the parameter being validated is {@code false}.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkFalse(@Nullable Boolean value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (!Boolean.FALSE.equals(value)) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be false");
        }
    }

    // String

    /**
     * Ensures that the parameter being validated is blank.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkBlank(@Nullable String value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || !value.isBlank()) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be blank");
        }
    }

    /**
     * Ensures that the parameter being validated is not blank or {@code null}.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkNotBlank(@Nullable String value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("The \"" + argument + "\" must not be blank");
        }
    }

    // Integer

    /**
     * Ensures that the parameter being validated is positive number.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkPositive(@Nullable Integer value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value < 1) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be positive");
        }
    }

    /**
     * Ensures that the parameter being validated is positive number or equals to zero.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkPositiveOrZero(@Nullable Integer value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value < 0) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be positive or zero");
        }
    }

    /**
     * Ensures that the parameter being validated is negative number.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkNegative(@Nullable Integer value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value >= 0) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be negative");
        }
    }

    /**
     * Ensures that the parameter being validated is negative number or equals to zero.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkNegativeOrZero(@Nullable Integer value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value > 0) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be negative or zero");
        }
    }

    // Long

    /**
     * Ensures that the parameter being validated is positive number.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkPositive(@Nullable Long value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value < 1) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be positive");
        }
    }

    /**
     * Ensures that the parameter being validated is positive number or equals to zero.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkPositiveOrZero(@Nullable Long value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value < 0) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be positive or zero");
        }
    }

    /**
     * Ensures that the parameter being validated is negative number.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkNegative(@Nullable Long value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value >= 0) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be negative");
        }
    }

    /**
     * Ensures that the parameter being validated is {@code null}.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkNegativeOrZero(@Nullable Long value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value > 0) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be negative or zero");
        }
    }

    // Double

    /**
     * Ensures that the parameter being validated is {@code null}.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkPositive(@Nullable Double value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value < 1) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be positive");
        }
    }

    /**
     * Ensures that the parameter being validated is {@code null}.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkPositiveOrZero(@Nullable Double value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value < 0) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be positive or zero");
        }
    }

    /**
     * Ensures that the parameter being validated is {@code null}.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkNegative(@Nullable Double value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value >= 0) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be negative");
        }
    }

    /**
     * Ensures that the parameter being validated is {@code null}.
     *
     * @param value    parameter's value
     * @param argument the name of parameter
     */
    public static void checkNegativeOrZero(@Nullable Double value, @NonNull String argument) {
        requireNonNull(argument, "argument");

        if (value == null || value > 0) {
            throw new IllegalArgumentException("The \"" + argument + "\" must be negative or zero");
        }
    }

}