// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Packs a list of {@code N} rank-{@code R} tensors into one rank-{@code (R+1)} tensor.
 * 
 *  Packs the {@code N} tensors in {@code values} into a tensor with rank one higher than each
 *  tensor in {@code values}, by packing them along the {@code axis} dimension.
 *  Given a list of tensors of shape {@code (A, B, C)};
 * 
 *  if {@code axis == 0} then the {@code output} tensor will have the shape {@code (N, A, B, C)}.
 *  if {@code axis == 1} then the {@code output} tensor will have the shape {@code (A, N, B, C)}.
 *  Etc.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # 'x' is [1, 4]
 *  # 'y' is [2, 5]
 *  # 'z' is [3, 6]
 *  pack([x, y, z]) => [[1, 4], [2, 5], [3, 6]]  # Pack along first dim.
 *  pack([x, y, z], axis=1) => [[1, 2, 3], [4, 5, 6]]
 *  }</pre>
 * 
 *  This is the opposite of {@code unpack}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * values: Must be of same shape and type.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * axis: Dimension along which to pack.  Negative values wrap around, so the
 *  valid range is {@code [-(R+1), R+1)}.
 * 
 *  Returns:
 *  * {@code Output}: The packed tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Stack extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Stack(Pointer p) { super(p); }

  /** Optional attribute setters for Stack */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** Dimension along which to pack.  Negative values wrap around, so the
     *  valid range is {@code [-(R+1), R+1)}.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs Axis(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long axis_(); public native Attrs axis_(long setter);
  }
  public Stack(@Const @ByRef Scope scope, @ByVal InputList values) { super((Pointer)null); allocate(scope, values); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList values);
  public Stack(@Const @ByRef Scope scope, @ByVal InputList values, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, values, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList values, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Axis(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native Stack operation(Operation setter);
  public native @ByRef Output output(); public native Stack output(Output setter);
}
