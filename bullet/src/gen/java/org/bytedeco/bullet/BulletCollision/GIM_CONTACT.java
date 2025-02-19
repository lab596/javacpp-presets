// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The GIM_CONTACT is an internal GIMPACT structure, similar to btManifoldPoint.
 * \todo: remove and replace GIM_CONTACT by btManifoldPoint. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class GIM_CONTACT extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GIM_CONTACT(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GIM_CONTACT(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GIM_CONTACT position(long position) {
        return (GIM_CONTACT)super.position(position);
    }
    @Override public GIM_CONTACT getPointer(long i) {
        return new GIM_CONTACT((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3 m_point(); public native GIM_CONTACT m_point(btVector3 setter);
	public native @ByRef btVector3 m_normal(); public native GIM_CONTACT m_normal(btVector3 setter);
	public native @Cast("btScalar") float m_depth(); public native GIM_CONTACT m_depth(float setter);     //Positive value indicates interpenetration
	public native @Cast("btScalar") float m_distance(); public native GIM_CONTACT m_distance(float setter);  //Padding not for use
	public native int m_feature1(); public native GIM_CONTACT m_feature1(int setter);       //Face number
	public native int m_feature2(); public native GIM_CONTACT m_feature2(int setter);
	public GIM_CONTACT() { super((Pointer)null); allocate(); }
	private native void allocate();

	public GIM_CONTACT(@Const @ByRef GIM_CONTACT contact) { super((Pointer)null); allocate(contact); }
	private native void allocate(@Const @ByRef GIM_CONTACT contact);

	public GIM_CONTACT(@Const @ByRef btVector3 point, @Const @ByRef btVector3 normal,
					@Cast("btScalar") float depth, int feature1, int feature2) { super((Pointer)null); allocate(point, normal, depth, feature1, feature2); }
	private native void allocate(@Const @ByRef btVector3 point, @Const @ByRef btVector3 normal,
					@Cast("btScalar") float depth, int feature1, int feature2);

	/** Calcs key for coord classification */
	public native @Cast("unsigned int") int calc_key_contact();

	public native void interpolate_normals(btVector3 normals, int normal_count);
}
