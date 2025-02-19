// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Stacks all tensors in the list.
 * 
 *  Requires that all tensors have the same shape.
 * 
 *  input_handle: the input list
 *  tensor: the gathered result
 *  num_elements: optional. If not -1, the number of elements in the list.
 * 
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The tensor tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorListStack extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorListStack(Pointer p) { super(p); }

  /** Optional attribute setters for TensorListStack */
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
  
    /** Defaults to -1 */
    public native @ByVal Attrs NumElements(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long num_elements_(); public native Attrs num_elements_(long setter);
  }
  public TensorListStack(@Const @ByRef Scope scope, @ByVal Input input_handle, @ByVal Input element_shape, @Cast("tensorflow::DataType") int element_dtype) { super((Pointer)null); allocate(scope, input_handle, element_shape, element_dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_handle, @ByVal Input element_shape, @Cast("tensorflow::DataType") int element_dtype);
  public TensorListStack(@Const @ByRef Scope scope, @ByVal Input input_handle, @ByVal Input element_shape, @Cast("tensorflow::DataType") int element_dtype, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_handle, element_shape, element_dtype, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_handle, @ByVal Input element_shape, @Cast("tensorflow::DataType") int element_dtype, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs NumElements(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native TensorListStack operation(Operation setter);
  public native @ByRef Output tensor(); public native TensorListStack tensor(Output setter);
}
