/* 
 * TURNUS - www.turnus.co
 * 
 * Copyright (C) 2010-2016 EPFL SCI STI MM
 *
 * This file is part of TURNUS.
 *
 * TURNUS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TURNUS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TURNUS.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Additional permission under GNU GPL version 3 section 7
 * 
 * If you modify this Program, or any covered work, by linking or combining it
 * with Eclipse (or a modified version of Eclipse or an Eclipse plugin or 
 * an Eclipse library), containing parts covered by the terms of the 
 * Eclipse Public License (EPL), the licensors of this Program grant you 
 * additional permission to convey the resulting work.  Corresponding Source 
 * for a non-source form of such a combination shall include the source code 
 * for the parts of Eclipse libraries used as well as that of the  covered work.
 * 
 */
package turnus.model.analysis.buffers.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import turnus.model.analysis.AnalysisPackage;
import turnus.model.analysis.bottlenecks.BottlenecksPackage;

import turnus.model.analysis.bottlenecks.impl.BottlenecksPackageImpl;

import turnus.model.analysis.buffers.BoundedBufferData;
import turnus.model.analysis.buffers.BoundedBuffersReport;
import turnus.model.analysis.buffers.BuffersFactory;
import turnus.model.analysis.buffers.BuffersPackage;

import turnus.model.analysis.buffers.OptimalBufferData;
import turnus.model.analysis.buffers.OptimalBuffersReport;
import turnus.model.analysis.impl.AnalysisPackageImpl;
import turnus.model.analysis.map.MapPackage;

import turnus.model.analysis.map.impl.MapPackageImpl;

import turnus.model.analysis.partitioning.PartitioningPackage;
import turnus.model.analysis.partitioning.impl.PartitioningPackageImpl;
import turnus.model.analysis.pipelining.PipeliningPackage;
import turnus.model.analysis.pipelining.impl.PipeliningPackageImpl;
import turnus.model.analysis.postprocessing.PostprocessingPackage;
import turnus.model.analysis.postprocessing.impl.PostprocessingPackageImpl;
import turnus.model.analysis.profiler.ProfilerPackage;

import turnus.model.analysis.profiler.impl.ProfilerPackageImpl;

import turnus.model.analysis.profiling.ProfilingPackage;
import turnus.model.analysis.profiling.impl.ProfilingPackageImpl;
import turnus.model.analysis.scheduling.SchedulingPackage;
import turnus.model.analysis.scheduling.impl.SchedulingPackageImpl;
import turnus.model.analysis.trace.TracePackage;

import turnus.model.analysis.trace.impl.TracePackageImpl;

import turnus.model.dataflow.DataflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuffersPackageImpl extends EPackageImpl implements BuffersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedBuffersReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedBufferDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimalBuffersReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimalBufferDataEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see turnus.model.analysis.buffers.BuffersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BuffersPackageImpl() {
		super(eNS_URI, BuffersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BuffersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BuffersPackage init() {
		if (isInited) return (BuffersPackage)EPackage.Registry.INSTANCE.getEPackage(BuffersPackage.eNS_URI);

		// Obtain or create and register package
		BuffersPackageImpl theBuffersPackage = (BuffersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BuffersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BuffersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DataflowPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AnalysisPackageImpl theAnalysisPackage = (AnalysisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI) instanceof AnalysisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI) : AnalysisPackage.eINSTANCE);
		ProfilerPackageImpl theProfilerPackage = (ProfilerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProfilerPackage.eNS_URI) instanceof ProfilerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProfilerPackage.eNS_URI) : ProfilerPackage.eINSTANCE);
		MapPackageImpl theMapPackage = (MapPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapPackage.eNS_URI) instanceof MapPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapPackage.eNS_URI) : MapPackage.eINSTANCE);
		TracePackageImpl theTracePackage = (TracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI) instanceof TracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI) : TracePackage.eINSTANCE);
		BottlenecksPackageImpl theBottlenecksPackage = (BottlenecksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BottlenecksPackage.eNS_URI) instanceof BottlenecksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BottlenecksPackage.eNS_URI) : BottlenecksPackage.eINSTANCE);
		PartitioningPackageImpl thePartitioningPackage = (PartitioningPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PartitioningPackage.eNS_URI) instanceof PartitioningPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PartitioningPackage.eNS_URI) : PartitioningPackage.eINSTANCE);
		PipeliningPackageImpl thePipeliningPackage = (PipeliningPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PipeliningPackage.eNS_URI) instanceof PipeliningPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PipeliningPackage.eNS_URI) : PipeliningPackage.eINSTANCE);
		PostprocessingPackageImpl thePostprocessingPackage = (PostprocessingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PostprocessingPackage.eNS_URI) instanceof PostprocessingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PostprocessingPackage.eNS_URI) : PostprocessingPackage.eINSTANCE);
		ProfilingPackageImpl theProfilingPackage = (ProfilingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProfilingPackage.eNS_URI) instanceof ProfilingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProfilingPackage.eNS_URI) : ProfilingPackage.eINSTANCE);
		SchedulingPackageImpl theSchedulingPackage = (SchedulingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulingPackage.eNS_URI) instanceof SchedulingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulingPackage.eNS_URI) : SchedulingPackage.eINSTANCE);

		// Create package meta-data objects
		theBuffersPackage.createPackageContents();
		theAnalysisPackage.createPackageContents();
		theProfilerPackage.createPackageContents();
		theMapPackage.createPackageContents();
		theTracePackage.createPackageContents();
		theBottlenecksPackage.createPackageContents();
		thePartitioningPackage.createPackageContents();
		thePipeliningPackage.createPackageContents();
		thePostprocessingPackage.createPackageContents();
		theProfilingPackage.createPackageContents();
		theSchedulingPackage.createPackageContents();

		// Initialize created meta-data
		theBuffersPackage.initializePackageContents();
		theAnalysisPackage.initializePackageContents();
		theProfilerPackage.initializePackageContents();
		theMapPackage.initializePackageContents();
		theTracePackage.initializePackageContents();
		theBottlenecksPackage.initializePackageContents();
		thePartitioningPackage.initializePackageContents();
		thePipeliningPackage.initializePackageContents();
		thePostprocessingPackage.initializePackageContents();
		theProfilingPackage.initializePackageContents();
		theSchedulingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBuffersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BuffersPackage.eNS_URI, theBuffersPackage);
		return theBuffersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedBuffersReport() {
		return boundedBuffersReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundedBuffersReport_Network() {
		return (EReference)boundedBuffersReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedBuffersReport_Pow2() {
		return (EAttribute)boundedBuffersReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedBuffersReport_BitAccurate() {
		return (EAttribute)boundedBuffersReportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundedBuffersReport_BuffersData() {
		return (EReference)boundedBuffersReportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedBuffersReport_TokenSize() {
		return (EAttribute)boundedBuffersReportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedBuffersReport_BitSize() {
		return (EAttribute)boundedBuffersReportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedBufferData() {
		return boundedBufferDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundedBufferData_Buffer() {
		return (EReference)boundedBufferDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedBufferData_TokenSize() {
		return (EAttribute)boundedBufferDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedBufferData_BitSize() {
		return (EAttribute)boundedBufferDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptimalBuffersReport() {
		return optimalBuffersReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimalBuffersReport_Network() {
		return (EReference)optimalBuffersReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimalBuffersReport_Pow2() {
		return (EAttribute)optimalBuffersReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimalBuffersReport_BitAccurate() {
		return (EAttribute)optimalBuffersReportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimalBuffersReport_BuffersData() {
		return (EReference)optimalBuffersReportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimalBuffersReport_InitialBufferConfiguration() {
		return (EReference)optimalBuffersReportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimalBuffersReport_InitialBottlenecks() {
		return (EReference)optimalBuffersReportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptimalBufferData() {
		return optimalBufferDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimalBufferData_BufferData() {
		return (EReference)optimalBufferDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimalBufferData_BottlenecksData() {
		return (EReference)optimalBufferDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuffersFactory getBuffersFactory() {
		return (BuffersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		boundedBuffersReportEClass = createEClass(BOUNDED_BUFFERS_REPORT);
		createEReference(boundedBuffersReportEClass, BOUNDED_BUFFERS_REPORT__NETWORK);
		createEAttribute(boundedBuffersReportEClass, BOUNDED_BUFFERS_REPORT__POW2);
		createEAttribute(boundedBuffersReportEClass, BOUNDED_BUFFERS_REPORT__BIT_ACCURATE);
		createEReference(boundedBuffersReportEClass, BOUNDED_BUFFERS_REPORT__BUFFERS_DATA);
		createEAttribute(boundedBuffersReportEClass, BOUNDED_BUFFERS_REPORT__TOKEN_SIZE);
		createEAttribute(boundedBuffersReportEClass, BOUNDED_BUFFERS_REPORT__BIT_SIZE);

		boundedBufferDataEClass = createEClass(BOUNDED_BUFFER_DATA);
		createEReference(boundedBufferDataEClass, BOUNDED_BUFFER_DATA__BUFFER);
		createEAttribute(boundedBufferDataEClass, BOUNDED_BUFFER_DATA__TOKEN_SIZE);
		createEAttribute(boundedBufferDataEClass, BOUNDED_BUFFER_DATA__BIT_SIZE);

		optimalBuffersReportEClass = createEClass(OPTIMAL_BUFFERS_REPORT);
		createEReference(optimalBuffersReportEClass, OPTIMAL_BUFFERS_REPORT__NETWORK);
		createEAttribute(optimalBuffersReportEClass, OPTIMAL_BUFFERS_REPORT__POW2);
		createEAttribute(optimalBuffersReportEClass, OPTIMAL_BUFFERS_REPORT__BIT_ACCURATE);
		createEReference(optimalBuffersReportEClass, OPTIMAL_BUFFERS_REPORT__BUFFERS_DATA);
		createEReference(optimalBuffersReportEClass, OPTIMAL_BUFFERS_REPORT__INITIAL_BUFFER_CONFIGURATION);
		createEReference(optimalBuffersReportEClass, OPTIMAL_BUFFERS_REPORT__INITIAL_BOTTLENECKS);

		optimalBufferDataEClass = createEClass(OPTIMAL_BUFFER_DATA);
		createEReference(optimalBufferDataEClass, OPTIMAL_BUFFER_DATA__BUFFER_DATA);
		createEReference(optimalBufferDataEClass, OPTIMAL_BUFFER_DATA__BOTTLENECKS_DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AnalysisPackage theAnalysisPackage = (AnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);
		DataflowPackage theDataflowPackage = (DataflowPackage)EPackage.Registry.INSTANCE.getEPackage(DataflowPackage.eNS_URI);
		BottlenecksPackage theBottlenecksPackage = (BottlenecksPackage)EPackage.Registry.INSTANCE.getEPackage(BottlenecksPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boundedBuffersReportEClass.getESuperTypes().add(theAnalysisPackage.getAnalysisReport());
		optimalBuffersReportEClass.getESuperTypes().add(theAnalysisPackage.getAnalysisReport());

		// Initialize classes, features, and operations; add parameters
		initEClass(boundedBuffersReportEClass, BoundedBuffersReport.class, "BoundedBuffersReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundedBuffersReport_Network(), theDataflowPackage.getNetwork(), null, "network", null, 0, 1, BoundedBuffersReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedBuffersReport_Pow2(), ecorePackage.getEBoolean(), "pow2", null, 0, 1, BoundedBuffersReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedBuffersReport_BitAccurate(), ecorePackage.getEBoolean(), "bitAccurate", null, 0, 1, BoundedBuffersReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundedBuffersReport_BuffersData(), this.getBoundedBufferData(), null, "buffersData", null, 0, -1, BoundedBuffersReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedBuffersReport_TokenSize(), ecorePackage.getEInt(), "tokenSize", "0", 0, 1, BoundedBuffersReport.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedBuffersReport_BitSize(), ecorePackage.getEInt(), "bitSize", "0", 0, 1, BoundedBuffersReport.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(boundedBufferDataEClass, BoundedBufferData.class, "BoundedBufferData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundedBufferData_Buffer(), theDataflowPackage.getBuffer(), null, "buffer", null, 0, 1, BoundedBufferData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedBufferData_TokenSize(), ecorePackage.getEInt(), "tokenSize", null, 0, 1, BoundedBufferData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedBufferData_BitSize(), ecorePackage.getEInt(), "bitSize", "0", 0, 1, BoundedBufferData.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(optimalBuffersReportEClass, OptimalBuffersReport.class, "OptimalBuffersReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptimalBuffersReport_Network(), theDataflowPackage.getNetwork(), null, "network", null, 0, 1, OptimalBuffersReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptimalBuffersReport_Pow2(), ecorePackage.getEBoolean(), "pow2", null, 0, 1, OptimalBuffersReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptimalBuffersReport_BitAccurate(), ecorePackage.getEBoolean(), "bitAccurate", null, 0, 1, OptimalBuffersReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimalBuffersReport_BuffersData(), this.getOptimalBufferData(), null, "buffersData", null, 0, -1, OptimalBuffersReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimalBuffersReport_InitialBufferConfiguration(), this.getBoundedBuffersReport(), null, "initialBufferConfiguration", null, 1, 1, OptimalBuffersReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimalBuffersReport_InitialBottlenecks(), theBottlenecksPackage.getBottlenecksWithSchedulingReport(), null, "initialBottlenecks", null, 1, 1, OptimalBuffersReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optimalBufferDataEClass, OptimalBufferData.class, "OptimalBufferData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptimalBufferData_BufferData(), this.getBoundedBuffersReport(), null, "bufferData", null, 0, 1, OptimalBufferData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimalBufferData_BottlenecksData(), theBottlenecksPackage.getBottlenecksWithSchedulingReport(), null, "bottlenecksData", null, 0, 1, OptimalBufferData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //BuffersPackageImpl
