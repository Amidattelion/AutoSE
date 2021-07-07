Star	"HIP 23518"
{
	ParentBody     "HIP 23518"
	Class	       "M0 V"
	Luminosity      0.0169981
	MassSol         0.423253
	RadSol          0.415024
	Teff            3850

	Age             2.38053

	InertiaMoment   0.0541204

	RotationPeriod  396.323
	Obliquity       161.574
	EqAscendNode    126.94
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.610 0.334)

	Surface
	{
		Randomize      (0.795, -0.954, 0.888)
		colorDistMagn   0.391544
		colorDistFreq   12.3515
		detailScale     742956
		colorConversion true
		tropicLatitude  0.518
		icecapLatitude  1.012
		mareFreq        28.0333
		mareDensity     0.0141198
		erosion         1
		montesFreq      537
		dunesMagn       0.515711
		hillsMagn       0.03
		hillsFreq       2345.02
		craterOctaves   0
		BumpHeight      382.156
		BumpOffset      382.156
		SpecBrightWater 0
		SpecBrightIce   0
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          2888.57
		Density         0
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      1.54031e+006
		Period      0.0214121
		Brightness  0.5
		RayDensity  2.64758
		RayCurv     12.8723
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     161.574
		AscendingNode   126.94
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet	"1"
{
	ParentBody     "HIP 23518"
	Class	       "IceGiant"

	Mass            10.6427
	Radius          22309.6
	InertiaMoment   0.181131

	Oblateness      0.00106365

	Obliquity       -1.29752
	EqAscendNode    3.40332
	Precession      0
	TidalLocked     true

	AlbedoBond      0.516293
	AlbedoGeom      0.619552
	Brightness      2

	Surface
	{
		SurfStyle       0.248079
		Randomize      (-0.181, -0.263, 0.915)
		detailScale     57381.5
		colorConversion true
		tropicLatitude  0.0452566
		icecapLatitude  0.945257
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.477358
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.95004
		stripeFluct     0.499436
		stripeTwist     11.1788
		cycloneMagn     9.44573
		cycloneFreq     0.566763
		cycloneDensity  0.599
		cycloneOctaves  0
		colorLayer0    (0.810, 0.810, 0.810, 1.000)
		colorLayer1    (0.630, 0.650, 0.650, 1.000)
		colorLayer2    (0.580, 0.560, 0.580, 1.000)
		colorLayer3    (0.610, 0.610, 0.630, 1.000)
		colorLayer4    (0.720, 0.720, 0.720, 1.000)
		colorLayer5    (0.780, 0.780, 0.780, 1.000)
		colorLayer6    (0.540, 0.540, 0.560, 1.000)
		colorLayer7    (0.690, 0.660, 0.620, 1.000)
		colorLowPlants (0.720, 0.720, 0.720, 1.000)
		colorUpPlants  (0.780, 0.780, 0.780, 1.000)
		BumpHeight      20
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          40.3105
		Velocity        -315.813
		BumpHeight      20.3096
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.755742
		mainOctaves     12
		Coverage        0.581466
		stripeZones     4.95004
		stripeFluct     0.499436
		stripeTwist     11.1788
	}

	Clouds
	{
		Height          60.6191
		Velocity        -2138.37
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        0.755742
		mainOctaves     12
		Coverage        0.581466
		stripeZones     4.95004
		stripeFluct     0.499436
		stripeTwist     11.1788
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          223.096
		Density         533.61
		Pressure        47292.5
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.000577193
		Saturation      0.893326

		Composition
		{
			He    	95.4295
			CH4   	3.64114
			N2    	0.406003
			NH3   	0.34724
			O2    	0.0822721
			C2H2  	0.0439923
			C2H4  	0.0146316
			Ne    	0.0127298
			Ar    	0.0109175
			C2H6  	0.00815899
			C3H8  	0.00335398
			H2O   	4.26707e-005
			H2S   	1.84279e-005
			CO2   	1.74699e-005
		}
	}

	Aurora
	{
		Height      230.593
		NorthLat    63.1024
		NorthLon    85.6986
		NorthRadius 4651.93
		NorthWidth  1314.29
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -87.8023
		SouthLon    278.648
		SouthRadius 6756.68
		SouthWidth  2359.35
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0288131
		Period          0.00751742
		Eccentricity    0.053257
		Inclination     -1.29752
		AscendingNode   3.40332
		ArgOfPericenter 301.048
		MeanAnomaly     97.7725
	}
}

DwarfMoon	"1.D1"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            5.73286e-006
	Radius          107.663
	InertiaMoment   0.399132

	Oblateness      0.0169795

	Obliquity       -0.0841976
	EqAscendNode    -176.587
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.537 0.533 0.529)

	Surface
	{
		SurfStyle       0.00283368
		OceanStyle      0.959547
		Randomize      (0.527, 0.815, 0.423)
		colorDistMagn   0.154572
		colorDistFreq   7.03124
		detailScale     2939.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.425197
		terraceProb     0.29384
		erosion         0
		montesMagn      0.546225
		montesFreq      2.68725
		montesSpiky     0.968171
		montesFraction  0.673531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.3894
		hillsFraction   0.831097
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206552
		craterFreq      0.41466
		craterDensity   0.688931
		craterOctaves   15
		volcanoActivity 0.709544
		volcanoFlows    0
		volcanoRadius   0.467688
		volcanoTemp     1755.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.213, 0.211, 0.000)
		colorShelf     (0.228, 0.227, 0.225, 0.000)
		colorBeach     (0.242, 0.240, 0.238, 0.000)
		colorDesert    (0.255, 0.253, 0.251, 0.000)
		colorLowland   (0.268, 0.267, 0.264, 0.000)
		colorUpland    (0.282, 0.280, 0.278, 0.000)
		colorRock      (0.295, 0.293, 0.291, 0.000)
		colorSnow      (0.309, 0.307, 0.304, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000369742
		Period          0.00126038
		Eccentricity    0.0250098
		Inclination     -0.0841976
		AscendingNode   -176.587
		ArgOfPericenter 140.136
		MeanAnomaly     52.4844
	}
}

DwarfPlanet	"2"
{
	ParentBody     "HIP 23518"
	Class	       "Selena"

	Mass            0.0037858
	Radius          1043.53
	InertiaMoment   0.394759

	Obliquity       1.95206
	EqAscendNode    -49.4986
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.657 0.653 0.651)

	Surface
	{
		SurfStyle       0.913618
		OceanStyle      0.446122
		Randomize      (-0.977, -0.080, 0.473)
		colorDistMagn   0.0434264
		colorDistFreq   142.12
		detailScale     2684.02
		colorConversion true
		drivenDarkening 0
		seaLevel        0.203403
		snowLevel       2
		tropicLatitude  0.0618397
		icecapLatitude  10
		icecapHeight    0.136727
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.94067
		venusFreq       0.651401
		venusMagn       0
		mareFreq        0.28609
		mareDensity     0.00225242
		terraceProb     0.749065
		erosion         0
		montesMagn      0.0668673
		montesFreq      44.6262
		montesSpiky     0.996874
		montesFraction  0.800819
		dunesMagn       0.0272024
		dunesFreq       1395.59
		dunesFraction   0.376623
		hillsMagn       0.124579
		hillsFreq       122.517
		hillsFraction   0.194139
		hills2Fraction  0
		riversMagn      63.2243
		riversFreq      1.67025
		riversSin       6.9352
		riversOctaves   0
		canyonsMagn     0.661495
		canyonsFreq     0.339761
		canyonFraction  0.0710257
		cracksMagn      0.0447341
		cracksFreq      0.495996
		cracksOctaves   0
		craterMagn      0.637644
		craterFreq      2.67971
		craterDensity   0.833033
		craterOctaves   10
		craterRayedFactor 0
		volcanoMagn     0.171594
		volcanoFreq     0.788169
		volcanoDensity  0.269327
		volcanoOctaves  3
		volcanoActivity 0.187682
		volcanoFlows    0.315183
		volcanoRadius   0.13391
		volcanoTemp     1305.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.466, 0.431, 0.378, 0.000)
		colorDesert    (0.545, 0.503, 0.417, 0.000)
		colorLowland   (0.433, 0.379, 0.312, 0.000)
		colorUpland    (0.387, 0.339, 0.293, 0.000)
		colorRock      (0.330, 0.250, 0.230, 0.000)
		colorSnow      (0.940, 0.910, 0.870, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0458523
		Period          0.0150918
		Eccentricity    0.0108997
		Inclination     5.7357
		AscendingNode   -49.2416
		ArgOfPericenter 227.467
		MeanAnomaly     307.068
	}
}

Planet	"3"
{
	ParentBody     "HIP 23518"
	Class	       "IceGiant"

	Mass            36.447
	Radius          26718.3
	InertiaMoment   0.221247

	Obliquity       -1.43479
	EqAscendNode    -47.5261
	Precession      0
	TidalLocked     true

	AlbedoBond      0.416487
	AlbedoGeom      0.499784
	Brightness      2

	Surface
	{
		SurfStyle       0.291584
		Randomize      (-0.831, -0.019, -0.660)
		detailScale     68720.9
		colorConversion true
		tropicLatitude  0.0458201
		icecapLatitude  0.94582
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.141896
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.49609
		stripeFluct     0.461693
		stripeTwist     8.43889
		cycloneMagn     8.92601
		cycloneFreq     0.954264
		cycloneDensity  0.322486
		cycloneOctaves  0
		colorLayer0    (0.120, 0.200, 0.480, 1.000)
		colorLayer1    (0.330, 0.400, 0.720, 1.000)
		colorLayer2    (0.330, 0.400, 0.720, 1.000)
		colorLayer3    (0.600, 0.600, 0.600, 1.000)
		colorLayer4    (0.350, 0.430, 0.770, 1.000)
		colorLayer5    (0.470, 0.540, 0.850, 1.000)
		colorLayer6    (0.600, 0.650, 0.910, 1.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 1.000)
		colorUpPlants  (0.470, 0.540, 0.850, 1.000)
		BumpHeight      13.8776
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          64.5391
		Velocity        497.481
		BumpHeight      50.661
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.964445
		mainOctaves     12
		Coverage        0.082434
		stripeZones     4.49609
		stripeFluct     0.461693
		stripeTwist     8.43889
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          267.183
		Density         5532.76
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0239812
		Saturation      0.61426

		Composition
		{
			H2    	90.2974
			He    	9.25781
			CH4   	0.354365
			N2    	0.0422178
			NH3   	0.0315719
			O2    	0.00843504
			C2H2  	0.00320988
			C2H4  	0.00164307
			Ne    	0.00126278
			Ar    	0.00106428
			C2H6  	0.000606363
			C3H8  	0.000386937
		}
	}

	Aurora
	{
		Height      507.307
		NorthLat    60.3647
		NorthLon    -85.5629
		NorthRadius 6540.08
		NorthWidth  2496.19
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -60.8338
		SouthLon    99.9369
		SouthRadius 7950.34
		SouthWidth  1907.12
		SouthRings  4
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0768033
		Period          0.0327125
		Eccentricity    0.0512618
		Inclination     -1.43479
		AscendingNode   -47.5261
		ArgOfPericenter 215.835
		MeanAnomaly     115.364
	}
}

DwarfMoon	"3.D1"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            2.36666e-008
	Radius          21.4187
	InertiaMoment   0.399162

	Oblateness      0.135592

	Obliquity       0.0126047
	EqAscendNode    -2.42442
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.778 0.776 0.775)

	Surface
	{
		SurfStyle       0.913763
		OceanStyle      0.942828
		Randomize      (0.763, -0.841, 0.312)
		colorDistMagn   0.157757
		colorDistFreq   0.276049
		detailScale     584.874
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577587
		terraceProb     0.134525
		erosion         0
		montesMagn      0.508333
		montesFreq      2.76243
		montesSpiky     0.923525
		montesFraction  0.608243
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.40179
		hillsFraction   0.670411
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236687
		craterFreq      0.189478
		craterDensity   0.7414
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443744
		volcanoTemp     1881.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.272, 0.310, 0.050)
		colorShelf     (0.311, 0.318, 0.356, 0.040)
		colorBeach     (0.358, 0.365, 0.403, 0.030)
		colorDesert    (0.405, 0.411, 0.457, 0.020)
		colorLowland   (0.451, 0.458, 0.503, 0.030)
		colorUpland    (0.498, 0.504, 0.550, 0.050)
		colorRock      (0.545, 0.551, 0.612, 0.020)
		colorSnow      (0.545, 0.551, 0.612, 1.000)
		BumpHeight      19.2768
		BumpOffset      3.85537
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000345796
		Period          0.000615997
		Eccentricity    3.34621e-005
		Inclination     0.0126047
		AscendingNode   -2.42442
		ArgOfPericenter 140.746
		MeanAnomaly     -179.192
	}
}

DwarfMoon	"3.D2"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            3.21166e-008
	Radius          41.7504
	InertiaMoment   0.395518

	Oblateness      0.249

	Obliquity       -0.00130787
	EqAscendNode    176.798
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.639 0.498 0.412)

	Surface
	{
		SurfStyle       0.357018
		OceanStyle      0.384801
		Randomize      (0.354, -0.033, 0.268)
		colorDistMagn   0.323524
		colorDistFreq   0.623725
		detailScale     1140.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492344
		terraceProb     0.260238
		erosion         0
		montesMagn      0.428188
		montesFreq      2.81357
		montesSpiky     0.994161
		montesFraction  0.523293
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.75988
		hillsFraction   0.571898
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192969
		craterFreq      0.19273
		craterDensity   0.891435
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5217
		volcanoTemp     1494.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.199, 0.165, 0.000)
		colorShelf     (0.272, 0.212, 0.175, 0.000)
		colorBeach     (0.288, 0.224, 0.185, 0.000)
		colorDesert    (0.303, 0.236, 0.196, 0.000)
		colorLowland   (0.319, 0.249, 0.206, 0.000)
		colorUpland    (0.335, 0.261, 0.216, 0.000)
		colorRock      (0.351, 0.274, 0.226, 0.000)
		colorSnow      (0.367, 0.286, 0.237, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00040572
		Period          0.000782868
		Eccentricity    8.09217e-005
		Inclination     -0.00130787
		AscendingNode   176.798
		ArgOfPericenter -145.696
		MeanAnomaly     5.08023
	}
}

DwarfMoon	"3.D3"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            4.35856e-008
	Radius          30.696
	InertiaMoment   0.398226

	Oblateness      0.0883034

	Obliquity       0.00671789
	EqAscendNode    -107.741
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.444 0.364)

	Surface
	{
		SurfStyle       0.952553
		OceanStyle      0.0444153
		Randomize      (0.582, -0.948, -0.809)
		colorDistMagn   0.121897
		colorDistFreq   0.752221
		detailScale     838.205
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512772
		terraceProb     0.264587
		erosion         0
		montesMagn      0.568269
		montesFreq      3.33955
		montesSpiky     0.956697
		montesFraction  0.377267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.41793
		hillsFraction   0.689095
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251936
		craterFreq      0.206637
		craterDensity   0.816505
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491343
		volcanoTemp     1390.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.155, 0.146, 0.050)
		colorShelf     (0.208, 0.182, 0.168, 0.040)
		colorBeach     (0.240, 0.209, 0.189, 0.030)
		colorDesert    (0.271, 0.235, 0.215, 0.020)
		colorLowland   (0.302, 0.262, 0.237, 0.030)
		colorUpland    (0.333, 0.289, 0.259, 0.050)
		colorRock      (0.365, 0.315, 0.288, 0.020)
		colorSnow      (0.365, 0.315, 0.288, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000465889
		Period          0.000963325
		Eccentricity    3.66197e-006
		Inclination     0.00671789
		AscendingNode   -107.741
		ArgOfPericenter -78.2525
		MeanAnomaly     60.5495
	}
}

DwarfMoon	"3.D4"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            5.92038e-008
	Radius          56.3877
	InertiaMoment   0.399296

	Oblateness      0.249

	Obliquity       0.0148048
	EqAscendNode    -23.8164
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.487 0.481)

	Surface
	{
		SurfStyle       0.573559
		OceanStyle      0.197007
		Randomize      (0.209, 0.595, -0.815)
		colorDistMagn   0.755625
		colorDistFreq   2.08302
		detailScale     1539.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464477
		terraceProb     0.426933
		erosion         0
		montesMagn      0.493041
		montesFreq      3.67223
		montesSpiky     0.973269
		montesFraction  0.536383
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.19635
		hillsFraction   0.701364
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228772
		craterFreq      0.234832
		craterDensity   0.83816
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523562
		volcanoTemp     1700.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.166, 0.135, 0.000)
		colorShelf     (0.198, 0.171, 0.154, 0.000)
		colorBeach     (0.232, 0.200, 0.183, 0.000)
		colorDesert    (0.252, 0.214, 0.178, 0.000)
		colorLowland   (0.277, 0.229, 0.202, 0.000)
		colorUpland    (0.306, 0.278, 0.245, 0.000)
		colorRock      (0.331, 0.302, 0.265, 0.000)
		colorSnow      (0.360, 0.322, 0.279, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00050894
		Period          0.00109989
		Eccentricity    3.95242e-005
		Inclination     0.0148048
		AscendingNode   -23.8164
		ArgOfPericenter -78.4854
		MeanAnomaly     -134.951
	}
}

DwarfMoon	"3.D5"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            8.05625e-008
	Radius          32.4886
	InertiaMoment   0.396437

	Oblateness      0.0340996

	Obliquity       0.00109198
	EqAscendNode    32.4906
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.737 0.735 0.733)

	Surface
	{
		SurfStyle       0.0920294
		OceanStyle      0.472611
		Randomize      (0.327, -0.933, 0.518)
		colorDistMagn   0.820008
		colorDistFreq   0.8522
		detailScale     887.154
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380569
		terraceProb     0.386517
		erosion         0
		montesMagn      0.400732
		montesFreq      2.57963
		montesSpiky     0.922034
		montesFraction  0.274687
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.8723
		hillsFraction   0.759423
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269939
		craterFreq      0.146267
		craterDensity   1.08123
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429311
		volcanoTemp     1698.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.294, 0.293, 0.000)
		colorShelf     (0.313, 0.313, 0.312, 0.000)
		colorBeach     (0.332, 0.331, 0.330, 0.000)
		colorDesert    (0.350, 0.349, 0.348, 0.000)
		colorLowland   (0.369, 0.368, 0.367, 0.000)
		colorUpland    (0.387, 0.386, 0.385, 0.000)
		colorRock      (0.406, 0.404, 0.403, 0.000)
		colorSnow      (0.424, 0.423, 0.422, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000550521
		Period          0.0012374
		Eccentricity    6.12608e-005
		Inclination     0.00109199
		AscendingNode   32.4906
		ArgOfPericenter -170.206
		MeanAnomaly     -140.466
	}
}

DwarfMoon	"3.D6"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.09923e-007
	Radius          33.7822
	InertiaMoment   0.398404

	Oblateness      0.0090971

	Obliquity       76.0252
	EqAscendNode    -59.5173
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.485 0.481 0.479)

	Surface
	{
		SurfStyle       0.570368
		OceanStyle      0.539199
		Randomize      (0.958, 0.530, 0.612)
		colorDistMagn   0.834604
		colorDistFreq   0.370234
		detailScale     922.478
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907813
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447761
		terraceProb     0.283713
		erosion         0
		montesMagn      0.61709
		montesFreq      3.34697
		montesSpiky     0.775554
		montesFraction  0.622589
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.95551
		hillsFraction   0.587849
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225551
		craterFreq      0.247703
		craterDensity   0.909945
		craterOctaves   13
		volcanoActivity 0.169201
		volcanoFlows    0
		volcanoRadius   0.579855
		volcanoTemp     1743.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.164, 0.134, 0.000)
		colorShelf     (0.194, 0.168, 0.153, 0.000)
		colorBeach     (0.228, 0.197, 0.182, 0.000)
		colorDesert    (0.247, 0.212, 0.177, 0.000)
		colorLowland   (0.271, 0.226, 0.201, 0.000)
		colorUpland    (0.300, 0.274, 0.244, 0.000)
		colorRock      (0.325, 0.298, 0.264, 0.000)
		colorSnow      (0.354, 0.318, 0.278, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000803702
		Period          0.00218268
		Eccentricity    0.480147
		Inclination     76.0252
		AscendingNode   -59.5173
		ArgOfPericenter 124.829
		MeanAnomaly     169.94
	}
}

DwarfMoon	"3.D7"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.50537e-007
	Radius          82.8464
	InertiaMoment   0.399428

	Oblateness      0.00507909

	Obliquity       -88.7157
	EqAscendNode    159.936
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.847 0.793 0.738)

	Surface
	{
		SurfStyle       0.0386886
		OceanStyle      0.309879
		Randomize      (-0.752, -0.487, -0.513)
		colorDistMagn   0.129509
		colorDistFreq   3.65626
		detailScale     2262.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.342987
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552447
		terraceProb     0.26256
		erosion         0
		montesMagn      0.550083
		montesFreq      2.77105
		montesSpiky     0.9669
		montesFraction  0.558128
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.4996
		hillsFraction   0.558289
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256184
		craterFreq      0.260181
		craterDensity   0.775748
		craterOctaves   15
		volcanoActivity 0.00743016
		volcanoFlows    0
		volcanoRadius   0.542939
		volcanoTemp     1818.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.339, 0.317, 0.295, 0.000)
		colorShelf     (0.360, 0.337, 0.314, 0.000)
		colorBeach     (0.381, 0.357, 0.332, 0.000)
		colorDesert    (0.402, 0.377, 0.350, 0.000)
		colorLowland   (0.423, 0.396, 0.369, 0.000)
		colorUpland    (0.445, 0.416, 0.387, 0.000)
		colorRock      (0.466, 0.436, 0.406, 0.000)
		colorSnow      (0.487, 0.456, 0.424, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00135958
		Period          0.00480237
		Eccentricity    0.108542
		Inclination     -88.7157
		AscendingNode   159.936
		ArgOfPericenter -7.95687
		MeanAnomaly     -30.0969
	}
}

Planet	"4"
{
	ParentBody     "HIP 23518"
	Class	       "Oceania"

	Mass            0.109781
	Radius          3549.62
	InertiaMoment   0.330739

	Obliquity       2.30358
	EqAscendNode    -91.8151
	Precession      0
	TidalLocked     true

	AlbedoBond      0.43963
	AlbedoGeom      0.527556
	Brightness      2
	Color          (0.763 0.761 0.759)

	Life
	{
		Class   "Organic"
		Type    "Unicellular"
		Biome   "Marine"
	}

	Surface
	{
		SurfStyle       0.261735
		OceanStyle      0.686858
		Randomize      (0.304, -0.726, -0.264)
		colorDistMagn   0.0634261
		colorDistFreq   482.949
		detailScale     9129.81
		colorConversion true
		seaLevel        0.940216
		snowLevel       2
		tropicLatitude  0.0559135
		icecapLatitude  10
		icecapHeight    1.06625
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.733443
		venusFreq       0.837569
		venusMagn       0
		mareFreq        0
		mareDensity     0
		terraceProb     0.349121
		erosion         0
		montesMagn      0.193667
		montesFreq      125.71
		montesSpiky     0.973478
		montesFraction  0.100312
		dunesMagn       0.0481762
		dunesFreq       26.5328
		dunesFraction   0.40345
		hillsMagn       0.028797
		hillsFreq       476.769
		hillsFraction   0.0243228
		hills2Fraction  0.144913
		riversMagn      58.9238
		riversFreq      2.62346
		riversSin       6.00478
		riversOctaves   0
		canyonsMagn     0.0521715
		canyonsFreq     77.2616
		canyonFraction  0.340416
		cracksMagn      0.0727043
		cracksFreq      0.358434
		cracksOctaves   0
		craterMagn      0.0366934
		craterFreq      33.9478
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.658451
		volcanoFreq     0.565326
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 1.18554
		volcanoFlows    0
		volcanoRadius   0.572689
		volcanoTemp     1652.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     0.7428
		cycloneDensity  0.348705
		cycloneOctaves  0
		colorSea       (0.040, 0.200, 0.200, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      57.3611
		BumpOffset      53.9318
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          25.3845
		Velocity        176.966
		BumpHeight      5.61802
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.922047
		mainOctaves     10
		Coverage        0.399384
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          50.769
		Velocity        99.6511
		BumpHeight      5.69464
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.922047
		mainOctaves     10
		Coverage        0.399384
		stripeZones     1
		stripeTwist     3.5
	}

	Ocean
	{
		Height          53.9318
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          177.481
		Density         52.2487
		Pressure        34.6455
		Greenhouse      45.6002
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0449454
		Saturation      0.597012

		Composition
		{
			CO2   	99.8884
			O2    	0.103437
			SO2   	0.00812699
			Ar    	4.50273e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.154516
		Period          0.09336
		Eccentricity    0.0671303
		Inclination     2.30358
		AscendingNode   -91.8151
		ArgOfPericenter 260.815
		MeanAnomaly     299.251
	}
}

Planet	"5"
{
	ParentBody     "HIP 23518"
	Class	       "Desert"

	Mass            0.527292
	Radius          5800.94
	InertiaMoment   0.332124

	RotationPeriod  110.201
	Obliquity       -1.80609
	EqAscendNode    100.596
	Precession      0

	AlbedoBond      0.251507
	AlbedoGeom      0.301809
	Brightness      2
	Color          (0.468 0.463 0.458)

	Surface
	{
		SurfStyle       0.952015
		OceanStyle      0.167488
		Randomize      (0.771, 0.839, 0.421)
		colorDistMagn   0.0586367
		colorDistFreq   693.35
		detailScale     14920.4
		colorConversion true
		seaLevel        0.0387796
		snowLevel       2
		tropicLatitude  0.0417582
		icecapLatitude  0.931109
		icecapHeight    0.0415494
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.05407
		venusFreq       0.629454
		venusMagn       0.480483
		mareFreq        1.32199
		mareDensity     0.0832117
		terraceProb     0.279358
		erosion         0
		montesMagn      0.213456
		montesFreq      285.238
		montesSpiky     0.958254
		montesFraction  0.222709
		dunesMagn       0.0481918
		dunesFreq       44.5716
		dunesFraction   0.134181
		hillsMagn       0.147361
		hillsFreq       763.584
		hillsFraction   0
		hills2Fraction  0
		riversMagn      65.0821
		riversFreq      3.20091
		riversSin       4.74157
		riversOctaves   0
		canyonsMagn     0.037636
		canyonsFreq     157.279
		canyonFraction  0
		cracksMagn      0.121813
		cracksFreq      0.646261
		cracksOctaves   0
		craterMagn      0.610425
		craterFreq      10.805
		craterDensity   0.387855
		craterOctaves   5.20131
		volcanoMagn     0.68943
		volcanoFreq     0.607959
		volcanoDensity  0.397639
		volcanoOctaves  3
		volcanoActivity 0.978651
		volcanoFlows    0.826334
		volcanoRadius   0.534893
		volcanoTemp     1778.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.44871
		stripeTwist     0.311307
		cycloneMagn     2.95261
		cycloneFreq     0.535156
		cycloneDensity  0.445824
		cycloneOctaves  2
		colorSea       (0.640, 0.500, 0.420, 0.000)
		colorShelf     (0.680, 0.500, 0.470, 0.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.310, 0.230, 0.170, 0.000)
		colorUpPlants  (0.510, 0.330, 0.190, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          14.6577
		Velocity        124.356
		BumpHeight      4.65751
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03886
		mainOctaves     10
		Coverage        0.103015
		stripeZones     2.44871
		stripeTwist     0.311307
	}

	Clouds
	{
		Height          19.3149
		Velocity        136.509
		BumpHeight      4.65751
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03886
		mainOctaves     10
		Coverage        0.103015
		stripeZones     2.44871
		stripeTwist     0.311307
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          34.598
		Density         0.17471
		Pressure        0.0630519
		Greenhouse      0.714594
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      0.905188

		Composition
		{
			CO2   	92.1544
			CH4   	3.37374
			N2    	2.06305
			C2H2  	1.31402
			NH3   	0.469505
			SO2   	0.384552
			H2S   	0.121498
			C2H6  	0.0503567
			CO    	0.0316965
			C2H4  	0.021362
			H2O   	0.00882743
			C3H8  	0.00354022
			Ar    	0.00338519
			Ne    	3.5148e-005
		}
	}

	Aurora
	{
		Height      150.574
		NorthLat    48.1724
		NorthLon    77.9112
		NorthRadius 1690.72
		NorthWidth  491.763
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -48.9166
		SouthLon    261.452
		SouthRadius 1456.79
		SouthWidth  307.133
		SouthRings  2
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     6552.93
		OuterRadius     15403.6
		RotationPeriod  4.38892
		RotationOffset  0
		FrontBright     0.865627
		BackBright      0.736318
		Density         0.790631
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.339591
		Period          0.304183
		Eccentricity    0.0991163
		Inclination     -1.93864
		AscendingNode   100.627
		ArgOfPericenter 321.719
		MeanAnomaly     107.728
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            6.45429e-010
	Radius          13.7619
	InertiaMoment   0.393345

	Oblateness      0.249

	Obliquity       -0.004239
	EqAscendNode    -112.564
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.672 0.669)

	Surface
	{
		SurfStyle       0.203557
		OceanStyle      0.476016
		Randomize      (-0.315, -0.542, 0.277)
		colorDistMagn   0.888341
		colorDistFreq   0.0526705
		detailScale     375.791
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.369277
		terraceProb     0.276721
		erosion         0
		montesMagn      0.56086
		montesFreq      3.63409
		montesSpiky     0.984546
		montesFraction  0.455493
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.626077
		hillsFraction   0.633035
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263399
		craterFreq      0.25054
		craterDensity   0.928311
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523276
		volcanoTemp     1348.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.269, 0.268, 0.000)
		colorShelf     (0.287, 0.286, 0.284, 0.000)
		colorBeach     (0.303, 0.302, 0.301, 0.000)
		colorDesert    (0.320, 0.319, 0.318, 0.000)
		colorLowland   (0.337, 0.336, 0.334, 0.000)
		colorUpland    (0.354, 0.353, 0.351, 0.000)
		colorRock      (0.371, 0.370, 0.368, 0.000)
		colorSnow      (0.388, 0.387, 0.385, 1.000)
		BumpHeight      12.3857
		BumpOffset      2.47714
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000128674
		Period          0.00116249
		Eccentricity    5.96147e-005
		Inclination     -0.004239
		AscendingNode   -112.564
		ArgOfPericenter 67.1531
		MeanAnomaly     69.1302
	}
}

DwarfMoon	"5.D2"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            9.39487e-010
	Radius          14.3757
	InertiaMoment   0.398134

	Oblateness      0.216248

	Obliquity       -0.00434153
	EqAscendNode    23.7226
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.784 0.725 0.679)

	Surface
	{
		SurfStyle       0.740067
		OceanStyle      0.349214
		Randomize      (0.884, -0.413, -0.503)
		colorDistMagn   0.626643
		colorDistFreq   0.0502788
		detailScale     392.552
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464826
		terraceProb     0.127882
		erosion         0
		montesMagn      0.407139
		montesFreq      4.07736
		montesSpiky     0.960022
		montesFraction  0.546772
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.48442
		hillsFraction   0.803589
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21408
		craterFreq      0.220645
		craterDensity   0.948923
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523637
		volcanoTemp     1585.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.246, 0.190, 0.000)
		colorShelf     (0.314, 0.254, 0.217, 0.000)
		colorBeach     (0.369, 0.297, 0.258, 0.000)
		colorDesert    (0.400, 0.319, 0.251, 0.000)
		colorLowland   (0.439, 0.341, 0.285, 0.000)
		colorUpland    (0.486, 0.413, 0.346, 0.000)
		colorRock      (0.526, 0.449, 0.374, 0.000)
		colorSnow      (0.573, 0.478, 0.394, 1.000)
		BumpHeight      12.9381
		BumpOffset      2.58762
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000141711
		Period          0.00134356
		Eccentricity    7.16394e-005
		Inclination     -0.00434153
		AscendingNode   23.7226
		ArgOfPericenter -4.47797
		MeanAnomaly     64.4164
	}
}

DwarfMoon	"5.D3"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.34797e-009
	Radius          15.5289
	InertiaMoment   0.399231

	RotationPeriod  353.213
	Obliquity       -50.8972
	EqAscendNode    -176.193
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.566 0.417 0.342)

	Surface
	{
		SurfStyle       0.0422775
		OceanStyle      0.198399
		Randomize      (-0.754, -0.967, 0.471)
		colorDistMagn   0.443538
		colorDistFreq   0.0808063
		detailScale     424.044
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0515295
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.760653
		terraceProb     0.133819
		erosion         0
		montesMagn      0.620212
		montesFreq      2.51768
		montesSpiky     0.83749
		montesFraction  0.37814
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.566109
		hillsFraction   0.679788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258739
		craterFreq      0.259072
		craterDensity   0.824427
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.416363
		volcanoTemp     1246.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.167, 0.137, 0.000)
		colorShelf     (0.240, 0.177, 0.145, 0.000)
		colorBeach     (0.255, 0.188, 0.154, 0.000)
		colorDesert    (0.269, 0.198, 0.163, 0.000)
		colorLowland   (0.283, 0.209, 0.171, 0.000)
		colorUpland    (0.297, 0.219, 0.180, 0.000)
		colorRock      (0.311, 0.229, 0.188, 0.000)
		colorSnow      (0.325, 0.240, 0.197, 1.000)
		BumpHeight      13.976
		BumpOffset      2.79521
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000657627
		Period          0.0134315
		Eccentricity    0.293266
		Inclination     -50.8972
		AscendingNode   -176.193
		ArgOfPericenter -98.5495
		MeanAnomaly     32.2785
	}
}

DwarfMoon	"5.D4"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.91097e-009
	Radius          16.7289
	InertiaMoment   0.396092

	Obliquity       78.0035
	EqAscendNode    -108.382
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.717 0.714 0.713)

	Surface
	{
		SurfStyle       0.264792
		OceanStyle      0.592435
		Randomize      (-0.041, 0.780, 0.538)
		colorDistMagn   0.521043
		colorDistFreq   0.171131
		detailScale     456.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.93863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.297539
		terraceProb     0.105364
		erosion         0
		montesMagn      0.501031
		montesFreq      3.06496
		montesSpiky     0.994322
		montesFraction  0.397317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.711562
		hillsFraction   0.651264
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276018
		craterFreq      0.169855
		craterDensity   0.864436
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503618
		volcanoTemp     1633.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.286, 0.285, 0.000)
		colorShelf     (0.305, 0.303, 0.303, 0.000)
		colorBeach     (0.323, 0.321, 0.321, 0.000)
		colorDesert    (0.340, 0.339, 0.339, 0.000)
		colorLowland   (0.358, 0.357, 0.356, 0.000)
		colorUpland    (0.376, 0.375, 0.374, 0.000)
		colorRock      (0.394, 0.393, 0.392, 0.000)
		colorSnow      (0.412, 0.410, 0.410, 1.000)
		BumpHeight      15.056
		BumpOffset      3.0112
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0011645
		Period          0.0316493
		Eccentricity    0.0743363
		Inclination     78.0035
		AscendingNode   -108.382
		ArgOfPericenter -172.673
		MeanAnomaly     124.816
	}
}

DwarfMoon	"5.D5"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.68208e-009
	Radius          22.8384
	InertiaMoment   0.398319

	Obliquity       79.6176
	EqAscendNode    70.1971
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.673 0.668 0.664)

	Surface
	{
		SurfStyle       0.437637
		OceanStyle      0.137303
		Randomize      (0.876, 0.969, 0.383)
		colorDistMagn   0.329106
		colorDistFreq   0.237152
		detailScale     623.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955404
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393204
		terraceProb     0.323314
		erosion         0
		montesMagn      0.530155
		montesFreq      3.59841
		montesSpiky     0.819336
		montesFraction  0.436657
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.23849
		hillsFraction   0.823183
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251795
		craterFreq      0.256392
		craterDensity   1.07318
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478803
		volcanoTemp     1515.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.267, 0.265, 0.000)
		colorShelf     (0.286, 0.284, 0.282, 0.000)
		colorBeach     (0.303, 0.301, 0.299, 0.000)
		colorDesert    (0.319, 0.317, 0.315, 0.000)
		colorLowland   (0.336, 0.334, 0.332, 0.000)
		colorUpland    (0.353, 0.351, 0.348, 0.000)
		colorRock      (0.370, 0.367, 0.365, 0.000)
		colorSnow      (0.387, 0.384, 0.382, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00161492
		Period          0.0516868
		Eccentricity    0.0650424
		Inclination     79.6176
		AscendingNode   70.1971
		ArgOfPericenter 29.5361
		MeanAnomaly     122.897
	}
}

Planet	"6"
{
	ParentBody     "HIP 23518"
	Class	       "Titan"

	Mass            2.51234
	Radius          9990.18
	InertiaMoment   0.327014

	Oblateness      0.0117502

	RotationPeriod  15.6863
	Obliquity       -4.68171
	EqAscendNode    78.9833
	Precession      0

	AlbedoBond      0.65
	AlbedoGeom      0.78
	Brightness      2
	Color          (0.737 0.570 0.410)

	Surface
	{
		SurfStyle       0.235263
		OceanStyle      0.736932
		Randomize      (-0.019, 0.494, -0.938)
		colorDistMagn   0.0467153
		colorDistFreq   1161.23
		detailScale     25695.3
		colorConversion true
		seaLevel        0.216585
		snowLevel       2
		tropicLatitude  0.0988098
		icecapLatitude  10
		icecapHeight    0.182826
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.80075
		venusFreq       0.922842
		venusMagn       -1
		mareFreq        1.77711
		mareDensity     0.200178
		terraceProb     0.456259
		erosion         0.111878
		montesMagn      0.163607
		montesFreq      567.605
		montesSpiky     0.822735
		montesFraction  0.317931
		dunesMagn       0.0515491
		dunesFreq       95.1792
		dunesFraction   0.0347763
		hillsMagn       0.112053
		hillsFreq       950.582
		hillsFraction   0.207151
		hills2Fraction  0.584523
		riversMagn      55.5128
		riversFreq      1.75036
		riversSin       6.63683
		riversOctaves   2
		canyonsMagn     0.0416405
		canyonsFreq     235.108
		canyonFraction  0.472648
		cracksMagn      0.0641135
		cracksFreq      4.14423
		cracksOctaves   3
		craterMagn      0.593133
		craterFreq      25.9348
		craterDensity   0.0961772
		craterOctaves   4.87431
		craterRayedFactor 0.05107
		volcanoMagn     0.548458
		volcanoFreq     0.802705
		volcanoDensity  0.186961
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.43466
		volcanoRadius   0.475256
		volcanoTemp     1437.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.53316
		stripeTwist     0
		cycloneMagn     2.66472
		cycloneFreq     0.73339
		cycloneDensity  0.343553
		cycloneOctaves  3
		colorSea       (0.150, 0.100, 0.090, 1.000)
		colorShelf     (0.640, 0.350, 0.210, 1.000)
		colorBeach     (0.405, 0.194, 0.070, 0.100)
		colorDesert    (0.442, 0.217, 0.082, 0.100)
		colorLowland   (0.479, 0.228, 0.086, 0.100)
		colorUpland    (0.516, 0.274, 0.103, 0.100)
		colorRock      (0.920, 0.870, 0.660, 0.200)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.479, 0.228, 0.086, 0.100)
		colorUpPlants  (0.516, 0.274, 0.103, 0.100)
		BumpHeight      19.7638
		BumpOffset      4.28054
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          5.40039
		Velocity        111.351
		BumpHeight      5.4006
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.02312
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.53316
		stripeTwist     0
	}

	Clouds
	{
		Height          10.8008
		Velocity        68.7857
		BumpHeight      5.4006
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.02312
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.53316
		stripeTwist     0
	}

	Ocean
	{
		Height          4.28054
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          49.9509
		Density         0.279578
		Pressure        0.0902618
		Greenhouse      0.629496
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0409128
		Saturation      1

		Composition
		{
			CO2   	51.1971
			N2    	48.6503
			CO    	0.0839649
			Ar    	0.0608319
			Ne    	0.00525661
			He    	0.00171799
			Kr    	0.000414156
			Xe    	0.000361395
		}
	}

	Aurora
	{
		Height      308.213
		NorthLat    67.7993
		NorthLon    145.32
		NorthRadius 2804.45
		NorthWidth  945.352
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -80.088
		SouthLon    313.517
		SouthRadius 2889.19
		SouthWidth  1066.73
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.53618
		Period          0.603481
		Eccentricity    0.0194869
		Inclination     -2.39892
		AscendingNode   78.4554
		ArgOfPericenter 350.488
		MeanAnomaly     54.6296
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.33876e-008
	Radius          57.9672
	InertiaMoment   0.397371

	Oblateness      0.249

	Obliquity       0.00921328
	EqAscendNode    113.308
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.615 0.612 0.606)

	Surface
	{
		SurfStyle       0.680026
		OceanStyle      0.581761
		Randomize      (0.666, 0.134, 0.989)
		colorDistMagn   0.74996
		colorDistFreq   2.35218
		detailScale     1582.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519297
		terraceProb     0.209986
		erosion         0
		montesMagn      0.386454
		montesFreq      2.42634
		montesSpiky     0.885988
		montesFraction  0.523072
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.4027
		hillsFraction   0.621859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234494
		craterFreq      0.206954
		craterDensity   0.960069
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453394
		volcanoTemp     1451
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.208, 0.170, 0.000)
		colorShelf     (0.246, 0.214, 0.194, 0.000)
		colorBeach     (0.289, 0.251, 0.230, 0.000)
		colorDesert    (0.313, 0.269, 0.224, 0.000)
		colorLowland   (0.344, 0.287, 0.254, 0.000)
		colorUpland    (0.381, 0.349, 0.309, 0.000)
		colorRock      (0.412, 0.379, 0.333, 0.000)
		colorSnow      (0.449, 0.404, 0.351, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000194862
		Period          0.000992498
		Eccentricity    1.52996e-005
		Inclination     0.00921328
		AscendingNode   113.308
		ArgOfPericenter -1.25811
		MeanAnomaly     14.932
	}
}

Planet	"7"
{
	ParentBody     "HIP 23518"
	Class	       "IceGiant"

	Mass            12.4351
	Radius          18937.3
	InertiaMoment   0.208569

	Oblateness      0.0251253

	RotationPeriod  10.2519
	Obliquity       24.1472
	EqAscendNode    -45.1923
	Precession      0

	AlbedoBond      0.428964
	AlbedoGeom      0.514756
	Brightness      2

	Surface
	{
		SurfStyle       0.781301
		Randomize      (-0.891, -0.514, -0.946)
		detailScale     48707.9
		colorConversion true
		tropicLatitude  0.419218
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.34625
		stripeFluct     0.428111
		stripeTwist     13.5283
		cycloneMagn     10.5791
		cycloneFreq     0.428104
		cycloneDensity  0.411152
		cycloneOctaves  1
		colorLayer0    (0.120, 0.200, 0.480, 1.000)
		colorLayer1    (0.330, 0.400, 0.720, 1.000)
		colorLayer2    (0.330, 0.400, 0.720, 1.000)
		colorLayer3    (0.600, 0.600, 0.600, 1.000)
		colorLayer4    (0.350, 0.430, 0.770, 1.000)
		colorLayer5    (0.470, 0.540, 0.850, 1.000)
		colorLayer6    (0.600, 0.650, 0.910, 1.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 1.000)
		colorUpPlants  (0.470, 0.540, 0.850, 1.000)
		BumpHeight      16.8395
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          34.0938
		Velocity        2077.3
		BumpHeight      17.2534
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.05136
		mainOctaves     12
		Coverage        0.144818
		stripeZones     6.34625
		stripeFluct     0.428111
		stripeTwist     13.5283
	}

	Clouds
	{
		Height          51.3457
		Velocity        806.347
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.310)
		mainFreq        1.05136
		mainOctaves     12
		Coverage        0.144818
		stripeZones     6.34625
		stripeFluct     0.428111
		stripeTwist     13.5283
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          189.373
		Density         1278.93
		Pressure        124360
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.578639
		Saturation      0.603946

		Composition
		{
			H2    	90.6086
			He    	9.01155
			CH4   	0.324045
			N2    	0.0452461
			O2    	0.00843084
			Ne    	0.00110822
			Ar    	0.000983634
		}
	}

	Aurora
	{
		Height      340.164
		NorthLat    54.8578
		NorthLon    89.305
		NorthRadius 5809.23
		NorthWidth  2045.29
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -59.8114
		SouthLon    262.171
		SouthRadius 5453.21
		SouthWidth  1910.87
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     23774.6
		OuterRadius     36525.3
		RotationPeriod  4.11328
		RotationOffset  0
		FrontBright     0.696693
		BackBright      0.570346
		Density         0.664415
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.15421
		Period          1.90594
		Eccentricity    0.0814691
		Inclination     0.757771
		AscendingNode   -33.101
		ArgOfPericenter 328.199
		MeanAnomaly     139.871
	}
}

DwarfMoon	"7.D1"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.2472e-006
	Radius          160.667
	InertiaMoment   0.399942

	Oblateness      0.249

	Obliquity       0.00272034
	EqAscendNode    -147.855
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.812 0.721 0.654)

	Surface
	{
		SurfStyle       0.0894347
		OceanStyle      0.572473
		Randomize      (-0.171, -0.360, 0.263)
		colorDistMagn   0.936459
		colorDistFreq   9.387
		detailScale     4387.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613677
		terraceProb     0.305488
		erosion         0
		montesMagn      0.689366
		montesFreq      2.41601
		montesSpiky     0.827818
		montesFraction  0.761992
		dunesFraction   0
		hillsMagn       0
		hillsFreq       48.0286
		hillsFraction   0.510419
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245842
		craterFreq      0.861074
		craterDensity   0.746084
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.649797
		volcanoTemp     1372.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.288, 0.262, 0.000)
		colorShelf     (0.345, 0.306, 0.278, 0.000)
		colorBeach     (0.366, 0.324, 0.294, 0.000)
		colorDesert    (0.386, 0.342, 0.311, 0.000)
		colorLowland   (0.406, 0.361, 0.327, 0.000)
		colorUpland    (0.427, 0.379, 0.343, 0.000)
		colorRock      (0.447, 0.397, 0.360, 0.000)
		colorSnow      (0.467, 0.415, 0.376, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000303487
		Period          0.00086709
		Eccentricity    2.67589e-005
		Inclination     0.00272034
		AscendingNode   -147.855
		ArgOfPericenter 46.888
		MeanAnomaly     -101.784
	}
}

DwarfMoon	"7.D2"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.8282e-006
	Radius          174.008
	InertiaMoment   0.398038

	Oblateness      0.249

	Obliquity       -0.00977504
	EqAscendNode    14.9546
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.570 0.534 0.474)

	Surface
	{
		SurfStyle       0.266264
		OceanStyle      0.171694
		Randomize      (-0.159, -0.191, 0.275)
		colorDistMagn   0.746141
		colorDistFreq   24.1724
		detailScale     4751.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481144
		terraceProb     0.254517
		erosion         0
		montesMagn      0.422572
		montesFreq      3.65565
		montesSpiky     0.870836
		montesFraction  0.177685
		dunesFraction   0
		hillsMagn       0
		hillsFreq       53.3551
		hillsFraction   0.653019
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212923
		craterFreq      0.919375
		craterDensity   0.911866
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475122
		volcanoTemp     1281.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.214, 0.190, 0.000)
		colorShelf     (0.242, 0.227, 0.201, 0.000)
		colorBeach     (0.257, 0.240, 0.213, 0.000)
		colorDesert    (0.271, 0.254, 0.225, 0.000)
		colorLowland   (0.285, 0.267, 0.237, 0.000)
		colorUpland    (0.299, 0.280, 0.249, 0.000)
		colorRock      (0.314, 0.294, 0.261, 0.000)
		colorSnow      (0.328, 0.307, 0.273, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000352718
		Period          0.00108642
		Eccentricity    8.20181e-005
		Inclination     -0.00977504
		AscendingNode   14.9546
		ArgOfPericenter 161.25
		MeanAnomaly     -90.7017
	}
}

DwarfMoon	"7.D3"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.73075e-006
	Radius          191.051
	InertiaMoment   0.399166

	Oblateness      0.193477

	Obliquity       -0.00569971
	EqAscendNode    -51.5385
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.525 0.517 0.511)

	Surface
	{
		SurfStyle       0.143553
		OceanStyle      0.600685
		Randomize      (-0.506, 0.935, -0.155)
		colorDistMagn   0.0697955
		colorDistFreq   15.014
		detailScale     5216.96
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.290815
		terraceProb     0.291204
		erosion         0
		montesMagn      0.562959
		montesFreq      3.41841
		montesSpiky     0.916704
		montesFraction  0.348705
		dunesFraction   0
		hillsMagn       0
		hillsFreq       85.3077
		hillsFraction   0.650693
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23755
		craterFreq      1.2692
		craterDensity   1.02156
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.33228
		volcanoTemp     1654.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.207, 0.205, 0.000)
		colorShelf     (0.223, 0.220, 0.217, 0.000)
		colorBeach     (0.236, 0.233, 0.230, 0.000)
		colorDesert    (0.249, 0.246, 0.243, 0.000)
		colorLowland   (0.262, 0.258, 0.256, 0.000)
		colorUpland    (0.276, 0.271, 0.268, 0.000)
		colorRock      (0.289, 0.284, 0.281, 0.000)
		colorSnow      (0.302, 0.297, 0.294, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000393242
		Period          0.00127892
		Eccentricity    3.02506e-005
		Inclination     -0.00569971
		AscendingNode   -51.5385
		ArgOfPericenter 17.9811
		MeanAnomaly     -103.402
	}
}

Moon	"7.1"
{
	ParentBody     "7"
	Class	       "Selena"

	Mass            0.0095675
	Radius          1852.01
	InertiaMoment   0.373872

	Oblateness      0.00840635

	Obliquity       1.38879
	EqAscendNode    128.785
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.421 0.414 0.412)

	Surface
	{
		SurfStyle       0.594031
		OceanStyle      0.247707
		Randomize      (0.318, -0.578, 0.545)
		colorDistMagn   0.0590384
		colorDistFreq   253.784
		detailScale     4763.48
		colorConversion true
		drivenDarkening 0
		seaLevel        0.103417
		snowLevel       2
		tropicLatitude  0.0209495
		icecapLatitude  10
		icecapHeight    0.0854636
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.02302
		venusFreq       0.352855
		venusMagn       0
		mareFreq        1.13196
		mareDensity     0.00167974
		terraceProb     0.304911
		erosion         0
		montesMagn      0.111836
		montesFreq      115.494
		montesSpiky     0.891467
		montesFraction  0.0499775
		dunesMagn       0.0310994
		dunesFreq       2383.05
		dunesFraction   0.0264905
		hillsMagn       0.142813
		hillsFreq       205.283
		hillsFraction   0.392878
		hills2Fraction  0
		riversMagn      57.3622
		riversFreq      1.20447
		riversSin       4.90974
		riversOctaves   0
		canyonsMagn     0.416229
		canyonsFreq     0.753025
		canyonFraction  0.958996
		cracksMagn      0.0602226
		cracksFreq      0.85649
		cracksOctaves   0
		craterMagn      0.511668
		craterFreq      5.4704
		craterDensity   0.649338
		craterOctaves   7.42664
		craterRayedFactor 0.0832627
		volcanoMagn     0.264502
		volcanoFreq     0.695369
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.373446
		volcanoRadius   0.216728
		volcanoTemp     1573.92
		lavaCoverTidal  0.360946
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.261, 0.253, 0.222, 0.000)
		colorDesert    (0.274, 0.257, 0.227, 0.000)
		colorLowland   (0.215, 0.191, 0.173, 0.000)
		colorUpland    (0.316, 0.294, 0.255, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000691922
		Period          0.00298383
		Eccentricity    0.026183
		Inclination     1.38879
		AscendingNode   128.785
		ArgOfPericenter -96.4615
		MeanAnomaly     40.5174
	}
}

DwarfMoon	"7.D4"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.16357e-006
	Radius          87.505
	InertiaMoment   0.399622

	Oblateness      0.00174882

	Obliquity       -0.4703
	EqAscendNode    -74.6544
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.617 0.614 0.610)

	Surface
	{
		SurfStyle       0.634636
		OceanStyle      0.782541
		Randomize      (0.562, 0.688, -0.645)
		colorDistMagn   0.738547
		colorDistFreq   0.223178
		detailScale     2389.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0130515
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.583695
		terraceProb     0.11474
		erosion         0
		montesMagn      0.489876
		montesFreq      2.36586
		montesSpiky     0.942182
		montesFraction  0.710805
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.1529
		hillsFraction   0.600458
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230613
		craterFreq      0.328333
		craterDensity   0.895627
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515375
		volcanoTemp     1556.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.209, 0.171, 0.000)
		colorShelf     (0.247, 0.215, 0.195, 0.000)
		colorBeach     (0.290, 0.252, 0.232, 0.000)
		colorDesert    (0.314, 0.270, 0.226, 0.000)
		colorLowland   (0.345, 0.289, 0.256, 0.000)
		colorUpland    (0.382, 0.350, 0.311, 0.000)
		colorRock      (0.413, 0.381, 0.336, 0.000)
		colorSnow      (0.450, 0.405, 0.354, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00114969
		Period          0.00639333
		Eccentricity    0.030997
		Inclination     -0.4703
		AscendingNode   -74.6545
		ArgOfPericenter -160.646
		MeanAnomaly     -43.1329
	}
}

DwarfMoon	"7.D5"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.22775e-011
	Radius          4.02771
	InertiaMoment   0.3993

	RotationPeriod  506.354
	Obliquity       68.1263
	EqAscendNode    -64.4336
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.602 0.595 0.592)

	Surface
	{
		SurfStyle       0.118414
		OceanStyle      0.757354
		Randomize      (-0.704, 0.279, 0.014)
		colorDistMagn   0.732299
		colorDistFreq   0.00291374
		detailScale     109.983
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972512
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580622
		terraceProb     0.180044
		erosion         0
		montesMagn      0.509979
		montesFreq      3.68407
		montesSpiky     0.986534
		montesFraction  0.789512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0489953
		hillsFraction   0.759854
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236368
		craterFreq      0.147522
		craterDensity   0.742363
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515028
		volcanoTemp     1396.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.238, 0.237, 0.000)
		colorShelf     (0.256, 0.253, 0.252, 0.000)
		colorBeach     (0.271, 0.268, 0.266, 0.000)
		colorDesert    (0.286, 0.283, 0.281, 0.000)
		colorLowland   (0.301, 0.298, 0.296, 0.000)
		colorUpland    (0.316, 0.313, 0.311, 0.000)
		colorRock      (0.331, 0.328, 0.325, 0.000)
		colorSnow      (0.346, 0.342, 0.340, 1.000)
		BumpHeight      3.62494
		BumpOffset      0.724989
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0065353
		Period          0.086647
		Eccentricity    0.187182
		Inclination     68.1263
		AscendingNode   -64.4336
		ArgOfPericenter 91.9808
		MeanAnomaly     -75.3772
	}
}

DwarfMoon	"7.D6"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            4.18869e-011
	Radius          4.77533
	InertiaMoment   0.396456

	Obliquity       52.0741
	EqAscendNode    164.247
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.552 0.550 0.547)

	Surface
	{
		SurfStyle       0.961862
		OceanStyle      0.89361
		Randomize      (-0.592, 0.260, 0.801)
		colorDistMagn   0.236867
		colorDistFreq   0.00249069
		detailScale     130.398
		colorConversion true
		snowLevel       2
		tropicLatitude  0.214927
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.510467
		terraceProb     0.117532
		erosion         0
		montesMagn      0.557342
		montesFreq      2.72217
		montesSpiky     0.805628
		montesFraction  0.425758
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0500656
		hillsFraction   0.576327
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215168
		craterFreq      0.218548
		craterDensity   1.07138
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489073
		volcanoTemp     1487.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.192, 0.219, 0.050)
		colorShelf     (0.221, 0.225, 0.252, 0.040)
		colorBeach     (0.254, 0.258, 0.284, 0.030)
		colorDesert    (0.287, 0.291, 0.323, 0.020)
		colorLowland   (0.320, 0.324, 0.356, 0.030)
		colorUpland    (0.354, 0.357, 0.388, 0.050)
		colorRock      (0.387, 0.390, 0.432, 0.020)
		colorSnow      (0.387, 0.390, 0.432, 1.000)
		BumpHeight      4.2978
		BumpOffset      0.85956
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00687936
		Period          0.0935786
		Eccentricity    0.215115
		Inclination     52.0741
		AscendingNode   164.247
		ArgOfPericenter 68.1163
		MeanAnomaly     -99.7621
	}
}

DwarfMoon	"7.D7"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            7.3357e-011
	Radius          5.45133
	InertiaMoment   0.398409

	RotationPeriod  1813.97
	Obliquity       38.2201
	EqAscendNode    -34.2179
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.534 0.451 0.324)

	Surface
	{
		SurfStyle       0.434711
		OceanStyle      0.320151
		Randomize      (0.011, 0.517, 0.993)
		colorDistMagn   0.374359
		colorDistFreq   0.011002
		detailScale     148.858
		colorConversion true
		snowLevel       2
		tropicLatitude  0.953714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478884
		terraceProb     0.796963
		erosion         0
		montesMagn      0.334042
		montesFreq      2.58363
		montesSpiky     0.876456
		montesFraction  0.629268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0537461
		hillsFraction   0.556439
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222214
		craterFreq      0.222175
		craterDensity   0.870326
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489151
		volcanoTemp     1391.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.180, 0.130, 0.000)
		colorShelf     (0.227, 0.192, 0.138, 0.000)
		colorBeach     (0.240, 0.203, 0.146, 0.000)
		colorDesert    (0.254, 0.214, 0.154, 0.000)
		colorLowland   (0.267, 0.225, 0.162, 0.000)
		colorUpland    (0.280, 0.237, 0.170, 0.000)
		colorRock      (0.294, 0.248, 0.178, 0.000)
		colorSnow      (0.307, 0.259, 0.186, 1.000)
		BumpHeight      4.90619
		BumpOffset      0.981239
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0073559
		Period          0.103469
		Eccentricity    0.0565256
		Inclination     38.2201
		AscendingNode   -34.2179
		ArgOfPericenter -156.22
		MeanAnomaly     -171.879
	}
}

DwarfMoon	"7.D8"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.21927e-010
	Radius          7.54654
	InertiaMoment   0.399432

	Obliquity       5.7057
	EqAscendNode    -33.7356
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.796 0.704 0.635)

	Surface
	{
		SurfStyle       0.0610338
		OceanStyle      0.514669
		Randomize      (0.185, 0.131, 0.645)
		colorDistMagn   0.427552
		colorDistFreq   0.0422807
		detailScale     206.071
		colorConversion true
		snowLevel       2
		tropicLatitude  0.18942
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.407898
		terraceProb     0.454797
		erosion         0
		montesMagn      0.508281
		montesFreq      2.89533
		montesSpiky     0.956849
		montesFraction  0.719556
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.153266
		hillsFraction   0.869781
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245526
		craterFreq      0.253481
		craterDensity   1.06703
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508828
		volcanoTemp     1574.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.282, 0.254, 0.000)
		colorShelf     (0.338, 0.299, 0.270, 0.000)
		colorBeach     (0.358, 0.317, 0.286, 0.000)
		colorDesert    (0.378, 0.335, 0.302, 0.000)
		colorLowland   (0.398, 0.352, 0.318, 0.000)
		colorUpland    (0.418, 0.370, 0.333, 0.000)
		colorRock      (0.438, 0.387, 0.349, 0.000)
		colorSnow      (0.458, 0.405, 0.365, 1.000)
		BumpHeight      6.79189
		BumpOffset      1.35838
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0079886
		Period          0.117101
		Eccentricity    0.215743
		Inclination     5.7057
		AscendingNode   -33.7356
		ArgOfPericenter 14.4717
		MeanAnomaly     -124.89
	}
}

DwarfMoon	"7.D9"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.94714e-010
	Radius          8.34682
	InertiaMoment   0.396942

	RotationPeriod  2221.44
	Obliquity       -56.782
	EqAscendNode    -83.1357
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.719 0.584 0.536)

	Surface
	{
		SurfStyle       0.51062
		OceanStyle      0.745868
		Randomize      (0.082, -0.694, 0.313)
		colorDistMagn   0.543275
		colorDistFreq   0.0412479
		detailScale     227.924
		colorConversion true
		snowLevel       2
		tropicLatitude  0.976291
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.256863
		terraceProb     0.575515
		erosion         0
		montesMagn      0.492352
		montesFreq      3.32321
		montesSpiky     0.984471
		montesFraction  0.668882
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.151218
		hillsFraction   0.500856
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225921
		craterFreq      0.164742
		craterDensity   0.785155
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539983
		volcanoTemp     1639.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.198, 0.150, 0.000)
		colorShelf     (0.288, 0.204, 0.172, 0.000)
		colorBeach     (0.338, 0.239, 0.204, 0.000)
		colorDesert    (0.367, 0.257, 0.198, 0.000)
		colorLowland   (0.403, 0.274, 0.225, 0.000)
		colorUpland    (0.446, 0.333, 0.273, 0.000)
		colorRock      (0.482, 0.362, 0.295, 0.000)
		colorSnow      (0.525, 0.385, 0.311, 1.000)
		BumpHeight      7.51214
		BumpOffset      1.50243
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00841986
		Period          0.12671
		Eccentricity    0.441153
		Inclination     -56.782
		AscendingNode   -83.1357
		ArgOfPericenter 149.743
		MeanAnomaly     155.53
	}
}

DwarfMoon	"7.D10"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            3.01321e-010
	Radius          9.27189
	InertiaMoment   0.398575

	Obliquity       -31.6363
	EqAscendNode    46.5413
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.519 0.461 0.404)

	Surface
	{
		SurfStyle       0.952246
		OceanStyle      0.333367
		Randomize      (0.442, -0.757, -0.002)
		colorDistMagn   0.998613
		colorDistFreq   0.046619
		detailScale     253.184
		colorConversion true
		snowLevel       2
		tropicLatitude  0.844451
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390673
		terraceProb     0.268175
		erosion         0
		montesMagn      0.464842
		montesFreq      2.71112
		montesSpiky     0.992752
		montesFraction  0.685873
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.187116
		hillsFraction   0.549424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249046
		craterFreq      0.173259
		craterDensity   0.89176
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46631
		volcanoTemp     1525.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.161, 0.162, 0.050)
		colorShelf     (0.208, 0.189, 0.186, 0.040)
		colorBeach     (0.239, 0.217, 0.210, 0.030)
		colorDesert    (0.270, 0.244, 0.238, 0.020)
		colorLowland   (0.301, 0.272, 0.263, 0.030)
		colorUpland    (0.332, 0.299, 0.287, 0.050)
		colorRock      (0.363, 0.327, 0.319, 0.020)
		colorSnow      (0.363, 0.327, 0.319, 1.000)
		BumpHeight      8.3447
		BumpOffset      1.66894
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00880127
		Period          0.135417
		Eccentricity    0.254747
		Inclination     -31.6363
		AscendingNode   46.5413
		ArgOfPericenter -4.2398
		MeanAnomaly     108.797
	}
}

DwarfMoon	"7.D11"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            4.5466e-010
	Radius          10.1263
	InertiaMoment   0.399561

	Obliquity       -13.5883
	EqAscendNode    167.585
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.430 0.427 0.424)

	Surface
	{
		SurfStyle       0.407712
		OceanStyle      0.159373
		Randomize      (0.195, -0.689, 0.742)
		colorDistMagn   0.62422
		colorDistFreq   0.0625118
		detailScale     276.515
		colorConversion true
		snowLevel       2
		tropicLatitude  0.050793
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497197
		terraceProb     0.337337
		erosion         0
		montesMagn      0.362276
		montesFreq      3.13303
		montesSpiky     0.839796
		montesFraction  0.460568
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.272999
		hillsFraction   0.696879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258451
		craterFreq      0.223311
		craterDensity   0.936158
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448186
		volcanoTemp     1973.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.171, 0.170, 0.000)
		colorShelf     (0.183, 0.181, 0.180, 0.000)
		colorBeach     (0.194, 0.192, 0.191, 0.000)
		colorDesert    (0.204, 0.203, 0.201, 0.000)
		colorLowland   (0.215, 0.213, 0.212, 0.000)
		colorUpland    (0.226, 0.224, 0.222, 0.000)
		colorRock      (0.237, 0.235, 0.233, 0.000)
		colorSnow      (0.247, 0.245, 0.244, 1.000)
		BumpHeight      9.11365
		BumpOffset      1.82273
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00922866
		Period          0.145399
		Eccentricity    0.182293
		Inclination     -13.5883
		AscendingNode   167.585
		ArgOfPericenter 32.2683
		MeanAnomaly     -122.972
	}
}

Moon	"7.2"
{
	ParentBody     "7"
	Class	       "IceWorld"

	Mass            0.000116643
	Radius          405.663
	InertiaMoment   0.398281

	Obliquity       40.0993
	EqAscendNode    -123.065
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.703 0.609 0.476)

	Surface
	{
		SurfStyle       0.117468
		OceanStyle      0.0299167
		Randomize      (0.758, 0.494, -0.711)
		colorDistMagn   0.0467571
		colorDistFreq   46.9871
		detailScale     1043.39
		colorConversion true
		drivenDarkening 0.179496
		seaLevel        0.139905
		snowLevel       2
		tropicLatitude  0.58439
		icecapLatitude  1
		icecapHeight    0.139905
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.9686
		venusFreq       1.04753
		venusMagn       0
		mareFreq        0
		mareDensity     9.81699e-005
		terraceProb     0.313493
		erosion         0
		montesMagn      0.0765951
		montesFreq      17.0207
		montesSpiky     0.981882
		montesFraction  0.305598
		dunesMagn       0.029742
		dunesFreq       534.474
		dunesFraction   0.144367
		hillsMagn       0.124596
		hillsFreq       40.5977
		hillsFraction   0.98364
		hills2Fraction  0.0909293
		riversMagn      56.8233
		riversFreq      3.95976
		riversSin       5.61695
		riversOctaves   0
		canyonsMagn     0.625277
		canyonsFreq     0.124342
		canyonFraction  0
		cracksMagn      0.0671936
		cracksFreq      0.252133
		cracksOctaves   0
		craterMagn      0.598216
		craterFreq      1.30343
		craterDensity   0.93152
		craterOctaves   9
		craterRayedFactor 0
		volcanoMagn     0.205565
		volcanoFreq     0.560286
		volcanoDensity  0.236053
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.280044
		volcanoRadius   0.16611
		volcanoTemp     1597.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.703, 0.609, 0.476, 0.500)
		colorShelf     (0.668, 0.578, 0.452, 0.500)
		colorBeach     (0.492, 0.426, 0.333, 0.750)
		colorDesert    (0.597, 0.517, 0.404, 1.000)
		colorLowland   (0.618, 0.536, 0.419, 1.000)
		colorUpland    (0.653, 0.566, 0.443, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.618, 0.536, 0.419, 1.000)
		colorUpPlants  (0.653, 0.566, 0.443, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00987339
		Period          0.160899
		Eccentricity    0.125587
		Inclination     40.0993
		AscendingNode   -123.065
		ArgOfPericenter -24.1512
		MeanAnomaly     106.871
	}
}

DwarfMoon	"7.D12"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            9.76615e-010
	Radius          14.3776
	InertiaMoment   0.398732

	Obliquity       77.5193
	EqAscendNode    91.3375
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.488 0.483 0.478)

	Surface
	{
		SurfStyle       0.279442
		OceanStyle      0.152303
		Randomize      (0.898, -0.970, -0.686)
		colorDistMagn   0.410381
		colorDistFreq   0.0930886
		detailScale     392.603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471401
		terraceProb     0.136066
		erosion         0
		montesMagn      0.494308
		montesFreq      3.81618
		montesSpiky     0.827192
		montesFraction  0.577531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.41579
		hillsFraction   0.738611
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264391
		craterFreq      0.226901
		craterDensity   0.972764
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46495
		volcanoTemp     1255.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.193, 0.191, 0.000)
		colorShelf     (0.207, 0.205, 0.203, 0.000)
		colorBeach     (0.220, 0.217, 0.215, 0.000)
		colorDesert    (0.232, 0.229, 0.227, 0.000)
		colorLowland   (0.244, 0.241, 0.239, 0.000)
		colorUpland    (0.256, 0.253, 0.251, 0.000)
		colorRock      (0.268, 0.265, 0.263, 0.000)
		colorSnow      (0.281, 0.278, 0.275, 1.000)
		BumpHeight      12.9398
		BumpOffset      2.58796
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0105181
		Period          0.176914
		Eccentricity    0.23993
		Inclination     77.5193
		AscendingNode   91.3375
		ArgOfPericenter -103.353
		MeanAnomaly     161.057
	}
}

DwarfMoon	"7.D13"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.39932e-009
	Radius          15.5572
	InertiaMoment   0.399688

	Obliquity       -48.0128
	EqAscendNode    43.9173
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.448 0.445 0.443)

	Surface
	{
		SurfStyle       0.748665
		OceanStyle      0.180285
		Randomize      (-0.602, 0.224, -0.257)
		colorDistMagn   0.0673706
		colorDistFreq   0.1801
		detailScale     424.814
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998772
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441835
		terraceProb     0.270663
		erosion         0
		montesMagn      0.441534
		montesFreq      2.67941
		montesSpiky     0.950825
		montesFraction  0.224572
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.524109
		hillsFraction   0.600085
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243438
		craterFreq      0.233991
		craterDensity   0.930135
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480207
		volcanoTemp     1655.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.151, 0.124, 0.000)
		colorShelf     (0.179, 0.156, 0.142, 0.000)
		colorBeach     (0.211, 0.183, 0.168, 0.000)
		colorDesert    (0.229, 0.196, 0.164, 0.000)
		colorLowland   (0.251, 0.209, 0.186, 0.000)
		colorUpland    (0.278, 0.254, 0.226, 0.000)
		colorRock      (0.300, 0.276, 0.243, 0.000)
		colorSnow      (0.327, 0.294, 0.257, 1.000)
		BumpHeight      14.0014
		BumpOffset      2.80029
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0108132
		Period          0.18441
		Eccentricity    0.178541
		Inclination     -48.0128
		AscendingNode   43.9173
		ArgOfPericenter 121.782
		MeanAnomaly     -65.3533
	}
}

DwarfMoon	"7.D14"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.98149e-009
	Radius          16.6918
	InertiaMoment   0.397578

	RotationPeriod  4261.66
	Obliquity       -0.963746
	EqAscendNode    -160.632
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.469 0.466 0.461)

	Surface
	{
		SurfStyle       0.136219
		OceanStyle      0.669389
		Randomize      (0.874, -0.024, 0.652)
		colorDistMagn   0.597154
		colorDistFreq   0.194493
		detailScale     455.798
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00566278
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.469374
		terraceProb     0.263281
		erosion         0
		montesMagn      0.506403
		montesFreq      3.28956
		montesSpiky     0.91755
		montesFraction  0.168968
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.687914
		hillsFraction   0.789801
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252979
		craterFreq      0.242756
		craterDensity   0.820247
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438909
		volcanoTemp     1636.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.186, 0.184, 0.000)
		colorShelf     (0.199, 0.198, 0.196, 0.000)
		colorBeach     (0.211, 0.210, 0.207, 0.000)
		colorDesert    (0.223, 0.221, 0.219, 0.000)
		colorLowland   (0.234, 0.233, 0.231, 0.000)
		colorUpland    (0.246, 0.245, 0.242, 0.000)
		colorRock      (0.258, 0.256, 0.254, 0.000)
		colorSnow      (0.270, 0.268, 0.265, 1.000)
		BumpHeight      15.0226
		BumpOffset      3.00453
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0112028
		Period          0.194467
		Eccentricity    0.31348
		Inclination     -0.963746
		AscendingNode   -160.632
		ArgOfPericenter 106.704
		MeanAnomaly     -86.6284
	}
}

DwarfMoon	"7.D15"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.7784e-009
	Radius          21.9874
	InertiaMoment   0.398881

	Obliquity       42.2013
	EqAscendNode    19.0714
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.666 0.663)

	Surface
	{
		SurfStyle       0.720376
		OceanStyle      0.277361
		Randomize      (0.544, 0.009, 0.865)
		colorDistMagn   0.635238
		colorDistFreq   0.152901
		detailScale     600.402
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992493
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52053
		terraceProb     0.26205
		erosion         0
		montesMagn      0.54505
		montesFreq      3.10765
		montesSpiky     0.868994
		montesFraction  0.821358
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.07445
		hillsFraction   0.408904
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255807
		craterFreq      0.242675
		craterDensity   0.777718
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495737
		volcanoTemp     1386.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.226, 0.186, 0.000)
		colorShelf     (0.268, 0.233, 0.212, 0.000)
		colorBeach     (0.314, 0.273, 0.252, 0.000)
		colorDesert    (0.341, 0.293, 0.245, 0.000)
		colorLowland   (0.375, 0.313, 0.279, 0.000)
		colorUpland    (0.415, 0.379, 0.338, 0.000)
		colorRock      (0.448, 0.413, 0.365, 0.000)
		colorSnow      (0.488, 0.439, 0.385, 1.000)
		BumpHeight      19.7886
		BumpOffset      3.95773
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0118148
		Period          0.210618
		Eccentricity    0.379671
		Inclination     42.2013
		AscendingNode   19.0714
		ArgOfPericenter -119.09
		MeanAnomaly     30.7957
	}
}

DwarfMoon	"7.D16"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            3.86403e-009
	Radius          22.89
	InertiaMoment   0.399814

	RotationPeriod  3856.37
	Obliquity       25.3836
	EqAscendNode    37.5792
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.481 0.471 0.467)

	Surface
	{
		SurfStyle       0.549228
		OceanStyle      0.982826
		Randomize      (0.702, -0.030, 0.705)
		colorDistMagn   0.228769
		colorDistFreq   0.189688
		detailScale     625.049
		colorConversion true
		snowLevel       2
		tropicLatitude  0.741818
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344587
		terraceProb     0.366968
		erosion         0
		montesMagn      0.588576
		montesFreq      2.84407
		montesSpiky     0.888621
		montesFraction  0.586622
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.43158
		hillsFraction   0.54705
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223898
		craterFreq      0.256866
		craterDensity   0.848525
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481672
		volcanoTemp     1663.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.160, 0.131, 0.000)
		colorShelf     (0.192, 0.165, 0.149, 0.000)
		colorBeach     (0.226, 0.193, 0.177, 0.000)
		colorDesert    (0.245, 0.207, 0.173, 0.000)
		colorLowland   (0.269, 0.222, 0.196, 0.000)
		colorUpland    (0.298, 0.269, 0.238, 0.000)
		colorRock      (0.322, 0.292, 0.257, 0.000)
		colorSnow      (0.351, 0.311, 0.271, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0121619
		Period          0.219967
		Eccentricity    0.1711
		Inclination     25.3836
		AscendingNode   37.5792
		ArgOfPericenter 113.686
		MeanAnomaly     -169.298
	}
}

DwarfMoon	"7.D17"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            5.33762e-009
	Radius          24.4446
	InertiaMoment   0.39782

	RotationPeriod  1362.37
	Obliquity       -80.7817
	EqAscendNode    101.729
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.680 0.585 0.495)

	Surface
	{
		SurfStyle       0.987522
		OceanStyle      0.805158
		Randomize      (0.248, -0.933, -0.049)
		colorDistMagn   0.475616
		colorDistFreq   0.151951
		detailScale     667.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974652
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.388837
		terraceProb     0.227486
		erosion         0
		montesMagn      0.498775
		montesFreq      3.06333
		montesSpiky     0.900132
		montesFraction  0.463817
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.08534
		hillsFraction   0.686079
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255598
		craterFreq      0.211515
		craterDensity   0.870623
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517541
		volcanoTemp     1484.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.205, 0.198, 0.050)
		colorShelf     (0.272, 0.240, 0.228, 0.040)
		colorBeach     (0.313, 0.275, 0.257, 0.030)
		colorDesert    (0.353, 0.310, 0.292, 0.020)
		colorLowland   (0.394, 0.345, 0.322, 0.030)
		colorUpland    (0.435, 0.380, 0.351, 0.050)
		colorRock      (0.476, 0.415, 0.391, 0.020)
		colorSnow      (0.476, 0.415, 0.391, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0126423
		Period          0.233127
		Eccentricity    0.400527
		Inclination     -80.7817
		AscendingNode   101.729
		ArgOfPericenter 132.439
		MeanAnomaly     -33.6693
	}
}

DwarfMoon	"7.D18"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            7.33265e-009
	Radius          26.0228
	InertiaMoment   0.399024

	Obliquity       -80.0629
	EqAscendNode    11.3584
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.684 0.678 0.675)

	Surface
	{
		SurfStyle       0.358909
		OceanStyle      0.00384087
		Randomize      (-0.314, 0.100, -0.697)
		colorDistMagn   0.943446
		colorDistFreq   0.496601
		detailScale     710.596
		colorConversion true
		snowLevel       2
		tropicLatitude  0.388524
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.396709
		terraceProb     0.452144
		erosion         0
		montesMagn      0.427656
		montesFreq      4.1346
		montesSpiky     0.884753
		montesFraction  0.884981
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.65405
		hillsFraction   0.661133
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237454
		craterFreq      0.172716
		craterDensity   0.825401
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454293
		volcanoTemp     1265.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.271, 0.270, 0.000)
		colorShelf     (0.291, 0.288, 0.287, 0.000)
		colorBeach     (0.308, 0.305, 0.304, 0.000)
		colorDesert    (0.325, 0.322, 0.321, 0.000)
		colorLowland   (0.342, 0.339, 0.338, 0.000)
		colorUpland    (0.359, 0.356, 0.354, 0.000)
		colorRock      (0.376, 0.373, 0.371, 0.000)
		colorSnow      (0.393, 0.390, 0.388, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0129131
		Period          0.240657
		Eccentricity    0.291393
		Inclination     -80.0629
		AscendingNode   11.3584
		ArgOfPericenter 133.78
		MeanAnomaly     -108.023
	}
}

DwarfMoon	"7.D19"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.00292e-008
	Radius          34.429
	InertiaMoment   0.399939

	Obliquity       42.4693
	EqAscendNode    -33.1087
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.493 0.487 0.483)

	Surface
	{
		SurfStyle       0.927261
		OceanStyle      0.587393
		Randomize      (0.372, 0.706, -0.714)
		colorDistMagn   0.441229
		colorDistFreq   0.781672
		detailScale     940.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986751
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533401
		terraceProb     0.259949
		erosion         0
		montesMagn      0.572454
		montesFreq      3.28925
		montesSpiky     0.966303
		montesFraction  0.743627
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.86315
		hillsFraction   0.645277
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225569
		craterFreq      0.198752
		craterDensity   0.854757
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504808
		volcanoTemp     1491.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.171, 0.193, 0.050)
		colorShelf     (0.197, 0.200, 0.222, 0.040)
		colorBeach     (0.227, 0.229, 0.251, 0.030)
		colorDesert    (0.256, 0.258, 0.285, 0.020)
		colorLowland   (0.286, 0.288, 0.314, 0.030)
		colorUpland    (0.315, 0.317, 0.343, 0.050)
		colorRock      (0.345, 0.346, 0.382, 0.020)
		colorSnow      (0.345, 0.346, 0.382, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.01314
		Period          0.247028
		Eccentricity    0.254786
		Inclination     42.4693
		AscendingNode   -33.1087
		ArgOfPericenter -19.2248
		MeanAnomaly     62.0682
	}
}

DwarfMoon	"7.D20"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.36714e-008
	Radius          35.1233
	InertiaMoment   0.398034

	Obliquity       -53.7233
	EqAscendNode    -78.6592
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.435 0.430 0.424)

	Surface
	{
		SurfStyle       0.29671
		OceanStyle      0.171952
		Randomize      (0.436, 0.726, -0.422)
		colorDistMagn   0.589639
		colorDistFreq   0.782585
		detailScale     959.099
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97498
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.73007
		terraceProb     0.733489
		erosion         0
		montesMagn      0.558536
		montesFreq      2.56482
		montesSpiky     0.886557
		montesFraction  0.703916
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.05098
		hillsFraction   0.770599
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22218
		craterFreq      0.197062
		craterDensity   0.847436
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498374
		volcanoTemp     1637.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.170, 0.000)
		colorShelf     (0.185, 0.183, 0.180, 0.000)
		colorBeach     (0.196, 0.193, 0.191, 0.000)
		colorDesert    (0.207, 0.204, 0.202, 0.000)
		colorLowland   (0.218, 0.215, 0.212, 0.000)
		colorUpland    (0.228, 0.226, 0.223, 0.000)
		colorRock      (0.239, 0.236, 0.233, 0.000)
		colorSnow      (0.250, 0.247, 0.244, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0134337
		Period          0.255356
		Eccentricity    0.0415287
		Inclination     -53.7233
		AscendingNode   -78.6592
		ArgOfPericenter -95.6178
		MeanAnomaly     -4.05272
	}
}

DwarfMoon	"7.D21"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.85914e-008
	Radius          37.2627
	InertiaMoment   0.399163

	RotationPeriod  3114.4
	Obliquity       -49.0165
	EqAscendNode    -122.972
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.762 0.759 0.755)

	Surface
	{
		SurfStyle       0.49095
		OceanStyle      0.211524
		Randomize      (-0.164, 0.108, -0.631)
		colorDistMagn   0.782977
		colorDistFreq   0.773186
		detailScale     1017.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.672307
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449897
		terraceProb     0.320577
		erosion         0
		montesMagn      0.433442
		montesFreq      3.13445
		montesSpiky     0.916347
		montesFraction  0.371131
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.89555
		hillsFraction   0.712891
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253457
		craterFreq      0.250837
		craterDensity   0.856456
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479696
		volcanoTemp     1650.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.304, 0.302, 0.000)
		colorShelf     (0.324, 0.323, 0.321, 0.000)
		colorBeach     (0.343, 0.342, 0.340, 0.000)
		colorDesert    (0.362, 0.361, 0.359, 0.000)
		colorLowland   (0.381, 0.379, 0.378, 0.000)
		colorUpland    (0.400, 0.398, 0.397, 0.000)
		colorRock      (0.419, 0.417, 0.415, 0.000)
		colorSnow      (0.438, 0.436, 0.434, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0138206
		Period          0.266467
		Eccentricity    0.248884
		Inclination     -49.0165
		AscendingNode   -122.972
		ArgOfPericenter 43.3402
		MeanAnomaly     -39.3049
	}
}

DwarfMoon	"7.D22"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.52438e-008
	Radius          39.5741
	InertiaMoment   0.395532

	RotationPeriod  14476.9
	Obliquity       59.097
	EqAscendNode    -57.0543
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.837 0.804 0.756)

	Surface
	{
		SurfStyle       0.625741
		OceanStyle      0.755193
		Randomize      (-0.604, -0.366, -0.161)
		colorDistMagn   0.786082
		colorDistFreq   0.796077
		detailScale     1080.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990623
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.342556
		terraceProb     0.471964
		erosion         0
		montesMagn      0.336396
		montesFreq      3.02297
		montesSpiky     0.870987
		montesFraction  0.10618
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.80954
		hillsFraction   0.717044
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22981
		craterFreq      0.278511
		craterDensity   0.98596
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.415732
		volcanoTemp     1333.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.273, 0.212, 0.000)
		colorShelf     (0.335, 0.281, 0.242, 0.000)
		colorBeach     (0.393, 0.329, 0.287, 0.000)
		colorDesert    (0.427, 0.354, 0.280, 0.000)
		colorLowland   (0.469, 0.378, 0.318, 0.000)
		colorUpland    (0.519, 0.458, 0.386, 0.000)
		colorRock      (0.561, 0.498, 0.416, 0.000)
		colorSnow      (0.611, 0.530, 0.439, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0141227
		Period          0.275254
		Eccentricity    0.413
		Inclination     59.097
		AscendingNode   -57.0543
		ArgOfPericenter 111.857
		MeanAnomaly     124.106
	}
}

DwarfMoon	"7.D23"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            3.42549e-008
	Radius          53.6437
	InertiaMoment   0.398227

	Obliquity       -82.9426
	EqAscendNode    31.719
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.678 0.639)

	Surface
	{
		SurfStyle       0.736606
		OceanStyle      0.301386
		Randomize      (0.062, -0.386, -0.557)
		colorDistMagn   0.730132
		colorDistFreq   1.44601
		detailScale     1464.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.568475
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629503
		terraceProb     0.547227
		erosion         0
		montesMagn      0.539816
		montesFreq      3.37928
		montesSpiky     0.898393
		montesFraction  0.267628
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.8515
		hillsFraction   0.865912
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.297276
		craterFreq      0.224799
		craterDensity   0.933116
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506463
		volcanoTemp     1310.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.230, 0.179, 0.000)
		colorShelf     (0.286, 0.237, 0.204, 0.000)
		colorBeach     (0.336, 0.278, 0.243, 0.000)
		colorDesert    (0.364, 0.298, 0.236, 0.000)
		colorLowland   (0.400, 0.319, 0.268, 0.000)
		colorUpland    (0.443, 0.386, 0.326, 0.000)
		colorRock      (0.479, 0.420, 0.351, 0.000)
		colorSnow      (0.522, 0.447, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0147733
		Period          0.294492
		Eccentricity    0.323952
		Inclination     -82.9426
		AscendingNode   31.719
		ArgOfPericenter 32.9502
		MeanAnomaly     -52.1033
	}
}

DwarfMoon	"7.D24"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            4.6493e-008
	Radius          53.2148
	InertiaMoment   0.399297

	Obliquity       69.7632
	EqAscendNode    -17.642
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.507 0.456 0.389)

	Surface
	{
		SurfStyle       0.262593
		OceanStyle      0.335049
		Randomize      (0.625, -0.110, -0.035)
		colorDistMagn   0.418289
		colorDistFreq   1.14843
		detailScale     1453.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.694698
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576068
		terraceProb     0.197847
		erosion         0
		montesMagn      0.462839
		montesFreq      1.94644
		montesSpiky     0.968897
		montesFraction  0.493385
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.92169
		hillsFraction   0.720651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246591
		craterFreq      0.189052
		craterDensity   0.995156
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511965
		volcanoTemp     1644.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.183, 0.155, 0.000)
		colorShelf     (0.215, 0.194, 0.165, 0.000)
		colorBeach     (0.228, 0.205, 0.175, 0.000)
		colorDesert    (0.241, 0.217, 0.185, 0.000)
		colorLowland   (0.253, 0.228, 0.194, 0.000)
		colorUpland    (0.266, 0.240, 0.204, 0.000)
		colorRock      (0.279, 0.251, 0.214, 0.000)
		colorSnow      (0.291, 0.262, 0.223, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0153104
		Period          0.310694
		Eccentricity    0.431929
		Inclination     69.7632
		AscendingNode   -17.642
		ArgOfPericenter 69.3537
		MeanAnomaly     54.5345
	}
}

DwarfMoon	"7.D25"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            6.31722e-008
	Radius          56.3375
	InertiaMoment   0.396443

	Obliquity       -53.1895
	EqAscendNode    -145.446
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.533 0.529 0.526)

	Surface
	{
		SurfStyle       0.456723
		OceanStyle      0.865332
		Randomize      (0.339, 0.936, -0.212)
		colorDistMagn   0.199041
		colorDistFreq   2.61789
		detailScale     1538.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.461917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578876
		terraceProb     0.100713
		erosion         0
		montesMagn      0.463169
		montesFreq      3.72295
		montesSpiky     0.882666
		montesFraction  0.44293
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.27705
		hillsFraction   0.40912
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263632
		craterFreq      0.241166
		craterDensity   0.741219
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491585
		volcanoTemp     1496.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.212, 0.210, 0.000)
		colorShelf     (0.226, 0.225, 0.224, 0.000)
		colorBeach     (0.240, 0.238, 0.237, 0.000)
		colorDesert    (0.253, 0.251, 0.250, 0.000)
		colorLowland   (0.266, 0.264, 0.263, 0.000)
		colorUpland    (0.280, 0.278, 0.276, 0.000)
		colorRock      (0.293, 0.291, 0.289, 0.000)
		colorSnow      (0.306, 0.304, 0.303, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0155844
		Period          0.319073
		Eccentricity    0.096301
		Inclination     -53.1895
		AscendingNode   -145.446
		ArgOfPericenter -47.4228
		MeanAnomaly     -171.654
	}
}

DwarfMoon	"7.D26"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            8.60048e-008
	Radius          59.9421
	InertiaMoment   0.398405

	Obliquity       -64.7025
	EqAscendNode    153.092
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.554 0.550 0.546)

	Surface
	{
		SurfStyle       0.391165
		OceanStyle      0.304831
		Randomize      (-0.067, -0.353, 0.095)
		colorDistMagn   0.437325
		colorDistFreq   0.889828
		detailScale     1636.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.411286
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405869
		terraceProb     0.360646
		erosion         0
		montesMagn      0.497867
		montesFreq      3.00962
		montesSpiky     0.965905
		montesFraction  0.494565
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.42216
		hillsFraction   0.53956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214903
		craterFreq      0.278907
		craterDensity   0.754112
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444919
		volcanoTemp     1663.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.220, 0.218, 0.000)
		colorShelf     (0.235, 0.234, 0.232, 0.000)
		colorBeach     (0.249, 0.247, 0.245, 0.000)
		colorDesert    (0.263, 0.261, 0.259, 0.000)
		colorLowland   (0.277, 0.275, 0.273, 0.000)
		colorUpland    (0.291, 0.289, 0.286, 0.000)
		colorRock      (0.305, 0.302, 0.300, 0.000)
		colorSnow      (0.318, 0.316, 0.314, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0158554
		Period          0.327432
		Eccentricity    0.253806
		Inclination     -64.7025
		AscendingNode   153.092
		ArgOfPericenter -19.7554
		MeanAnomaly     -151.776
	}
}

Planet	"8"
{
	ParentBody     "HIP 23518"
	Class	       "IceGiant"

	Mass            15.3167
	Radius          20108.3
	InertiaMoment   0.226135

	Oblateness      0.026068

	RotationPeriod  10.2138
	Obliquity       -26.6685
	EqAscendNode    -167.771
	Precession      0

	AlbedoBond      0.421589
	AlbedoGeom      0.505906
	Brightness      2

	Surface
	{
		SurfStyle       0.85167
		Randomize      (0.629, 0.983, -0.596)
		detailScale     51719.7
		colorConversion true
		tropicLatitude  0.425453
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.23593
		stripeFluct     0.475498
		stripeTwist     9.76765
		cycloneMagn     8.38831
		cycloneFreq     0.801988
		cycloneDensity  0.489018
		cycloneOctaves  0
		colorLayer0    (0.200, 0.260, 0.330, 1.000)
		colorLayer1    (0.250, 0.330, 0.450, 1.000)
		colorLayer2    (0.220, 0.380, 0.560, 1.000)
		colorLayer3    (0.260, 0.430, 0.530, 1.000)
		colorLayer4    (0.240, 0.430, 0.630, 1.000)
		colorLayer5    (0.240, 0.510, 0.780, 1.000)
		colorLayer6    (0.340, 0.580, 0.750, 1.000)
		colorLayer7    (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.240, 0.430, 0.630, 1.000)
		colorUpPlants  (0.240, 0.510, 0.780, 1.000)
		BumpHeight      16.1112
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          34.6094
		Velocity        1084.46
		BumpHeight      18.4972
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.08157
		mainOctaves     12
		Coverage        0.107943
		stripeZones     6.23593
		stripeFluct     0.475498
		stripeTwist     9.76765
	}

	Clouds
	{
		Height          53.1055
		Velocity        -700.274
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.690)
		mainFreq        1.08157
		mainOctaves     12
		Coverage        0.107943
		stripeZones     6.23593
		stripeFluct     0.475498
		stripeTwist     9.76765
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          201.083
		Density         2003.3
		Pressure        165307
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0199977
		Saturation      0.662456

		Composition
		{
			H2    	92.1533
			He    	7.77759
			N2    	0.0436399
			CH4   	0.0150835
			O2    	0.00826995
			Ne    	0.0011957
			Ar    	0.000933194
		}
	}

	Aurora
	{
		Height      268.051
		NorthLat    71.9341
		NorthLon    33.2899
		NorthRadius 5062.25
		NorthWidth  1102.74
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -68.5416
		SouthLon    202.487
		SouthRadius 4325.88
		SouthWidth  839.154
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     27880.2
		OuterRadius     48658.2
		RotationPeriod  5.86315
		RotationOffset  0
		FrontBright     0.243843
		BackBright      0.591968
		Density         0.336392
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.9636
		Period          4.22919
		Eccentricity    0.0470918
		Inclination     -1.56153
		AscendingNode   -162.967
		ArgOfPericenter 253.187
		MeanAnomaly     251.909
	}
}

DwarfMoon	"8.D1"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.27227e-006
	Radius          174.79
	InertiaMoment   0.397511

	Oblateness      0.249

	Obliquity       -0.00811702
	EqAscendNode    3.90805
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.692 0.631)

	Surface
	{
		SurfStyle       0.249712
		OceanStyle      0.184867
		Randomize      (-0.254, -0.958, 0.485)
		colorDistMagn   0.397044
		colorDistFreq   18.469
		detailScale     4772.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335678
		terraceProb     0.138818
		erosion         0
		montesMagn      0.519211
		montesFreq      2.7816
		montesSpiky     0.955406
		montesFraction  0.418417
		dunesFraction   0
		hillsMagn       0
		hillsFreq       84.6578
		hillsFraction   0.56223
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210639
		craterFreq      1.29749
		craterDensity   0.959469
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547206
		volcanoTemp     1527.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.277, 0.252, 0.000)
		colorShelf     (0.332, 0.294, 0.268, 0.000)
		colorBeach     (0.352, 0.311, 0.284, 0.000)
		colorDesert    (0.371, 0.329, 0.300, 0.000)
		colorLowland   (0.391, 0.346, 0.315, 0.000)
		colorUpland    (0.410, 0.363, 0.331, 0.000)
		colorRock      (0.430, 0.381, 0.347, 0.000)
		colorSnow      (0.449, 0.398, 0.363, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000328663
		Period          0.00088049
		Eccentricity    7.92059e-005
		Inclination     -0.00811702
		AscendingNode   3.90805
		ArgOfPericenter -101.894
		MeanAnomaly     -63.8499
	}
}

Moon	"8.1"
{
	ParentBody     "8"
	Class	       "Selena"

	Mass            0.0104946
	Radius          1909.06
	InertiaMoment   0.375006

	Oblateness      0.0123715

	Obliquity       -0.190849
	EqAscendNode    118.472
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.539 0.534 0.528)

	Surface
	{
		SurfStyle       0.912393
		OceanStyle      0.0393335
		Randomize      (0.364, -0.429, 0.584)
		colorDistMagn   0.0745468
		colorDistFreq   244.278
		detailScale     4910.2
		colorConversion true
		drivenDarkening 0
		seaLevel        0.158851
		snowLevel       2
		tropicLatitude  0.00340048
		icecapLatitude  10
		icecapHeight    0.154152
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.93568
		venusFreq       0.38282
		venusMagn       0
		mareFreq        1.01154
		mareDensity     0.00183611
		terraceProb     0.394397
		erosion         0
		montesMagn      0.0957057
		montesFreq      102.333
		montesSpiky     0.879576
		montesFraction  0.842116
		dunesMagn       0.0448
		dunesFreq       2493.4
		dunesFraction   0.0695551
		hillsMagn       0.134015
		hillsFreq       205.452
		hillsFraction   0.473477
		hills2Fraction  0
		riversMagn      64.0644
		riversFreq      2.14346
		riversSin       5.97011
		riversOctaves   0
		canyonsMagn     0.683016
		canyonsFreq     0.695291
		canyonFraction  0.160309
		cracksMagn      0.0795317
		cracksFreq      1.12694
		cracksOctaves   0
		craterMagn      0.587898
		craterFreq      4.40265
		craterDensity   0.520055
		craterOctaves   6.50622
		craterRayedFactor 0.0879357
		volcanoMagn     0.320266
		volcanoFreq     0.711229
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.327295
		volcanoRadius   0.220513
		volcanoTemp     1646.09
		lavaCoverTidal  0.453917
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.383, 0.352, 0.307, 0.000)
		colorDesert    (0.447, 0.411, 0.338, 0.000)
		colorLowland   (0.356, 0.310, 0.254, 0.000)
		colorUpland    (0.318, 0.278, 0.238, 0.000)
		colorRock      (0.330, 0.250, 0.230, 0.000)
		colorSnow      (0.940, 0.910, 0.870, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000652646
		Period          0.002463
		Eccentricity    0.043531
		Inclination     -0.190849
		AscendingNode   118.472
		ArgOfPericenter 80.9883
		MeanAnomaly     114.732
	}
}

Moon	"8.2"
{
	ParentBody     "8"
	Class	       "Selena"

	Mass            0.136902
	Radius          4123.18
	InertiaMoment   0.328199

	Obliquity       0.257283
	EqAscendNode    -166.576
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.699 0.697 0.695)

	Surface
	{
		SurfStyle       0.740998
		OceanStyle      0.664451
		Randomize      (0.168, 0.098, -0.163)
		colorDistMagn   0.0830515
		colorDistFreq   429.097
		detailScale     10605
		colorConversion true
		drivenDarkening 0
		seaLevel        0.239679
		snowLevel       2
		tropicLatitude  0.0010358
		icecapLatitude  0.925874
		icecapHeight    0.241297
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.78201
		venusFreq       0.878717
		venusMagn       0
		mareFreq        1.63663
		mareDensity     0.0157321
		terraceProb     0.327105
		erosion         0
		montesMagn      0.167193
		montesFreq      181.662
		montesSpiky     0.965493
		montesFraction  0.92215
		dunesMagn       0.0429736
		dunesFreq       5439.45
		dunesFraction   0.513704
		hillsMagn       0.139217
		hillsFreq       494.05
		hillsFraction   0.164554
		hills2Fraction  0
		riversMagn      59.1009
		riversFreq      3.48127
		riversSin       6.07529
		riversOctaves   0
		canyonsMagn     0.532715
		canyonsFreq     1.3398
		canyonFraction  0.0742726
		cracksMagn      0.0575018
		cracksFreq      1.3108
		cracksOctaves   0
		craterMagn      0.635443
		craterFreq      11.6561
		craterDensity   0.659624
		craterOctaves   8.75767
		craterRayedFactor 0.0579168
		volcanoMagn     0.619103
		volcanoFreq     0.722681
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.371255
		volcanoRadius   0.58515
		volcanoTemp     1265.93
		lavaCoverTidal  0.300216
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.441, 0.425, 0.334, 0.000)
		colorDesert    (0.469, 0.432, 0.341, 0.000)
		colorLowland   (0.385, 0.321, 0.271, 0.000)
		colorUpland    (0.546, 0.495, 0.362, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.996492
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          136.625
		Density         0.000350805
		Pressure        0.00020769
		Greenhouse      0.52147
		Bright          3.22859
		Opacity         0
		SkyLight        1.0762
		Hue             0.0478402
		Saturation      1

		Composition
		{
			CH4   	88.8059
			C2H4  	7.7457
			N2    	1.55346
			C2H6  	1.11303
			C2H2  	0.709149
			H2S   	0.037747
			CO    	0.022957
			CO2   	0.0112281
			Ar    	0.000735021
			Ne    	8.94282e-005
			C3H8  	1.9276e-005
			Kr    	1.10269e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00149777
		Period          0.00852775
		Eccentricity    0.0379783
		Inclination     0.257283
		AscendingNode   -166.576
		ArgOfPericenter -16.0985
		MeanAnomaly     100.529
	}
}

DwarfMoon	"8.D2"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            6.97812e-006
	Radius          168.811
	InertiaMoment   0.393636

	Obliquity       -0.658494
	EqAscendNode    74.7873
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.587 0.584 0.582)

	Surface
	{
		SurfStyle       0.398767
		OceanStyle      0.219446
		Randomize      (-0.137, -0.313, -0.715)
		colorDistMagn   0.681092
		colorDistFreq   13.7246
		detailScale     4609.68
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0182593
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516463
		terraceProb     0.114413
		erosion         0
		montesMagn      0.39625
		montesFreq      3.31064
		montesSpiky     0.901678
		montesFraction  0.335882
		dunesFraction   0
		hillsMagn       0
		hillsFreq       65.5376
		hillsFraction   0.599961
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255421
		craterFreq      1.13547
		craterDensity   1.01197
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478056
		volcanoTemp     1343.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.234, 0.233, 0.000)
		colorShelf     (0.250, 0.248, 0.247, 0.000)
		colorBeach     (0.264, 0.263, 0.262, 0.000)
		colorDesert    (0.279, 0.277, 0.276, 0.000)
		colorLowland   (0.294, 0.292, 0.291, 0.000)
		colorUpland    (0.308, 0.307, 0.306, 0.000)
		colorRock      (0.323, 0.321, 0.320, 0.000)
		colorSnow      (0.338, 0.336, 0.335, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00226898
		Period          0.0159714
		Eccentricity    0.0349628
		Inclination     -0.658494
		AscendingNode   74.7873
		ArgOfPericenter 38.1898
		MeanAnomaly     -48.5066
	}
}

DwarfMoon	"8.D3"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.18189e-011
	Radius          4.24618
	InertiaMoment   0.398989

	Obliquity       -13.2302
	EqAscendNode    113.959
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.546 0.517)

	Surface
	{
		SurfStyle       0.728732
		OceanStyle      0.100687
		Randomize      (0.493, 0.565, -0.980)
		colorDistMagn   0.953113
		colorDistFreq   0.0049174
		detailScale     115.949
		colorConversion true
		snowLevel       2
		tropicLatitude  0.247485
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592687
		terraceProb     0.312489
		erosion         0
		montesMagn      0.6361
		montesFreq      4.61235
		montesSpiky     0.935107
		montesFraction  0.636143
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0506713
		hillsFraction   0.551435
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256131
		craterFreq      0.19142
		craterDensity   0.744051
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.613659
		volcanoTemp     1600.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.186, 0.145, 0.000)
		colorShelf     (0.250, 0.191, 0.165, 0.000)
		colorBeach     (0.294, 0.224, 0.196, 0.000)
		colorDesert    (0.319, 0.240, 0.191, 0.000)
		colorLowland   (0.351, 0.257, 0.217, 0.000)
		colorUpland    (0.388, 0.311, 0.264, 0.000)
		colorRock      (0.420, 0.338, 0.284, 0.000)
		colorSnow      (0.457, 0.360, 0.300, 1.000)
		BumpHeight      3.82156
		BumpOffset      0.764312
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0123641
		Period          0.203161
		Eccentricity    0.41378
		Inclination     -13.2302
		AscendingNode   113.959
		ArgOfPericenter 62.103
		MeanAnomaly     98.0665
	}
}

DwarfMoon	"8.D4"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.7377e-011
	Radius          6.16577
	InertiaMoment   0.399907

	Obliquity       12.0037
	EqAscendNode    136.492
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.473 0.470 0.465)

	Surface
	{
		SurfStyle       0.943992
		OceanStyle      0.188905
		Randomize      (0.860, 0.348, -0.217)
		colorDistMagn   0.725789
		colorDistFreq   0.0157489
		detailScale     168.367
		colorConversion true
		snowLevel       2
		tropicLatitude  0.153701
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380916
		terraceProb     0.323965
		erosion         0
		montesMagn      0.641899
		montesFreq      3.11504
		montesSpiky     0.976982
		montesFraction  0.528346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.106968
		hillsFraction   0.60661
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223926
		craterFreq      0.209886
		craterDensity   0.882337
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.584179
		volcanoTemp     1837.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.165, 0.186, 0.050)
		colorShelf     (0.189, 0.193, 0.214, 0.040)
		colorBeach     (0.218, 0.221, 0.242, 0.030)
		colorDesert    (0.246, 0.249, 0.274, 0.020)
		colorLowland   (0.274, 0.277, 0.302, 0.030)
		colorUpland    (0.303, 0.306, 0.330, 0.050)
		colorRock      (0.331, 0.334, 0.367, 0.020)
		colorSnow      (0.331, 0.334, 0.367, 1.000)
		BumpHeight      5.54919
		BumpOffset      1.10984
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0126087
		Period          0.20922
		Eccentricity    0.241892
		Inclination     12.0037
		AscendingNode   136.492
		ArgOfPericenter -155.342
		MeanAnomaly     81.9506
	}
}

DwarfMoon	"8.D5"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            9.74676e-011
	Radius          6.76251
	InertiaMoment   0.397982

	RotationPeriod  9717.47
	Obliquity       -80.7899
	EqAscendNode    49.4318
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.470 0.466 0.459)

	Surface
	{
		SurfStyle       0.175134
		OceanStyle      0.384749
		Randomize      (0.760, 0.075, 0.856)
		colorDistMagn   0.689724
		colorDistFreq   0.0142554
		detailScale     184.661
		colorConversion true
		snowLevel       2
		tropicLatitude  0.79388
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501345
		terraceProb     0.170045
		erosion         0
		montesMagn      0.486563
		montesFreq      3.30044
		montesSpiky     0.9693
		montesFraction  0.193867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.112599
		hillsFraction   0.620933
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230422
		craterFreq      0.234572
		craterDensity   0.936429
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.594402
		volcanoTemp     1362.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.186, 0.183, 0.000)
		colorShelf     (0.200, 0.198, 0.195, 0.000)
		colorBeach     (0.212, 0.209, 0.206, 0.000)
		colorDesert    (0.223, 0.221, 0.218, 0.000)
		colorLowland   (0.235, 0.233, 0.229, 0.000)
		colorUpland    (0.247, 0.244, 0.241, 0.000)
		colorRock      (0.259, 0.256, 0.252, 0.000)
		colorSnow      (0.270, 0.268, 0.264, 1.000)
		BumpHeight      6.08625
		BumpOffset      1.21725
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0131058
		Period          0.221713
		Eccentricity    0.368012
		Inclination     -80.7899
		AscendingNode   49.4318
		ArgOfPericenter -173.369
		MeanAnomaly     74.362
	}
}

DwarfMoon	"8.D6"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.58292e-010
	Radius          7.61117
	InertiaMoment   0.399128

	Obliquity       78.1881
	EqAscendNode    171.44
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.572 0.568 0.567)

	Surface
	{
		SurfStyle       0.177463
		OceanStyle      0.534803
		Randomize      (-0.701, 0.023, -0.773)
		colorDistMagn   0.56043
		colorDistFreq   0.0466275
		detailScale     207.836
		colorConversion true
		snowLevel       2
		tropicLatitude  0.145714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.754778
		terraceProb     0.111338
		erosion         0
		montesMagn      0.563373
		montesFreq      3.43988
		montesSpiky     0.879095
		montesFraction  0.226769
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.136689
		hillsFraction   0.809546
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230911
		craterFreq      0.275687
		craterDensity   0.932783
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488295
		volcanoTemp     1066.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.227, 0.227, 0.000)
		colorShelf     (0.243, 0.242, 0.241, 0.000)
		colorBeach     (0.257, 0.256, 0.255, 0.000)
		colorDesert    (0.272, 0.270, 0.269, 0.000)
		colorLowland   (0.286, 0.284, 0.283, 0.000)
		colorUpland    (0.300, 0.298, 0.297, 0.000)
		colorRock      (0.314, 0.313, 0.312, 0.000)
		colorSnow      (0.329, 0.327, 0.326, 1.000)
		BumpHeight      6.85005
		BumpOffset      1.37001
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0136516
		Period          0.235706
		Eccentricity    0.156813
		Inclination     78.1881
		AscendingNode   171.44
		ArgOfPericenter 139.545
		MeanAnomaly     37.9427
	}
}

DwarfMoon	"8.D7"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.48244e-010
	Radius          8.48153
	InertiaMoment   0.395024

	Obliquity       -4.78423
	EqAscendNode    -129.797
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.549 0.546 0.543)

	Surface
	{
		SurfStyle       0.571603
		OceanStyle      0.46673
		Randomize      (-0.065, -0.930, 0.986)
		colorDistMagn   0.901376
		colorDistFreq   0.0260995
		detailScale     231.602
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0707194
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548955
		terraceProb     0.3925
		erosion         0
		montesMagn      0.589902
		montesFreq      3.54926
		montesSpiky     0.894172
		montesFraction  0.47132
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.180261
		hillsFraction   0.624162
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253538
		craterFreq      0.250702
		craterDensity   0.847781
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.377846
		volcanoTemp     1516.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.186, 0.152, 0.000)
		colorShelf     (0.220, 0.191, 0.174, 0.000)
		colorBeach     (0.258, 0.224, 0.206, 0.000)
		colorDesert    (0.280, 0.240, 0.201, 0.000)
		colorLowland   (0.308, 0.256, 0.228, 0.000)
		colorUpland    (0.341, 0.311, 0.277, 0.000)
		colorRock      (0.368, 0.338, 0.299, 0.000)
		colorSnow      (0.401, 0.360, 0.315, 1.000)
		BumpHeight      7.63338
		BumpOffset      1.52668
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0142279
		Period          0.25079
		Eccentricity    0.113567
		Inclination     -4.78423
		AscendingNode   -129.797
		ArgOfPericenter 51.6313
		MeanAnomaly     108.74
	}
}

Planet	"9"
{
	ParentBody     "HIP 23518"
	Class	       "IceWorld"

	Mass            0.0253384
	Radius          2395.32
	InertiaMoment   0.358891

	Oblateness      0.00312963

	RotationPeriod  37.679
	Obliquity       42.4937
	EqAscendNode    131.679
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.729 0.479 0.387)

	Surface
	{
		SurfStyle       0.446303
		OceanStyle      0.840966
		Randomize      (0.555, 0.634, -0.708)
		colorDistMagn   0.0891122
		colorDistFreq   308.015
		detailScale     6160.89
		colorConversion true
		drivenDarkening 0
		seaLevel        0.155743
		snowLevel       2
		tropicLatitude  0.672223
		icecapLatitude  1
		icecapHeight    0.155743
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.86771
		venusFreq       0.944258
		venusMagn       0
		mareFreq        1.01474
		mareDensity     0.00480451
		terraceProb     0.464405
		erosion         0
		montesMagn      0.122136
		montesFreq      143.24
		montesSpiky     0.949297
		montesFraction  0.640312
		dunesMagn       0.0345156
		dunesFreq       3175.38
		dunesFraction   0.886847
		hillsMagn       0.130566
		hillsFreq       264.389
		hillsFraction   0.838574
		hills2Fraction  0.237603
		riversMagn      65.4649
		riversFreq      2.78789
		riversSin       5.0212
		riversOctaves   0
		canyonsMagn     0.563236
		canyonsFreq     0.866241
		canyonFraction  0
		cracksMagn      0.0498484
		cracksFreq      1.51795
		cracksOctaves   2
		craterMagn      0.586112
		craterFreq      6.744
		craterDensity   0.998704
		craterOctaves   12
		craterRayedFactor 0.178483
		volcanoMagn     0.448461
		volcanoFreq     0.633199
		volcanoDensity  0.223476
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.278618
		volcanoRadius   0.39289
		volcanoTemp     1378.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.729, 0.479, 0.387, 0.500)
		colorShelf     (0.693, 0.455, 0.367, 0.500)
		colorBeach     (0.510, 0.335, 0.271, 0.750)
		colorDesert    (0.620, 0.407, 0.329, 1.000)
		colorLowland   (0.642, 0.421, 0.340, 1.000)
		colorUpland    (0.678, 0.445, 0.360, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.642, 0.421, 0.340, 1.000)
		colorUpPlants  (0.678, 0.445, 0.360, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.53813
		Period          10.2297
		Eccentricity    0.0311082
		Inclination     0.404795
		AscendingNode   129.186
		ArgOfPericenter 92.4496
		MeanAnomaly     96.1412
	}
}

DwarfMoon	"9.D1"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            7.58062e-009
	Radius          25.8962
	InertiaMoment   0.399496

	Oblateness      0.249

	Obliquity       0.00086881
	EqAscendNode    -9.90937
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.669 0.667)

	Surface
	{
		SurfStyle       0.452419
		OceanStyle      0.155321
		Randomize      (-0.816, 0.094, 0.195)
		colorDistMagn   0.497969
		colorDistFreq   0.126823
		detailScale     707.139
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563116
		terraceProb     0.296912
		erosion         0
		montesMagn      0.445445
		montesFreq      2.72924
		montesSpiky     0.947875
		montesFraction  0.463006
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.03763
		hillsFraction   0.702447
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24532
		craterFreq      0.222698
		craterDensity   0.855237
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487511
		volcanoTemp     1656.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.268, 0.267, 0.000)
		colorShelf     (0.287, 0.284, 0.283, 0.000)
		colorBeach     (0.303, 0.301, 0.300, 0.000)
		colorDesert    (0.320, 0.318, 0.317, 0.000)
		colorLowland   (0.337, 0.335, 0.333, 0.000)
		colorUpland    (0.354, 0.351, 0.350, 0.000)
		colorRock      (0.371, 0.368, 0.367, 0.000)
		colorSnow      (0.388, 0.385, 0.383, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.64506e-005
		Period          0.000799553
		Eccentricity    9.22683e-005
		Inclination     0.00086881
		AscendingNode   -9.90937
		ArgOfPericenter 45.5292
		MeanAnomaly     172.991
	}
}

DwarfMoon	"9.D2"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            1.03642e-008
	Radius          33.6357
	InertiaMoment   0.397127

	Oblateness      0.249

	Obliquity       0.000916002
	EqAscendNode    170.238
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.451 0.446 0.441)

	Surface
	{
		SurfStyle       0.583507
		OceanStyle      0.81084
		Randomize      (-0.833, -0.516, 0.727)
		colorDistMagn   0.774749
		colorDistFreq   0.468805
		detailScale     918.478
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580871
		terraceProb     0.386532
		erosion         0
		montesMagn      0.463579
		montesFreq      2.89672
		montesSpiky     0.90403
		montesFraction  0.5373
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.78493
		hillsFraction   0.919521
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261751
		craterFreq      0.25421
		craterDensity   0.892971
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534916
		volcanoTemp     1747.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.152, 0.124, 0.000)
		colorShelf     (0.180, 0.156, 0.141, 0.000)
		colorBeach     (0.212, 0.183, 0.168, 0.000)
		colorDesert    (0.230, 0.196, 0.163, 0.000)
		colorLowland   (0.253, 0.210, 0.185, 0.000)
		colorUpland    (0.280, 0.254, 0.225, 0.000)
		colorRock      (0.302, 0.276, 0.243, 0.000)
		colorSnow      (0.329, 0.294, 0.256, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.04794e-005
		Period          0.000935709
		Eccentricity    3.43147e-005
		Inclination     0.000916002
		AscendingNode   170.238
		ArgOfPericenter 37.3774
		MeanAnomaly     55.2702
	}
}

DwarfMoon	"9.D3"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            1.41238e-008
	Radius          35.0526
	InertiaMoment   0.398653

	Oblateness      0.249

	Obliquity       0.0136213
	EqAscendNode    67.4894
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.686 0.658)

	Surface
	{
		SurfStyle       0.980448
		OceanStyle      0.046521
		Randomize      (-0.236, 0.171, 0.279)
		colorDistMagn   0.668946
		colorDistFreq   1.0236
		detailScale     957.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364667
		terraceProb     0.389649
		erosion         0
		montesMagn      0.537011
		montesFreq      3.05483
		montesSpiky     0.86345
		montesFraction  0.380058
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.34511
		hillsFraction   0.831334
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230985
		craterFreq      0.197129
		craterDensity   0.874759
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476029
		volcanoTemp     1354.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.240, 0.263, 0.050)
		colorShelf     (0.297, 0.281, 0.303, 0.040)
		colorBeach     (0.342, 0.323, 0.342, 0.030)
		colorDesert    (0.387, 0.364, 0.388, 0.020)
		colorLowland   (0.431, 0.405, 0.428, 0.030)
		colorUpland    (0.476, 0.446, 0.467, 0.050)
		colorRock      (0.520, 0.487, 0.520, 0.020)
		colorSnow      (0.520, 0.487, 0.520, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.85913e-005
		Period          0.00123063
		Eccentricity    5.14774e-005
		Inclination     0.0136213
		AscendingNode   67.4894
		ArgOfPericenter 47.8205
		MeanAnomaly     -72.5197
	}
}

Moon	"9.1"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.00012028
	Radius          409.825
	InertiaMoment   0.398447

	Oblateness      0.00909831

	Obliquity       1.45578
	EqAscendNode    -18.5078
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.666 0.614 0.562)

	Surface
	{
		SurfStyle       0.996929
		OceanStyle      0.236127
		Randomize      (-0.092, -0.911, 0.955)
		colorDistMagn   0.0456113
		colorDistFreq   60.1099
		detailScale     1054.09
		colorConversion true
		drivenDarkening 0
		seaLevel        0.18585
		snowLevel       2
		tropicLatitude  0.0501336
		icecapLatitude  0.695163
		icecapHeight    0.199404
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88561
		venusFreq       1.03662
		venusMagn       0
		mareFreq        0
		mareDensity     0.000148353
		terraceProb     0.288303
		erosion         0
		montesMagn      0.0652067
		montesFreq      24.7721
		montesSpiky     0.933482
		montesFraction  0.387702
		dunesMagn       0.04161
		dunesFreq       550.939
		dunesFraction   0.794998
		hillsMagn       0.111247
		hillsFreq       44.2355
		hillsFraction   0.688526
		hills2Fraction  0.21352
		riversMagn      56.5586
		riversFreq      3.08622
		riversSin       6.72106
		riversOctaves   0
		canyonsMagn     0.589214
		canyonsFreq     0.137458
		canyonFraction  0
		cracksMagn      0.0638817
		cracksFreq      0.182334
		cracksOctaves   0
		craterMagn      0.655829
		craterFreq      0.869252
		craterDensity   0.94358
		craterOctaves   9
		craterRayedFactor 0.201522
		volcanoMagn     0.176271
		volcanoFreq     0.570842
		volcanoDensity  0.221297
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.224716
		volcanoRadius   0.150682
		volcanoTemp     1423.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.506, 0.436, 0.326, 1.000)
		colorShelf     (0.506, 0.436, 0.326, 1.000)
		colorBeach     (0.466, 0.380, 0.281, 1.000)
		colorDesert    (0.466, 0.380, 0.281, 1.000)
		colorLowland   (0.566, 0.497, 0.427, 1.000)
		colorUpland    (0.593, 0.546, 0.483, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.566, 0.497, 0.427, 1.000)
		colorUpPlants  (0.593, 0.546, 0.483, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.39525e-005
		Period          0.00278812
		Eccentricity    0.0313455
		Inclination     1.45578
		AscendingNode   -18.5078
		ArgOfPericenter -179.521
		MeanAnomaly     75.6186
	}
}

Moon	"9.2"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.000139219
	Radius          457.052
	InertiaMoment   0.397724

	Obliquity       0.56552
	EqAscendNode    149.382
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.758 0.624 0.438)

	Surface
	{
		SurfStyle       0.569456
		OceanStyle      0.343646
		Randomize      (-0.732, 0.844, -0.622)
		colorDistMagn   0.0624659
		colorDistFreq   51.5649
		detailScale     1175.56
		colorConversion true
		drivenDarkening 0
		seaLevel        0.248646
		snowLevel       2
		tropicLatitude  0.0052134
		icecapLatitude  0.48211
		icecapHeight    0.276308
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.03721
		venusFreq       1.03028
		venusMagn       0
		mareFreq        0
		mareDensity     0.000120937
		terraceProb     0.357214
		erosion         0
		montesMagn      0.0498581
		montesFreq      23.726
		montesSpiky     0.83936
		montesFraction  0.734362
		dunesMagn       0.0408144
		dunesFreq       600.81
		dunesFraction   0.290836
		hillsMagn       0.102578
		hillsFreq       53.4401
		hillsFraction   0.319941
		hills2Fraction  0.0178374
		riversMagn      58.6468
		riversFreq      3.47647
		riversSin       6.17849
		riversOctaves   0
		canyonsMagn     0.50159
		canyonsFreq     0.143124
		canyonFraction  0
		cracksMagn      0.0407969
		cracksFreq      0.187316
		cracksOctaves   0
		craterMagn      0.550748
		craterFreq      1.36108
		craterDensity   0.865065
		craterOctaves   9
		craterRayedFactor 0.0650536
		volcanoMagn     0.172236
		volcanoFreq     0.58755
		volcanoDensity  0.214065
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.24957
		volcanoRadius   0.163756
		volcanoTemp     1394.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.156, 0.096, 0.000)
		colorShelf     (0.281, 0.193, 0.123, 0.000)
		colorBeach     (0.425, 0.293, 0.184, 0.200)
		colorDesert    (0.387, 0.274, 0.162, 0.500)
		colorLowland   (0.296, 0.212, 0.123, 0.800)
		colorUpland    (0.500, 0.374, 0.228, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.296, 0.212, 0.123, 0.800)
		colorUpPlants  (0.500, 0.374, 0.228, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000245657
		Period          0.0139506
		Eccentricity    0.00475059
		Inclination     0.56552
		AscendingNode   149.382
		ArgOfPericenter 124.231
		MeanAnomaly     -106.17
	}
}

Moon	"9.3"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.000161085
	Radius          451.6
	InertiaMoment   0.396409

	Obliquity       1.27462
	EqAscendNode    108.52
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.800 0.657 0.557)

	Surface
	{
		SurfStyle       0.593902
		OceanStyle      0.24641
		Randomize      (-0.345, 0.818, 0.557)
		colorDistMagn   0.0484722
		colorDistFreq   58.6959
		detailScale     1161.54
		colorConversion true
		drivenDarkening 0
		seaLevel        0.165497
		snowLevel       2
		tropicLatitude  0.0259847
		icecapLatitude  0.967136
		icecapHeight    0.168041
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.69262
		venusFreq       0.353986
		venusMagn       0
		mareFreq        0
		mareDensity     0.000144786
		terraceProb     0.25667
		erosion         0
		montesMagn      0.0710023
		montesFreq      20.6236
		montesSpiky     0.837849
		montesFraction  0.472369
		dunesMagn       0.0279869
		dunesFreq       602.725
		dunesFraction   0.934611
		hillsMagn       0.122571
		hillsFreq       49.7098
		hillsFraction   0.472573
		hills2Fraction  0.155937
		riversMagn      52.6345
		riversFreq      2.78464
		riversSin       7.2964
		riversOctaves   0
		canyonsMagn     0.434966
		canyonsFreq     0.161191
		canyonFraction  0
		cracksMagn      0.0474374
		cracksFreq      0.168538
		cracksOctaves   0
		craterMagn      0.577185
		craterFreq      1.34963
		craterDensity   0.996911
		craterOctaves   9
		craterRayedFactor 0
		volcanoMagn     0.176999
		volcanoFreq     0.648513
		volcanoDensity  0.184114
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.415119
		volcanoRadius   0.144903
		volcanoTemp     1637.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.164, 0.122, 0.000)
		colorShelf     (0.296, 0.204, 0.156, 0.000)
		colorBeach     (0.448, 0.309, 0.234, 0.200)
		colorDesert    (0.408, 0.289, 0.206, 0.500)
		colorLowland   (0.312, 0.223, 0.156, 0.800)
		colorUpland    (0.528, 0.394, 0.290, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.312, 0.223, 0.156, 0.800)
		colorUpPlants  (0.528, 0.394, 0.290, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000420221
		Period          0.0311982
		Eccentricity    0.00996755
		Inclination     1.27462
		AscendingNode   108.52
		ArgOfPericenter -76.3473
		MeanAnomaly     30.6179
	}
}

DwarfMoon	"9.D4"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            4.80194e-008
	Radius          53.0573
	InertiaMoment   0.39975

	RotationPeriod  8832.43
	Obliquity       28.9541
	EqAscendNode    71.9204
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.708 0.705 0.704)

	Surface
	{
		SurfStyle       0.0402533
		OceanStyle      0.827674
		Randomize      (0.598, 0.255, 0.351)
		colorDistMagn   0.991919
		colorDistFreq   1.34366
		detailScale     1448.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.721027
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543678
		terraceProb     0.108951
		erosion         0
		montesMagn      0.481961
		montesFreq      3.4098
		montesSpiky     0.993571
		montesFraction  0.44867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.85975
		hillsFraction   0.548051
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266008
		craterFreq      0.229565
		craterDensity   0.903778
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556102
		volcanoTemp     1517.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.282, 0.281, 0.000)
		colorShelf     (0.301, 0.300, 0.299, 0.000)
		colorBeach     (0.318, 0.317, 0.317, 0.000)
		colorDesert    (0.336, 0.335, 0.334, 0.000)
		colorLowland   (0.354, 0.352, 0.352, 0.000)
		colorUpland    (0.371, 0.370, 0.369, 0.000)
		colorRock      (0.389, 0.388, 0.387, 0.000)
		colorSnow      (0.407, 0.405, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00267904
		Period          0.5038
		Eccentricity    0.473207
		Inclination     28.9541
		AscendingNode   71.9204
		ArgOfPericenter 158.678
		MeanAnomaly     1.65673
	}
}

DwarfMoon	"9.D5"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            6.52571e-008
	Radius          56.3461
	InertiaMoment   0.397702

	RotationPeriod  8239.12
	Obliquity       33.2598
	EqAscendNode    106.599
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.589 0.586 0.582)

	Surface
	{
		SurfStyle       0.121471
		OceanStyle      0.883176
		Randomize      (0.283, -0.723, 0.478)
		colorDistMagn   0.945361
		colorDistFreq   1.91279
		detailScale     1538.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.619317
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50147
		terraceProb     0.508668
		erosion         0
		montesMagn      0.42237
		montesFreq      2.27902
		montesSpiky     0.845358
		montesFraction  0.478446
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.15607
		hillsFraction   0.653452
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206481
		craterFreq      0.272541
		craterDensity   0.961611
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436207
		volcanoTemp     1594.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.235, 0.233, 0.000)
		colorShelf     (0.250, 0.249, 0.248, 0.000)
		colorBeach     (0.265, 0.264, 0.262, 0.000)
		colorDesert    (0.280, 0.279, 0.277, 0.000)
		colorLowland   (0.294, 0.293, 0.291, 0.000)
		colorUpland    (0.309, 0.308, 0.306, 0.000)
		colorRock      (0.324, 0.323, 0.320, 0.000)
		colorSnow      (0.339, 0.337, 0.335, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00309841
		Period          0.62661
		Eccentricity    0.22844
		Inclination     33.2598
		AscendingNode   106.599
		ArgOfPericenter 151.497
		MeanAnomaly     -123.567
	}
}

Planet	"10"
{
	ParentBody     "HIP 23518"
	Class	       "GasGiant"

	Mass            104.575
	Radius          59592.1
	InertiaMoment   0.273091

	Oblateness      0.0750262

	RotationPeriod  12.7329
	Obliquity       -37.5432
	EqAscendNode    95.9979
	Precession      0

	AlbedoBond      0.463217
	AlbedoGeom      0.55586
	Brightness      2

	Surface
	{
		SurfStyle       0.756461
		Randomize      (0.996, 0.713, 0.539)
		detailScale     153274
		colorConversion true
		tropicLatitude  0.61291
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.31406
		stripeFluct     0.386871
		stripeTwist     12.9348
		cycloneMagn     12.8103
		cycloneFreq     0.855867
		cycloneDensity  0.23179
		cycloneOctaves  5
		colorLayer0    (0.120, 0.200, 0.480, 1.100)
		colorLayer1    (0.330, 0.400, 0.720, 0.700)
		colorLayer2    (0.330, 0.400, 0.720, 0.200)
		colorLayer3    (0.600, 0.600, 0.600, 0.050)
		colorLayer4    (0.350, 0.430, 0.770, 0.000)
		colorLayer5    (0.470, 0.540, 0.850, 0.000)
		colorLayer6    (0.600, 0.650, 0.910, 0.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 0.000)
		colorUpPlants  (0.470, 0.540, 0.850, 0.000)
		BumpHeight      18.273
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          55.8125
		Velocity        -707.029
		BumpHeight      37.5402
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.761382
		mainOctaves     12
		Coverage        0.132167
		stripeZones     6.31406
		stripeFluct     0.386871
		stripeTwist     12.9348
	}

	Clouds
	{
		Height          93.3516
		Velocity        -568.562
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        0.761382
		mainOctaves     12
		Coverage        0.132167
		stripeZones     6.31406
		stripeFluct     0.386871
		stripeTwist     12.9348
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          393.675
		Density         11809.6
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0450836
		Saturation      0.779476

		Composition
		{
			H2    	94.2695
			He    	5.72945
			Ne    	0.00104087
			N2    	2.2718e-005
		}
	}

	Aurora
	{
		Height      3314.96
		NorthLat    85.7437
		NorthLon    -144.978
		NorthRadius 16660.4
		NorthWidth  8755.65
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -87.6065
		SouthLon    27.7439
		SouthRadius 12395.2
		SouthWidth  5885.72
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.14796
		Period          23.4227
		Eccentricity    0.0415205
		Inclination     -1.51526
		AscendingNode   81.2067
		ArgOfPericenter 24.5281
		MeanAnomaly     71.8233
	}
}

DwarfMoon	"10.D1"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.59846e-006
	Radius          160.92
	InertiaMoment   0.395862

	Oblateness      0.249

	Obliquity       -0.00108716
	EqAscendNode    168.843
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.684 0.582 0.490)

	Surface
	{
		SurfStyle       0.324222
		OceanStyle      0.754567
		Randomize      (0.447, -0.554, 0.904)
		colorDistMagn   0.406612
		colorDistFreq   8.70526
		detailScale     4394.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406436
		terraceProb     0.210283
		erosion         0
		montesMagn      0.60251
		montesFreq      2.56411
		montesSpiky     0.988453
		montesFraction  0.784423
		dunesFraction   0
		hillsMagn       0
		hillsFreq       56.9565
		hillsFraction   0.529459
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222363
		craterFreq      0.929127
		craterDensity   0.971265
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474083
		volcanoTemp     1783.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.233, 0.196, 0.000)
		colorShelf     (0.291, 0.247, 0.208, 0.000)
		colorBeach     (0.308, 0.262, 0.220, 0.000)
		colorDesert    (0.325, 0.276, 0.233, 0.000)
		colorLowland   (0.342, 0.291, 0.245, 0.000)
		colorUpland    (0.359, 0.305, 0.257, 0.000)
		colorRock      (0.376, 0.320, 0.269, 0.000)
		colorSnow      (0.393, 0.334, 0.282, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000730263
		Period          0.00111605
		Eccentricity    3.54027e-005
		Inclination     -0.00108716
		AscendingNode   168.843
		ArgOfPericenter 89.6598
		MeanAnomaly     -8.31156
	}
}

DwarfMoon	"10.D2"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.3711e-006
	Radius          173.99
	InertiaMoment   0.398275

	Oblateness      0.197923

	Obliquity       0.0132415
	EqAscendNode    148.655
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.585 0.482 0.413)

	Surface
	{
		SurfStyle       0.364223
		OceanStyle      0.932401
		Randomize      (-0.949, 0.663, 0.785)
		colorDistMagn   0.656672
		colorDistFreq   11.9231
		detailScale     4751.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.753773
		terraceProb     0.624864
		erosion         0
		montesMagn      0.545655
		montesFreq      2.64489
		montesSpiky     0.894459
		montesFraction  0.748756
		dunesFraction   0
		hillsMagn       0
		hillsFreq       61.0367
		hillsFraction   0.590379
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217716
		craterFreq      1.04764
		craterDensity   0.715162
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451847
		volcanoTemp     1540.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.193, 0.165, 0.000)
		colorShelf     (0.249, 0.205, 0.176, 0.000)
		colorBeach     (0.263, 0.217, 0.186, 0.000)
		colorDesert    (0.278, 0.229, 0.196, 0.000)
		colorLowland   (0.293, 0.241, 0.207, 0.000)
		colorUpland    (0.307, 0.253, 0.217, 0.000)
		colorRock      (0.322, 0.265, 0.227, 0.000)
		colorSnow      (0.337, 0.277, 0.238, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000756775
		Period          0.00117738
		Eccentricity    6.11367e-005
		Inclination     0.0132415
		AscendingNode   148.655
		ArgOfPericenter -168.674
		MeanAnomaly     -91.9323
	}
}

Moon	"10.1"
{
	ParentBody     "10"
	Class	       "Desert"

	Mass            0.0735809
	Radius          3596.11
	InertiaMoment   0.334796

	Oblateness      0.00652862

	Obliquity       -0.907901
	EqAscendNode    -96.8906
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.798 0.794 0.792)

	Surface
	{
		SurfStyle       0.870907
		OceanStyle      0.567564
		Randomize      (-0.443, -0.796, 0.176)
		colorDistMagn   0.0574503
		colorDistFreq   522.808
		detailScale     9249.4
		colorConversion true
		seaLevel        0.113866
		snowLevel       2
		tropicLatitude  0.0210205
		icecapLatitude  10
		icecapHeight    0.160594
		climatePole     0.4375
		climateTropic   0.446201
		climateEquator  0.6875
		heightTempGrad  0.491299
		tropicWidth     0.192986
		mainFreq        0.647278
		venusFreq       0.443172
		venusMagn       0.42031
		mareFreq        0.915227
		mareDensity     0.0118052
		terraceProb     0.359248
		erosion         0
		montesMagn      0.170397
		montesFreq      140.493
		montesSpiky     0.921525
		montesFraction  0.952581
		dunesMagn       0.060591
		dunesFreq       21.7394
		dunesFraction   0.584811
		hillsMagn       0.156478
		hillsFreq       292.818
		hillsFraction   0
		hills2Fraction  0
		riversMagn      65.4892
		riversFreq      2.1961
		riversSin       6.2873
		riversOctaves   0
		canyonsMagn     0.0322105
		canyonsFreq     89.2388
		canyonFraction  0
		cracksMagn      0.105147
		cracksFreq      0.41908
		cracksOctaves   0
		craterMagn      0.539269
		craterFreq      12.2789
		craterDensity   0.309502
		craterOctaves   4.20643
		volcanoMagn     0.692567
		volcanoFreq     0.61446
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.286765
		volcanoRadius   0.52656
		volcanoTemp     1711.35
		lavaCoverTidal  0.548469
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.640, 0.500, 0.420, 0.000)
		colorShelf     (0.680, 0.500, 0.470, 0.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.310, 0.230, 0.170, 0.000)
		colorUpPlants  (0.510, 0.330, 0.190, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.895884
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          173.677
		Density         0.0104116
		Pressure        0.00838064
		Greenhouse      0.695082
		Bright          6.36068
		Opacity         1
		SkyLight        2.12023
		Hue             -0.0473286
		Saturation      1

		Composition
		{
			CO2   	57.2823
			C2H2  	18.5015
			SO2   	10.9169
			H2S   	8.69958
			N2    	1.93854
			C2H6  	1.45116
			C2H4  	0.72128
			C3H8  	0.484461
			CO    	0.00304751
			Ar    	0.000865335
			Cl2   	0.000166489
			Kr    	7.47482e-005
			Ne    	6.65163e-005
			O2    	1.06437e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00143493
		Period          0.00307297
		Eccentricity    0.0385465
		Inclination     -0.907901
		AscendingNode   -96.8906
		ArgOfPericenter -87.696
		MeanAnomaly     -58.9523
	}
}

Moon	"10.2"
{
	ParentBody     "10"
	Class	       "Desert"

	Mass            0.963348
	Radius          7547.66
	InertiaMoment   0.326823

	Oblateness      0.00117559

	Obliquity       0.288034
	EqAscendNode    -24.382
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.552 0.545 0.543)

	Surface
	{
		SurfStyle       0.0717
		OceanStyle      0.695185
		Randomize      (-0.654, -0.862, -0.687)
		colorDistMagn   0.0807147
		colorDistFreq   737.183
		detailScale     19413
		colorConversion true
		seaLevel        0.0485882
		snowLevel       2
		tropicLatitude  0.00982635
		icecapLatitude  0.910581
		icecapHeight    0.0529101
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.11432
		venusFreq       0.512328
		venusMagn       0.417465
		mareFreq        2.03006
		mareDensity     0.101072
		terraceProb     0.333794
		erosion         0
		montesMagn      0.162544
		montesFreq      279.266
		montesSpiky     0.901695
		montesFraction  0.150533
		dunesMagn       0.0604944
		dunesFreq       74.2902
		dunesFraction   0.86271
		hillsMagn       0.146208
		hillsFreq       1131.97
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.5278
		riversFreq      2.09798
		riversSin       6.1077
		riversOctaves   0
		canyonsMagn     0.0563752
		canyonsFreq     209.407
		canyonFraction  0
		cracksMagn      0.0680914
		cracksFreq      0.525379
		cracksOctaves   0
		craterMagn      0.53343
		craterFreq      19.6505
		craterDensity   0.437669
		craterOctaves   6.00623
		volcanoMagn     0.740469
		volcanoFreq     0.493698
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.781478
		volcanoRadius   0.445323
		volcanoTemp     1296.22
		lavaCoverTidal  0.336726
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.230, 0.230, 0.000)
		colorShelf     (0.380, 0.360, 0.350, 0.000)
		colorBeach     (0.550, 0.520, 0.480, 0.000)
		colorDesert    (0.520, 0.490, 0.470, 0.000)
		colorLowland   (0.460, 0.440, 0.410, 0.000)
		colorUpland    (0.390, 0.360, 0.330, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.460, 0.440, 0.410, 0.000)
		colorUpPlants  (0.390, 0.360, 0.330, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.673853
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          37.7383
		Density         0.0326147
		Pressure        0.0102624
		Greenhouse      1.09942
		Bright          7.9925
		Opacity         1
		SkyLight        2.66417
		Hue             -0.0395772
		Saturation      1

		Composition
		{
			N2    	99.6121
			CO    	0.14748
			Ne    	0.136181
			Ar    	0.0919546
			He    	0.00841624
			Kr    	0.00387401
		}
	}

	Aurora
	{
		Height      168.735
		NorthLat    74.14
		NorthLon    159.829
		NorthRadius 1808.72
		NorthWidth  717.625
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -79.6182
		SouthLon    341.001
		SouthRadius 1960.07
		SouthWidth  416.899
		SouthRings  2
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00224735
		Period          0.00599762
		Eccentricity    0.00386699
		Inclination     0.288034
		AscendingNode   -24.382
		ArgOfPericenter -116.897
		MeanAnomaly     -140.784
	}
}

Moon	"10.3"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            5.49183e-005
	Radius          335.46
	InertiaMoment   0.399682

	Obliquity       -1.22589
	EqAscendNode    121.654
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.593 0.586 0.580)

	Surface
	{
		SurfStyle       0.345813
		OceanStyle      0.41971
		Randomize      (-0.807, -0.367, -0.612)
		colorDistMagn   0.0775532
		colorDistFreq   40.6249
		detailScale     862.821
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.266689
		snowLevel       2
		tropicLatitude  0.0208554
		icecapLatitude  0.505667
		icecapHeight    0.284016
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.66715
		venusFreq       0.405665
		venusMagn       0
		mareFreq        0
		mareDensity     5.73854e-005
		terraceProb     0.239068
		erosion         0
		montesMagn      0.0649142
		montesFreq      18.6934
		montesSpiky     0.900916
		montesFraction  0.0159224
		dunesMagn       0.0410472
		dunesFreq       448.792
		dunesFraction   0.550595
		hillsMagn       0.10495
		hillsFreq       34.415
		hillsFraction   0.0631159
		hills2Fraction  0.0736962
		riversMagn      67.1012
		riversFreq      2.94195
		riversSin       5.23758
		riversOctaves   0
		canyonsMagn     0.427316
		canyonsFreq     0.101628
		canyonFraction  0
		cracksMagn      0.0451583
		cracksFreq      0.18247
		cracksOctaves   0
		craterMagn      0.751521
		craterFreq      0.746155
		craterDensity   0.791081
		craterOctaves   8
		craterRayedFactor 0.236725
		volcanoMagn     0.177828
		volcanoFreq     0.701969
		volcanoDensity  0.222998
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.112667
		volcanoRadius   0.118342
		volcanoTemp     1248.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.593, 0.586, 0.580, 0.500)
		colorShelf     (0.564, 0.557, 0.551, 0.500)
		colorBeach     (0.415, 0.410, 0.406, 0.750)
		colorDesert    (0.504, 0.498, 0.493, 1.000)
		colorLowland   (0.522, 0.516, 0.511, 1.000)
		colorUpland    (0.552, 0.545, 0.540, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.522, 0.516, 0.511, 1.000)
		colorUpPlants  (0.552, 0.545, 0.540, 1.000)
		BumpHeight      16.773
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00351973
		Period          0.0118094
		Eccentricity    0.0275606
		Inclination     -1.22589
		AscendingNode   121.654
		ArgOfPericenter -159.77
		MeanAnomaly     -86.7192
	}
}

Moon	"10.4"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.00012965
	Radius          420.171
	InertiaMoment   0.399205

	Obliquity       1.32213
	EqAscendNode    -117.897
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.753 0.683 0.618)

	Surface
	{
		SurfStyle       0.0115014
		OceanStyle      0.650464
		Randomize      (-0.748, 0.135, -0.333)
		colorDistMagn   0.0805323
		colorDistFreq   50.7866
		detailScale     1080.7
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.142271
		snowLevel       2
		tropicLatitude  0.0238017
		icecapLatitude  0.482362
		icecapHeight    0.17907
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79658
		venusFreq       1.27706
		venusMagn       0.124567
		mareFreq        0
		mareDensity     0.000112843
		terraceProb     0.369043
		erosion         0
		montesMagn      0.0606707
		montesFreq      23.0869
		montesSpiky     0.963919
		montesFraction  0.0266
		dunesMagn       0.0433584
		dunesFreq       531.677
		dunesFraction   0.624293
		hillsMagn       0.1252
		hillsFreq       50.4446
		hillsFraction   0.867117
		hills2Fraction  0.0587507
		riversMagn      62.2625
		riversFreq      2.59634
		riversSin       6.00789
		riversOctaves   0
		canyonsMagn     0.533101
		canyonsFreq     0.139661
		canyonFraction  0
		cracksMagn      0.0297284
		cracksFreq      0.188436
		cracksOctaves   0
		craterMagn      0.626443
		craterFreq      1.48407
		craterDensity   0.991371
		craterOctaves   9
		craterRayedFactor 0.218459
		volcanoMagn     0.169428
		volcanoFreq     0.753075
		volcanoDensity  0.194429
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.340727
		volcanoRadius   0.146836
		volcanoTemp     1764.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.753, 0.683, 0.618, 0.500)
		colorShelf     (0.716, 0.649, 0.587, 0.500)
		colorBeach     (0.527, 0.478, 0.432, 0.750)
		colorDesert    (0.640, 0.581, 0.525, 1.000)
		colorLowland   (0.663, 0.601, 0.543, 1.000)
		colorUpland    (0.701, 0.635, 0.574, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.663, 0.601, 0.543, 1.000)
		colorUpPlants  (0.701, 0.635, 0.574, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00551251
		Period          0.0231467
		Eccentricity    0.0449615
		Inclination     1.32213
		AscendingNode   -117.897
		ArgOfPericenter 46.6091
		MeanAnomaly     -53.1019
	}
}

Moon	"10.5"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.000217317
	Radius          529.934
	InertiaMoment   0.398678

	Obliquity       0.696729
	EqAscendNode    125.84
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.815 0.788 0.770)

	Surface
	{
		SurfStyle       0.189006
		OceanStyle      0.84672
		Randomize      (-0.818, -0.149, 0.995)
		colorDistMagn   0.066894
		colorDistFreq   53.6078
		detailScale     1363.02
		colorConversion true
		drivenDarkening 0.645955
		seaLevel        0.124057
		snowLevel       2
		tropicLatitude  0.0110699
		icecapLatitude  0.686716
		icecapHeight    0.143618
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.69091
		venusFreq       0.847498
		venusMagn       0
		mareFreq        0
		mareDensity     0.000196783
		terraceProb     0.186232
		erosion         0
		montesMagn      0.0550542
		montesFreq      30.2655
		montesSpiky     0.946108
		montesFraction  0.0631596
		dunesMagn       0.0349217
		dunesFreq       703.835
		dunesFraction   0.943513
		hillsMagn       0.120963
		hillsFreq       57.41
		hillsFraction   0.993175
		hills2Fraction  0.0265486
		riversMagn      53.436
		riversFreq      2.44288
		riversSin       5.8074
		riversOctaves   0
		canyonsMagn     0.359688
		canyonsFreq     0.178309
		canyonFraction  0
		cracksMagn      0.0526919
		cracksFreq      0.140683
		cracksOctaves   0
		craterMagn      0.582889
		craterFreq      1.476
		craterDensity   0.824033
		craterOctaves   9
		craterRayedFactor 0.164848
		volcanoMagn     0.180716
		volcanoFreq     0.5937
		volcanoDensity  0.216808
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.104338
		volcanoRadius   0.130261
		volcanoTemp     1463.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.815, 0.788, 0.770, 0.500)
		colorShelf     (0.774, 0.749, 0.731, 0.500)
		colorBeach     (0.571, 0.552, 0.539, 0.750)
		colorDesert    (0.693, 0.670, 0.654, 1.000)
		colorLowland   (0.717, 0.694, 0.677, 1.000)
		colorUpland    (0.758, 0.733, 0.716, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.717, 0.694, 0.677, 1.000)
		colorUpPlants  (0.758, 0.733, 0.716, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00863354
		Period          0.0453678
		Eccentricity    0.0304746
		Inclination     0.696729
		AscendingNode   125.84
		ArgOfPericenter -167.934
		MeanAnomaly     -40.3859
	}
}

Moon	"10.6"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.00031975
	Radius          567.065
	InertiaMoment   0.398036

	Obliquity       -0.365589
	EqAscendNode    -113.904
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.855 0.790 0.690)

	Surface
	{
		SurfStyle       0.765672
		OceanStyle      0.87989
		Randomize      (0.274, 0.552, -0.826)
		colorDistMagn   0.0599637
		colorDistFreq   67.4868
		detailScale     1458.52
		colorConversion true
		drivenDarkening 0.412442
		seaLevel        0.209251
		snowLevel       2
		tropicLatitude  0.00695689
		icecapLatitude  0.712444
		icecapHeight    0.215585
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.67235
		venusFreq       1.14162
		venusMagn       0
		mareFreq        0
		mareDensity     0.000189991
		terraceProb     0.143765
		erosion         0
		montesMagn      0.0553166
		montesFreq      31.4012
		montesSpiky     0.956143
		montesFraction  0.941473
		dunesMagn       0.0310294
		dunesFreq       758.003
		dunesFraction   0.169284
		hillsMagn       0.131542
		hillsFreq       72.5416
		hillsFraction   0.745566
		hills2Fraction  0.0364209
		riversMagn      69.1191
		riversFreq      1.44854
		riversSin       6.64371
		riversOctaves   0
		canyonsMagn     0.341443
		canyonsFreq     0.136739
		canyonFraction  0
		cracksMagn      0.0582016
		cracksFreq      0.245074
		cracksOctaves   0
		craterMagn      0.580737
		craterFreq      1.91654
		craterDensity   0.950279
		craterOctaves   9
		craterRayedFactor 0.174452
		volcanoMagn     0.195411
		volcanoFreq     0.916401
		volcanoDensity  0.20065
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.215594
		volcanoRadius   0.162395
		volcanoTemp     1318.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.547, 0.506, 0.462, 0.250)
		colorShelf     (0.599, 0.577, 0.524, 0.250)
		colorBeach     (0.487, 0.427, 0.400, 0.200)
		colorDesert    (0.453, 0.387, 0.352, 0.200)
		colorLowland   (0.334, 0.300, 0.290, 0.200)
		colorUpland    (0.633, 0.585, 0.524, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.334, 0.300, 0.290, 0.200)
		colorUpPlants  (0.633, 0.585, 0.524, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0135216
		Period          0.0889215
		Eccentricity    0.0258105
		Inclination     -0.365589
		AscendingNode   -113.904
		ArgOfPericenter -177.736
		MeanAnomaly     -150.658
	}
}

DwarfMoon	"10.D3"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.66245e-010
	Radius          7.65466
	InertiaMoment   0.399591

	RotationPeriod  2546.78
	Obliquity       44.0091
	EqAscendNode    55.3964
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.589 0.483)

	Surface
	{
		SurfStyle       0.0595062
		OceanStyle      0.720023
		Randomize      (0.610, -0.709, -0.315)
		colorDistMagn   0.939957
		colorDistFreq   0.041692
		detailScale     209.023
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974195
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.321168
		terraceProb     0.380443
		erosion         0
		montesMagn      0.445018
		montesFreq      2.81039
		montesSpiky     0.889168
		montesFraction  0.562788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.147414
		hillsFraction   0.487442
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232996
		craterFreq      0.206329
		craterDensity   0.889434
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529643
		volcanoTemp     1991.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.236, 0.193, 0.000)
		colorShelf     (0.300, 0.250, 0.205, 0.000)
		colorBeach     (0.318, 0.265, 0.217, 0.000)
		colorDesert    (0.336, 0.280, 0.229, 0.000)
		colorLowland   (0.353, 0.295, 0.241, 0.000)
		colorUpland    (0.371, 0.309, 0.253, 0.000)
		colorRock      (0.389, 0.324, 0.265, 0.000)
		colorSnow      (0.407, 0.339, 0.277, 1.000)
		BumpHeight      6.88919
		BumpOffset      1.37784
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0738688
		Period          1.13542
		Eccentricity    0.0620181
		Inclination     45.1509
		AscendingNode   55.1424
		ArgOfPericenter -52.2139
		MeanAnomaly     -5.04044
	}
}

DwarfMoon	"10.D4"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.59874e-010
	Radius          8.49168
	InertiaMoment   0.397367

	RotationPeriod  2031.96
	Obliquity       93.9864
	EqAscendNode    -20.3091
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.467 0.464 0.461)

	Surface
	{
		SurfStyle       0.599714
		OceanStyle      0.815584
		Randomize      (0.330, 0.850, 0.482)
		colorDistMagn   0.735326
		colorDistFreq   0.0482965
		detailScale     231.879
		colorConversion true
		snowLevel       2
		tropicLatitude  0.353393
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464182
		terraceProb     0.305432
		erosion         0
		montesMagn      0.532579
		montesFreq      3.81681
		montesSpiky     0.922975
		montesFraction  0.602819
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.180733
		hillsFraction   0.661954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234778
		craterFreq      0.243976
		craterDensity   0.770282
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445613
		volcanoTemp     1423.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.158, 0.129, 0.000)
		colorShelf     (0.187, 0.162, 0.147, 0.000)
		colorBeach     (0.219, 0.190, 0.175, 0.000)
		colorDesert    (0.238, 0.204, 0.170, 0.000)
		colorLowland   (0.261, 0.218, 0.193, 0.000)
		colorUpland    (0.289, 0.265, 0.235, 0.000)
		colorRock      (0.313, 0.288, 0.253, 0.000)
		colorSnow      (0.341, 0.306, 0.267, 1.000)
		BumpHeight      7.64251
		BumpOffset      1.5285
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0743973
		Period          1.14763
		Eccentricity    0.0481958
		Inclination     83.4438
		AscendingNode   -20.6247
		ArgOfPericenter 126.367
		MeanAnomaly     31.784
	}
}

DwarfMoon	"10.D5"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.95333e-010
	Radius          11.5106
	InertiaMoment   0.398768

	RotationPeriod  2286.12
	Obliquity       91.0103
	EqAscendNode    -113.479
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.544 0.538 0.531)

	Surface
	{
		SurfStyle       0.23051
		OceanStyle      0.644079
		Randomize      (-0.680, -0.237, 0.497)
		colorDistMagn   0.616222
		colorDistFreq   0.0507613
		detailScale     314.317
		colorConversion true
		snowLevel       2
		tropicLatitude  0.919504
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.294408
		terraceProb     0.215898
		erosion         0
		montesMagn      0.325141
		montesFreq      3.53571
		montesSpiky     0.945577
		montesFraction  0.335421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.342462
		hillsFraction   0.452229
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281561
		craterFreq      0.193605
		craterDensity   0.98903
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556677
		volcanoTemp     1545.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.215, 0.213, 0.000)
		colorShelf     (0.231, 0.229, 0.226, 0.000)
		colorBeach     (0.245, 0.242, 0.239, 0.000)
		colorDesert    (0.258, 0.256, 0.252, 0.000)
		colorLowland   (0.272, 0.269, 0.266, 0.000)
		colorUpland    (0.286, 0.282, 0.279, 0.000)
		colorRock      (0.299, 0.296, 0.292, 0.000)
		colorSnow      (0.313, 0.309, 0.306, 1.000)
		BumpHeight      10.3596
		BumpOffset      2.07191
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.074777
		Period          1.15642
		Eccentricity    0.279375
		Inclination     87.5526
		AscendingNode   -113.22
		ArgOfPericenter 139.162
		MeanAnomaly     124.847
	}
}

DwarfMoon	"10.D6"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            5.88263e-010
	Radius          12.2354
	InertiaMoment   0.399718

	RotationPeriod  1846.89
	Obliquity       -1.78902
	EqAscendNode    -34.1111
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.537 0.530 0.524)

	Surface
	{
		SurfStyle       0.300368
		OceanStyle      0.886443
		Randomize      (-0.152, 0.142, -0.370)
		colorDistMagn   0.429392
		colorDistFreq   0.0146333
		detailScale     334.108
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0209239
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.350137
		terraceProb     0.446926
		erosion         0
		montesMagn      0.411881
		montesFreq      2.69289
		montesSpiky     0.836721
		montesFraction  0.434953
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.28988
		hillsFraction   0.607815
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2811
		craterFreq      0.211261
		craterDensity   0.869777
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463142
		volcanoTemp     1345.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.212, 0.209, 0.000)
		colorShelf     (0.228, 0.225, 0.223, 0.000)
		colorBeach     (0.242, 0.238, 0.236, 0.000)
		colorDesert    (0.255, 0.252, 0.249, 0.000)
		colorLowland   (0.268, 0.265, 0.262, 0.000)
		colorUpland    (0.282, 0.278, 0.275, 0.000)
		colorRock      (0.295, 0.291, 0.288, 0.000)
		colorSnow      (0.309, 0.305, 0.301, 1.000)
		BumpHeight      11.0119
		BumpOffset      2.20237
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0750674
		Period          1.16317
		Eccentricity    0.089743
		Inclination     0.824391
		AscendingNode   -34.0967
		ArgOfPericenter -170.688
		MeanAnomaly     5.19938
	}
}

DwarfMoon	"10.D7"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            8.59604e-010
	Radius          13.3111
	InertiaMoment   0.397639

	RotationPeriod  1579.13
	Obliquity       40.1558
	EqAscendNode    -176.577
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.564 0.557 0.555)

	Surface
	{
		SurfStyle       0.21549
		OceanStyle      0.454855
		Randomize      (-0.861, -0.955, 0.390)
		colorDistMagn   0.641964
		colorDistFreq   0.0695961
		detailScale     363.483
		colorConversion true
		snowLevel       2
		tropicLatitude  0.146736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.3748
		terraceProb     0.132042
		erosion         0
		montesMagn      0.489567
		montesFreq      2.86866
		montesSpiky     0.928755
		montesFraction  0.62679
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.441405
		hillsFraction   0.583497
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238054
		craterFreq      0.21405
		craterDensity   0.82533
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56313
		volcanoTemp     1385.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.223, 0.222, 0.000)
		colorShelf     (0.240, 0.237, 0.236, 0.000)
		colorBeach     (0.254, 0.251, 0.250, 0.000)
		colorDesert    (0.268, 0.265, 0.263, 0.000)
		colorLowland   (0.282, 0.279, 0.277, 0.000)
		colorUpland    (0.296, 0.292, 0.291, 0.000)
		colorRock      (0.310, 0.306, 0.305, 0.000)
		colorSnow      (0.325, 0.320, 0.319, 1.000)
		BumpHeight      11.98
		BumpOffset      2.396
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0752917
		Period          1.16838
		Eccentricity    0.319988
		Inclination     48.1843
		AscendingNode   -176.261
		ArgOfPericenter 5.4579
		MeanAnomaly     -157.514
	}
}

DwarfMoon	"10.D8"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.23734e-009
	Radius          14.3969
	InertiaMoment   0.398916

	RotationPeriod  1360.34
	Obliquity       -15.9756
	EqAscendNode    38.7128
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.470 0.463 0.461)

	Surface
	{
		SurfStyle       0.947619
		OceanStyle      0.566767
		Randomize      (0.928, -0.937, -0.684)
		colorDistMagn   0.308215
		colorDistFreq   0.10947
		detailScale     393.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.397615
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628821
		terraceProb     0.218607
		erosion         0
		montesMagn      0.480733
		montesFreq      3.04104
		montesSpiky     0.929137
		montesFraction  0.685668
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.395476
		hillsFraction   0.402452
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208814
		craterFreq      0.222672
		craterDensity   0.871577
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468663
		volcanoTemp     1772.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.162, 0.184, 0.050)
		colorShelf     (0.188, 0.190, 0.212, 0.040)
		colorBeach     (0.216, 0.218, 0.240, 0.030)
		colorDesert    (0.244, 0.245, 0.272, 0.020)
		colorLowland   (0.272, 0.273, 0.300, 0.030)
		colorUpland    (0.301, 0.301, 0.327, 0.050)
		colorRock      (0.329, 0.329, 0.364, 0.020)
		colorSnow      (0.329, 0.329, 0.364, 1.000)
		BumpHeight      12.9572
		BumpOffset      2.59143
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0757352
		Period          1.17872
		Eccentricity    0.0253051
		Inclination     -8.56414
		AscendingNode   36.1222
		ArgOfPericenter -142.243
		MeanAnomaly     -119.972
	}
}

DwarfMoon	"10.D9"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.75887e-009
	Radius          19.3498
	InertiaMoment   0.399844

	RotationPeriod  1568.81
	Obliquity       -64.9345
	EqAscendNode    29.6257
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.733 0.729 0.727)

	Surface
	{
		SurfStyle       0.973197
		OceanStyle      0.553717
		Randomize      (0.331, -0.918, -0.044)
		colorDistMagn   0.852857
		colorDistFreq   0.0721342
		detailScale     528.38
		colorConversion true
		snowLevel       2
		tropicLatitude  0.818028
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48691
		terraceProb     0.215989
		erosion         0
		montesMagn      0.527904
		montesFreq      2.44192
		montesSpiky     0.844181
		montesFraction  0.243693
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.906479
		hillsFraction   0.642859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226301
		craterFreq      0.225836
		craterDensity   0.783563
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473541
		volcanoTemp     1584.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.255, 0.291, 0.050)
		colorShelf     (0.293, 0.299, 0.334, 0.040)
		colorBeach     (0.337, 0.343, 0.378, 0.030)
		colorDesert    (0.381, 0.386, 0.429, 0.020)
		colorLowland   (0.425, 0.430, 0.472, 0.030)
		colorUpland    (0.469, 0.474, 0.516, 0.050)
		colorRock      (0.513, 0.517, 0.574, 0.020)
		colorSnow      (0.513, 0.517, 0.574, 1.000)
		BumpHeight      17.4149
		BumpOffset      3.48297
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0760309
		Period          1.18563
		Eccentricity    0.339657
		Inclination     -68.937
		AscendingNode   30.6199
		ArgOfPericenter -113.601
		MeanAnomaly     -87.6015
	}
}

DwarfMoon	"10.D10"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.47415e-009
	Radius          19.8896
	InertiaMoment   0.397874

	RotationPeriod  1292.58
	Obliquity       -35.6756
	EqAscendNode    -138.596
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.542 0.538 0.535)

	Surface
	{
		SurfStyle       0.788468
		OceanStyle      0.339945
		Randomize      (0.535, 0.725, -0.411)
		colorDistMagn   0.589477
		colorDistFreq   0.0424716
		detailScale     543.119
		colorConversion true
		snowLevel       2
		tropicLatitude  0.40272
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.725191
		terraceProb     0.430589
		erosion         0
		montesMagn      0.565571
		montesFreq      3.01108
		montesSpiky     0.865813
		montesFraction  0.638428
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.874089
		hillsFraction   0.839549
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254494
		craterFreq      0.279871
		craterDensity   0.88241
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499895
		volcanoTemp     1599.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.183, 0.150, 0.000)
		colorShelf     (0.217, 0.188, 0.171, 0.000)
		colorBeach     (0.255, 0.221, 0.203, 0.000)
		colorDesert    (0.276, 0.237, 0.198, 0.000)
		colorLowland   (0.304, 0.253, 0.225, 0.000)
		colorUpland    (0.336, 0.307, 0.273, 0.000)
		colorRock      (0.363, 0.334, 0.294, 0.000)
		colorSnow      (0.396, 0.355, 0.310, 1.000)
		BumpHeight      17.9006
		BumpOffset      3.58013
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.076337
		Period          1.1928
		Eccentricity    0.496278
		Inclination     -34.4606
		AscendingNode   -138.08
		ArgOfPericenter -97.3803
		MeanAnomaly     45.5
	}
}

DwarfMoon	"10.D11"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.45008e-009
	Radius          21.2731
	InertiaMoment   0.399058

	RotationPeriod  1130.87
	Obliquity       -50.0765
	EqAscendNode    118.542
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.795 0.732 0.677)

	Surface
	{
		SurfStyle       0.293423
		OceanStyle      0.818788
		Randomize      (0.350, 0.822, -0.374)
		colorDistMagn   0.234582
		colorDistFreq   0.220772
		detailScale     580.897
		colorConversion true
		snowLevel       2
		tropicLatitude  0.72396
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46584
		terraceProb     0.185299
		erosion         0
		montesMagn      0.63152
		montesFreq      3.61984
		montesSpiky     0.954945
		montesFraction  0.661907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.947067
		hillsFraction   0.371641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21593
		craterFreq      0.267775
		craterDensity   0.964949
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50492
		volcanoTemp     1638.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.293, 0.271, 0.000)
		colorShelf     (0.338, 0.311, 0.288, 0.000)
		colorBeach     (0.358, 0.329, 0.305, 0.000)
		colorDesert    (0.378, 0.348, 0.322, 0.000)
		colorLowland   (0.398, 0.366, 0.339, 0.000)
		colorUpland    (0.418, 0.384, 0.356, 0.000)
		colorRock      (0.437, 0.402, 0.373, 0.000)
		colorSnow      (0.457, 0.421, 0.390, 1.000)
		BumpHeight      19.1458
		BumpOffset      3.82915
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0768926
		Period          1.20584
		Eccentricity    0.00443531
		Inclination     -53.008
		AscendingNode   119.722
		ArgOfPericenter 22.2183
		MeanAnomaly     -140.855
	}
}

DwarfMoon	"10.D12"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            4.77627e-009
	Radius          22.7432
	InertiaMoment   0.399969

	RotationPeriod  1000.61
	Obliquity       -34.5589
	EqAscendNode    -29.1777
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.620 0.615 0.613)

	Surface
	{
		SurfStyle       0.256063
		OceanStyle      0.982206
		Randomize      (-0.030, -0.396, -0.124)
		colorDistMagn   0.610115
		colorDistFreq   0.187505
		detailScale     621.041
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999767
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.509968
		terraceProb     0.230597
		erosion         0
		montesMagn      0.399619
		montesFreq      3.48251
		montesSpiky     0.955541
		montesFraction  0.328771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.21738
		hillsFraction   0.681638
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216638
		craterFreq      0.182744
		craterDensity   0.919661
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.578775
		volcanoTemp     1330.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.246, 0.245, 0.000)
		colorShelf     (0.263, 0.261, 0.260, 0.000)
		colorBeach     (0.279, 0.277, 0.276, 0.000)
		colorDesert    (0.294, 0.292, 0.291, 0.000)
		colorLowland   (0.310, 0.307, 0.306, 0.000)
		colorUpland    (0.325, 0.323, 0.322, 0.000)
		colorRock      (0.341, 0.338, 0.337, 0.000)
		colorSnow      (0.356, 0.354, 0.352, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0773836
		Period          1.21741
		Eccentricity    0.482435
		Inclination     -58.1157
		AscendingNode   -30.871
		ArgOfPericenter -28.4272
		MeanAnomaly     -67.8674
	}
}

DwarfMoon	"10.D13"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            6.57314e-009
	Radius          31.1991
	InertiaMoment   0.398082

	RotationPeriod  1177.59
	Obliquity       23.0824
	EqAscendNode    162.821
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.543 0.539 0.536)

	Surface
	{
		SurfStyle       0.0201558
		OceanStyle      0.129977
		Randomize      (-0.752, 0.285, 0.024)
		colorDistMagn   0.74188
		colorDistFreq   0.189591
		detailScale     851.945
		colorConversion true
		snowLevel       2
		tropicLatitude  0.481204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406017
		terraceProb     0.486045
		erosion         0
		montesMagn      0.440708
		montesFreq      3.22937
		montesSpiky     0.88381
		montesFraction  0.217729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.93808
		hillsFraction   0.681458
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221531
		craterFreq      0.200622
		craterDensity   1.04177
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486963
		volcanoTemp     1614.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.215, 0.215, 0.000)
		colorShelf     (0.231, 0.229, 0.228, 0.000)
		colorBeach     (0.244, 0.242, 0.241, 0.000)
		colorDesert    (0.258, 0.256, 0.255, 0.000)
		colorLowland   (0.271, 0.269, 0.268, 0.000)
		colorUpland    (0.285, 0.283, 0.282, 0.000)
		colorRock      (0.298, 0.296, 0.295, 0.000)
		colorSnow      (0.312, 0.310, 0.308, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.078021
		Period          1.23249
		Eccentricity    0.146881
		Inclination     50.3369
		AscendingNode   163.538
		ArgOfPericenter -53.8445
		MeanAnomaly     -30.1737
	}
}

DwarfMoon	"10.D14"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            9.00299e-009
	Radius          30.8247
	InertiaMoment   0.399195

	RotationPeriod  960.118
	Obliquity       11.212
	EqAscendNode    -131.601
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.730 0.727)

	Surface
	{
		SurfStyle       0.420567
		OceanStyle      0.629957
		Randomize      (0.410, -0.585, 0.961)
		colorDistMagn   0.460331
		colorDistFreq   0.287646
		detailScale     841.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.310209
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.469212
		terraceProb     0.36039
		erosion         0
		montesMagn      0.42713
		montesFreq      3.13956
		montesSpiky     0.870991
		montesFraction  0.440912
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.42111
		hillsFraction   0.589107
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24522
		craterFreq      0.199787
		craterDensity   0.604668
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.385869
		volcanoTemp     1227.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.292, 0.291, 0.000)
		colorShelf     (0.312, 0.310, 0.309, 0.000)
		colorBeach     (0.330, 0.329, 0.327, 0.000)
		colorDesert    (0.349, 0.347, 0.345, 0.000)
		colorLowland   (0.367, 0.365, 0.363, 0.000)
		colorUpland    (0.385, 0.383, 0.382, 0.000)
		colorRock      (0.404, 0.402, 0.400, 0.000)
		colorSnow      (0.422, 0.420, 0.418, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0786161
		Period          1.24661
		Eccentricity    0.458181
		Inclination     23.2277
		AscendingNode   -129.971
		ArgOfPericenter 141.548
		MeanAnomaly     14.2333
	}
}

DwarfMoon	"10.D15"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.22854e-008
	Radius          32.6693
	InertiaMoment   0.395838

	RotationPeriod  852.687
	Obliquity       57.0158
	EqAscendNode    -97.7247
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.857 0.805 0.741)

	Surface
	{
		SurfStyle       0.899016
		OceanStyle      0.283115
		Randomize      (-0.080, -0.910, -0.029)
		colorDistMagn   0.649686
		colorDistFreq   0.719303
		detailScale     892.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.911056
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.274672
		terraceProb     0.331184
		erosion         0
		montesMagn      0.366771
		montesFreq      2.93524
		montesSpiky     0.918396
		montesFraction  0.66117
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.02842
		hillsFraction   0.701358
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278762
		craterFreq      0.199474
		craterDensity   0.931265
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.614172
		volcanoTemp     1449.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.282, 0.296, 0.050)
		colorShelf     (0.343, 0.330, 0.341, 0.040)
		colorBeach     (0.394, 0.378, 0.385, 0.030)
		colorDesert    (0.446, 0.427, 0.437, 0.020)
		colorLowland   (0.497, 0.475, 0.482, 0.030)
		colorUpland    (0.548, 0.523, 0.526, 0.050)
		colorRock      (0.600, 0.572, 0.586, 0.020)
		colorSnow      (0.600, 0.572, 0.586, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0789591
		Period          1.25478
		Eccentricity    0.422307
		Inclination     45.1702
		AscendingNode   -92.7434
		ArgOfPericenter 36.9589
		MeanAnomaly     56.5815
	}
}

DwarfMoon	"10.D16"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.67188e-008
	Radius          34.7584
	InertiaMoment   0.398271

	RotationPeriod  766.505
	Obliquity       54.8829
	EqAscendNode    152.015
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.492 0.489 0.487)

	Surface
	{
		SurfStyle       0.280801
		OceanStyle      0.0818913
		Randomize      (-0.364, -0.394, 0.169)
		colorDistMagn   0.762714
		colorDistFreq   0.362704
		detailScale     949.137
		colorConversion true
		snowLevel       2
		tropicLatitude  0.338122
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600861
		terraceProb     0.238237
		erosion         0
		montesMagn      0.548662
		montesFreq      2.80859
		montesSpiky     0.99311
		montesFraction  0.470275
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.50507
		hillsFraction   0.932598
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226924
		craterFreq      0.18829
		craterDensity   0.956384
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515054
		volcanoTemp     1333.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.195, 0.195, 0.000)
		colorShelf     (0.209, 0.208, 0.207, 0.000)
		colorBeach     (0.222, 0.220, 0.219, 0.000)
		colorDesert    (0.234, 0.232, 0.231, 0.000)
		colorLowland   (0.246, 0.244, 0.244, 0.000)
		colorUpland    (0.258, 0.257, 0.256, 0.000)
		colorRock      (0.271, 0.269, 0.268, 0.000)
		colorSnow      (0.283, 0.281, 0.280, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0795918
		Period          1.26989
		Eccentricity    0.0487982
		Inclination     55.2702
		AscendingNode   155.842
		ArgOfPericenter -48.7641
		MeanAnomaly     -147.602
	}
}

DwarfMoon	"10.D17"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.27108e-008
	Radius          35.2053
	InertiaMoment   0.399329

	RotationPeriod  655.482
	Obliquity       54.2887
	EqAscendNode    135.948
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.487 0.482 0.479)

	Surface
	{
		SurfStyle       0.171657
		OceanStyle      0.325565
		Randomize      (0.588, 0.674, -0.014)
		colorDistMagn   0.933751
		colorDistFreq   0.334257
		detailScale     961.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.508246
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.320911
		terraceProb     0.308361
		erosion         0
		montesMagn      0.433278
		montesFreq      3.6617
		montesSpiky     0.920836
		montesFraction  0.646187
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.49049
		hillsFraction   0.759291
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237208
		craterFreq      0.224621
		craterDensity   0.787354
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447815
		volcanoTemp     1115.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.193, 0.192, 0.000)
		colorShelf     (0.207, 0.205, 0.204, 0.000)
		colorBeach     (0.219, 0.217, 0.216, 0.000)
		colorDesert    (0.232, 0.229, 0.228, 0.000)
		colorLowland   (0.244, 0.241, 0.240, 0.000)
		colorUpland    (0.256, 0.253, 0.252, 0.000)
		colorRock      (0.268, 0.265, 0.263, 0.000)
		colorSnow      (0.280, 0.277, 0.275, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0801997
		Period          1.28447
		Eccentricity    0.465026
		Inclination     46.5215
		AscendingNode   141.262
		ArgOfPericenter -168.615
		MeanAnomaly     19.089
	}
}

DwarfMoon	"10.D18"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.08214e-008
	Radius          46.8428
	InertiaMoment   0.39658

	RotationPeriod  746.97
	Obliquity       5.41137
	EqAscendNode    -88.4149
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.795 0.790 0.789)

	Surface
	{
		SurfStyle       0.964169
		OceanStyle      0.900912
		Randomize      (0.457, -0.945, -0.156)
		colorDistMagn   0.455246
		colorDistFreq   0.853211
		detailScale     1279.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.194702
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404803
		terraceProb     0.159397
		erosion         0
		montesMagn      0.454538
		montesFreq      3.63329
		montesSpiky     0.891173
		montesFraction  0.285286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.87356
		hillsFraction   0.404931
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257721
		craterFreq      0.243209
		craterDensity   0.909827
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480597
		volcanoTemp     1219.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.277, 0.316, 0.050)
		colorShelf     (0.318, 0.324, 0.363, 0.040)
		colorBeach     (0.366, 0.371, 0.410, 0.030)
		colorDesert    (0.413, 0.419, 0.465, 0.020)
		colorLowland   (0.461, 0.466, 0.513, 0.030)
		colorUpland    (0.509, 0.514, 0.560, 0.050)
		colorRock      (0.556, 0.561, 0.623, 0.020)
		colorSnow      (0.556, 0.561, 0.623, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0807961
		Period          1.29882
		Eccentricity    0.186697
		Inclination     -9.78002
		AscendingNode   -90.7612
		ArgOfPericenter -46.4171
		MeanAnomaly     96.0135
	}
}

DwarfMoon	"10.D19"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            4.18255e-008
	Radius          49.4292
	InertiaMoment   0.398446

	RotationPeriod  672.461
	Obliquity       -5.34466
	EqAscendNode    115.116
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.765 0.761 0.760)

	Surface
	{
		SurfStyle       0.564224
		OceanStyle      0.663017
		Randomize      (-0.889, -0.602, -0.266)
		colorDistMagn   0.321555
		colorDistFreq   0.684574
		detailScale     1349.75
		colorConversion true
		snowLevel       2
		tropicLatitude  0.69457
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.297128
		terraceProb     0.244972
		erosion         0
		montesMagn      0.608003
		montesFreq      4.09695
		montesSpiky     0.828917
		montesFraction  0.369341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.35942
		hillsFraction   0.687738
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25046
		craterFreq      0.26765
		craterDensity   1.0069
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457657
		volcanoTemp     1163.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.213, 0.000)
		colorShelf     (0.306, 0.266, 0.243, 0.000)
		colorBeach     (0.360, 0.312, 0.289, 0.000)
		colorDesert    (0.390, 0.335, 0.281, 0.000)
		colorLowland   (0.428, 0.358, 0.319, 0.000)
		colorUpland    (0.474, 0.434, 0.388, 0.000)
		colorRock      (0.513, 0.472, 0.418, 0.000)
		colorSnow      (0.559, 0.502, 0.441, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0810515
		Period          1.30499
		Eccentricity    0.0446098
		Inclination     41.6275
		AscendingNode   113.633
		ArgOfPericenter -63.3036
		MeanAnomaly     47.0661
	}
}

DwarfMoon	"10.D20"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            5.68032e-008
	Radius          52.5777
	InertiaMoment   0.39946

	RotationPeriod  608.946
	Obliquity       -43.4115
	EqAscendNode    -122.682
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.801 0.798 0.797)

	Surface
	{
		SurfStyle       0.375995
		OceanStyle      0.53816
		Randomize      (0.399, 0.006, -0.163)
		colorDistMagn   0.796399
		colorDistFreq   0.998139
		detailScale     1435.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.676174
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.547634
		terraceProb     0.307545
		erosion         0
		montesMagn      0.599477
		montesFreq      3.18659
		montesSpiky     0.894081
		montesFraction  0.583074
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.81306
		hillsFraction   0.542424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.189599
		craterFreq      0.23551
		craterDensity   0.799357
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438656
		volcanoTemp     1592.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.319, 0.319, 0.000)
		colorShelf     (0.340, 0.339, 0.339, 0.000)
		colorBeach     (0.360, 0.359, 0.359, 0.000)
		colorDesert    (0.380, 0.379, 0.379, 0.000)
		colorLowland   (0.400, 0.399, 0.398, 0.000)
		colorUpland    (0.420, 0.419, 0.418, 0.000)
		colorRock      (0.440, 0.439, 0.438, 0.000)
		colorSnow      (0.460, 0.459, 0.458, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0815382
		Period          1.31676
		Eccentricity    0.267667
		Inclination     -53.114
		AscendingNode   -123.167
		ArgOfPericenter 28.2945
		MeanAnomaly     165.753
	}
}

DwarfMoon	"10.D21"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            7.72731e-008
	Radius          54.7129
	InertiaMoment   0.397027

	RotationPeriod  537.979
	Obliquity       10.9315
	EqAscendNode    -21.3799
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.467 0.459 0.456)

	Surface
	{
		SurfStyle       0.00544149
		OceanStyle      0.737407
		Randomize      (0.968, -0.092, -0.876)
		colorDistMagn   0.880462
		colorDistFreq   1.27335
		detailScale     1494.03
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0632718
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667793
		terraceProb     0.155498
		erosion         0
		montesMagn      0.40735
		montesFreq      2.85203
		montesSpiky     0.796312
		montesFraction  0.598193
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.94433
		hillsFraction   0.612578
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226525
		craterFreq      0.255037
		craterDensity   0.882887
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421926
		volcanoTemp     1674.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.184, 0.183, 0.000)
		colorShelf     (0.198, 0.195, 0.194, 0.000)
		colorBeach     (0.210, 0.207, 0.205, 0.000)
		colorDesert    (0.222, 0.218, 0.217, 0.000)
		colorLowland   (0.233, 0.230, 0.228, 0.000)
		colorUpland    (0.245, 0.241, 0.240, 0.000)
		colorRock      (0.257, 0.253, 0.251, 0.000)
		colorSnow      (0.268, 0.264, 0.262, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0817747
		Period          1.32249
		Eccentricity    0.222131
		Inclination     -8.81822
		AscendingNode   -17.3554
		ArgOfPericenter -16.8342
		MeanAnomaly     102.769
	}
}

DwarfMoon	"10.D22"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.05391e-007
	Radius          71.2231
	InertiaMoment   0.39861

	RotationPeriod  601.723
	Obliquity       96.3143
	EqAscendNode    -120.063
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.578 0.575)

	Surface
	{
		SurfStyle       0.695862
		OceanStyle      0.335243
		Randomize      (-0.067, 0.823, 0.151)
		colorDistMagn   0.655041
		colorDistFreq   2.33873
		detailScale     1944.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917948
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.291564
		terraceProb     0.229487
		erosion         0
		montesMagn      0.458755
		montesFreq      2.67274
		montesSpiky     0.93788
		montesFraction  0.258242
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.4124
		hillsFraction   0.489727
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236244
		craterFreq      0.257085
		craterDensity   0.943629
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47205
		volcanoTemp     1549.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.197, 0.161, 0.000)
		colorShelf     (0.234, 0.202, 0.184, 0.000)
		colorBeach     (0.275, 0.237, 0.218, 0.000)
		colorDesert    (0.299, 0.254, 0.213, 0.000)
		colorLowland   (0.328, 0.272, 0.241, 0.000)
		colorUpland    (0.363, 0.330, 0.293, 0.000)
		colorRock      (0.393, 0.359, 0.316, 0.000)
		colorSnow      (0.428, 0.382, 0.333, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0821158
		Period          1.33077
		Eccentricity    0.307129
		Inclination     68.1592
		AscendingNode   -118.316
		ArgOfPericenter -145.666
		MeanAnomaly     -103.92
	}
}

DwarfMoon	"10.D23"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.4425e-007
	Radius          75.1204
	InertiaMoment   0.399589

	RotationPeriod  539.533
	Obliquity       -85.0657
	EqAscendNode    29.675
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.718 0.713)

	Surface
	{
		SurfStyle       0.324941
		OceanStyle      0.471391
		Randomize      (0.647, -0.372, -0.673)
		colorDistMagn   0.270773
		colorDistFreq   0.877167
		detailScale     2051.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.621531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584142
		terraceProb     0.341146
		erosion         0
		montesMagn      0.352447
		montesFreq      2.80398
		montesSpiky     0.930929
		montesFraction  0.385368
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.1598
		hillsFraction   0.781462
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232636
		craterFreq      0.174757
		craterDensity   0.937046
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520633
		volcanoTemp     1534.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.287, 0.285, 0.000)
		colorShelf     (0.306, 0.305, 0.303, 0.000)
		colorBeach     (0.324, 0.323, 0.321, 0.000)
		colorDesert    (0.342, 0.341, 0.339, 0.000)
		colorLowland   (0.360, 0.359, 0.356, 0.000)
		colorUpland    (0.378, 0.377, 0.374, 0.000)
		colorRock      (0.396, 0.395, 0.392, 0.000)
		colorSnow      (0.415, 0.413, 0.410, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0825001
		Period          1.34013
		Eccentricity    0.00641591
		Inclination     -69.4149
		AscendingNode   29.2663
		ArgOfPericenter 176.572
		MeanAnomaly     123.494
	}
}

DwarfMoon	"10.D24"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.98343e-007
	Radius          80.2409
	InertiaMoment   0.397361

	RotationPeriod  487.831
	Obliquity       75.9785
	EqAscendNode    -165.013
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.843 0.778 0.752)

	Surface
	{
		SurfStyle       0.170299
		OceanStyle      0.43357
		Randomize      (0.085, -0.475, 0.279)
		colorDistMagn   0.27289
		colorDistFreq   3.16543
		detailScale     2191.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.28783
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624593
		terraceProb     0.200562
		erosion         0
		montesMagn      0.548185
		montesFreq      2.63157
		montesSpiky     0.99446
		montesFraction  0.52926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.3594
		hillsFraction   0.798921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257669
		craterFreq      0.238741
		craterDensity   0.782806
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54398
		volcanoTemp     1420.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.337, 0.311, 0.301, 0.000)
		colorShelf     (0.358, 0.331, 0.320, 0.000)
		colorBeach     (0.380, 0.350, 0.339, 0.000)
		colorDesert    (0.401, 0.370, 0.357, 0.000)
		colorLowland   (0.422, 0.389, 0.376, 0.000)
		colorUpland    (0.443, 0.408, 0.395, 0.000)
		colorRock      (0.464, 0.428, 0.414, 0.000)
		colorSnow      (0.485, 0.447, 0.433, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0827633
		Period          1.34655
		Eccentricity    0.0963792
		Inclination     82.2625
		AscendingNode   -164.203
		ArgOfPericenter 102.421
		MeanAnomaly     97.7472
	}
}

DwarfMoon	"10.D25"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.74287e-007
	Radius          84.7274
	InertiaMoment   0.398765

	RotationPeriod  436.664
	Obliquity       75.1182
	EqAscendNode    -139.96
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.591 0.588)

	Surface
	{
		SurfStyle       0.886544
		OceanStyle      0.328135
		Randomize      (0.323, 0.226, -0.665)
		colorDistMagn   0.802525
		colorDistFreq   5.02982
		detailScale     2313.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.737854
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446601
		terraceProb     0.31419
		erosion         0
		montesMagn      0.507777
		montesFreq      2.96334
		montesSpiky     0.9004
		montesFraction  0.707728
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.8052
		hillsFraction   0.748722
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240143
		craterFreq      0.273801
		craterDensity   1.05898
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548183
		volcanoTemp     1844.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.207, 0.235, 0.050)
		colorShelf     (0.237, 0.242, 0.270, 0.040)
		colorBeach     (0.273, 0.278, 0.306, 0.030)
		colorDesert    (0.308, 0.313, 0.347, 0.020)
		colorLowland   (0.344, 0.349, 0.382, 0.030)
		colorUpland    (0.379, 0.384, 0.417, 0.050)
		colorRock      (0.415, 0.420, 0.464, 0.020)
		colorSnow      (0.415, 0.420, 0.464, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.083142
		Period          1.3558
		Eccentricity    0.0102967
		Inclination     71.1952
		AscendingNode   -130.337
		ArgOfPericenter -29.297
		MeanAnomaly     -135.924
	}
}

DwarfMoon	"10.D26"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.81976e-007
	Radius          110.559
	InertiaMoment   0.399715

	RotationPeriod  483.242
	Obliquity       -41.8964
	EqAscendNode    29.2692
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.785 0.750 0.691)

	Surface
	{
		SurfStyle       0.210704
		OceanStyle      0.394164
		Randomize      (-0.177, 0.742, 0.254)
		colorDistMagn   0.637619
		colorDistFreq   6.28129
		detailScale     3019
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998748
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.289375
		terraceProb     0.282218
		erosion         0
		montesMagn      0.685904
		montesFreq      3.38774
		montesSpiky     0.920901
		montesFraction  0.657127
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.2103
		hillsFraction   0.588299
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259334
		craterFreq      0.444346
		craterDensity   0.891293
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55809
		volcanoTemp     1481.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.300, 0.276, 0.000)
		colorShelf     (0.334, 0.319, 0.293, 0.000)
		colorBeach     (0.353, 0.338, 0.311, 0.000)
		colorDesert    (0.373, 0.356, 0.328, 0.000)
		colorLowland   (0.392, 0.375, 0.345, 0.000)
		colorUpland    (0.412, 0.394, 0.363, 0.000)
		colorRock      (0.432, 0.413, 0.380, 0.000)
		colorSnow      (0.451, 0.431, 0.397, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0835944
		Period          1.36688
		Eccentricity    0.358845
		Inclination     -55.999
		AscendingNode   32.623
		ArgOfPericenter 27.5362
		MeanAnomaly     -119.703
	}
}

DwarfMoon	"10.D27"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            5.36467e-007
	Radius          117.093
	InertiaMoment   0.397634

	RotationPeriod  429.174
	Obliquity       -37.247
	EqAscendNode    -177.107
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.544 0.540 0.537)

	Surface
	{
		SurfStyle       0.666865
		OceanStyle      0.558796
		Randomize      (-0.256, -0.609, 0.680)
		colorDistMagn   0.976697
		colorDistFreq   6.46013
		detailScale     3197.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.583329
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.674953
		terraceProb     0.301328
		erosion         0
		montesMagn      0.502047
		montesFreq      2.7162
		montesSpiky     0.990734
		montesFraction  0.902199
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.7952
		hillsFraction   0.723872
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219513
		craterFreq      0.459599
		craterDensity   0.887717
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541581
		volcanoTemp     1062.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.184, 0.150, 0.000)
		colorShelf     (0.217, 0.189, 0.172, 0.000)
		colorBeach     (0.256, 0.222, 0.204, 0.000)
		colorDesert    (0.277, 0.238, 0.199, 0.000)
		colorLowland   (0.304, 0.254, 0.225, 0.000)
		colorUpland    (0.337, 0.308, 0.274, 0.000)
		colorRock      (0.364, 0.335, 0.295, 0.000)
		colorSnow      (0.397, 0.357, 0.311, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0838381
		Period          1.37286
		Eccentricity    0.106858
		Inclination     -1.57672
		AscendingNode   -172.304
		ArgOfPericenter -20.1468
		MeanAnomaly     179.387
	}
}

DwarfMoon	"10.D28"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            7.61137e-007
	Radius          126.353
	InertiaMoment   0.398913

	RotationPeriod  388.247
	Obliquity       -58.2975
	EqAscendNode    1.11404
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.526 0.402)

	Surface
	{
		SurfStyle       0.685332
		OceanStyle      0.26975
		Randomize      (0.153, -0.488, -0.918)
		colorDistMagn   0.786515
		colorDistFreq   12.4382
		detailScale     3450.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.845408
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622101
		terraceProb     0.202742
		erosion         0
		montesMagn      0.45354
		montesFreq      2.90176
		montesSpiky     0.974334
		montesFraction  0.834328
		dunesFraction   0
		hillsMagn       0
		hillsFreq       45.9659
		hillsFraction   0.483762
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210185
		craterFreq      0.598163
		craterDensity   0.902097
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481554
		volcanoTemp     1244.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.179, 0.113, 0.000)
		colorShelf     (0.267, 0.184, 0.129, 0.000)
		colorBeach     (0.314, 0.215, 0.153, 0.000)
		colorDesert    (0.341, 0.231, 0.149, 0.000)
		colorLowland   (0.374, 0.247, 0.169, 0.000)
		colorUpland    (0.415, 0.300, 0.205, 0.000)
		colorRock      (0.448, 0.326, 0.221, 0.000)
		colorSnow      (0.488, 0.347, 0.233, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0841349
		Period          1.38016
		Eccentricity    0.406333
		Inclination     -63.9884
		AscendingNode   -0.443148
		ArgOfPericenter 101.415
		MeanAnomaly     94.5587
	}
}

DwarfMoon	"10.D29"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.09312e-006
	Radius          135.804
	InertiaMoment   0.399841

	RotationPeriod  347.553
	Obliquity       1.0627
	EqAscendNode    147.629
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.790 0.788)

	Surface
	{
		SurfStyle       0.259352
		OceanStyle      0.316537
		Randomize      (-0.199, 0.541, 0.952)
		colorDistMagn   0.813689
		colorDistFreq   7.53072
		detailScale     3708.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.741492
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412101
		terraceProb     0.437698
		erosion         0
		montesMagn      0.544123
		montesFreq      2.60083
		montesSpiky     0.972762
		montesFraction  0.571679
		dunesFraction   0
		hillsMagn       0
		hillsFreq       63.4589
		hillsFraction   0.74406
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209496
		craterFreq      0.708705
		craterDensity   0.907968
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441449
		volcanoTemp     1150.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.316, 0.315, 0.000)
		colorShelf     (0.338, 0.336, 0.335, 0.000)
		colorBeach     (0.357, 0.356, 0.355, 0.000)
		colorDesert    (0.377, 0.375, 0.374, 0.000)
		colorLowland   (0.397, 0.395, 0.394, 0.000)
		colorUpland    (0.417, 0.415, 0.414, 0.000)
		colorRock      (0.437, 0.435, 0.433, 0.000)
		colorSnow      (0.457, 0.455, 0.453, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0845115
		Period          1.38943
		Eccentricity    0.085689
		Inclination     48.7516
		AscendingNode   147.421
		ArgOfPericenter -68.6745
		MeanAnomaly     -13.1595
	}
}

DwarfMoon	"10.D30"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.59297e-006
	Radius          180.186
	InertiaMoment   0.397869

	RotationPeriod  381.054
	Obliquity       78.146
	EqAscendNode    -130.732
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.776 0.773 0.770)

	Surface
	{
		SurfStyle       0.806805
		OceanStyle      0.0359943
		Randomize      (-0.290, -0.288, 0.264)
		colorDistMagn   0.16818
		colorDistFreq   9.27652
		detailScale     4920.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.792726
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64307
		terraceProb     0.152613
		erosion         0
		montesMagn      0.382361
		montesFreq      2.52894
		montesSpiky     0.769683
		montesFraction  0.665071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       85.7406
		hillsFraction   0.680834
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228526
		craterFreq      1.00133
		craterDensity   0.963788
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455723
		volcanoTemp     1308.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.263, 0.216, 0.000)
		colorShelf     (0.311, 0.270, 0.246, 0.000)
		colorBeach     (0.365, 0.317, 0.293, 0.000)
		colorDesert    (0.396, 0.340, 0.285, 0.000)
		colorLowland   (0.435, 0.363, 0.323, 0.000)
		colorUpland    (0.481, 0.440, 0.393, 0.000)
		colorRock      (0.520, 0.479, 0.423, 0.000)
		colorSnow      (0.567, 0.510, 0.447, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0847858
		Period          1.3962
		Eccentricity    0.295276
		Inclination     50.0134
		AscendingNode   -129.56
		ArgOfPericenter -34.9492
		MeanAnomaly     -64.8469
	}
}

DwarfMoon	"10.D31"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.36256e-006
	Radius          193.143
	InertiaMoment   0.399055

	RotationPeriod  334.657
	Obliquity       -52.9117
	EqAscendNode    -152.913
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.479 0.473 0.467)

	Surface
	{
		SurfStyle       0.730145
		OceanStyle      0.617669
		Randomize      (0.970, 0.121, 0.625)
		colorDistMagn   0.617796
		colorDistFreq   17.5911
		detailScale     5274.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.384816
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597164
		terraceProb     0.107737
		erosion         0
		montesMagn      0.383289
		montesFreq      3.44202
		montesSpiky     0.965917
		montesFraction  0.555453
		dunesFraction   0
		hillsMagn       0
		hillsFreq       68.8615
		hillsFraction   0.604749
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207241
		craterFreq      1.21652
		craterDensity   0.795046
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.442591
		volcanoTemp     1678.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.161, 0.131, 0.000)
		colorShelf     (0.192, 0.166, 0.149, 0.000)
		colorBeach     (0.225, 0.194, 0.177, 0.000)
		colorDesert    (0.244, 0.208, 0.173, 0.000)
		colorLowland   (0.268, 0.222, 0.196, 0.000)
		colorUpland    (0.297, 0.270, 0.238, 0.000)
		colorRock      (0.321, 0.293, 0.257, 0.000)
		colorSnow      (0.350, 0.312, 0.271, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0854272
		Period          1.41208
		Eccentricity    0.309132
		Inclination     -60.5514
		AscendingNode   -154.412
		ArgOfPericenter -142.069
		MeanAnomaly     68.8887
	}
}

Moon	"10.7"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            3.57956e-006
	Radius          212.897
	InertiaMoment   0.399966

	RotationPeriod  299.257
	Obliquity       -102.323
	EqAscendNode    -50.372
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.421 0.419 0.415)

	Surface
	{
		SurfStyle       0.974656
		OceanStyle      0.242852
		Randomize      (0.728, -0.437, -0.472)
		colorDistMagn   0.0868797
		colorDistFreq   24.3013
		detailScale     547.584
		colorConversion true
		drivenDarkening 0.0648433
		seaLevel        0.258026
		snowLevel       2
		tropicLatitude  0.67969
		icecapLatitude  1
		icecapHeight    0.258026
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.96838
		venusFreq       1.55018
		venusMagn       0.178655
		mareFreq        0
		mareDensity     1.73626e-006
		terraceProb     0.107898
		erosion         0
		montesMagn      0.0534887
		montesFreq      7.87379
		montesSpiky     0.821921
		montesFraction  0.941493
		dunesMagn       0.0400254
		dunesFreq       281.253
		dunesFraction   0.176076
		hillsMagn       0.124388
		hillsFreq       24.7187
		hillsFraction   0.697419
		hills2Fraction  0.0370472
		riversMagn      66.4899
		riversFreq      2.77978
		riversSin       4.15505
		riversOctaves   0
		canyonsMagn     0.429092
		canyonsFreq     0.0715008
		canyonFraction  0
		cracksMagn      0.0583919
		cracksFreq      0.0525604
		cracksOctaves   0
		craterMagn      1.02066
		craterFreq      0.601142
		craterDensity   0.791756
		craterOctaves   8
		craterRayedFactor 0.0768059
		volcanoMagn     0.198323
		volcanoFreq     0.660023
		volcanoDensity  0.191047
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0582067
		volcanoRadius   0.151179
		volcanoTemp     1572.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.297, 0.241, 1.000)
		colorShelf     (0.320, 0.297, 0.241, 1.000)
		colorBeach     (0.294, 0.260, 0.208, 1.000)
		colorDesert    (0.294, 0.260, 0.208, 1.000)
		colorLowland   (0.357, 0.339, 0.316, 1.000)
		colorUpland    (0.374, 0.373, 0.357, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.357, 0.339, 0.316, 1.000)
		colorUpPlants  (0.374, 0.373, 0.357, 1.000)
		BumpHeight      10.6449
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0860055
		Period          1.42644
		Eccentricity    0.482989
		Inclination     -88.0575
		AscendingNode   -41.9422
		ArgOfPericenter -18.8032
		MeanAnomaly     22.9888
	}
}

Moon	"10.8"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            5.56765e-006
	Radius          235.755
	InertiaMoment   0.398078

	RotationPeriod  264.649
	Obliquity       13.736
	EqAscendNode    -112.929
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.830 0.739 0.619)

	Surface
	{
		SurfStyle       0.0985508
		OceanStyle      0.482024
		Randomize      (-0.393, 0.971, 0.851)
		colorDistMagn   0.0486964
		colorDistFreq   28.9378
		detailScale     606.375
		colorConversion true
		drivenDarkening 0.0645444
		seaLevel        0.104076
		snowLevel       2
		tropicLatitude  0.461188
		icecapLatitude  1
		icecapHeight    0.104076
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.01482
		venusFreq       0.50176
		venusMagn       0
		mareFreq        0
		mareDensity     2.13144e-006
		terraceProb     0.138055
		erosion         0
		montesMagn      0.0558354
		montesFreq      14.6001
		montesSpiky     0.901773
		montesFraction  0.552644
		dunesMagn       0.0493164
		dunesFreq       318.425
		dunesFraction   0.705849
		hillsMagn       0.121962
		hillsFreq       28.4116
		hillsFraction   0.828452
		hills2Fraction  0.251868
		riversMagn      61.7545
		riversFreq      2.67234
		riversSin       5.16893
		riversOctaves   0
		canyonsMagn     0.4612
		canyonsFreq     0.0943169
		canyonFraction  0
		cracksMagn      0.0690473
		cracksFreq      0.138133
		cracksOctaves   0
		craterMagn      0.97915
		craterFreq      0.813706
		craterDensity   0.814941
		craterOctaves   8
		craterRayedFactor 0.227656
		volcanoMagn     0.183429
		volcanoFreq     0.679291
		volcanoDensity  0.206351
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.128294
		volcanoRadius   0.13574
		volcanoTemp     1335.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.830, 0.739, 0.619, 0.500)
		colorShelf     (0.788, 0.702, 0.588, 0.500)
		colorBeach     (0.581, 0.517, 0.434, 0.750)
		colorDesert    (0.705, 0.628, 0.527, 1.000)
		colorLowland   (0.730, 0.650, 0.545, 1.000)
		colorUpland    (0.772, 0.687, 0.576, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.730, 0.650, 0.545, 1.000)
		colorUpPlants  (0.772, 0.687, 0.576, 1.000)
		BumpHeight      11.7877
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0864038
		Period          1.43636
		Eccentricity    0.368535
		Inclination     -18.6465
		AscendingNode   -115.855
		ArgOfPericenter -149.513
		MeanAnomaly     35.5222
	}
}

DwarfMoon	"10.D32"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.74107e-011
	Radius          4.06146
	InertiaMoment   0.399193

	RotationPeriod  2661.72
	Obliquity       -71.4357
	EqAscendNode    -31.8883
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.767 0.766 0.763)

	Surface
	{
		SurfStyle       0.713997
		OceanStyle      0.710855
		Randomize      (-0.607, -0.235, 0.195)
		colorDistMagn   0.56774
		colorDistFreq   0.00255243
		detailScale     110.905
		colorConversion true
		snowLevel       2
		tropicLatitude  0.876639
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450258
		terraceProb     0.548635
		erosion         0
		montesMagn      0.532544
		montesFreq      3.18453
		montesSpiky     0.9721
		montesFraction  0.661083
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0398823
		hillsFraction   0.796082
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241764
		craterFreq      0.181273
		craterDensity   0.947276
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500174
		volcanoTemp     1074.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.260, 0.214, 0.000)
		colorShelf     (0.307, 0.268, 0.244, 0.000)
		colorBeach     (0.361, 0.314, 0.290, 0.000)
		colorDesert    (0.391, 0.337, 0.282, 0.000)
		colorLowland   (0.430, 0.360, 0.321, 0.000)
		colorUpland    (0.476, 0.437, 0.389, 0.000)
		colorRock      (0.514, 0.475, 0.420, 0.000)
		colorSnow      (0.560, 0.506, 0.443, 1.000)
		BumpHeight      3.65531
		BumpOffset      0.731062
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0866146
		Period          1.44162
		Eccentricity    0.483915
		Inclination     -56.223
		AscendingNode   -33.3572
		ArgOfPericenter -93.1373
		MeanAnomaly     87.7635
	}
}

DwarfMoon	"10.D33"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.37917e-011
	Radius          4.71945
	InertiaMoment   0.395814

	RotationPeriod  2180.29
	Obliquity       92.0847
	EqAscendNode    -135.761
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.732 0.649 0.557)

	Surface
	{
		SurfStyle       0.201639
		OceanStyle      0.339992
		Randomize      (-0.499, 0.033, -0.400)
		colorDistMagn   0.130771
		colorDistFreq   0.0134198
		detailScale     128.872
		colorConversion true
		snowLevel       2
		tropicLatitude  0.686725
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495377
		terraceProb     0.733958
		erosion         0
		montesMagn      0.564265
		montesFreq      2.94513
		montesSpiky     0.994116
		montesFraction  0.262131
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.052299
		hillsFraction   0.627618
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254256
		craterFreq      0.23547
		craterDensity   0.80001
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.596453
		volcanoTemp     1549.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.260, 0.223, 0.000)
		colorShelf     (0.311, 0.276, 0.237, 0.000)
		colorBeach     (0.329, 0.292, 0.251, 0.000)
		colorDesert    (0.348, 0.308, 0.265, 0.000)
		colorLowland   (0.366, 0.325, 0.279, 0.000)
		colorUpland    (0.384, 0.341, 0.292, 0.000)
		colorRock      (0.403, 0.357, 0.306, 0.000)
		colorSnow      (0.421, 0.373, 0.320, 1.000)
		BumpHeight      4.2475
		BumpOffset      0.8495
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0870187
		Period          1.45172
		Eccentricity    0.240497
		Inclination     84.3593
		AscendingNode   -137.268
		ArgOfPericenter 170.322
		MeanAnomaly     -33.2291
	}
}

DwarfMoon	"10.D34"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            6.0533e-011
	Radius          5.49538
	InertiaMoment   0.398267

	RotationPeriod  1888.75
	Obliquity       48.5612
	EqAscendNode    5.55258
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.712 0.615)

	Surface
	{
		SurfStyle       0.184129
		OceanStyle      0.870127
		Randomize      (0.485, 0.071, -0.082)
		colorDistMagn   0.630529
		colorDistFreq   0.0232646
		detailScale     150.061
		colorConversion true
		snowLevel       2
		tropicLatitude  0.926678
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.72115
		terraceProb     0.438733
		erosion         0
		montesMagn      0.531902
		montesFreq      2.89704
		montesSpiky     0.825517
		montesFraction  0.480983
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.064878
		hillsFraction   0.585681
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215808
		craterFreq      0.231456
		craterDensity   0.858537
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575076
		volcanoTemp     1426.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.285, 0.246, 0.000)
		colorShelf     (0.336, 0.303, 0.261, 0.000)
		colorBeach     (0.356, 0.320, 0.277, 0.000)
		colorDesert    (0.376, 0.338, 0.292, 0.000)
		colorLowland   (0.395, 0.356, 0.308, 0.000)
		colorUpland    (0.415, 0.374, 0.323, 0.000)
		colorRock      (0.435, 0.392, 0.338, 0.000)
		colorSnow      (0.455, 0.409, 0.354, 1.000)
		BumpHeight      4.94584
		BumpOffset      0.989168
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0873059
		Period          1.45891
		Eccentricity    0.0258733
		Inclination     63.637
		AscendingNode   4.37151
		ArgOfPericenter 85.816
		MeanAnomaly     -109.536
	}
}

DwarfMoon	"10.D35"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.02327e-010
	Radius          6.27023
	InertiaMoment   0.399326

	RotationPeriod  1645.62
	Obliquity       64.9737
	EqAscendNode    107.476
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.468 0.462 0.459)

	Surface
	{
		SurfStyle       0.30494
		OceanStyle      0.750684
		Randomize      (0.618, 0.982, -0.652)
		colorDistMagn   0.635737
		colorDistFreq   0.0210521
		detailScale     171.219
		colorConversion true
		snowLevel       2
		tropicLatitude  0.845716
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434424
		terraceProb     0.391212
		erosion         0
		montesMagn      0.462709
		montesFreq      2.63469
		montesSpiky     0.881764
		montesFraction  0.630701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0910452
		hillsFraction   0.65457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255075
		craterFreq      0.169376
		craterDensity   0.796976
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538062
		volcanoTemp     1617.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.185, 0.184, 0.000)
		colorShelf     (0.199, 0.196, 0.195, 0.000)
		colorBeach     (0.211, 0.208, 0.207, 0.000)
		colorDesert    (0.222, 0.219, 0.218, 0.000)
		colorLowland   (0.234, 0.231, 0.230, 0.000)
		colorUpland    (0.246, 0.243, 0.241, 0.000)
		colorRock      (0.258, 0.254, 0.253, 0.000)
		colorSnow      (0.269, 0.266, 0.264, 1.000)
		BumpHeight      5.64321
		BumpOffset      1.12864
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0878083
		Period          1.47153
		Eccentricity    0.443123
		Inclination     41.8158
		AscendingNode   111.188
		ArgOfPericenter -78.2325
		MeanAnomaly     -104.796
	}
}

DwarfMoon	"10.D36"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.6556e-010
	Radius          8.79103
	InertiaMoment   0.396568

	RotationPeriod  1800.01
	Obliquity       -77.0249
	EqAscendNode    157.801
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.512 0.506 0.503)

	Surface
	{
		SurfStyle       0.971887
		OceanStyle      0.229106
		Randomize      (0.359, -0.508, 0.659)
		colorDistMagn   0.951158
		colorDistFreq   0.0243604
		detailScale     240.054
		colorConversion true
		snowLevel       2
		tropicLatitude  0.403573
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.402851
		terraceProb     0.191339
		erosion         0
		montesMagn      0.568933
		montesFreq      2.29368
		montesSpiky     0.938822
		montesFraction  0.725007
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.223999
		hillsFraction   0.779572
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2492
		craterFreq      0.27112
		craterDensity   0.906749
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.383904
		volcanoTemp     1385.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.177, 0.201, 0.050)
		colorShelf     (0.205, 0.207, 0.231, 0.040)
		colorBeach     (0.235, 0.238, 0.261, 0.030)
		colorDesert    (0.266, 0.268, 0.296, 0.020)
		colorLowland   (0.297, 0.298, 0.327, 0.030)
		colorUpland    (0.328, 0.329, 0.357, 0.050)
		colorRock      (0.358, 0.359, 0.397, 0.020)
		colorSnow      (0.358, 0.359, 0.397, 1.000)
		BumpHeight      7.91192
		BumpOffset      1.58238
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0881305
		Period          1.47963
		Eccentricity    0.206315
		Inclination     -71.8152
		AscendingNode   155.866
		ArgOfPericenter 121.082
		MeanAnomaly     145.867
	}
}

DwarfMoon	"10.D37"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.58874e-010
	Radius          9.36909
	InertiaMoment   0.398443

	RotationPeriod  1527.05
	Obliquity       11.7295
	EqAscendNode    -181.333
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.645 0.641 0.637)

	Surface
	{
		SurfStyle       0.967543
		OceanStyle      0.836709
		Randomize      (0.823, 0.901, 0.843)
		colorDistMagn   0.887706
		colorDistFreq   0.0384661
		detailScale     255.839
		colorConversion true
		snowLevel       2
		tropicLatitude  0.34114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.547496
		terraceProb     0.176168
		erosion         0
		montesMagn      0.612721
		montesFreq      3.09019
		montesSpiky     0.900595
		montesFraction  0.582058
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.1444
		hillsFraction   0.638291
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225353
		craterFreq      0.253361
		craterDensity   0.890097
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465545
		volcanoTemp     1296.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.224, 0.255, 0.050)
		colorShelf     (0.258, 0.263, 0.293, 0.040)
		colorBeach     (0.297, 0.301, 0.331, 0.030)
		colorDesert    (0.335, 0.340, 0.376, 0.020)
		colorLowland   (0.374, 0.378, 0.414, 0.030)
		colorUpland    (0.413, 0.417, 0.452, 0.050)
		colorRock      (0.452, 0.455, 0.503, 0.020)
		colorSnow      (0.452, 0.455, 0.503, 1.000)
		BumpHeight      8.43218
		BumpOffset      1.68644
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0887188
		Period          1.49447
		Eccentricity    0.192272
		Inclination     -8.2199
		AscendingNode   -177.957
		ArgOfPericenter 44.6672
		MeanAnomaly     8.42876
	}
}

DwarfMoon	"10.D38"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.93896e-010
	Radius          10.3173
	InertiaMoment   0.399457

	RotationPeriod  1357.87
	Obliquity       -16.8977
	EqAscendNode    55.3975
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.727 0.723 0.721)

	Surface
	{
		SurfStyle       0.119074
		OceanStyle      0.972031
		Randomize      (-0.018, 0.425, 0.268)
		colorDistMagn   0.697752
		colorDistFreq   0.00530422
		detailScale     281.731
		colorConversion true
		snowLevel       2
		tropicLatitude  0.845519
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66049
		terraceProb     0.375302
		erosion         0
		montesMagn      0.574105
		montesFreq      3.24671
		montesSpiky     0.791812
		montesFraction  0.588317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.312447
		hillsFraction   0.707613
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241109
		craterFreq      0.219735
		craterDensity   0.944818
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.417943
		volcanoTemp     1411.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.289, 0.289, 0.000)
		colorShelf     (0.309, 0.307, 0.307, 0.000)
		colorBeach     (0.327, 0.325, 0.325, 0.000)
		colorDesert    (0.345, 0.343, 0.343, 0.000)
		colorLowland   (0.363, 0.361, 0.361, 0.000)
		colorUpland    (0.382, 0.380, 0.379, 0.000)
		colorRock      (0.400, 0.398, 0.397, 0.000)
		colorSnow      (0.418, 0.416, 0.415, 1.000)
		BumpHeight      9.28556
		BumpOffset      1.85711
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0893175
		Period          1.50963
		Eccentricity    0.148571
		Inclination     -46.7005
		AscendingNode   54.6942
		ArgOfPericenter 67.445
		MeanAnomaly     -154.963
	}
}

DwarfMoon	"10.D39"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            5.86229e-010
	Radius          11.299
	InertiaMoment   0.397019

	RotationPeriod  1210.31
	Obliquity       15.3442
	EqAscendNode    -140.182
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.548 0.541 0.535)

	Surface
	{
		SurfStyle       0.701009
		OceanStyle      0.781303
		Randomize      (0.389, -0.083, 0.911)
		colorDistMagn   0.867785
		colorDistFreq   0.0424731
		detailScale     308.538
		colorConversion true
		snowLevel       2
		tropicLatitude  0.253127
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.383718
		terraceProb     0.382535
		erosion         0
		montesMagn      0.562729
		montesFreq      1.8663
		montesSpiky     0.988847
		montesFraction  0.334227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.275635
		hillsFraction   0.897488
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26093
		craterFreq      0.226175
		craterDensity   0.923749
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540774
		volcanoTemp     1749.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.184, 0.150, 0.000)
		colorShelf     (0.219, 0.189, 0.171, 0.000)
		colorBeach     (0.258, 0.222, 0.203, 0.000)
		colorDesert    (0.280, 0.238, 0.198, 0.000)
		colorLowland   (0.307, 0.254, 0.225, 0.000)
		colorUpland    (0.340, 0.308, 0.273, 0.000)
		colorRock      (0.367, 0.335, 0.294, 0.000)
		colorSnow      (0.400, 0.357, 0.310, 1.000)
		BumpHeight      10.1691
		BumpOffset      2.03382
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0899554
		Period          1.52583
		Eccentricity    0.057806
		Inclination     21.7339
		AscendingNode   -136.974
		ArgOfPericenter -173.13
		MeanAnomaly     131.593
	}
}

DwarfMoon	"10.D40"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            8.56759e-010
	Radius          15.7768
	InertiaMoment   0.398607

	RotationPeriod  1393.14
	Obliquity       -48.8247
	EqAscendNode    -108.066
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.557 0.390)

	Surface
	{
		SurfStyle       0.846359
		OceanStyle      0.0770109
		Randomize      (-0.690, 0.303, 0.995)
		colorDistMagn   0.828492
		colorDistFreq   0.136359
		detailScale     430.812
		colorConversion true
		snowLevel       2
		tropicLatitude  0.745847
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424197
		terraceProb     0.438285
		erosion         0
		montesMagn      0.534571
		montesFreq      3.59513
		montesSpiky     0.854525
		montesFraction  0.569796
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.657717
		hillsFraction   0.527169
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209398
		craterFreq      0.185499
		craterDensity   0.730749
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528175
		volcanoTemp     1444.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.189, 0.109, 0.000)
		colorShelf     (0.267, 0.195, 0.125, 0.000)
		colorBeach     (0.314, 0.228, 0.148, 0.000)
		colorDesert    (0.341, 0.245, 0.144, 0.000)
		colorLowland   (0.374, 0.262, 0.164, 0.000)
		colorUpland    (0.415, 0.317, 0.199, 0.000)
		colorRock      (0.448, 0.345, 0.214, 0.000)
		colorSnow      (0.488, 0.367, 0.226, 1.000)
		BumpHeight      14.1991
		BumpOffset      2.83983
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0902807
		Period          1.53411
		Eccentricity    0.158096
		Inclination     -28.5576
		AscendingNode   -104.132
		ArgOfPericenter -176.055
		MeanAnomaly     57.8282
	}
}

DwarfMoon	"10.D41"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.23339e-009
	Radius          15.8846
	InertiaMoment   0.399586

	RotationPeriod  1172.06
	Obliquity       63.0552
	EqAscendNode    -169.743
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.624 0.621)

	Surface
	{
		SurfStyle       0.355209
		OceanStyle      0.019621
		Randomize      (0.860, 0.437, -0.413)
		colorDistMagn   0.351748
		colorDistFreq   0.160045
		detailScale     433.755
		colorConversion true
		snowLevel       2
		tropicLatitude  0.229795
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.702715
		terraceProb     0.538887
		erosion         0
		montesMagn      0.697955
		montesFreq      2.62593
		montesSpiky     0.92932
		montesFraction  0.486071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.585329
		hillsFraction   0.677172
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225705
		craterFreq      0.274892
		craterDensity   0.86803
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470923
		volcanoTemp     1414.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.250, 0.248, 0.000)
		colorShelf     (0.266, 0.265, 0.264, 0.000)
		colorBeach     (0.282, 0.281, 0.279, 0.000)
		colorDesert    (0.297, 0.296, 0.295, 0.000)
		colorLowland   (0.313, 0.312, 0.310, 0.000)
		colorUpland    (0.329, 0.328, 0.326, 0.000)
		colorRock      (0.344, 0.343, 0.341, 0.000)
		colorSnow      (0.360, 0.359, 0.357, 1.000)
		BumpHeight      14.2961
		BumpOffset      2.85923
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0905499
		Period          1.54098
		Eccentricity    0.119842
		Inclination     52.4947
		AscendingNode   -170.439
		ArgOfPericenter -103.266
		MeanAnomaly     -70.1172
	}
}

DwarfMoon	"10.D42"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.75344e-009
	Radius          17.0683
	InertiaMoment   0.397354

	RotationPeriod  1052.2
	Obliquity       73.3533
	EqAscendNode    7.96103
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.650 0.620 0.566)

	Surface
	{
		SurfStyle       0.0158318
		OceanStyle      0.738444
		Randomize      (-0.501, 0.935, 0.703)
		colorDistMagn   0.0134388
		colorDistFreq   0.134332
		detailScale     466.078
		colorConversion true
		snowLevel       2
		tropicLatitude  0.812217
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534351
		terraceProb     0.305723
		erosion         0
		montesMagn      0.485056
		montesFreq      3.41457
		montesSpiky     0.95409
		montesFraction  0.382981
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.662699
		hillsFraction   0.789302
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.287547
		craterFreq      0.244885
		craterDensity   0.884189
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522722
		volcanoTemp     1292.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.248, 0.226, 0.000)
		colorShelf     (0.276, 0.263, 0.240, 0.000)
		colorBeach     (0.292, 0.279, 0.255, 0.000)
		colorDesert    (0.309, 0.294, 0.269, 0.000)
		colorLowland   (0.325, 0.310, 0.283, 0.000)
		colorUpland    (0.341, 0.325, 0.297, 0.000)
		colorRock      (0.357, 0.341, 0.311, 0.000)
		colorSnow      (0.374, 0.356, 0.325, 1.000)
		BumpHeight      15.3615
		BumpOffset      3.07229
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0910228
		Period          1.55307
		Eccentricity    0.37873
		Inclination     52.9068
		AscendingNode   8.34708
		ArgOfPericenter -33.6185
		MeanAnomaly     175.384
	}
}

DwarfMoon	"10.D43"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.46673e-009
	Radius          18.3612
	InertiaMoment   0.398762

	RotationPeriod  954.411
	Obliquity       17.1939
	EqAscendNode    139.128
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.426 0.420 0.415)

	Surface
	{
		SurfStyle       0.683139
		OceanStyle      0.619401
		Randomize      (-0.279, 0.270, 0.900)
		colorDistMagn   0.432918
		colorDistFreq   0.246272
		detailScale     501.384
		colorConversion true
		snowLevel       2
		tropicLatitude  0.487195
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.672135
		terraceProb     0.386499
		erosion         0
		montesMagn      0.329284
		montesFreq      3.46884
		montesSpiky     0.971873
		montesFraction  0.471719
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.855618
		hillsFraction   0.628108
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242025
		craterFreq      0.250652
		craterDensity   1.0602
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52974
		volcanoTemp     1634.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.143, 0.116, 0.000)
		colorShelf     (0.170, 0.147, 0.133, 0.000)
		colorBeach     (0.200, 0.172, 0.158, 0.000)
		colorDesert    (0.217, 0.185, 0.153, 0.000)
		colorLowland   (0.239, 0.198, 0.174, 0.000)
		colorUpland    (0.264, 0.240, 0.211, 0.000)
		colorRock      (0.285, 0.261, 0.228, 0.000)
		colorSnow      (0.311, 0.277, 0.240, 1.000)
		BumpHeight      16.5251
		BumpOffset      3.30502
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0916666
		Period          1.56957
		Eccentricity    0.124999
		Inclination     -14.1441
		AscendingNode   137.264
		ArgOfPericenter 175.625
		MeanAnomaly     -168.977
	}
}

DwarfMoon	"10.D44"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.43997e-009
	Radius          18.6957
	InertiaMoment   0.399713

	RotationPeriod  824.453
	Obliquity       51.7172
	EqAscendNode    68.2455
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.506 0.391)

	Surface
	{
		SurfStyle       0.81788
		OceanStyle      0.135274
		Randomize      (-0.726, 0.462, -0.612)
		colorDistMagn   0.239262
		colorDistFreq   0.262341
		detailScale     510.518
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999392
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489975
		terraceProb     0.364176
		erosion         0
		montesMagn      0.503304
		montesFreq      3.08449
		montesSpiky     0.798647
		montesFraction  0.293047
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28239
		hillsFraction   0.652311
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212371
		craterFreq      0.251764
		craterDensity   1.02783
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468898
		volcanoTemp     1862.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.172, 0.109, 0.000)
		colorShelf     (0.237, 0.177, 0.125, 0.000)
		colorBeach     (0.279, 0.207, 0.149, 0.000)
		colorDesert    (0.302, 0.223, 0.145, 0.000)
		colorLowland   (0.332, 0.238, 0.164, 0.000)
		colorUpland    (0.367, 0.288, 0.199, 0.000)
		colorRock      (0.397, 0.314, 0.215, 0.000)
		colorSnow      (0.433, 0.334, 0.227, 1.000)
		BumpHeight      16.8262
		BumpOffset      3.36523
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0921956
		Period          1.58318
		Eccentricity    0.448938
		Inclination     67.0679
		AscendingNode   67.5335
		ArgOfPericenter 59.8112
		MeanAnomaly     -87.364
	}
}

DwarfMoon	"10.D45"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            4.76255e-009
	Radius          25.1262
	InertiaMoment   0.397628

	RotationPeriod  935.105
	Obliquity       -0.530005
	EqAscendNode    150.354
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.483 0.478 0.473)

	Surface
	{
		SurfStyle       0.318467
		OceanStyle      0.363115
		Randomize      (0.957, -0.707, 0.449)
		colorDistMagn   0.660226
		colorDistFreq   0.327986
		detailScale     686.113
		colorConversion true
		snowLevel       2
		tropicLatitude  0.789314
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506584
		terraceProb     0.447591
		erosion         0
		montesMagn      0.467534
		montesFreq      3.18435
		montesSpiky     0.959986
		montesFraction  0.687555
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.99873
		hillsFraction   0.708734
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241473
		craterFreq      0.232409
		craterDensity   0.915362
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472838
		volcanoTemp     1702.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.191, 0.189, 0.000)
		colorShelf     (0.205, 0.203, 0.201, 0.000)
		colorBeach     (0.217, 0.215, 0.213, 0.000)
		colorDesert    (0.229, 0.227, 0.225, 0.000)
		colorLowland   (0.241, 0.239, 0.236, 0.000)
		colorUpland    (0.253, 0.251, 0.248, 0.000)
		colorRock      (0.265, 0.263, 0.260, 0.000)
		colorSnow      (0.277, 0.275, 0.272, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0924795
		Period          1.5905
		Eccentricity    0.142651
		Inclination     -52.5993
		AscendingNode   154.451
		ArgOfPericenter -9.5856
		MeanAnomaly     147.779
	}
}

DwarfMoon	"10.D46"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            6.55458e-009
	Radius          26.6419
	InertiaMoment   0.39891

	RotationPeriod  847.165
	Obliquity       -60.6829
	EqAscendNode    109.643
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.438 0.434 0.425)

	Surface
	{
		SurfStyle       0.607312
		OceanStyle      0.256638
		Randomize      (0.097, -0.132, 0.956)
		colorDistMagn   0.852777
		colorDistFreq   0.516649
		detailScale     727.502
		colorConversion true
		snowLevel       2
		tropicLatitude  0.833762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.686202
		terraceProb     0.23238
		erosion         0
		montesMagn      0.351798
		montesFreq      3.00311
		montesSpiky     0.993864
		montesFraction  0.554133
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.992906
		hillsFraction   0.562137
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261771
		craterFreq      0.141603
		craterDensity   0.836235
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482928
		volcanoTemp     1605.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.147, 0.119, 0.000)
		colorShelf     (0.175, 0.152, 0.136, 0.000)
		colorBeach     (0.206, 0.178, 0.162, 0.000)
		colorDesert    (0.223, 0.191, 0.157, 0.000)
		colorLowland   (0.245, 0.204, 0.179, 0.000)
		colorUpland    (0.272, 0.247, 0.217, 0.000)
		colorRock      (0.294, 0.269, 0.234, 0.000)
		colorSnow      (0.320, 0.286, 0.247, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0928776
		Period          1.60078
		Eccentricity    0.158064
		Inclination     -36.3669
		AscendingNode   107.777
		ArgOfPericenter -148.951
		MeanAnomaly     -129.194
	}
}

Barycenter	"11-11.1"
{
	ParentBody     "HIP 23518"
	Mass            0.635396
	Radius          33428.8
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0
	Precession      0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.4799
		Period          52.1481
		Eccentricity    0.0139133
		Inclination     2.21099
		AscendingNode   39.946
		ArgOfPericenter 241.75
		MeanAnomaly     355.919
	}
}

Planet	"11"
{
	ParentBody     "11-11.1"
	Class	       "IceWorld"

	Mass            0.611786
	Radius          6578.92
	InertiaMoment   0.327719

	Oblateness      0.0085534

	RotationPeriod  19.9362
	Obliquity       -19.1762
	EqAscendNode    42.053
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.478 0.472 0.469)

	Surface
	{
		SurfStyle       0.646897
		OceanStyle      0.723149
		Randomize      (0.354, -0.950, 0.845)
		colorDistMagn   0.0974466
		colorDistFreq   743.379
		detailScale     16921.3
		colorConversion true
		drivenDarkening 0
		seaLevel        0.266523
		snowLevel       2
		tropicLatitude  0.348163
		icecapLatitude  1
		icecapHeight    0.266523
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.09715
		venusFreq       0.716428
		venusMagn       0.18887
		mareFreq        1.63078
		mareDensity     0.0558082
		terraceProb     0.206893
		erosion         0
		montesMagn      0.170344
		montesFreq      295.052
		montesSpiky     0.868075
		montesFraction  0.693447
		dunesMagn       0.0320303
		dunesFreq       8654.14
		dunesFraction   0.371847
		hillsMagn       0.106746
		hillsFreq       866.741
		hillsFraction   0.206797
		hills2Fraction  0.186097
		riversMagn      49.8582
		riversFreq      2.94141
		riversSin       6.47141
		riversOctaves   0
		canyonsMagn     0.560157
		canyonsFreq     2.66853
		canyonFraction  0
		cracksMagn      0.031577
		cracksFreq      2.80457
		cracksOctaves   6
		craterMagn      0.644075
		craterFreq      15.108
		craterDensity   0.849953
		craterOctaves   13
		craterRayedFactor 0.219021
		volcanoMagn     0.592343
		volcanoFreq     0.444345
		volcanoDensity  0.336677
		volcanoOctaves  3
		volcanoActivity 0.730588
		volcanoFlows    0.227095
		volcanoRadius   0.480043
		volcanoTemp     1568.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.124, 0.090, 0.052, 1.000)
		colorShelf     (0.162, 0.123, 0.075, 1.000)
		colorBeach     (0.263, 0.160, 0.080, 0.200)
		colorDesert    (0.287, 0.179, 0.094, 0.200)
		colorLowland   (0.311, 0.189, 0.098, 0.200)
		colorUpland    (0.334, 0.226, 0.117, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.311, 0.189, 0.098, 0.200)
		colorUpPlants  (0.334, 0.226, 0.117, 0.200)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999999
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          57.7801
		Density         9.32127e-008
		Pressure        1.73246e-008
		Greenhouse      0.00346044
		Bright          0.62215
		Opacity         0
		SkyLight        0.207383
		Hue             0.0175972
		Saturation      1

		Composition
		{
			He    	50.4201
			N2    	46.6158
			Ne    	2.95471
			Ar    	0.00927464
			CO    	0.000106801
		}
	}

	Aurora
	{
		Height      69.157
		NorthLat    73.8244
		NorthLon    65.6471
		NorthRadius 1834.67
		NorthWidth  534.572
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -40.8019
		SouthLon    235.867
		SouthRadius 2013.82
		SouthWidth  575.976
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     8542.95
		OuterRadius     18455.6
		RotationPeriod  5.55583
		RotationOffset  0
		FrontBright     0.214792
		BackBright      0.385968
		Density         0.093988
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000173294
		Period          0.231071
		Eccentricity    0.00472023
		Inclination     1.38815
		AscendingNode   148.728
		ArgOfPericenter 118.931
		MeanAnomaly     87.8981
	}
}

Moon	"11.1"
{
	ParentBody     "11-11.1"
	Class	       "IceWorld"

	Mass            0.0236104
	Radius          2340.89
	InertiaMoment   0.35951

	Obliquity       1.38815
	EqAscendNode    148.728
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.597 0.505 0.464)

	Surface
	{
		SurfStyle       0.0391279
		OceanStyle      0.567439
		Randomize      (-0.010, -0.513, -0.285)
		colorDistMagn   0.0415337
		colorDistFreq   291.861
		detailScale     6020.89
		colorConversion true
		drivenDarkening 0
		seaLevel        0.220535
		snowLevel       2
		tropicLatitude  0.0130561
		icecapLatitude  0.972441
		icecapHeight    0.222091
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.65467
		venusFreq       1.19788
		venusMagn       0
		mareFreq        1.1699
		mareDensity     0.00350834
		terraceProb     0.123592
		erosion         0
		montesMagn      0.175181
		montesFreq      120.676
		montesSpiky     0.775263
		montesFraction  0.668594
		dunesMagn       0.0404043
		dunesFreq       3034.08
		dunesFraction   0.416428
		hillsMagn       0.101184
		hillsFreq       234.418
		hillsFraction   0.742672
		hills2Fraction  0.245015
		riversMagn      58.1744
		riversFreq      3.62097
		riversSin       5.57747
		riversOctaves   0
		canyonsMagn     0.503755
		canyonsFreq     0.798505
		canyonFraction  0
		cracksMagn      0.0525916
		cracksFreq      1.40169
		cracksOctaves   1
		craterMagn      0.633037
		craterFreq      7.85347
		craterDensity   0.997742
		craterOctaves   12
		craterRayedFactor 0.0970826
		volcanoMagn     0.438119
		volcanoFreq     0.46496
		volcanoDensity  0.157355
		volcanoOctaves  3
		volcanoActivity 0.0245497
		volcanoFlows    0.331902
		volcanoRadius   0.350225
		volcanoTemp     1531.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.597, 0.505, 0.464, 0.500)
		colorShelf     (0.567, 0.479, 0.441, 0.500)
		colorBeach     (0.418, 0.353, 0.325, 0.750)
		colorDesert    (0.507, 0.429, 0.395, 1.000)
		colorLowland   (0.525, 0.444, 0.409, 1.000)
		colorUpland    (0.555, 0.469, 0.432, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.525, 0.444, 0.409, 1.000)
		colorUpPlants  (0.555, 0.469, 0.432, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00449035
		Period          0.231071
		Eccentricity    0.00472023
		Inclination     1.38815
		AscendingNode   148.728
		ArgOfPericenter -61.0686
		MeanAnomaly     87.8981
	}
}

Asteroid	"S1"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.14595e-008
	Radius          16.7281
	InertiaMoment   0.39914

	RotationPeriod  227.183
	Obliquity       -0.612732
	EqAscendNode    -79.8039
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.668 0.663)

	Surface
	{
		SurfStyle       0.194499
		OceanStyle      0.958892
		Randomize      (-0.597, 0.789, 0.297)
		colorDistMagn   0.727048
		colorDistFreq   0.0040906
		detailScale     456.788
		colorConversion true
		snowLevel       2
		tropicLatitude  0.016406
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691124
		terraceProb     0.348318
		erosion         0
		montesMagn      0.528316
		montesFreq      2.83195
		montesSpiky     0.910638
		montesFraction  0.344458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.537677
		hillsFraction   0.606768
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247226
		craterFreq      0.188469
		craterDensity   0.940809
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53225
		volcanoTemp     1489.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.267, 0.265, 0.000)
		colorShelf     (0.285, 0.284, 0.282, 0.000)
		colorBeach     (0.302, 0.301, 0.298, 0.000)
		colorDesert    (0.319, 0.318, 0.315, 0.000)
		colorLowland   (0.336, 0.334, 0.331, 0.000)
		colorUpland    (0.353, 0.351, 0.348, 0.000)
		colorRock      (0.369, 0.368, 0.365, 0.000)
		colorSnow      (0.386, 0.384, 0.381, 1.000)
		BumpHeight      15.0553
		BumpOffset      3.01105
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.046776
		Period          0.0155502
		Eccentricity    0.130835
		Inclination     -0.612732
		AscendingNode   -79.8039
		ArgOfPericenter 120.89
		MeanAnomaly     -138.802
	}
}

Asteroid	"S2"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.25718e-016
	Radius          0.0338751
	InertiaMoment   0.395482

	RotationPeriod  210.34
	Obliquity       -0.237065
	EqAscendNode    62.4179
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.474 0.471 0.467)

	Surface
	{
		SurfStyle       0.198138
		OceanStyle      0.84475
		Randomize      (0.835, -0.650, 0.651)
		colorDistMagn   0.349498
		colorDistFreq   3.7171e-007
		detailScale     0.925015
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00707582
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.740907
		terraceProb     0.209109
		erosion         0
		montesMagn      0.540642
		montesFreq      2.28165
		montesSpiky     0.850611
		montesFraction  0.79794
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.68867e-006
		hillsFraction   0.715111
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234503
		craterFreq      0.181181
		craterDensity   0.890531
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433704
		volcanoTemp     1576.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.188, 0.187, 0.000)
		colorShelf     (0.202, 0.200, 0.199, 0.000)
		colorBeach     (0.213, 0.212, 0.210, 0.000)
		colorDesert    (0.225, 0.224, 0.222, 0.000)
		colorLowland   (0.237, 0.235, 0.234, 0.000)
		colorUpland    (0.249, 0.247, 0.245, 0.000)
		colorRock      (0.261, 0.259, 0.257, 0.000)
		colorSnow      (0.273, 0.271, 0.269, 1.000)
		BumpHeight      0.0304876
		BumpOffset      0.00609751
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.039349
		Period          0.0119978
		Eccentricity    0.0787633
		Inclination     -0.237065
		AscendingNode   62.4179
		ArgOfPericenter -121.842
		MeanAnomaly     -152.956
	}
}

Asteroid	"S3"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.85e-013
	Radius          0.438451
	InertiaMoment   0.398247

	RotationPeriod  268.01
	Obliquity       2.76
	EqAscendNode    -42.0839
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.459 0.456 0.451)

	Surface
	{
		SurfStyle       0.15996
		OceanStyle      0.232764
		Randomize      (-0.175, 0.881, -0.767)
		colorDistMagn   0.317607
		colorDistFreq   0.000120276
		detailScale     11.9726
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0897921
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53238
		terraceProb     0.20638
		erosion         0
		montesMagn      0.612065
		montesFreq      2.66775
		montesSpiky     0.955176
		montesFraction  0.799435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000411669
		hillsFraction   0.690779
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242028
		craterFreq      0.144479
		craterDensity   0.910032
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537782
		volcanoTemp     1596.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.182, 0.180, 0.000)
		colorShelf     (0.195, 0.194, 0.192, 0.000)
		colorBeach     (0.207, 0.205, 0.203, 0.000)
		colorDesert    (0.218, 0.216, 0.214, 0.000)
		colorLowland   (0.230, 0.228, 0.225, 0.000)
		colorUpland    (0.241, 0.239, 0.237, 0.000)
		colorRock      (0.253, 0.251, 0.248, 0.000)
		colorSnow      (0.264, 0.262, 0.259, 1.000)
		BumpHeight      0.394606
		BumpOffset      0.0789212
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0462472
		Period          0.0152872
		Eccentricity    0.109559
		Inclination     2.76
		AscendingNode   -42.0839
		ArgOfPericenter -176.253
		MeanAnomaly     -119.361
	}
}

Asteroid	"S4"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.72238e-010
	Radius          3.90169
	InertiaMoment   0.399329

	Obliquity       2.45755
	EqAscendNode    29.2277
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.824 0.765 0.719)

	Surface
	{
		SurfStyle       0.342655
		OceanStyle      0.565963
		Randomize      (-0.048, -0.644, 0.794)
		colorDistMagn   0.845221
		colorDistFreq   0.00846547
		detailScale     106.542
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0829126
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600825
		terraceProb     0.342432
		erosion         0
		montesMagn      0.469062
		montesFreq      3.25549
		montesSpiky     0.928241
		montesFraction  0.641077
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.039842
		hillsFraction   0.872664
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22772
		craterFreq      0.220195
		craterDensity   1.05935
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524175
		volcanoTemp     1438.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.330, 0.306, 0.288, 0.000)
		colorShelf     (0.350, 0.325, 0.306, 0.000)
		colorBeach     (0.371, 0.344, 0.324, 0.000)
		colorDesert    (0.391, 0.363, 0.342, 0.000)
		colorLowland   (0.412, 0.383, 0.360, 0.000)
		colorUpland    (0.433, 0.402, 0.378, 0.000)
		colorRock      (0.453, 0.421, 0.396, 0.000)
		colorSnow      (0.474, 0.440, 0.414, 1.000)
		BumpHeight      3.51152
		BumpOffset      0.702304
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0394082
		Period          0.0120249
		Eccentricity    0.0801474
		Inclination     2.45755
		AscendingNode   29.2277
		ArgOfPericenter 111.309
		MeanAnomaly     -147.375
	}
}

Asteroid	"S5"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.00612e-007
	Radius          49.8357
	InertiaMoment   0.396652

	Obliquity       4.0944
	EqAscendNode    -132.515
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.689 0.686 0.684)

	Surface
	{
		SurfStyle       0.91474
		OceanStyle      0.289149
		Randomize      (-0.317, -0.448, -0.186)
		colorDistMagn   0.116105
		colorDistFreq   0.703156
		detailScale     1360.85
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0574712
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559133
		terraceProb     0.38755
		erosion         0
		montesMagn      0.548041
		montesFreq      2.63902
		montesSpiky     0.925358
		montesFraction  0.459096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.82651
		hillsFraction   0.527866
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27082
		craterFreq      0.187022
		craterDensity   0.734199
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554834
		volcanoTemp     1772.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.240, 0.274, 0.050)
		colorShelf     (0.276, 0.281, 0.315, 0.040)
		colorBeach     (0.317, 0.322, 0.356, 0.030)
		colorDesert    (0.358, 0.364, 0.403, 0.020)
		colorLowland   (0.400, 0.405, 0.445, 0.030)
		colorUpland    (0.441, 0.446, 0.486, 0.050)
		colorRock      (0.483, 0.487, 0.540, 0.020)
		colorSnow      (0.483, 0.487, 0.540, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0550662
		Period          0.0198622
		Eccentricity    0.117822
		Inclination     4.0944
		AscendingNode   -132.515
		ArgOfPericenter -173.645
		MeanAnomaly     -58.6199
	}
}

Asteroid	"S6"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.34693e-015
	Radius          0.102258
	InertiaMoment   0.398492

	RotationPeriod  175.936
	Obliquity       5.95735
	EqAscendNode    -157.392
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.733 0.731 0.729)

	Surface
	{
		SurfStyle       0.522216
		OceanStyle      0.4028
		Randomize      (0.367, 0.986, -0.378)
		colorDistMagn   0.119232
		colorDistFreq   4.42851e-006
		detailScale     2.79233
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0406789
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.583226
		terraceProb     0.421378
		erosion         0
		montesMagn      0.359373
		montesFreq      3.50534
		montesSpiky     0.877337
		montesFraction  0.875902
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.03176e-005
		hillsFraction   0.473164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216742
		craterFreq      0.220178
		craterDensity   0.934732
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491861
		volcanoTemp     1294.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.248, 0.204, 0.000)
		colorShelf     (0.293, 0.256, 0.233, 0.000)
		colorBeach     (0.344, 0.300, 0.277, 0.000)
		colorDesert    (0.374, 0.322, 0.270, 0.000)
		colorLowland   (0.410, 0.343, 0.306, 0.000)
		colorUpland    (0.454, 0.417, 0.372, 0.000)
		colorRock      (0.491, 0.453, 0.401, 0.000)
		colorSnow      (0.535, 0.482, 0.423, 1.000)
		BumpHeight      0.0920324
		BumpOffset      0.0184065
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0457737
		Period          0.015053
		Eccentricity    0.110881
		Inclination     5.95735
		AscendingNode   -157.392
		ArgOfPericenter 155.383
		MeanAnomaly     44.5003
	}
}

Asteroid	"S7"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.45364e-012
	Radius          0.909986
	InertiaMoment   0.399513

	RotationPeriod  196.545
	Obliquity       1.37175
	EqAscendNode    35.4597
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.658 0.563 0.408)

	Surface
	{
		SurfStyle       0.375963
		OceanStyle      0.257065
		Randomize      (-0.147, 0.320, 0.711)
		colorDistMagn   0.397707
		colorDistFreq   6.91388e-005
		detailScale     24.8487
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0455921
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.258351
		terraceProb     0.118601
		erosion         0
		montesMagn      0.47053
		montesFreq      2.94995
		montesSpiky     0.878963
		montesFraction  0.84652
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0020275
		hillsFraction   0.662401
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20056
		craterFreq      0.154516
		craterDensity   0.914552
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50136
		volcanoTemp     1564.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.225, 0.163, 0.000)
		colorShelf     (0.280, 0.239, 0.173, 0.000)
		colorBeach     (0.296, 0.253, 0.183, 0.000)
		colorDesert    (0.313, 0.267, 0.194, 0.000)
		colorLowland   (0.329, 0.282, 0.204, 0.000)
		colorUpland    (0.345, 0.296, 0.214, 0.000)
		colorRock      (0.362, 0.310, 0.224, 0.000)
		colorSnow      (0.378, 0.324, 0.234, 1.000)
		BumpHeight      0.818987
		BumpOffset      0.163797
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0424698
		Period          0.0134531
		Eccentricity    0.0558439
		Inclination     1.37175
		AscendingNode   35.4597
		ArgOfPericenter 115.916
		MeanAnomaly     30.8949
	}
}

Asteroid	"S8"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.08221e-009
	Radius          10.35
	InertiaMoment   0.397219

	RotationPeriod  247.237
	Obliquity       -1.13769
	EqAscendNode    -144.978
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.507 0.412 0.379)

	Surface
	{
		SurfStyle       0.340184
		OceanStyle      0.661065
		Randomize      (0.892, -0.897, -0.127)
		colorDistMagn   0.544961
		colorDistFreq   0.0667324
		detailScale     282.623
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0119502
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.371967
		terraceProb     0.149454
		erosion         0
		montesMagn      0.386009
		montesFreq      2.87846
		montesSpiky     0.874234
		montesFraction  0.328574
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.196784
		hillsFraction   0.819737
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241134
		craterFreq      0.270732
		craterDensity   1.03184
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481492
		volcanoTemp     1714.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.165, 0.151, 0.000)
		colorShelf     (0.215, 0.175, 0.161, 0.000)
		colorBeach     (0.228, 0.185, 0.170, 0.000)
		colorDesert    (0.241, 0.195, 0.180, 0.000)
		colorLowland   (0.253, 0.206, 0.189, 0.000)
		colorUpland    (0.266, 0.216, 0.199, 0.000)
		colorRock      (0.279, 0.226, 0.208, 0.000)
		colorSnow      (0.291, 0.237, 0.218, 1.000)
		BumpHeight      9.31498
		BumpOffset      1.863
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0438256
		Period          0.0141024
		Eccentricity    0.0959943
		Inclination     -1.13769
		AscendingNode   -144.978
		ArgOfPericenter 16.3412
		MeanAnomaly     -135.622
	}
}

Asteroid	"S9"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.97735e-017
	Radius          0.0209584
	InertiaMoment   0.398717

	RotationPeriod  85.9972
	Obliquity       -8.17567
	EqAscendNode    81.4877
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.639 0.636 0.634)

	Surface
	{
		SurfStyle       0.94183
		OceanStyle      0.679085
		Randomize      (0.772, 0.348, 0.562)
		colorDistMagn   0.551116
		colorDistFreq   3.74638e-007
		detailScale     0.572304
		colorConversion true
		snowLevel       2
		tropicLatitude  0.21423
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330958
		terraceProb     0.279825
		erosion         0
		montesMagn      0.457803
		montesFreq      3.12629
		montesSpiky     0.770166
		montesFraction  0.558559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.73199e-007
		hillsFraction   0.488757
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.169185
		craterFreq      0.245758
		craterDensity   0.904593
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468613
		volcanoTemp     1551
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.223, 0.254, 0.050)
		colorShelf     (0.256, 0.261, 0.292, 0.040)
		colorBeach     (0.294, 0.299, 0.330, 0.030)
		colorDesert    (0.332, 0.337, 0.374, 0.020)
		colorLowland   (0.371, 0.375, 0.412, 0.030)
		colorUpland    (0.409, 0.414, 0.450, 0.050)
		colorRock      (0.447, 0.452, 0.501, 0.020)
		colorSnow      (0.447, 0.452, 0.501, 1.000)
		BumpHeight      0.0188626
		BumpOffset      0.00377251
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0450874
		Period          0.0147158
		Eccentricity    0.196012
		Inclination     -8.17567
		AscendingNode   81.4877
		ArgOfPericenter 81.8065
		MeanAnomaly     22.7265
	}
}

Asteroid	"S10"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.38132e-014
	Radius          0.271269
	InertiaMoment   0.399693

	Obliquity       -2.44162
	EqAscendNode    -113.213
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.613 0.607 0.604)

	Surface
	{
		SurfStyle       0.250282
		OceanStyle      0.208911
		Randomize      (-0.718, -0.284, 0.067)
		colorDistMagn   0.498211
		colorDistFreq   1.87308e-005
		detailScale     7.40744
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0468812
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441435
		terraceProb     0.424552
		erosion         0
		montesMagn      0.503149
		montesFreq      2.4284
		montesSpiky     0.699238
		montesFraction  0.301232
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000101222
		hillsFraction   0.748334
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241748
		craterFreq      0.231696
		craterDensity   0.896675
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455478
		volcanoTemp     1684.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.243, 0.242, 0.000)
		colorShelf     (0.260, 0.258, 0.257, 0.000)
		colorBeach     (0.276, 0.273, 0.272, 0.000)
		colorDesert    (0.291, 0.288, 0.287, 0.000)
		colorLowland   (0.306, 0.304, 0.302, 0.000)
		colorUpland    (0.322, 0.319, 0.317, 0.000)
		colorRock      (0.337, 0.334, 0.332, 0.000)
		colorSnow      (0.352, 0.349, 0.347, 1.000)
		BumpHeight      0.244142
		BumpOffset      0.0488284
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0482958
		Period          0.0163142
		Eccentricity    0.125611
		Inclination     -2.44162
		AscendingNode   -113.213
		ArgOfPericenter 35.4827
		MeanAnomaly     39.5468
	}
}

Asteroid	"S11"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.44733e-011
	Radius          2.41397
	InertiaMoment   0.397623

	RotationPeriod  166.508
	Obliquity       2.64496
	EqAscendNode    146.167
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.662 0.657 0.652)

	Surface
	{
		SurfStyle       0.708641
		OceanStyle      0.784743
		Randomize      (-0.224, 0.643, -0.465)
		colorDistMagn   0.857755
		colorDistFreq   0.00275735
		detailScale     65.9176
		colorConversion true
		snowLevel       2
		tropicLatitude  0.026853
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.365865
		terraceProb     0.539284
		erosion         0
		montesMagn      0.352532
		montesFreq      2.70885
		montesSpiky     0.97407
		montesFraction  0.673842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0165532
		hillsFraction   0.71896
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274631
		craterFreq      0.25474
		craterDensity   0.866698
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478441
		volcanoTemp     1303.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.223, 0.183, 0.000)
		colorShelf     (0.265, 0.230, 0.209, 0.000)
		colorBeach     (0.311, 0.269, 0.248, 0.000)
		colorDesert    (0.337, 0.289, 0.241, 0.000)
		colorLowland   (0.370, 0.309, 0.274, 0.000)
		colorUpland    (0.410, 0.374, 0.332, 0.000)
		colorRock      (0.443, 0.407, 0.358, 0.000)
		colorSnow      (0.483, 0.434, 0.378, 1.000)
		BumpHeight      2.17258
		BumpOffset      0.434515
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0441234
		Period          0.0142464
		Eccentricity    0.178447
		Inclination     2.64496
		AscendingNode   146.167
		ArgOfPericenter 28.6523
		MeanAnomaly     45.4363
	}
}

Asteroid	"S12"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            9.48761e-008
	Radius          30.8367
	InertiaMoment   0.398926

	Obliquity       4.88626
	EqAscendNode    -44.442
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.457 0.451 0.446)

	Surface
	{
		SurfStyle       0.704082
		OceanStyle      0.865931
		Randomize      (0.344, -0.274, 0.077)
		colorDistMagn   0.880782
		colorDistFreq   0.562187
		detailScale     842.049
		colorConversion true
		snowLevel       2
		tropicLatitude  0.157213
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.333453
		terraceProb     0.168439
		erosion         0
		montesMagn      0.519468
		montesFreq      3.37219
		montesSpiky     0.842299
		montesFraction  0.586559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.31176
		hillsFraction   0.831177
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242325
		craterFreq      0.208922
		craterDensity   0.864538
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546274
		volcanoTemp     1636.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.153, 0.125, 0.000)
		colorShelf     (0.183, 0.158, 0.143, 0.000)
		colorBeach     (0.215, 0.185, 0.169, 0.000)
		colorDesert    (0.233, 0.198, 0.165, 0.000)
		colorLowland   (0.256, 0.212, 0.187, 0.000)
		colorUpland    (0.283, 0.257, 0.227, 0.000)
		colorRock      (0.306, 0.279, 0.245, 0.000)
		colorSnow      (0.334, 0.297, 0.259, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0476207
		Period          0.0159733
		Eccentricity    0.100549
		Inclination     4.88626
		AscendingNode   -44.442
		ArgOfPericenter -88.2821
		MeanAnomaly     137.137
	}
}

Asteroid	"S13"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.55818e-016
	Radius          0.0632668
	InertiaMoment   0.39987

	RotationPeriod  345.725
	Obliquity       -3.07788
	EqAscendNode    61.3219
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.740 0.737)

	Surface
	{
		SurfStyle       0.935874
		OceanStyle      0.38719
		Randomize      (-0.937, -0.764, -0.688)
		colorDistMagn   0.80858
		colorDistFreq   2.25886e-006
		detailScale     1.7276
		colorConversion true
		snowLevel       2
		tropicLatitude  0.092275
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545353
		terraceProb     0.446489
		erosion         0
		montesMagn      0.518992
		montesFreq      2.53106
		montesSpiky     0.997733
		montesFraction  0.501853
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.90385e-006
		hillsFraction   0.755142
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204266
		craterFreq      0.272588
		craterDensity   1.0007
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59771
		volcanoTemp     1495.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.259, 0.295, 0.050)
		colorShelf     (0.297, 0.303, 0.339, 0.040)
		colorBeach     (0.342, 0.348, 0.383, 0.030)
		colorDesert    (0.387, 0.392, 0.435, 0.020)
		colorLowland   (0.431, 0.436, 0.479, 0.030)
		colorUpland    (0.476, 0.481, 0.523, 0.050)
		colorRock      (0.520, 0.525, 0.582, 0.020)
		colorSnow      (0.520, 0.525, 0.582, 1.000)
		BumpHeight      0.0569401
		BumpOffset      0.011388
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0472279
		Period          0.0157761
		Eccentricity    0.131992
		Inclination     -3.07788
		AscendingNode   61.3219
		ArgOfPericenter -81.5357
		MeanAnomaly     -175.709
	}
}

Asteroid	"S14"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            8.17916e-013
	Radius          0.563005
	InertiaMoment   0.397948

	RotationPeriod  369.12
	Obliquity       -0.334081
	EqAscendNode    -18.1433
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.673 0.539 0.493)

	Surface
	{
		SurfStyle       0.865596
		OceanStyle      0.0941492
		Randomize      (-0.213, 0.666, -0.918)
		colorDistMagn   0.997994
		colorDistFreq   7.1603e-005
		detailScale     15.3738
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0115133
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512462
		terraceProb     0.428785
		erosion         0
		montesMagn      0.451861
		montesFreq      4.25659
		montesSpiky     0.955714
		montesFraction  0.677905
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000851937
		hillsFraction   0.603124
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208425
		craterFreq      0.224528
		craterDensity   0.870377
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488932
		volcanoTemp     1639.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.189, 0.197, 0.050)
		colorShelf     (0.269, 0.221, 0.227, 0.040)
		colorBeach     (0.310, 0.253, 0.256, 0.030)
		colorDesert    (0.350, 0.286, 0.291, 0.020)
		colorLowland   (0.391, 0.318, 0.320, 0.030)
		colorUpland    (0.431, 0.350, 0.350, 0.050)
		colorRock      (0.471, 0.383, 0.389, 0.020)
		colorSnow      (0.471, 0.383, 0.389, 1.000)
		BumpHeight      0.506704
		BumpOffset      0.101341
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0436887
		Period          0.0140364
		Eccentricity    0.170272
		Inclination     -0.334081
		AscendingNode   -18.1433
		ArgOfPericenter 115.971
		MeanAnomaly     30.6806
	}
}

Asteroid	"S15"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.20361e-009
	Radius          7.1928
	InertiaMoment   0.399125

	Obliquity       0.645745
	EqAscendNode    -99.3121
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.530 0.527 0.523)

	Surface
	{
		SurfStyle       0.47381
		OceanStyle      0.128796
		Randomize      (-0.608, 0.622, 0.504)
		colorDistMagn   0.50531
		colorDistFreq   0.0165887
		detailScale     196.412
		colorConversion true
		snowLevel       2
		tropicLatitude  0.014591
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.665525
		terraceProb     0.103811
		erosion         0
		montesMagn      0.429198
		montesFreq      3.41221
		montesSpiky     0.977244
		montesFraction  0.539286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.100968
		hillsFraction   0.584681
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232594
		craterFreq      0.191076
		craterDensity   0.923851
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.426891
		volcanoTemp     890.038
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.211, 0.209, 0.000)
		colorShelf     (0.225, 0.224, 0.222, 0.000)
		colorBeach     (0.239, 0.237, 0.235, 0.000)
		colorDesert    (0.252, 0.250, 0.248, 0.000)
		colorLowland   (0.265, 0.264, 0.261, 0.000)
		colorUpland    (0.278, 0.277, 0.274, 0.000)
		colorRock      (0.292, 0.290, 0.287, 0.000)
		colorSnow      (0.305, 0.303, 0.301, 1.000)
		BumpHeight      6.47352
		BumpOffset      1.2947
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0469992
		Period          0.0156616
		Eccentricity    0.132967
		Inclination     0.645745
		AscendingNode   -99.3121
		ArgOfPericenter 178.404
		MeanAnomaly     -148.61
	}
}

Asteroid	"S16"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.05117e-018
	Radius          0.0147554
	InertiaMoment   0.395286

	RotationPeriod  238.732
	Obliquity       0.642589
	EqAscendNode    80.6055
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.821 0.801 0.760)

	Surface
	{
		SurfStyle       0.841315
		OceanStyle      0.00713648
		Randomize      (-0.712, -0.427, -0.969)
		colorDistMagn   0.696422
		colorDistFreq   1.22082e-007
		detailScale     0.402921
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0171066
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.40079
		terraceProb     0.436992
		erosion         0
		montesMagn      0.485342
		montesFreq      1.84835
		montesSpiky     0.896957
		montesFraction  0.467057
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.94609e-007
		hillsFraction   0.855707
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263519
		craterFreq      0.208894
		craterDensity   0.915235
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508481
		volcanoTemp     1455.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.272, 0.213, 0.000)
		colorShelf     (0.329, 0.280, 0.243, 0.000)
		colorBeach     (0.386, 0.328, 0.289, 0.000)
		colorDesert    (0.419, 0.352, 0.281, 0.000)
		colorLowland   (0.460, 0.376, 0.319, 0.000)
		colorUpland    (0.509, 0.457, 0.388, 0.000)
		colorRock      (0.550, 0.497, 0.418, 0.000)
		colorSnow      (0.600, 0.529, 0.441, 1.000)
		BumpHeight      0.0132799
		BumpOffset      0.00265598
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0518663
		Period          0.0181564
		Eccentricity    0.135035
		Inclination     0.642589
		AscendingNode   80.6055
		ArgOfPericenter 25.2005
		MeanAnomaly     -74.4855
	}
}

Asteroid	"S17"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.03762e-014
	Radius          0.131307
	InertiaMoment   0.398226

	Obliquity       2.15633
	EqAscendNode    29.0622
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.484 0.478 0.476)

	Surface
	{
		SurfStyle       0.689458
		OceanStyle      0.978184
		Randomize      (0.995, -0.376, 0.081)
		colorDistMagn   0.744245
		colorDistFreq   6.12278e-006
		detailScale     3.58556
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0727965
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553469
		terraceProb     0.245849
		erosion         0
		montesMagn      0.390135
		montesFreq      2.62774
		montesSpiky     0.913325
		montesFraction  0.669088
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.39324e-005
		hillsFraction   0.435414
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220771
		craterFreq      0.260601
		craterDensity   0.872043
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474298
		volcanoTemp     1389.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.163, 0.133, 0.000)
		colorShelf     (0.193, 0.167, 0.152, 0.000)
		colorBeach     (0.227, 0.196, 0.181, 0.000)
		colorDesert    (0.247, 0.210, 0.176, 0.000)
		colorLowland   (0.271, 0.225, 0.200, 0.000)
		colorUpland    (0.300, 0.273, 0.243, 0.000)
		colorRock      (0.324, 0.296, 0.262, 0.000)
		colorSnow      (0.353, 0.316, 0.276, 1.000)
		BumpHeight      0.118177
		BumpOffset      0.0236353
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0512967
		Period          0.0178581
		Eccentricity    0.100611
		Inclination     2.15633
		AscendingNode   29.0622
		ArgOfPericenter 38.454
		MeanAnomaly     135.901
	}
}

Asteroid	"S18"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.52691e-011
	Radius          1.67758
	InertiaMoment   0.399315

	Obliquity       -7.59922
	EqAscendNode    94.4066
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.668 0.666)

	Surface
	{
		SurfStyle       0.207086
		OceanStyle      0.0426001
		Randomize      (-0.870, 0.521, -0.990)
		colorDistMagn   0.0174128
		colorDistFreq   0.00149429
		detailScale     45.8092
		colorConversion true
		snowLevel       2
		tropicLatitude  0.178964
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.652991
		terraceProb     0.211298
		erosion         0
		montesMagn      0.371452
		montesFreq      2.36549
		montesSpiky     0.987233
		montesFraction  0.523512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00487747
		hillsFraction   0.60061
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206915
		craterFreq      0.159457
		craterDensity   0.841485
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485559
		volcanoTemp     1357.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.267, 0.266, 0.000)
		colorShelf     (0.285, 0.284, 0.283, 0.000)
		colorBeach     (0.302, 0.301, 0.300, 0.000)
		colorDesert    (0.319, 0.317, 0.316, 0.000)
		colorLowland   (0.335, 0.334, 0.333, 0.000)
		colorUpland    (0.352, 0.351, 0.349, 0.000)
		colorRock      (0.369, 0.367, 0.366, 0.000)
		colorSnow      (0.386, 0.384, 0.383, 1.000)
		BumpHeight      1.50983
		BumpOffset      0.301965
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.04343
		Period          0.0139119
		Eccentricity    0.146024
		Inclination     -7.59922
		AscendingNode   94.4066
		ArgOfPericenter -149.863
		MeanAnomaly     150.07
	}
}

Asteroid	"S19"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.24693e-008
	Radius          21.7115
	InertiaMoment   0.396595

	Obliquity       1.78102
	EqAscendNode    135.175
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.557 0.552 0.550)

	Surface
	{
		SurfStyle       0.286911
		OceanStyle      0.565706
		Randomize      (0.477, 0.569, 0.396)
		colorDistMagn   0.140157
		colorDistFreq   0.0785846
		detailScale     592.869
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0236988
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5867
		terraceProb     0.364643
		erosion         0
		montesMagn      0.449902
		montesFreq      3.07238
		montesSpiky     0.945775
		montesFraction  0.728203
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.35718
		hillsFraction   0.55405
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251478
		craterFreq      0.231483
		craterDensity   1.05176
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500269
		volcanoTemp     1280.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.221, 0.220, 0.000)
		colorShelf     (0.237, 0.234, 0.234, 0.000)
		colorBeach     (0.251, 0.248, 0.247, 0.000)
		colorDesert    (0.265, 0.262, 0.261, 0.000)
		colorLowland   (0.278, 0.276, 0.275, 0.000)
		colorUpland    (0.292, 0.290, 0.289, 0.000)
		colorRock      (0.306, 0.303, 0.302, 0.000)
		colorSnow      (0.320, 0.317, 0.316, 1.000)
		BumpHeight      19.5404
		BumpOffset      3.90807
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0402818
		Period          0.0124269
		Eccentricity    0.100097
		Inclination     1.78102
		AscendingNode   135.175
		ArgOfPericenter 86.9035
		MeanAnomaly     141.754
	}
}

Asteroid	"S20"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.31633e-016
	Radius          0.0306242
	InertiaMoment   0.398474

	Obliquity       -3.25815
	EqAscendNode    41.0893
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.793 0.791 0.789)

	Surface
	{
		SurfStyle       0.204003
		OceanStyle      0.824437
		Randomize      (0.115, 0.647, 0.634)
		colorDistMagn   0.396963
		colorDistFreq   4.85063e-007
		detailScale     0.836244
		colorConversion true
		snowLevel       2
		tropicLatitude  0.106289
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330543
		terraceProb     0.169973
		erosion         0
		montesMagn      0.523503
		montesFreq      2.7504
		montesSpiky     0.828925
		montesFraction  0.392106
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.22566e-006
		hillsFraction   0.542109
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259214
		craterFreq      0.231424
		craterDensity   0.913029
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.608669
		volcanoTemp     1603.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.316, 0.316, 0.000)
		colorShelf     (0.337, 0.336, 0.335, 0.000)
		colorBeach     (0.357, 0.356, 0.355, 0.000)
		colorDesert    (0.377, 0.376, 0.375, 0.000)
		colorLowland   (0.396, 0.395, 0.394, 0.000)
		colorUpland    (0.416, 0.415, 0.414, 0.000)
		colorRock      (0.436, 0.435, 0.434, 0.000)
		colorSnow      (0.456, 0.455, 0.454, 1.000)
		BumpHeight      0.0275618
		BumpOffset      0.00551235
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0449762
		Period          0.0146614
		Eccentricity    0.194023
		Inclination     -3.25815
		AscendingNode   41.0893
		ArgOfPericenter 52.1212
		MeanAnomaly     74.0384
	}
}

Asteroid	"S21"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.93705e-013
	Radius          0.391257
	InertiaMoment   0.399499

	Obliquity       1.36515
	EqAscendNode    10.4696
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.565 0.561 0.558)

	Surface
	{
		SurfStyle       0.380151
		OceanStyle      0.949303
		Randomize      (-0.000, 0.505, 0.365)
		colorDistMagn   0.897569
		colorDistFreq   0.000100446
		detailScale     10.6839
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0474367
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.752858
		terraceProb     0.291804
		erosion         0
		montesMagn      0.558608
		montesFreq      3.73194
		montesSpiky     0.882976
		montesFraction  0.632499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0003355
		hillsFraction   0.61406
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256853
		craterFreq      0.270092
		craterDensity   1.01391
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435521
		volcanoTemp     1441.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.225, 0.223, 0.000)
		colorShelf     (0.240, 0.239, 0.237, 0.000)
		colorBeach     (0.254, 0.253, 0.251, 0.000)
		colorDesert    (0.268, 0.267, 0.265, 0.000)
		colorLowland   (0.283, 0.281, 0.279, 0.000)
		colorUpland    (0.297, 0.295, 0.293, 0.000)
		colorRock      (0.311, 0.309, 0.307, 0.000)
		colorSnow      (0.325, 0.323, 0.321, 1.000)
		BumpHeight      0.352131
		BumpOffset      0.0704262
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0508463
		Period          0.0176234
		Eccentricity    0.0352509
		Inclination     1.36515
		AscendingNode   10.4696
		ArgOfPericenter -36.386
		MeanAnomaly     77.9681
	}
}

Asteroid	"S22"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.85047e-010
	Radius          5.06403
	InertiaMoment   0.397183

	RotationPeriod  170.723
	Obliquity       -5.31136
	EqAscendNode    -171.768
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.650 0.645)

	Surface
	{
		SurfStyle       0.13665
		OceanStyle      0.334984
		Randomize      (-0.669, -0.687, 0.102)
		colorDistMagn   0.990907
		colorDistFreq   0.0019519
		detailScale     138.282
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0132869
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330177
		terraceProb     0.264452
		erosion         0
		montesMagn      0.55358
		montesFreq      3.54624
		montesSpiky     0.972445
		montesFraction  0.281427
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0527728
		hillsFraction   0.527722
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21824
		craterFreq      0.256475
		craterDensity   0.815684
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462095
		volcanoTemp     1377.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.260, 0.258, 0.000)
		colorShelf     (0.278, 0.276, 0.274, 0.000)
		colorBeach     (0.294, 0.293, 0.290, 0.000)
		colorDesert    (0.311, 0.309, 0.306, 0.000)
		colorLowland   (0.327, 0.325, 0.322, 0.000)
		colorUpland    (0.343, 0.341, 0.338, 0.000)
		colorRock      (0.360, 0.358, 0.355, 0.000)
		colorSnow      (0.376, 0.374, 0.371, 1.000)
		BumpHeight      4.55763
		BumpOffset      0.911526
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0414768
		Period          0.012984
		Eccentricity    0.126023
		Inclination     -5.31136
		AscendingNode   -171.768
		ArgOfPericenter -17.0891
		MeanAnomaly     134.294
	}
}

Asteroid	"S23"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.19462e-007
	Radius          45.0528
	InertiaMoment   0.3987

	RotationPeriod  236.848
	Obliquity       -1.28375
	EqAscendNode    -34.9188
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.686 0.682 0.677)

	Surface
	{
		SurfStyle       0.802328
		OceanStyle      0.0403444
		Randomize      (-0.255, 0.292, 0.001)
		colorDistMagn   0.454151
		colorDistFreq   1.42541
		detailScale     1230.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0427337
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.604413
		terraceProb     0.10645
		erosion         0
		montesMagn      0.543689
		montesFreq      3.45836
		montesSpiky     0.850362
		montesFraction  0.577712
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.85573
		hillsFraction   0.826664
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229623
		craterFreq      0.225293
		craterDensity   0.997202
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517462
		volcanoTemp     1739.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.232, 0.190, 0.000)
		colorShelf     (0.274, 0.239, 0.217, 0.000)
		colorBeach     (0.322, 0.280, 0.257, 0.000)
		colorDesert    (0.350, 0.300, 0.251, 0.000)
		colorLowland   (0.384, 0.321, 0.284, 0.000)
		colorUpland    (0.425, 0.389, 0.345, 0.000)
		colorRock      (0.459, 0.423, 0.372, 0.000)
		colorSnow      (0.501, 0.450, 0.393, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0425891
		Period          0.0135098
		Eccentricity    0.148848
		Inclination     -1.28375
		AscendingNode   -34.9188
		ArgOfPericenter -55.9412
		MeanAnomaly     -30.6361
	}
}

Asteroid	"S24"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.45736e-015
	Radius          0.0912511
	InertiaMoment   0.399679

	Obliquity       2.41768
	EqAscendNode    3.50305
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.546 0.543 0.540)

	Surface
	{
		SurfStyle       0.550959
		OceanStyle      0.589482
		Randomize      (0.991, -0.028, -0.142)
		colorDistMagn   0.958505
		colorDistFreq   5.74781e-006
		detailScale     2.49176
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0842536
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569548
		terraceProb     0.159677
		erosion         0
		montesMagn      0.373946
		montesFreq      1.87235
		montesSpiky     0.77826
		montesFraction  0.622053
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.83012e-005
		hillsFraction   0.809373
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253943
		craterFreq      0.186094
		craterDensity   1.04942
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452267
		volcanoTemp     1460.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.185, 0.151, 0.000)
		colorShelf     (0.218, 0.190, 0.173, 0.000)
		colorBeach     (0.257, 0.223, 0.205, 0.000)
		colorDesert    (0.278, 0.239, 0.200, 0.000)
		colorLowland   (0.306, 0.255, 0.227, 0.000)
		colorUpland    (0.338, 0.309, 0.276, 0.000)
		colorRock      (0.366, 0.337, 0.297, 0.000)
		colorSnow      (0.398, 0.358, 0.313, 1.000)
		BumpHeight      0.082126
		BumpOffset      0.0164252
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0402668
		Period          0.01242
		Eccentricity    0.091777
		Inclination     2.41768
		AscendingNode   3.50305
		ArgOfPericenter 139.473
		MeanAnomaly     7.75489
	}
}

Asteroid	"S25"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.61614e-012
	Radius          1.18108
	InertiaMoment   0.397595

	Obliquity       3.38009
	EqAscendNode    -3.92642
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.556 0.550 0.547)

	Surface
	{
		SurfStyle       0.988045
		OceanStyle      0.00208662
		Randomize      (-0.168, 0.691, 0.401)
		colorDistMagn   0.451442
		colorDistFreq   0.000750375
		detailScale     32.2513
		colorConversion true
		snowLevel       2
		tropicLatitude  0.117645
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592258
		terraceProb     0.328867
		erosion         0
		montesMagn      0.40875
		montesFreq      3.02125
		montesSpiky     0.921922
		montesFraction  0.554014
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00427324
		hillsFraction   0.770885
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224008
		craterFreq      0.190949
		craterDensity   0.782694
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45931
		volcanoTemp     1426.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.192, 0.219, 0.050)
		colorShelf     (0.223, 0.225, 0.251, 0.040)
		colorBeach     (0.256, 0.258, 0.284, 0.030)
		colorDesert    (0.289, 0.291, 0.323, 0.020)
		colorLowland   (0.323, 0.324, 0.355, 0.030)
		colorUpland    (0.356, 0.357, 0.388, 0.050)
		colorRock      (0.389, 0.390, 0.432, 0.020)
		colorSnow      (0.389, 0.390, 0.432, 1.000)
		BumpHeight      1.06297
		BumpOffset      0.212594
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0544421
		Period          0.0195255
		Eccentricity    0.0364813
		Inclination     3.38009
		AscendingNode   -3.92642
		ArgOfPericenter -66.4404
		MeanAnomaly     85.0888
	}
}

Asteroid	"S26"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.32134e-009
	Radius          10.5098
	InertiaMoment   0.398911

	Obliquity       -2.22557
	EqAscendNode    -85.7668
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.598 0.596 0.594)

	Surface
	{
		SurfStyle       0.50821
		OceanStyle      0.115122
		Randomize      (0.992, 0.045, 0.074)
		colorDistMagn   0.0927881
		colorDistFreq   0.085274
		detailScale     286.988
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0568874
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609873
		terraceProb     0.321113
		erosion         0
		montesMagn      0.566484
		montesFreq      2.98863
		montesSpiky     0.94226
		montesFraction  0.195302
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.406184
		hillsFraction   0.695671
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197017
		craterFreq      0.213963
		craterDensity   0.702399
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544337
		volcanoTemp     1722.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.203, 0.166, 0.000)
		colorShelf     (0.239, 0.209, 0.190, 0.000)
		colorBeach     (0.281, 0.244, 0.226, 0.000)
		colorDesert    (0.305, 0.262, 0.220, 0.000)
		colorLowland   (0.335, 0.280, 0.249, 0.000)
		colorUpland    (0.371, 0.340, 0.303, 0.000)
		colorRock      (0.401, 0.369, 0.327, 0.000)
		colorSnow      (0.437, 0.393, 0.344, 1.000)
		BumpHeight      9.45884
		BumpOffset      1.89177
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0529621
		Period          0.0187348
		Eccentricity    0.0770488
		Inclination     -2.22557
		AscendingNode   -85.7668
		ArgOfPericenter 6.14716
		MeanAnomaly     -100.347
	}
}

Asteroid	"S27"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.11744e-017
	Radius          0.0212821
	InertiaMoment   0.399856

	RotationPeriod  171.889
	Obliquity       3.41421
	EqAscendNode    -156.002
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.673 0.594 0.552)

	Surface
	{
		SurfStyle       0.406811
		OceanStyle      0.774179
		Randomize      (0.464, 0.496, 0.084)
		colorDistMagn   0.343051
		colorDistFreq   3.74648e-007
		detailScale     0.581143
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0247588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50364
		terraceProb     0.430604
		erosion         0
		montesMagn      0.511676
		montesFreq      3.3473
		montesSpiky     0.906306
		montesFraction  0.593667
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.6358e-007
		hillsFraction   0.62066
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233729
		craterFreq      0.218669
		craterDensity   1.05552
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566399
		volcanoTemp     1324.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.238, 0.221, 0.000)
		colorShelf     (0.286, 0.252, 0.235, 0.000)
		colorBeach     (0.303, 0.267, 0.249, 0.000)
		colorDesert    (0.320, 0.282, 0.262, 0.000)
		colorLowland   (0.337, 0.297, 0.276, 0.000)
		colorUpland    (0.353, 0.312, 0.290, 0.000)
		colorRock      (0.370, 0.327, 0.304, 0.000)
		colorSnow      (0.387, 0.341, 0.318, 1.000)
		BumpHeight      0.0191539
		BumpOffset      0.00383077
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0416654
		Period          0.0130727
		Eccentricity    0.0512608
		Inclination     3.41421
		AscendingNode   -156.002
		ArgOfPericenter -116.467
		MeanAnomaly     61.8497
	}
}

Asteroid	"S28"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.58748e-014
	Radius          0.275458
	InertiaMoment   0.397925

	RotationPeriod  253.69
	Obliquity       4.35178
	EqAscendNode    35.1406
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.766 0.763 0.760)

	Surface
	{
		SurfStyle       0.0187883
		OceanStyle      0.748946
		Randomize      (0.230, 0.201, 0.509)
		colorDistMagn   0.847596
		colorDistFreq   5.49406e-005
		detailScale     7.52184
		colorConversion true
		snowLevel       2
		tropicLatitude  0.144301
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.351168
		terraceProb     0.773901
		erosion         0
		montesMagn      0.225866
		montesFreq      2.17166
		montesSpiky     0.811778
		montesFraction  0.579243
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000150392
		hillsFraction   0.806936
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275675
		craterFreq      0.212995
		craterDensity   1.06026
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501854
		volcanoTemp     1240.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.305, 0.304, 0.000)
		colorShelf     (0.326, 0.324, 0.323, 0.000)
		colorBeach     (0.345, 0.344, 0.342, 0.000)
		colorDesert    (0.364, 0.363, 0.361, 0.000)
		colorLowland   (0.383, 0.382, 0.380, 0.000)
		colorUpland    (0.402, 0.401, 0.399, 0.000)
		colorRock      (0.422, 0.420, 0.418, 0.000)
		colorSnow      (0.441, 0.439, 0.437, 1.000)
		BumpHeight      0.247912
		BumpOffset      0.0495824
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0445849
		Period          0.0144704
		Eccentricity    0.077317
		Inclination     4.35178
		AscendingNode   35.1406
		ArgOfPericenter 81.5984
		MeanAnomaly     -111.661
	}
}

Asteroid	"S29"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.75072e-011
	Radius          2.45126
	InertiaMoment   0.39911

	RotationPeriod  293.851
	Obliquity       0.66432
	EqAscendNode    -105.52
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.567 0.490)

	Surface
	{
		SurfStyle       0.518964
		OceanStyle      0.2878
		Randomize      (0.440, -0.915, -0.137)
		colorDistMagn   0.59394
		colorDistFreq   0.00332948
		detailScale     66.9357
		colorConversion true
		snowLevel       2
		tropicLatitude  0.014033
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431827
		terraceProb     0.347619
		erosion         0
		montesMagn      0.503686
		montesFreq      2.92745
		montesSpiky     0.880156
		montesFraction  0.450536
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0124251
		hillsFraction   0.65339
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239712
		craterFreq      0.149707
		craterDensity   0.844552
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430095
		volcanoTemp     1152.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.193, 0.137, 0.000)
		colorShelf     (0.261, 0.198, 0.157, 0.000)
		colorBeach     (0.307, 0.232, 0.186, 0.000)
		colorDesert    (0.333, 0.249, 0.181, 0.000)
		colorLowland   (0.365, 0.266, 0.206, 0.000)
		colorUpland    (0.405, 0.323, 0.250, 0.000)
		colorRock      (0.437, 0.351, 0.269, 0.000)
		colorSnow      (0.476, 0.374, 0.284, 1.000)
		BumpHeight      2.20613
		BumpOffset      0.441227
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.042377
		Period          0.013409
		Eccentricity    0.0832084
		Inclination     0.66432
		AscendingNode   -105.52
		ArgOfPericenter 32.3793
		MeanAnomaly     10.3121
	}
}

Asteroid	"S30"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            9.93402e-008
	Radius          31.3129
	InertiaMoment   0.395032

	RotationPeriod  388.643
	Obliquity       -0.845304
	EqAscendNode    -77.9263
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.404 0.401 0.397)

	Surface
	{
		SurfStyle       0.266648
		OceanStyle      0.144882
		Randomize      (0.189, -0.439, 0.844)
		colorDistMagn   0.391219
		colorDistFreq   0.484842
		detailScale     855.051
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0229399
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.338181
		terraceProb     0.252521
		erosion         0
		montesMagn      0.517928
		montesFreq      3.30094
		montesSpiky     0.884132
		montesFraction  0.582678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.18785
		hillsFraction   0.441179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257221
		craterFreq      0.239085
		craterDensity   0.726098
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561389
		volcanoTemp     1601.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.160, 0.159, 0.000)
		colorShelf     (0.172, 0.170, 0.169, 0.000)
		colorBeach     (0.182, 0.180, 0.179, 0.000)
		colorDesert    (0.192, 0.190, 0.189, 0.000)
		colorLowland   (0.202, 0.200, 0.199, 0.000)
		colorUpland    (0.212, 0.210, 0.208, 0.000)
		colorRock      (0.222, 0.220, 0.218, 0.000)
		colorSnow      (0.232, 0.230, 0.228, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.045216
		Period          0.0147788
		Eccentricity    0.138654
		Inclination     -0.845304
		AscendingNode   -77.9263
		ArgOfPericenter 100.192
		MeanAnomaly     116.425
	}
}

Asteroid	"S31"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.8197e-016
	Radius          0.0642438
	InertiaMoment   0.398206

	Obliquity       -0.76752
	EqAscendNode    -155.6
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.753 0.642 0.574)

	Surface
	{
		SurfStyle       0.13262
		OceanStyle      0.22994
		Randomize      (-0.876, 0.929, -0.086)
		colorDistMagn   0.751133
		colorDistFreq   2.72361e-006
		detailScale     1.75428
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00566278
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421866
		terraceProb     0.144743
		erosion         0
		montesMagn      0.579874
		montesFreq      3.64305
		montesSpiky     0.983343
		montesFraction  0.484704
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.84747e-006
		hillsFraction   0.688008
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228263
		craterFreq      0.227738
		craterDensity   0.994683
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540555
		volcanoTemp     1600.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.257, 0.229, 0.000)
		colorShelf     (0.320, 0.273, 0.244, 0.000)
		colorBeach     (0.339, 0.289, 0.258, 0.000)
		colorDesert    (0.358, 0.305, 0.273, 0.000)
		colorLowland   (0.377, 0.321, 0.287, 0.000)
		colorUpland    (0.395, 0.337, 0.301, 0.000)
		colorRock      (0.414, 0.353, 0.316, 0.000)
		colorSnow      (0.433, 0.369, 0.330, 1.000)
		BumpHeight      0.0578194
		BumpOffset      0.0115639
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0580009
		Period          0.0214711
		Eccentricity    0.073819
		Inclination     -0.76752
		AscendingNode   -155.6
		ArgOfPericenter 95.4009
		MeanAnomaly     39.4296
	}
}

Asteroid	"S32"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            8.564e-013
	Radius          0.5717
	InertiaMoment   0.3993

	Obliquity       1.38555
	EqAscendNode    -25.4766
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.502 0.496 0.489)

	Surface
	{
		SurfStyle       0.955697
		OceanStyle      0.982689
		Randomize      (0.976, -0.898, -0.503)
		colorDistMagn   0.0835529
		colorDistFreq   0.000126456
		detailScale     15.6112
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0471572
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561414
		terraceProb     0.249926
		erosion         0
		montesMagn      0.419871
		montesFreq      1.97561
		montesSpiky     0.785706
		montesFraction  0.430943
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000992345
		hillsFraction   0.682201
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237658
		craterFreq      0.203639
		craterDensity   0.739125
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.440083
		volcanoTemp     1311.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.174, 0.195, 0.050)
		colorShelf     (0.201, 0.203, 0.225, 0.040)
		colorBeach     (0.231, 0.233, 0.254, 0.030)
		colorDesert    (0.261, 0.263, 0.288, 0.020)
		colorLowland   (0.291, 0.293, 0.318, 0.030)
		colorUpland    (0.321, 0.322, 0.347, 0.050)
		colorRock      (0.352, 0.352, 0.386, 0.020)
		colorSnow      (0.352, 0.352, 0.386, 1.000)
		BumpHeight      0.51453
		BumpOffset      0.102906
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.046349
		Period          0.0153378
		Eccentricity    0.137985
		Inclination     1.38555
		AscendingNode   -25.4766
		ArgOfPericenter -60.639
		MeanAnomaly     -124.91
	}
}

Asteroid	"S33"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.26024e-009
	Radius          7.30388
	InertiaMoment   0.396536

	Obliquity       -1.89649
	EqAscendNode    -120.22
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.728 0.725 0.720)

	Surface
	{
		SurfStyle       0.923957
		OceanStyle      0.204615
		Randomize      (-0.963, -0.486, 0.887)
		colorDistMagn   0.538903
		colorDistFreq   0.0283906
		detailScale     199.445
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0329789
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.641413
		terraceProb     0.443143
		erosion         0
		montesMagn      0.431271
		montesFreq      3.41762
		montesSpiky     0.832919
		montesFraction  0.856314
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.144619
		hillsFraction   0.659776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229444
		craterFreq      0.202238
		craterDensity   1.03626
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522606
		volcanoTemp     1532.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.254, 0.288, 0.050)
		colorShelf     (0.291, 0.297, 0.331, 0.040)
		colorBeach     (0.335, 0.341, 0.375, 0.030)
		colorDesert    (0.378, 0.384, 0.425, 0.020)
		colorLowland   (0.422, 0.428, 0.468, 0.030)
		colorUpland    (0.466, 0.471, 0.512, 0.050)
		colorRock      (0.509, 0.515, 0.569, 0.020)
		colorSnow      (0.509, 0.515, 0.569, 1.000)
		BumpHeight      6.5735
		BumpOffset      1.3147
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0399392
		Period          0.0122687
		Eccentricity    0.0923771
		Inclination     -1.89649
		AscendingNode   -120.22
		ArgOfPericenter -86.6603
		MeanAnomaly     -163.058
	}
}

Asteroid	"S34"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.38294e-018
	Radius          0.0149833
	InertiaMoment   0.398456

	RotationPeriod  405.276
	Obliquity       3.61549
	EqAscendNode    152.97
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.406 0.403 0.400)

	Surface
	{
		SurfStyle       0.754754
		OceanStyle      0.763224
		Randomize      (0.005, 0.564, -0.790)
		colorDistMagn   0.872235
		colorDistFreq   1.1406e-007
		detailScale     0.409144
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0294701
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53083
		terraceProb     0.646664
		erosion         0
		montesMagn      0.385636
		montesFreq      2.69774
		montesSpiky     0.972656
		montesFraction  0.339207
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.28874e-007
		hillsFraction   0.84553
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233724
		craterFreq      0.213542
		craterDensity   0.920569
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486603
		volcanoTemp     1692.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.137, 0.112, 0.000)
		colorShelf     (0.162, 0.141, 0.128, 0.000)
		colorBeach     (0.191, 0.165, 0.152, 0.000)
		colorDesert    (0.207, 0.178, 0.148, 0.000)
		colorLowland   (0.227, 0.190, 0.168, 0.000)
		colorUpland    (0.251, 0.230, 0.204, 0.000)
		colorRock      (0.272, 0.250, 0.220, 0.000)
		colorSnow      (0.296, 0.266, 0.232, 1.000)
		BumpHeight      0.013485
		BumpOffset      0.00269699
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0383824
		Period          0.0115584
		Eccentricity    0.0555632
		Inclination     3.61549
		AscendingNode   152.97
		ArgOfPericenter -161.382
		MeanAnomaly     166.438
	}
}

Asteroid	"S35"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.08644e-014
	Radius          0.133335
	InertiaMoment   0.399485

	RotationPeriod  774.494
	Obliquity       -0.983127
	EqAscendNode    107.189
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.591 0.586 0.580)

	Surface
	{
		SurfStyle       0.306028
		OceanStyle      0.135849
		Randomize      (0.068, -0.967, -0.479)
		colorDistMagn   0.585323
		colorDistFreq   1.2762e-005
		detailScale     3.64094
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0203668
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.73751
		terraceProb     0.241781
		erosion         0
		montesMagn      0.443523
		montesFreq      2.7412
		montesSpiky     0.95164
		montesFraction  0.107927
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.58312e-005
		hillsFraction   0.803311
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230143
		craterFreq      0.274446
		craterDensity   1.01102
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520797
		volcanoTemp     1599.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.235, 0.232, 0.000)
		colorShelf     (0.251, 0.249, 0.247, 0.000)
		colorBeach     (0.266, 0.264, 0.261, 0.000)
		colorDesert    (0.281, 0.278, 0.276, 0.000)
		colorLowland   (0.295, 0.293, 0.290, 0.000)
		colorUpland    (0.310, 0.308, 0.305, 0.000)
		colorRock      (0.325, 0.322, 0.319, 0.000)
		colorSnow      (0.340, 0.337, 0.334, 1.000)
		BumpHeight      0.120002
		BumpOffset      0.0240003
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0509374
		Period          0.0176708
		Eccentricity    0.0730229
		Inclination     -0.983127
		AscendingNode   107.189
		ArgOfPericenter 150.246
		MeanAnomaly     127.44
	}
}

Asteroid	"S36"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.59875e-011
	Radius          1.70349
	InertiaMoment   0.397146

	RotationPeriod  825.453
	Obliquity       2.30599
	EqAscendNode    71.3981
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.576 0.572 0.569)

	Surface
	{
		SurfStyle       0.721109
		OceanStyle      0.317592
		Randomize      (0.957, 0.083, -0.361)
		colorDistMagn   0.827593
		colorDistFreq   0.00241256
		detailScale     46.5167
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0653164
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.74494
		terraceProb     0.106471
		erosion         0
		montesMagn      0.565584
		montesFreq      3.16231
		montesSpiky     0.859888
		montesFraction  0.464516
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00512472
		hillsFraction   0.651819
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192692
		craterFreq      0.242424
		craterDensity   0.822438
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459367
		volcanoTemp     1902.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.194, 0.159, 0.000)
		colorShelf     (0.230, 0.200, 0.182, 0.000)
		colorBeach     (0.271, 0.235, 0.216, 0.000)
		colorDesert    (0.294, 0.252, 0.211, 0.000)
		colorLowland   (0.322, 0.269, 0.239, 0.000)
		colorUpland    (0.357, 0.326, 0.290, 0.000)
		colorRock      (0.386, 0.355, 0.313, 0.000)
		colorSnow      (0.420, 0.378, 0.330, 1.000)
		BumpHeight      1.53314
		BumpOffset      0.306629
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0470651
		Period          0.0156946
		Eccentricity    0.142474
		Inclination     2.30599
		AscendingNode   71.3981
		ArgOfPericenter -15.3393
		MeanAnomaly     40.1796
	}
}

Asteroid	"S37"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.35265e-008
	Radius          19.3745
	InertiaMoment   0.398683

	RotationPeriod  285.704
	Obliquity       2.38639
	EqAscendNode    24.9376
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.447 0.444 0.442)

	Surface
	{
		SurfStyle       0.855704
		OceanStyle      0.574672
		Randomize      (-0.477, -0.840, 0.852)
		colorDistMagn   0.334728
		colorDistFreq   0.277496
		detailScale     529.052
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0812452
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.590389
		terraceProb     0.269936
		erosion         0
		montesMagn      0.497095
		montesFreq      3.23675
		montesSpiky     0.976436
		montesFraction  0.690908
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.629724
		hillsFraction   0.625865
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202793
		craterFreq      0.230077
		craterDensity   0.947794
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43112
		volcanoTemp     1363.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.152, 0.155, 0.177, 0.050)
		colorShelf     (0.179, 0.182, 0.203, 0.040)
		colorBeach     (0.206, 0.209, 0.230, 0.030)
		colorDesert    (0.232, 0.235, 0.260, 0.020)
		colorLowland   (0.259, 0.262, 0.287, 0.030)
		colorUpland    (0.286, 0.289, 0.313, 0.050)
		colorRock      (0.313, 0.315, 0.349, 0.020)
		colorSnow      (0.313, 0.315, 0.349, 1.000)
		BumpHeight      17.437
		BumpOffset      3.4874
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0482609
		Period          0.0162965
		Eccentricity    0.0814359
		Inclination     2.38639
		AscendingNode   24.9376
		ArgOfPericenter 60.9728
		MeanAnomaly     134.755
	}
}

Asteroid	"S38"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.37827e-016
	Radius          0.0397475
	InertiaMoment   0.399665

	Obliquity       2.06312
	EqAscendNode    -77.0082
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.462 0.455 0.450)

	Surface
	{
		SurfStyle       0.556304
		OceanStyle      0.314969
		Randomize      (0.705, -0.809, 0.782)
		colorDistMagn   0.15165
		colorDistFreq   1.09715e-006
		detailScale     1.08537
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0563228
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531592
		terraceProb     0.117316
		erosion         0
		montesMagn      0.328125
		montesFreq      2.67004
		montesSpiky     0.82289
		montesFraction  0.436603
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.90871e-006
		hillsFraction   0.652164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222229
		craterFreq      0.191502
		craterDensity   0.966778
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490616
		volcanoTemp     1454.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.155, 0.126, 0.000)
		colorShelf     (0.185, 0.159, 0.144, 0.000)
		colorBeach     (0.217, 0.187, 0.171, 0.000)
		colorDesert    (0.236, 0.200, 0.167, 0.000)
		colorLowland   (0.259, 0.214, 0.189, 0.000)
		colorUpland    (0.287, 0.259, 0.230, 0.000)
		colorRock      (0.310, 0.282, 0.248, 0.000)
		colorSnow      (0.338, 0.300, 0.261, 1.000)
		BumpHeight      0.0357727
		BumpOffset      0.00715454
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0371134
		Period          0.01099
		Eccentricity    0.0232717
		Inclination     2.06312
		AscendingNode   -77.0082
		ArgOfPericenter 62.9976
		MeanAnomaly     -41.6534
	}
}

Asteroid	"S39"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.0282e-013
	Radius          0.353709
	InertiaMoment   0.397567

	Obliquity       0.128581
	EqAscendNode    56.8892
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.589 0.585 0.580)

	Surface
	{
		SurfStyle       0.696791
		OceanStyle      0.522544
		Randomize      (-0.502, -0.586, -0.659)
		colorDistMagn   0.242459
		colorDistFreq   7.94722e-005
		detailScale     9.65861
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00395175
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593061
		terraceProb     0.237422
		erosion         0
		montesMagn      0.463785
		montesFreq      2.40297
		montesSpiky     0.866681
		montesFraction  0.604189
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00029937
		hillsFraction   0.654052
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256085
		craterFreq      0.204656
		craterDensity   0.828839
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574073
		volcanoTemp     1379.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.199, 0.162, 0.000)
		colorShelf     (0.236, 0.205, 0.186, 0.000)
		colorBeach     (0.277, 0.240, 0.220, 0.000)
		colorDesert    (0.301, 0.257, 0.215, 0.000)
		colorLowland   (0.330, 0.275, 0.244, 0.000)
		colorUpland    (0.365, 0.333, 0.296, 0.000)
		colorRock      (0.395, 0.363, 0.319, 0.000)
		colorSnow      (0.430, 0.386, 0.337, 1.000)
		BumpHeight      0.318338
		BumpOffset      0.0636676
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.056991
		Period          0.0209127
		Eccentricity    0.098387
		Inclination     0.128581
		AscendingNode   56.8892
		ArgOfPericenter -40.9172
		MeanAnomaly     45.4615
	}
}

Asteroid	"S40"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.98459e-010
	Radius          4.51894
	InertiaMoment   0.398895

	Obliquity       -1.10667
	EqAscendNode    50.6794
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.429 0.425 0.421)

	Surface
	{
		SurfStyle       0.904234
		OceanStyle      0.187675
		Randomize      (0.601, 0.420, -0.482)
		colorDistMagn   0.128937
		colorDistFreq   0.0137761
		detailScale     123.397
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0349059
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609472
		terraceProb     0.67754
		erosion         0
		montesMagn      0.657993
		montesFreq      2.81567
		montesSpiky     0.881948
		montesFraction  0.409204
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0513255
		hillsFraction   0.790259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231481
		craterFreq      0.258906
		craterDensity   1.0759
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443757
		volcanoTemp     1532.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.146, 0.149, 0.168, 0.050)
		colorShelf     (0.172, 0.174, 0.194, 0.040)
		colorBeach     (0.197, 0.200, 0.219, 0.030)
		colorDesert    (0.223, 0.225, 0.249, 0.020)
		colorLowland   (0.249, 0.251, 0.274, 0.030)
		colorUpland    (0.275, 0.276, 0.299, 0.050)
		colorRock      (0.300, 0.302, 0.333, 0.020)
		colorSnow      (0.300, 0.302, 0.333, 1.000)
		BumpHeight      4.06705
		BumpOffset      0.81341
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0433809
		Period          0.0138883
		Eccentricity    0.135075
		Inclination     -1.10667
		AscendingNode   50.6794
		ArgOfPericenter 122.181
		MeanAnomaly     -102.461
	}
}

Asteroid	"S41"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.39199e-007
	Radius          58.4742
	InertiaMoment   0.399843

	RotationPeriod  707.536
	Obliquity       1.41277
	EqAscendNode    3.02715
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.446 0.441 0.436)

	Surface
	{
		SurfStyle       0.652468
		OceanStyle      0.279153
		Randomize      (-0.084, 0.114, 0.802)
		colorDistMagn   0.577067
		colorDistFreq   2.46486
		detailScale     1596.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0492773
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337419
		terraceProb     0.471274
		erosion         0
		montesMagn      0.525542
		montesFreq      2.7823
		montesSpiky     0.857219
		montesFraction  0.639596
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.6745
		hillsFraction   0.623079
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236875
		craterFreq      0.198065
		craterDensity   0.860391
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509909
		volcanoTemp     1681.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.150, 0.122, 0.000)
		colorShelf     (0.179, 0.154, 0.140, 0.000)
		colorBeach     (0.210, 0.181, 0.166, 0.000)
		colorDesert    (0.228, 0.194, 0.161, 0.000)
		colorLowland   (0.250, 0.207, 0.183, 0.000)
		colorUpland    (0.277, 0.251, 0.222, 0.000)
		colorRock      (0.299, 0.273, 0.240, 0.000)
		colorSnow      (0.326, 0.291, 0.253, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0479576
		Period          0.0161431
		Eccentricity    0.105683
		Inclination     1.41277
		AscendingNode   3.02715
		ArgOfPericenter -140.079
		MeanAnomaly     -152.49
	}
}

Asteroid	"S42"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.57298e-015
	Radius          0.0824938
	InertiaMoment   0.397901

	RotationPeriod  823.438
	Obliquity       -4.16451
	EqAscendNode    16.2399
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.493 0.488 0.486)

	Surface
	{
		SurfStyle       0.453396
		OceanStyle      0.564927
		Randomize      (-0.885, -0.946, 0.915)
		colorDistMagn   0.64135
		colorDistFreq   2.87936e-006
		detailScale     2.25263
		colorConversion true
		snowLevel       2
		tropicLatitude  0.143413
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522333
		terraceProb     0.242846
		erosion         0
		montesMagn      0.569836
		montesFreq      2.6434
		montesSpiky     0.870338
		montesFraction  0.530016
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.75183e-005
		hillsFraction   0.529895
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242043
		craterFreq      0.189189
		craterDensity   1.02461
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493331
		volcanoTemp     1300.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.195, 0.194, 0.000)
		colorShelf     (0.210, 0.207, 0.206, 0.000)
		colorBeach     (0.222, 0.219, 0.219, 0.000)
		colorDesert    (0.234, 0.232, 0.231, 0.000)
		colorLowland   (0.247, 0.244, 0.243, 0.000)
		colorUpland    (0.259, 0.256, 0.255, 0.000)
		colorRock      (0.271, 0.268, 0.267, 0.000)
		colorSnow      (0.284, 0.280, 0.279, 1.000)
		BumpHeight      0.0742444
		BumpOffset      0.0148489
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0469885
		Period          0.0156563
		Eccentricity    0.0636219
		Inclination     -4.16451
		AscendingNode   16.2399
		ArgOfPericenter 24.5892
		MeanAnomaly     -75.0331
	}
}

Asteroid	"S43"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.78629e-012
	Radius          1.05395
	InertiaMoment   0.399095

	RotationPeriod  273.498
	Obliquity       -0.657647
	EqAscendNode    -90.6024
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.463 0.408)

	Surface
	{
		SurfStyle       0.184227
		OceanStyle      0.975829
		Randomize      (0.746, 0.869, -0.602)
		colorDistMagn   0.525803
		colorDistFreq   0.000687218
		detailScale     28.7798
		colorConversion true
		snowLevel       2
		tropicLatitude  0.016146
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.273503
		terraceProb     0.48263
		erosion         0
		montesMagn      0.477294
		montesFreq      3.1581
		montesSpiky     0.848112
		montesFraction  0.692137
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00204996
		hillsFraction   0.44473
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254968
		craterFreq      0.266256
		craterDensity   0.89603
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536949
		volcanoTemp     1203.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.185, 0.163, 0.000)
		colorShelf     (0.221, 0.197, 0.173, 0.000)
		colorBeach     (0.234, 0.208, 0.183, 0.000)
		colorDesert    (0.247, 0.220, 0.194, 0.000)
		colorLowland   (0.260, 0.232, 0.204, 0.000)
		colorUpland    (0.273, 0.243, 0.214, 0.000)
		colorRock      (0.286, 0.255, 0.224, 0.000)
		colorSnow      (0.300, 0.266, 0.234, 1.000)
		BumpHeight      0.948552
		BumpOffset      0.18971
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0468765
		Period          0.0156003
		Eccentricity    0.138111
		Inclination     -0.657647
		AscendingNode   -90.6024
		ArgOfPericenter -156.532
		MeanAnomaly     84.9279
	}
}

Asteroid	"S44"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.57172e-009
	Radius          13.6408
	InertiaMoment   0.394657

	RotationPeriod  402.058
	Obliquity       4.4178
	EqAscendNode    104.713
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.764 0.762 0.759)

	Surface
	{
		SurfStyle       0.664705
		OceanStyle      0.581128
		Randomize      (-0.696, 0.335, -0.549)
		colorDistMagn   0.185866
		colorDistFreq   0.140791
		detailScale     372.484
		colorConversion true
		snowLevel       2
		tropicLatitude  0.093986
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525276
		terraceProb     0.290697
		erosion         0
		montesMagn      0.501704
		montesFreq      3.1203
		montesSpiky     0.948851
		montesFraction  0.388
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.468965
		hillsFraction   0.699404
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227419
		craterFreq      0.185713
		craterDensity   0.906793
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504218
		volcanoTemp     1290.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.213, 0.000)
		colorShelf     (0.306, 0.267, 0.243, 0.000)
		colorBeach     (0.359, 0.312, 0.289, 0.000)
		colorDesert    (0.390, 0.335, 0.281, 0.000)
		colorLowland   (0.428, 0.358, 0.319, 0.000)
		colorUpland    (0.474, 0.434, 0.387, 0.000)
		colorRock      (0.512, 0.472, 0.418, 0.000)
		colorSnow      (0.558, 0.503, 0.440, 1.000)
		BumpHeight      12.2767
		BumpOffset      2.45534
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0462506
		Period          0.0152889
		Eccentricity    0.116278
		Inclination     4.4178
		AscendingNode   104.713
		ArgOfPericenter 110.236
		MeanAnomaly     -165.25
	}
}

Asteroid	"S45"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.26412e-017
	Radius          0.0192397
	InertiaMoment   0.398186

	RotationPeriod  455.138
	Obliquity       2.16626
	EqAscendNode    88.1966
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.429 0.426 0.423)

	Surface
	{
		SurfStyle       0.190206
		OceanStyle      0.679481
		Randomize      (-0.052, 0.096, -0.071)
		colorDistMagn   0.620722
		colorDistFreq   1.67496e-007
		detailScale     0.525372
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0542704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482052
		terraceProb     0.343058
		erosion         0
		montesMagn      0.512764
		montesFreq      2.48036
		montesSpiky     0.938197
		montesFraction  0.517136
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.13044e-007
		hillsFraction   0.487937
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25328
		craterFreq      0.24272
		craterDensity   0.984526
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.583119
		volcanoTemp     1194.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.171, 0.169, 0.000)
		colorShelf     (0.182, 0.181, 0.180, 0.000)
		colorBeach     (0.193, 0.192, 0.190, 0.000)
		colorDesert    (0.204, 0.203, 0.201, 0.000)
		colorLowland   (0.215, 0.213, 0.212, 0.000)
		colorUpland    (0.225, 0.224, 0.222, 0.000)
		colorRock      (0.236, 0.234, 0.233, 0.000)
		colorSnow      (0.247, 0.245, 0.243, 1.000)
		BumpHeight      0.0173157
		BumpOffset      0.00346315
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0414694
		Period          0.0129805
		Eccentricity    0.125867
		Inclination     2.16626
		AscendingNode   88.1966
		ArgOfPericenter 69.9164
		MeanAnomaly     -111.382
	}
}

Asteroid	"S46"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.80332e-014
	Radius          0.245808
	InertiaMoment   0.399286

	Obliquity       -3.81872
	EqAscendNode    -102.712
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.527 0.523 0.521)

	Surface
	{
		SurfStyle       0.326169
		OceanStyle      0.862993
		Randomize      (0.217, -0.855, 0.955)
		colorDistMagn   0.358612
		colorDistFreq   2.50075e-005
		detailScale     6.7122
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0831087
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.594337
		terraceProb     0.105555
		erosion         0
		montesMagn      0.539752
		montesFreq      3.13941
		montesSpiky     0.934176
		montesFraction  0.203641
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000170906
		hillsFraction   0.490502
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232631
		craterFreq      0.261766
		craterDensity   0.916008
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509196
		volcanoTemp     1476.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.209, 0.208, 0.000)
		colorShelf     (0.224, 0.222, 0.221, 0.000)
		colorBeach     (0.237, 0.235, 0.234, 0.000)
		colorDesert    (0.250, 0.248, 0.247, 0.000)
		colorLowland   (0.264, 0.261, 0.260, 0.000)
		colorUpland    (0.277, 0.274, 0.273, 0.000)
		colorRock      (0.290, 0.287, 0.286, 0.000)
		colorSnow      (0.303, 0.300, 0.299, 1.000)
		BumpHeight      0.221227
		BumpOffset      0.0442454
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0402063
		Period          0.012392
		Eccentricity    0.0984065
		Inclination     -3.81872
		AscendingNode   -102.712
		ArgOfPericenter -20.1858
		MeanAnomaly     97.0676
	}
}

Asteroid	"S47"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.06835e-011
	Radius          3.18151
	InertiaMoment   0.396473

	Obliquity       -0.446716
	EqAscendNode    169.133
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.530 0.527 0.524)

	Surface
	{
		SurfStyle       0.20552
		OceanStyle      0.558364
		Randomize      (-0.761, 0.293, 0.688)
		colorDistMagn   0.884421
		colorDistFreq   0.00757068
		detailScale     86.8764
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00146484
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565338
		terraceProb     0.278911
		erosion         0
		montesMagn      0.542886
		montesFreq      3.68693
		montesSpiky     0.89268
		montesFraction  0.0801113
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0188264
		hillsFraction   0.776215
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228255
		craterFreq      0.21195
		craterDensity   0.824627
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.582648
		volcanoTemp     1298.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.211, 0.210, 0.000)
		colorShelf     (0.225, 0.224, 0.223, 0.000)
		colorBeach     (0.238, 0.237, 0.236, 0.000)
		colorDesert    (0.252, 0.250, 0.249, 0.000)
		colorLowland   (0.265, 0.264, 0.262, 0.000)
		colorUpland    (0.278, 0.277, 0.275, 0.000)
		colorRock      (0.291, 0.290, 0.288, 0.000)
		colorSnow      (0.305, 0.303, 0.301, 1.000)
		BumpHeight      2.86336
		BumpOffset      0.572672
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0505491
		Period          0.0174691
		Eccentricity    0.0741321
		Inclination     -0.446716
		AscendingNode   169.133
		ArgOfPericenter 160.187
		MeanAnomaly     117.078
	}
}

Asteroid	"S48"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.04015e-007
	Radius          28.3078
	InertiaMoment   0.398437

	Obliquity       -1.22675
	EqAscendNode    -151.766
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.748 0.718 0.673)

	Surface
	{
		SurfStyle       0.14841
		OceanStyle      0.66489
		Randomize      (0.108, 0.585, -0.925)
		colorDistMagn   0.719823
		colorDistFreq   0.242315
		detailScale     772.991
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0104438
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.679829
		terraceProb     0.247327
		erosion         0
		montesMagn      0.492779
		montesFreq      3.13021
		montesSpiky     0.882581
		montesFraction  0.578874
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.68176
		hillsFraction   0.365899
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225841
		craterFreq      0.189227
		craterDensity   0.931873
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549385
		volcanoTemp     1511.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.287, 0.269, 0.000)
		colorShelf     (0.318, 0.305, 0.286, 0.000)
		colorBeach     (0.337, 0.323, 0.303, 0.000)
		colorDesert    (0.356, 0.341, 0.320, 0.000)
		colorLowland   (0.374, 0.359, 0.337, 0.000)
		colorUpland    (0.393, 0.377, 0.353, 0.000)
		colorRock      (0.412, 0.395, 0.370, 0.000)
		colorSnow      (0.430, 0.413, 0.387, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0624146
		Period          0.0239679
		Eccentricity    0.0154773
		Inclination     -1.22675
		AscendingNode   -151.766
		ArgOfPericenter -167.406
		MeanAnomaly     -12.6799
	}
}

Asteroid	"S49"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.09355e-016
	Radius          0.0573287
	InertiaMoment   0.399471

	RotationPeriod  232.007
	Obliquity       -5.51051
	EqAscendNode    98.2346
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.701 0.697 0.695)

	Surface
	{
		SurfStyle       0.493468
		OceanStyle      0.402788
		Randomize      (-0.507, 0.853, -0.982)
		colorDistMagn   0.699829
		colorDistFreq   2.02968e-006
		detailScale     1.56546
		colorConversion true
		snowLevel       2
		tropicLatitude  0.125455
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346676
		terraceProb     0.358987
		erosion         0
		montesMagn      0.315037
		montesFreq      3.9691
		montesSpiky     0.928795
		montesFraction  0.570758
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.38289e-006
		hillsFraction   0.681494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255642
		craterFreq      0.236899
		craterDensity   0.707574
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483519
		volcanoTemp     1271.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.279, 0.278, 0.000)
		colorShelf     (0.298, 0.296, 0.295, 0.000)
		colorBeach     (0.316, 0.314, 0.313, 0.000)
		colorDesert    (0.333, 0.331, 0.330, 0.000)
		colorLowland   (0.351, 0.349, 0.348, 0.000)
		colorUpland    (0.368, 0.366, 0.365, 0.000)
		colorRock      (0.386, 0.383, 0.382, 0.000)
		colorSnow      (0.403, 0.401, 0.400, 1.000)
		BumpHeight      0.0515958
		BumpOffset      0.0103192
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0420068
		Period          0.0132337
		Eccentricity    0.113413
		Inclination     -5.51051
		AscendingNode   98.2346
		ArgOfPericenter 116.264
		MeanAnomaly     -128.15
	}
}

Asteroid	"S50"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            8.96697e-013
	Radius          0.742015
	InertiaMoment   0.397107

	Obliquity       -2.40527
	EqAscendNode    162.254
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.650 0.613 0.547)

	Surface
	{
		SurfStyle       0.0730309
		OceanStyle      0.0758512
		Randomize      (0.488, -0.477, 0.552)
		colorDistMagn   0.732727
		colorDistFreq   0.000252346
		detailScale     20.262
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0129461
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528518
		terraceProb     0.200301
		erosion         0
		montesMagn      0.441288
		montesFreq      2.83069
		montesSpiky     0.953398
		montesFraction  0.121494
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00173644
		hillsFraction   0.739613
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256883
		craterFreq      0.265628
		craterDensity   1.06336
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421666
		volcanoTemp     1472.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.245, 0.219, 0.000)
		colorShelf     (0.276, 0.260, 0.233, 0.000)
		colorBeach     (0.292, 0.276, 0.246, 0.000)
		colorDesert    (0.309, 0.291, 0.260, 0.000)
		colorLowland   (0.325, 0.306, 0.274, 0.000)
		colorUpland    (0.341, 0.322, 0.287, 0.000)
		colorRock      (0.357, 0.337, 0.301, 0.000)
		colorSnow      (0.374, 0.352, 0.315, 1.000)
		BumpHeight      0.667814
		BumpOffset      0.133563
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0518357
		Period          0.0181403
		Eccentricity    0.125065
		Inclination     -2.40527
		AscendingNode   162.254
		ArgOfPericenter 76.3963
		MeanAnomaly     -42.0245
	}
}

Asteroid	"S51"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.31954e-009
	Radius          6.60295
	InertiaMoment   0.398666

	Obliquity       3.2297
	EqAscendNode    -57.5146
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.768 0.767)

	Surface
	{
		SurfStyle       0.501873
		OceanStyle      0.103425
		Randomize      (0.039, -0.782, -0.087)
		colorDistMagn   0.842248
		colorDistFreq   0.0276598
		detailScale     180.305
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0986602
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602803
		terraceProb     0.224558
		erosion         0
		montesMagn      0.544946
		montesFreq      3.28153
		montesSpiky     0.921892
		montesFraction  0.628429
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0845724
		hillsFraction   0.81273
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202343
		craterFreq      0.183149
		craterDensity   0.94962
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51445
		volcanoTemp     1398.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.261, 0.215, 0.000)
		colorShelf     (0.308, 0.269, 0.246, 0.000)
		colorBeach     (0.362, 0.315, 0.292, 0.000)
		colorDesert    (0.393, 0.338, 0.284, 0.000)
		colorLowland   (0.431, 0.361, 0.322, 0.000)
		colorUpland    (0.477, 0.438, 0.391, 0.000)
		colorRock      (0.516, 0.476, 0.422, 0.000)
		colorSnow      (0.562, 0.507, 0.445, 1.000)
		BumpHeight      5.94266
		BumpOffset      1.18853
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0410048
		Period          0.012763
		Eccentricity    0.0588714
		Inclination     3.2297
		AscendingNode   -57.5146
		ArgOfPericenter -65.1123
		MeanAnomaly     -76.8566
	}
}

Asteroid	"S52"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.73032e-018
	Radius          0.0133705
	InertiaMoment   0.399651

	Obliquity       2.43484
	EqAscendNode    0.397608
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.546 0.544 0.542)

	Surface
	{
		SurfStyle       0.181646
		OceanStyle      0.527379
		Randomize      (-0.407, 0.716, 0.588)
		colorDistMagn   0.711798
		colorDistFreq   1.11666e-007
		detailScale     0.365104
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0848891
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472917
		terraceProb     0.293373
		erosion         0
		montesMagn      0.522217
		montesFreq      1.56673
		montesSpiky     0.91652
		montesFraction  0.51991
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.78595e-007
		hillsFraction   0.506596
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243454
		craterFreq      0.180128
		craterDensity   0.812481
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450347
		volcanoTemp     1190.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.218, 0.217, 0.000)
		colorShelf     (0.232, 0.231, 0.230, 0.000)
		colorBeach     (0.246, 0.245, 0.244, 0.000)
		colorDesert    (0.260, 0.258, 0.257, 0.000)
		colorLowland   (0.273, 0.272, 0.271, 0.000)
		colorUpland    (0.287, 0.285, 0.284, 0.000)
		colorRock      (0.301, 0.299, 0.298, 0.000)
		colorSnow      (0.314, 0.313, 0.311, 1.000)
		BumpHeight      0.0120335
		BumpOffset      0.00240669
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0444103
		Period          0.0143855
		Eccentricity    0.100381
		Inclination     2.43484
		AscendingNode   0.397608
		ArgOfPericenter 43.153
		MeanAnomaly     104.715
	}
}

Asteroid	"S53"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.13756e-014
	Radius          0.173057
	InertiaMoment   0.397538

	Obliquity       5.19909
	EqAscendNode    -149.387
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.581 0.577 0.569)

	Surface
	{
		SurfStyle       0.24571
		OceanStyle      0.319752
		Randomize      (0.958, -0.711, 0.261)
		colorDistMagn   0.405878
		colorDistFreq   1.54756e-005
		detailScale     4.72561
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0478279
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.36213
		terraceProb     0.412884
		erosion         0
		montesMagn      0.428196
		montesFreq      2.59218
		montesSpiky     0.967948
		montesFraction  0.747539
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.51486e-005
		hillsFraction   0.845332
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252628
		craterFreq      0.207408
		craterDensity   0.694989
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445365
		volcanoTemp     1583.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.231, 0.227, 0.000)
		colorShelf     (0.247, 0.245, 0.242, 0.000)
		colorBeach     (0.261, 0.259, 0.256, 0.000)
		colorDesert    (0.276, 0.274, 0.270, 0.000)
		colorLowland   (0.290, 0.288, 0.284, 0.000)
		colorUpland    (0.305, 0.303, 0.299, 0.000)
		colorRock      (0.319, 0.317, 0.313, 0.000)
		colorSnow      (0.334, 0.332, 0.327, 1.000)
		BumpHeight      0.155751
		BumpOffset      0.0311503
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0431417
		Period          0.0137736
		Eccentricity    0.100299
		Inclination     5.19909
		AscendingNode   -149.387
		ArgOfPericenter 135.213
		MeanAnomaly     -126.031
	}
}

Asteroid	"S54"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.67398e-011
	Radius          1.54001
	InertiaMoment   0.398879

	Obliquity       7.69327
	EqAscendNode    -82.1218
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.765 0.762 0.759)

	Surface
	{
		SurfStyle       0.87952
		OceanStyle      0.550903
		Randomize      (-0.963, -0.825, -0.653)
		colorDistMagn   0.299044
		colorDistFreq   0.00170943
		detailScale     42.0526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.200848
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450654
		terraceProb     0.367912
		erosion         0
		montesMagn      0.476887
		montesFreq      3.1384
		montesSpiky     0.91444
		montesFraction  0.542615
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00447606
		hillsFraction   0.536617
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235726
		craterFreq      0.218785
		craterDensity   0.794329
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480471
		volcanoTemp     1814.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.267, 0.304, 0.050)
		colorShelf     (0.306, 0.313, 0.349, 0.040)
		colorBeach     (0.352, 0.358, 0.395, 0.030)
		colorDesert    (0.398, 0.404, 0.448, 0.020)
		colorLowland   (0.444, 0.450, 0.493, 0.030)
		colorUpland    (0.490, 0.496, 0.539, 0.050)
		colorRock      (0.536, 0.541, 0.600, 0.020)
		colorSnow      (0.536, 0.541, 0.600, 1.000)
		BumpHeight      1.38601
		BumpOffset      0.277202
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0432412
		Period          0.0138213
		Eccentricity    0.161685
		Inclination     7.69327
		AscendingNode   -82.1218
		ArgOfPericenter 137.041
		MeanAnomaly     153.377
	}
}

Asteroid	"S55"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.46335e-008
	Radius          19.6737
	InertiaMoment   0.399829

	Obliquity       2.54961
	EqAscendNode    24.4206
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.588 0.585)

	Surface
	{
		SurfStyle       0.928142
		OceanStyle      0.833868
		Randomize      (-0.611, -0.721, -0.777)
		colorDistMagn   0.430076
		colorDistFreq   0.231358
		detailScale     537.222
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0868737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480945
		terraceProb     0.17097
		erosion         0
		montesMagn      0.362727
		montesFreq      2.30553
		montesSpiky     0.975206
		montesFraction  0.725355
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.646576
		hillsFraction   0.703787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204235
		craterFreq      0.246905
		craterDensity   0.867459
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.371288
		volcanoTemp     1449.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.206, 0.234, 0.050)
		colorShelf     (0.237, 0.241, 0.269, 0.040)
		colorBeach     (0.273, 0.276, 0.304, 0.030)
		colorDesert    (0.309, 0.312, 0.345, 0.020)
		colorLowland   (0.344, 0.347, 0.380, 0.030)
		colorUpland    (0.380, 0.382, 0.415, 0.050)
		colorRock      (0.415, 0.417, 0.462, 0.020)
		colorSnow      (0.415, 0.417, 0.462, 1.000)
		BumpHeight      17.7063
		BumpOffset      3.54126
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0470668
		Period          0.0156954
		Eccentricity    0.16706
		Inclination     2.54961
		AscendingNode   24.4206
		ArgOfPericenter 169.025
		MeanAnomaly     8.62803
	}
}

Asteroid	"S56"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.44312e-016
	Radius          0.0403613
	InertiaMoment   0.397878

	RotationPeriod  158.648
	Obliquity       0.428591
	EqAscendNode    128.249
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.780 0.777 0.774)

	Surface
	{
		SurfStyle       0.696718
		OceanStyle      0.930023
		Randomize      (0.254, 0.638, 0.194)
		colorDistMagn   0.562278
		colorDistFreq   8.05224e-007
		detailScale     1.10213
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00653272
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.746024
		terraceProb     0.291136
		erosion         0
		montesMagn      0.507104
		montesFreq      3.29091
		montesSpiky     0.973277
		montesFraction  0.689617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.65996e-006
		hillsFraction   0.492719
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222518
		craterFreq      0.207014
		craterDensity   0.91729
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457212
		volcanoTemp     1659.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.264, 0.217, 0.000)
		colorShelf     (0.312, 0.272, 0.248, 0.000)
		colorBeach     (0.366, 0.319, 0.294, 0.000)
		colorDesert    (0.398, 0.342, 0.286, 0.000)
		colorLowland   (0.437, 0.365, 0.325, 0.000)
		colorUpland    (0.483, 0.443, 0.395, 0.000)
		colorRock      (0.522, 0.482, 0.426, 0.000)
		colorSnow      (0.569, 0.513, 0.449, 1.000)
		BumpHeight      0.0363252
		BumpOffset      0.00726503
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0427237
		Period          0.0135739
		Eccentricity    0.15153
		Inclination     0.428591
		AscendingNode   128.249
		ArgOfPericenter 135.342
		MeanAnomaly     87.5236
	}
}

Asteroid	"S57"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.12363e-013
	Radius          0.359171
	InertiaMoment   0.39908

	RotationPeriod  196.521
	Obliquity       -1.02203
	EqAscendNode    113.879
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.746 0.744 0.743)

	Surface
	{
		SurfStyle       0.589656
		OceanStyle      0.792953
		Randomize      (-0.679, 0.841, -0.653)
		colorDistMagn   0.773245
		colorDistFreq   0.000113207
		detailScale     9.80777
		colorConversion true
		snowLevel       2
		tropicLatitude  0.01946
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498443
		terraceProb     0.362386
		erosion         0
		montesMagn      0.570731
		montesFreq      3.2068
		montesSpiky     0.938264
		montesFraction  0.789106
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000347878
		hillsFraction   0.653551
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239931
		craterFreq      0.250003
		craterDensity   0.898225
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.410111
		volcanoTemp     1477.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.253, 0.208, 0.000)
		colorShelf     (0.298, 0.261, 0.238, 0.000)
		colorBeach     (0.351, 0.305, 0.282, 0.000)
		colorDesert    (0.380, 0.328, 0.275, 0.000)
		colorLowland   (0.418, 0.350, 0.312, 0.000)
		colorUpland    (0.462, 0.424, 0.379, 0.000)
		colorRock      (0.500, 0.462, 0.409, 0.000)
		colorSnow      (0.544, 0.491, 0.431, 1.000)
		BumpHeight      0.323254
		BumpOffset      0.0646509
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0424664
		Period          0.0134514
		Eccentricity    0.104462
		Inclination     -1.02203
		AscendingNode   113.879
		ArgOfPericenter 163.581
		MeanAnomaly     136.135
	}
}

Asteroid	"S58"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.12503e-010
	Radius          4.58874
	InertiaMoment   0.393853

	Obliquity       -5.67427
	EqAscendNode    107.987
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.589 0.585)

	Surface
	{
		SurfStyle       0.413917
		OceanStyle      0.628045
		Randomize      (-0.958, 0.971, -0.210)
		colorDistMagn   0.682868
		colorDistFreq   0.00704435
		detailScale     125.303
		colorConversion true
		snowLevel       2
		tropicLatitude  0.116054
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375433
		terraceProb     0.431966
		erosion         0
		montesMagn      0.515811
		montesFreq      2.70421
		montesSpiky     0.840757
		montesFraction  0.756828
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0588567
		hillsFraction   0.58933
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243526
		craterFreq      0.244362
		craterDensity   0.907856
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472713
		volcanoTemp     1465.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.236, 0.234, 0.000)
		colorShelf     (0.252, 0.250, 0.249, 0.000)
		colorBeach     (0.267, 0.265, 0.263, 0.000)
		colorDesert    (0.282, 0.280, 0.278, 0.000)
		colorLowland   (0.296, 0.295, 0.293, 0.000)
		colorUpland    (0.311, 0.309, 0.307, 0.000)
		colorRock      (0.326, 0.324, 0.322, 0.000)
		colorSnow      (0.341, 0.339, 0.336, 1.000)
		BumpHeight      4.12986
		BumpOffset      0.825972
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0473614
		Period          0.015843
		Eccentricity    0.0674138
		Inclination     -5.67427
		AscendingNode   107.987
		ArgOfPericenter -2.47053
		MeanAnomaly     20.6934
	}
}

Asteroid	"S59"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.59864e-007
	Radius          59.377
	InertiaMoment   0.398165

	RotationPeriod  247.895
	Obliquity       0.158325
	EqAscendNode    -114.868
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.531 0.495)

	Surface
	{
		SurfStyle       0.341565
		OceanStyle      0.5094
		Randomize      (0.153, -0.614, -0.869)
		colorDistMagn   0.856581
		colorDistFreq   1.48872
		detailScale     1621.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0029701
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.654416
		terraceProb     0.287707
		erosion         0
		montesMagn      0.54363
		montesFreq      4.45457
		montesSpiky     0.94189
		montesFraction  0.720223
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.3495
		hillsFraction   0.527565
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242434
		craterFreq      0.14401
		craterDensity   1.02417
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497555
		volcanoTemp     1277.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.212, 0.198, 0.000)
		colorShelf     (0.263, 0.226, 0.211, 0.000)
		colorBeach     (0.278, 0.239, 0.223, 0.000)
		colorDesert    (0.294, 0.252, 0.235, 0.000)
		colorLowland   (0.309, 0.266, 0.248, 0.000)
		colorUpland    (0.325, 0.279, 0.260, 0.000)
		colorRock      (0.340, 0.292, 0.272, 0.000)
		colorSnow      (0.355, 0.305, 0.285, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0439032
		Period          0.0141399
		Eccentricity    0.151588
		Inclination     0.158325
		AscendingNode   -114.868
		ArgOfPericenter -65.4899
		MeanAnomaly     -6.42614
	}
}

Asteroid	"S60"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.69406e-015
	Radius          0.083768
	InertiaMoment   0.399271

	Obliquity       -1.49997
	EqAscendNode    -83.9773
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.581 0.443)

	Surface
	{
		SurfStyle       0.592103
		OceanStyle      0.208196
		Randomize      (-0.856, 0.684, 0.750)
		colorDistMagn   0.561608
		colorDistFreq   2.41035e-006
		detailScale     2.28743
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0389053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410113
		terraceProb     0.348408
		erosion         0
		montesMagn      0.613059
		montesFreq      3.05484
		montesSpiky     0.827667
		montesFraction  0.709926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.58846e-005
		hillsFraction   0.705509
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26822
		craterFreq      0.253277
		craterDensity   0.832387
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542147
		volcanoTemp     1471.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.198, 0.124, 0.000)
		colorShelf     (0.271, 0.203, 0.142, 0.000)
		colorBeach     (0.318, 0.238, 0.168, 0.000)
		colorDesert    (0.345, 0.256, 0.164, 0.000)
		colorLowland   (0.379, 0.273, 0.186, 0.000)
		colorUpland    (0.420, 0.331, 0.226, 0.000)
		colorRock      (0.454, 0.360, 0.244, 0.000)
		colorSnow      (0.494, 0.384, 0.257, 1.000)
		BumpHeight      0.0753912
		BumpOffset      0.0150782
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0550611
		Period          0.0198595
		Eccentricity    0.0825826
		Inclination     -1.49997
		AscendingNode   -83.9773
		ArgOfPericenter 18.1257
		MeanAnomaly     -114.867
	}
}

Asteroid	"S61"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.96444e-012
	Radius          1.07022
	InertiaMoment   0.396407

	Obliquity       -2.51744
	EqAscendNode    -113.722
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.769 0.712 0.683)

	Surface
	{
		SurfStyle       0.858307
		OceanStyle      0.523858
		Randomize      (-0.045, -0.862, 0.230)
		colorDistMagn   0.838714
		colorDistFreq   0.000495032
		detailScale     29.2242
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0480093
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.510862
		terraceProb     0.120265
		erosion         0
		montesMagn      0.6855
		montesFreq      2.61344
		montesSpiky     0.792646
		montesFraction  0.566899
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00291101
		hillsFraction   0.640093
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253222
		craterFreq      0.160531
		craterDensity   0.980321
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456743
		volcanoTemp     1771.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.249, 0.273, 0.050)
		colorShelf     (0.308, 0.292, 0.314, 0.040)
		colorBeach     (0.354, 0.334, 0.355, 0.030)
		colorDesert    (0.400, 0.377, 0.403, 0.020)
		colorLowland   (0.446, 0.420, 0.444, 0.030)
		colorUpland    (0.492, 0.462, 0.485, 0.050)
		colorRock      (0.538, 0.505, 0.539, 0.020)
		colorSnow      (0.538, 0.505, 0.539, 1.000)
		BumpHeight      0.963201
		BumpOffset      0.19264
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0428638
		Period          0.0136407
		Eccentricity    0.064528
		Inclination     -2.51744
		AscendingNode   -113.722
		ArgOfPericenter 112.017
		MeanAnomaly     -19.0132
	}
}

Asteroid	"S62"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.83389e-009
	Radius          13.8515
	InertiaMoment   0.398419

	RotationPeriod  151.756
	Obliquity       -2.40161
	EqAscendNode    136.713
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.571 0.563)

	Surface
	{
		SurfStyle       0.777753
		OceanStyle      0.464927
		Randomize      (0.544, -0.890, -0.610)
		colorDistMagn   0.746763
		colorDistFreq   0.0394947
		detailScale     378.237
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0309069
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.401251
		terraceProb     0.11873
		erosion         0
		montesMagn      0.602744
		montesFreq      3.81722
		montesSpiky     0.849246
		montesFraction  0.303382
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.469561
		hillsFraction   0.546063
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233898
		craterFreq      0.230557
		craterDensity   0.881869
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48689
		volcanoTemp     1479.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.194, 0.158, 0.000)
		colorShelf     (0.230, 0.200, 0.180, 0.000)
		colorBeach     (0.270, 0.234, 0.214, 0.000)
		colorDesert    (0.293, 0.251, 0.208, 0.000)
		colorLowland   (0.322, 0.268, 0.237, 0.000)
		colorUpland    (0.356, 0.325, 0.287, 0.000)
		colorRock      (0.385, 0.354, 0.310, 0.000)
		colorSnow      (0.419, 0.377, 0.327, 1.000)
		BumpHeight      12.4663
		BumpOffset      2.49326
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0414773
		Period          0.0129842
		Eccentricity    0.126033
		Inclination     -2.40161
		AscendingNode   136.713
		ArgOfPericenter 146.099
		MeanAnomaly     112.394
	}
}

Asteroid	"S63"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.4177e-017
	Radius          0.0195368
	InertiaMoment   0.399457

	RotationPeriod  208.856
	Obliquity       -1.51544
	EqAscendNode    93.5994
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.654 0.595)

	Surface
	{
		SurfStyle       0.835225
		OceanStyle      0.555305
		Randomize      (-0.441, -0.121, -0.755)
		colorDistMagn   0.418946
		colorDistFreq   1.74349e-007
		detailScale     0.533486
		colorConversion true
		snowLevel       2
		tropicLatitude  0.036201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.31467
		terraceProb     0.269435
		erosion         0
		montesMagn      0.649993
		montesFreq      1.94161
		montesSpiky     0.745645
		montesFraction  0.595761
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.5113e-007
		hillsFraction   0.918319
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221808
		craterFreq      0.216954
		craterDensity   1.04274
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476956
		volcanoTemp     1386.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.222, 0.166, 0.000)
		colorShelf     (0.289, 0.229, 0.190, 0.000)
		colorBeach     (0.339, 0.268, 0.226, 0.000)
		colorDesert    (0.368, 0.288, 0.220, 0.000)
		colorLowland   (0.404, 0.307, 0.250, 0.000)
		colorUpland    (0.448, 0.373, 0.303, 0.000)
		colorRock      (0.484, 0.405, 0.327, 0.000)
		colorSnow      (0.527, 0.432, 0.345, 1.000)
		BumpHeight      0.0175831
		BumpOffset      0.00351663
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0442253
		Period          0.0142958
		Eccentricity    0.18034
		Inclination     -1.51544
		AscendingNode   93.5994
		ArgOfPericenter 100.428
		MeanAnomaly     40.6715
	}
}

Asteroid	"S64"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.02933e-014
	Radius          0.249604
	InertiaMoment   0.397068

	Obliquity       1.66963
	EqAscendNode    -5.37141
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.821 0.774 0.705)

	Surface
	{
		SurfStyle       0.98032
		OceanStyle      0.712201
		Randomize      (-0.935, -0.203, -0.817)
		colorDistMagn   0.294799
		colorDistFreq   3.76407e-005
		detailScale     6.81586
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0581843
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525939
		terraceProb     0.348285
		erosion         0
		montesMagn      0.356148
		montesFreq      3.29372
		montesSpiky     0.901436
		montesFraction  0.637471
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000172655
		hillsFraction   0.784999
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236494
		craterFreq      0.212873
		craterDensity   0.752725
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464813
		volcanoTemp     1433.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.271, 0.282, 0.050)
		colorShelf     (0.328, 0.317, 0.324, 0.040)
		colorBeach     (0.377, 0.364, 0.367, 0.030)
		colorDesert    (0.427, 0.410, 0.416, 0.020)
		colorLowland   (0.476, 0.456, 0.458, 0.030)
		colorUpland    (0.525, 0.503, 0.501, 0.050)
		colorRock      (0.574, 0.549, 0.557, 0.020)
		colorSnow      (0.574, 0.549, 0.557, 1.000)
		BumpHeight      0.224644
		BumpOffset      0.0449287
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0370986
		Period          0.0109834
		Eccentricity    0.0228802
		Inclination     1.66963
		AscendingNode   -5.37141
		ArgOfPericenter -49.5175
		MeanAnomaly     53.283
	}
}

Asteroid	"S65"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.40092e-011
	Radius          3.23064
	InertiaMoment   0.398649

	Obliquity       -3.89769
	EqAscendNode    -36.5236
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.717 0.711 0.709)

	Surface
	{
		SurfStyle       0.127255
		OceanStyle      0.576563
		Randomize      (0.900, 0.476, -0.507)
		colorDistMagn   0.183133
		colorDistFreq   0.00402374
		detailScale     88.2181
		colorConversion true
		snowLevel       2
		tropicLatitude  0.128834
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535943
		terraceProb     0.232608
		erosion         0
		montesMagn      0.560905
		montesFreq      3.26509
		montesSpiky     0.886661
		montesFraction  0.512667
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0266155
		hillsFraction   0.533042
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222105
		craterFreq      0.192424
		craterDensity   1.04434
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514598
		volcanoTemp     1465.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.285, 0.283, 0.000)
		colorShelf     (0.305, 0.302, 0.301, 0.000)
		colorBeach     (0.323, 0.320, 0.319, 0.000)
		colorDesert    (0.340, 0.338, 0.337, 0.000)
		colorLowland   (0.358, 0.356, 0.354, 0.000)
		colorUpland    (0.376, 0.373, 0.372, 0.000)
		colorRock      (0.394, 0.391, 0.390, 0.000)
		colorSnow      (0.412, 0.409, 0.407, 1.000)
		BumpHeight      2.90758
		BumpOffset      0.581516
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0417289
		Period          0.0131025
		Eccentricity    0.0119645
		Inclination     -3.89769
		AscendingNode   -36.5236
		ArgOfPericenter -68.736
		MeanAnomaly     -167.74
	}
}

Asteroid	"S66"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.08909e-007
	Radius          36.7408
	InertiaMoment   0.399637

	Obliquity       -5.49334
	EqAscendNode    67.8477
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.638 0.633)

	Surface
	{
		SurfStyle       0.289311
		OceanStyle      0.191312
		Randomize      (0.110, 0.967, -0.832)
		colorDistMagn   0.519962
		colorDistFreq   0.77823
		detailScale     1003.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.158368
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355835
		terraceProb     0.52273
		erosion         0
		montesMagn      0.512563
		montesFreq      3.29501
		montesSpiky     0.878249
		montesFraction  0.709965
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.21081
		hillsFraction   0.652805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236135
		craterFreq      0.215442
		craterDensity   0.924665
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458099
		volcanoTemp     1742.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.255, 0.253, 0.000)
		colorShelf     (0.273, 0.271, 0.269, 0.000)
		colorBeach     (0.289, 0.287, 0.285, 0.000)
		colorDesert    (0.305, 0.303, 0.301, 0.000)
		colorLowland   (0.321, 0.319, 0.317, 0.000)
		colorUpland    (0.337, 0.335, 0.333, 0.000)
		colorRock      (0.353, 0.351, 0.348, 0.000)
		colorSnow      (0.369, 0.367, 0.364, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0426184
		Period          0.0135237
		Eccentricity    0.0523447
		Inclination     -5.49334
		AscendingNode   67.8477
		ArgOfPericenter -19.0069
		MeanAnomaly     -102.36
	}
}

Asteroid	"S67"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.38026e-016
	Radius          0.0518269
	InertiaMoment   0.397509

	Obliquity       -2.44727
	EqAscendNode    -155.056
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.761 0.759 0.757)

	Surface
	{
		SurfStyle       0.831859
		OceanStyle      0.875738
		Randomize      (0.166, -0.541, -0.021)
		colorDistMagn   0.592263
		colorDistFreq   1.06129e-006
		detailScale     1.41522
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0184411
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582599
		terraceProb     0.373462
		erosion         0
		montesMagn      0.465798
		montesFreq      3.03611
		montesSpiky     0.89829
		montesFraction  0.377525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.83391e-006
		hillsFraction   0.694932
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227236
		craterFreq      0.231546
		craterDensity   0.961754
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451697
		volcanoTemp     1494.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.258, 0.212, 0.000)
		colorShelf     (0.304, 0.266, 0.242, 0.000)
		colorBeach     (0.357, 0.311, 0.288, 0.000)
		colorDesert    (0.388, 0.334, 0.280, 0.000)
		colorLowland   (0.426, 0.357, 0.318, 0.000)
		colorUpland    (0.472, 0.433, 0.386, 0.000)
		colorRock      (0.510, 0.471, 0.416, 0.000)
		colorSnow      (0.555, 0.501, 0.439, 1.000)
		BumpHeight      0.0466442
		BumpOffset      0.00932884
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0427795
		Period          0.0136005
		Eccentricity    0.0762111
		Inclination     -2.44727
		AscendingNode   -155.056
		ArgOfPericenter 106.198
		MeanAnomaly     73.1
	}
}

Asteroid	"S68"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            9.3889e-013
	Radius          0.662144
	InertiaMoment   0.398863

	Obliquity       2.36246
	EqAscendNode    -104.286
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.463 0.458 0.456)

	Surface
	{
		SurfStyle       0.0266083
		OceanStyle      0.42891
		Randomize      (-0.905, 0.014, 0.672)
		colorDistMagn   0.376998
		colorDistFreq   0.000104357
		detailScale     18.0809
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0505781
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.29743
		terraceProb     0.160341
		erosion         0
		montesMagn      0.494982
		montesFreq      2.69345
		montesSpiky     0.939949
		montesFraction  0.668844
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00120556
		hillsFraction   0.602389
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236036
		craterFreq      0.215619
		craterDensity   0.886808
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482464
		volcanoTemp     1721.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.183, 0.182, 0.000)
		colorShelf     (0.197, 0.195, 0.194, 0.000)
		colorBeach     (0.208, 0.206, 0.205, 0.000)
		colorDesert    (0.220, 0.218, 0.216, 0.000)
		colorLowland   (0.231, 0.229, 0.228, 0.000)
		colorUpland    (0.243, 0.241, 0.239, 0.000)
		colorRock      (0.255, 0.252, 0.251, 0.000)
		colorSnow      (0.266, 0.264, 0.262, 1.000)
		BumpHeight      0.59593
		BumpOffset      0.119186
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0441234
		Period          0.0142464
		Eccentricity    0.130705
		Inclination     2.36246
		AscendingNode   -104.286
		ArgOfPericenter -163.762
		MeanAnomaly     40.8807
	}
}

Asteroid	"S69"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.38162e-009
	Radius          8.57002
	InertiaMoment   0.399815

	RotationPeriod  448.816
	Obliquity       1.80903
	EqAscendNode    167.257
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.788 0.786 0.783)

	Surface
	{
		SurfStyle       0.728897
		OceanStyle      0.406419
		Randomize      (0.738, 0.139, -0.301)
		colorDistMagn   0.894953
		colorDistFreq   0.0464617
		detailScale     234.019
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00700811
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535307
		terraceProb     0.184765
		erosion         0
		montesMagn      0.518681
		montesFreq      3.00189
		montesSpiky     0.997579
		montesFraction  0.47527
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.163376
		hillsFraction   0.745845
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246903
		craterFreq      0.260145
		craterDensity   0.833176
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546884
		volcanoTemp     1440.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.267, 0.219, 0.000)
		colorShelf     (0.315, 0.275, 0.251, 0.000)
		colorBeach     (0.370, 0.322, 0.298, 0.000)
		colorDesert    (0.402, 0.346, 0.290, 0.000)
		colorLowland   (0.441, 0.369, 0.329, 0.000)
		colorUpland    (0.488, 0.448, 0.399, 0.000)
		colorRock      (0.528, 0.487, 0.431, 0.000)
		colorSnow      (0.575, 0.519, 0.454, 1.000)
		BumpHeight      7.71302
		BumpOffset      1.5426
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0562027
		Period          0.0204803
		Eccentricity    0.0871624
		Inclination     1.80903
		AscendingNode   167.257
		ArgOfPericenter -169.189
		MeanAnomaly     -126.185
	}
}

Asteroid	"S70"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            8.09408e-018
	Radius          0.0120874
	InertiaMoment   0.397854

	Obliquity       6.85955
	EqAscendNode    -110.298
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.796 0.794 0.793)

	Surface
	{
		SurfStyle       0.428273
		OceanStyle      0.658155
		Randomize      (-0.591, -0.250, -0.407)
		colorDistMagn   0.908978
		colorDistFreq   2.84146e-008
		detailScale     0.330066
		colorConversion true
		snowLevel       2
		tropicLatitude  0.136183
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.762522
		terraceProb     0.514193
		erosion         0
		montesMagn      0.57427
		montesFreq      2.99083
		montesSpiky     0.878752
		montesFraction  0.727191
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.1345e-007
		hillsFraction   0.721639
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263591
		craterFreq      0.257862
		craterDensity   0.809815
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45119
		volcanoTemp     1642.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.318, 0.317, 0.000)
		colorShelf     (0.338, 0.337, 0.337, 0.000)
		colorBeach     (0.358, 0.357, 0.357, 0.000)
		colorDesert    (0.378, 0.377, 0.377, 0.000)
		colorLowland   (0.398, 0.397, 0.397, 0.000)
		colorUpland    (0.418, 0.417, 0.417, 0.000)
		colorRock      (0.438, 0.437, 0.436, 0.000)
		colorSnow      (0.457, 0.457, 0.456, 1.000)
		BumpHeight      0.0108786
		BumpOffset      0.00217573
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.043139
		Period          0.0137723
		Eccentricity    0.0342771
		Inclination     6.85955
		AscendingNode   -110.298
		ArgOfPericenter 93.0416
		MeanAnomaly     -3.38799
	}
}

Asteroid	"S71"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.19109e-014
	Radius          0.154429
	InertiaMoment   0.399064

	Obliquity       2.22879
	EqAscendNode    -131.561
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.710 0.706)

	Surface
	{
		SurfStyle       0.803647
		OceanStyle      0.304714
		Randomize      (-0.559, -0.847, 0.896)
		colorDistMagn   0.428265
		colorDistFreq   1.04646e-005
		detailScale     4.21695
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0319047
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622987
		terraceProb     0.345734
		erosion         0
		montesMagn      0.442366
		montesFreq      2.77416
		montesSpiky     0.976459
		montesFraction  0.672086
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.81268e-005
		hillsFraction   0.781095
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25001
		craterFreq      0.167069
		craterDensity   0.916023
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432631
		volcanoTemp     1578.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.241, 0.198, 0.000)
		colorShelf     (0.286, 0.248, 0.226, 0.000)
		colorBeach     (0.336, 0.291, 0.268, 0.000)
		colorDesert    (0.365, 0.312, 0.261, 0.000)
		colorLowland   (0.400, 0.333, 0.297, 0.000)
		colorUpland    (0.443, 0.404, 0.360, 0.000)
		colorRock      (0.479, 0.440, 0.388, 0.000)
		colorSnow      (0.522, 0.468, 0.410, 1.000)
		BumpHeight      0.138986
		BumpOffset      0.0277973
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0553947
		Period          0.0200403
		Eccentricity    0.0850909
		Inclination     2.22879
		AscendingNode   -131.561
		ArgOfPericenter -74.4464
		MeanAnomaly     -96.0322
	}
}

Asteroid	"S72"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.75274e-011
	Radius          1.99879
	InertiaMoment   0.399992

	Obliquity       -0.700464
	EqAscendNode    144.669
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.423 0.419 0.414)

	Surface
	{
		SurfStyle       0.831562
		OceanStyle      0.674696
		Randomize      (-0.285, -0.111, 0.165)
		colorDistMagn   0.354565
		colorDistFreq   0.00158689
		detailScale     54.5804
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00742118
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.274266
		terraceProb     0.487149
		erosion         0
		montesMagn      0.499825
		montesFreq      3.69564
		montesSpiky     0.943868
		montesFraction  0.568397
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00908391
		hillsFraction   0.755344
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25396
		craterFreq      0.267982
		craterDensity   0.849317
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448477
		volcanoTemp     1404.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.142, 0.116, 0.000)
		colorShelf     (0.169, 0.147, 0.132, 0.000)
		colorBeach     (0.199, 0.172, 0.157, 0.000)
		colorDesert    (0.216, 0.184, 0.153, 0.000)
		colorLowland   (0.237, 0.197, 0.174, 0.000)
		colorUpland    (0.262, 0.239, 0.211, 0.000)
		colorRock      (0.283, 0.260, 0.228, 0.000)
		colorSnow      (0.308, 0.276, 0.240, 1.000)
		BumpHeight      1.79891
		BumpOffset      0.359783
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0481311
		Period          0.0162308
		Eccentricity    0.0745348
		Inclination     -0.700464
		AscendingNode   144.669
		ArgOfPericenter -68.8789
		MeanAnomaly     5.4473
	}
}

Asteroid	"S73"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.57926e-008
	Radius          17.7856
	InertiaMoment   0.398144

	Obliquity       -0.466357
	EqAscendNode    17.0719
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.578 0.572 0.569)

	Surface
	{
		SurfStyle       0.119204
		OceanStyle      0.971663
		Randomize      (-0.269, 0.098, -0.357)
		colorDistMagn   0.331507
		colorDistFreq   0.215381
		detailScale     485.665
		colorConversion true
		snowLevel       2
		tropicLatitude  0.016098
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503685
		terraceProb     0.16899
		erosion         0
		montesMagn      0.523767
		montesFreq      3.61461
		montesSpiky     0.860138
		montesFraction  0.572256
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.765075
		hillsFraction   0.556627
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262627
		craterFreq      0.238539
		craterDensity   0.972684
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471941
		volcanoTemp     1654.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.229, 0.228, 0.000)
		colorShelf     (0.246, 0.243, 0.242, 0.000)
		colorBeach     (0.260, 0.257, 0.256, 0.000)
		colorDesert    (0.275, 0.272, 0.270, 0.000)
		colorLowland   (0.289, 0.286, 0.284, 0.000)
		colorUpland    (0.303, 0.300, 0.299, 0.000)
		colorRock      (0.318, 0.315, 0.313, 0.000)
		colorSnow      (0.332, 0.329, 0.327, 1.000)
		BumpHeight      16.007
		BumpOffset      3.20141
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0510157
		Period          0.0177115
		Eccentricity    0.0510521
		Inclination     -0.466357
		AscendingNode   17.0719
		ArgOfPericenter 139.3
		MeanAnomaly     134.959
	}
}

Asteroid	"S74"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.51102e-016
	Radius          0.0360168
	InertiaMoment   0.399257

	Obliquity       4.18478
	EqAscendNode    24.8502
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.466 0.392)

	Surface
	{
		SurfStyle       0.519612
		OceanStyle      0.297043
		Randomize      (-0.775, 0.862, -0.209)
		colorDistMagn   0.554017
		colorDistFreq   1.35969e-007
		detailScale     0.983498
		colorConversion true
		snowLevel       2
		tropicLatitude  0.142166
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.297553
		terraceProb     0.324668
		erosion         0
		montesMagn      0.381188
		montesFreq      2.51859
		montesSpiky     0.891879
		montesFraction  0.614364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.94771e-006
		hillsFraction   0.394913
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27424
		craterFreq      0.22218
		craterDensity   0.884246
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519322
		volcanoTemp     1500.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.158, 0.110, 0.000)
		colorShelf     (0.216, 0.163, 0.125, 0.000)
		colorBeach     (0.254, 0.191, 0.149, 0.000)
		colorDesert    (0.276, 0.205, 0.145, 0.000)
		colorLowland   (0.303, 0.219, 0.165, 0.000)
		colorUpland    (0.335, 0.266, 0.200, 0.000)
		colorRock      (0.362, 0.289, 0.216, 0.000)
		colorSnow      (0.395, 0.308, 0.227, 1.000)
		BumpHeight      0.0324151
		BumpOffset      0.00648302
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0469183
		Period          0.0156212
		Eccentricity    0.187912
		Inclination     4.18478
		AscendingNode   24.8502
		ArgOfPericenter -49.835
		MeanAnomaly     31.9197
	}
}

Asteroid	"S75"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.22355e-013
	Radius          0.466172
	InertiaMoment   0.396336

	Obliquity       -2.16283
	EqAscendNode    -156.933
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.442 0.438 0.435)

	Surface
	{
		SurfStyle       0.6336
		OceanStyle      0.897915
		Randomize      (-0.137, 0.124, -0.148)
		colorDistMagn   0.589075
		colorDistFreq   0.000138843
		detailScale     12.7296
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0150929
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.594263
		terraceProb     0.289994
		erosion         0
		montesMagn      0.424806
		montesFreq      2.96868
		montesSpiky     0.922097
		montesFraction  0.146214
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000598747
		hillsFraction   0.883787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263149
		craterFreq      0.177437
		craterDensity   0.838502
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517958
		volcanoTemp     1431.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.149, 0.122, 0.000)
		colorShelf     (0.177, 0.153, 0.139, 0.000)
		colorBeach     (0.208, 0.180, 0.165, 0.000)
		colorDesert    (0.225, 0.193, 0.161, 0.000)
		colorLowland   (0.247, 0.206, 0.183, 0.000)
		colorUpland    (0.274, 0.250, 0.222, 0.000)
		colorRock      (0.296, 0.272, 0.239, 0.000)
		colorSnow      (0.322, 0.289, 0.252, 1.000)
		BumpHeight      0.419554
		BumpOffset      0.0839109
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0440934
		Period          0.0142318
		Eccentricity    0.0956574
		Inclination     -2.16283
		AscendingNode   -156.933
		ArgOfPericenter 15.7222
		MeanAnomaly     -110.77
	}
}

Asteroid	"S76"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.27207e-010
	Radius          4.14836
	InertiaMoment   0.3984

	Obliquity       -0.661612
	EqAscendNode    116.95
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.514 0.510 0.502)

	Surface
	{
		SurfStyle       0.060825
		OceanStyle      0.000282739
		Randomize      (0.344, 0.033, 0.220)
		colorDistMagn   0.701142
		colorDistFreq   0.00181952
		detailScale     113.278
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0120743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.313107
		terraceProb     0.497055
		erosion         0
		montesMagn      0.416835
		montesFreq      3.53295
		montesSpiky     0.990947
		montesFraction  0.825011
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0331087
		hillsFraction   0.599543
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240672
		craterFreq      0.214257
		craterDensity   0.844444
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49002
		volcanoTemp     1344.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.204, 0.201, 0.000)
		colorShelf     (0.219, 0.217, 0.214, 0.000)
		colorBeach     (0.231, 0.229, 0.226, 0.000)
		colorDesert    (0.244, 0.242, 0.239, 0.000)
		colorLowland   (0.257, 0.255, 0.251, 0.000)
		colorUpland    (0.270, 0.268, 0.264, 0.000)
		colorRock      (0.283, 0.280, 0.276, 0.000)
		colorSnow      (0.296, 0.293, 0.289, 1.000)
		BumpHeight      3.73353
		BumpOffset      0.746705
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0542814
		Period          0.0194391
		Eccentricity    0.0236193
		Inclination     -0.661612
		AscendingNode   116.95
		ArgOfPericenter -36.0734
		MeanAnomaly     166.573
	}
}

Asteroid	"S77"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.81502e-007
	Radius          52.9854
	InertiaMoment   0.399443

	Obliquity       -3.49229
	EqAscendNode    116.319
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.551 0.547 0.540)

	Surface
	{
		SurfStyle       0.737638
		OceanStyle      0.256187
		Randomize      (0.367, 0.113, -0.086)
		colorDistMagn   0.628001
		colorDistFreq   0.878195
		detailScale     1446.85
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0642384
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512608
		terraceProb     0.134884
		erosion         0
		montesMagn      0.512714
		montesFreq      2.3072
		montesSpiky     0.871677
		montesFraction  0.510095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.58841
		hillsFraction   0.682757
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234786
		craterFreq      0.250629
		craterDensity   0.870097
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500911
		volcanoTemp     1698.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.186, 0.151, 0.000)
		colorShelf     (0.220, 0.191, 0.173, 0.000)
		colorBeach     (0.259, 0.224, 0.205, 0.000)
		colorDesert    (0.281, 0.241, 0.200, 0.000)
		colorLowland   (0.309, 0.257, 0.227, 0.000)
		colorUpland    (0.342, 0.312, 0.276, 0.000)
		colorRock      (0.369, 0.339, 0.297, 0.000)
		colorSnow      (0.402, 0.361, 0.313, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0414256
		Period          0.01296
		Eccentricity    0.124944
		Inclination     -3.49229
		AscendingNode   116.319
		ArgOfPericenter 126.069
		MeanAnomaly     38.9257
	}
}

Asteroid	"S78"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.82082e-015
	Radius          0.108723
	InertiaMoment   0.397027

	RotationPeriod  185.79
	Obliquity       -0.698278
	EqAscendNode    154.132
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.579 0.574)

	Surface
	{
		SurfStyle       0.984881
		OceanStyle      0.855608
		Randomize      (-0.059, -0.610, 0.297)
		colorDistMagn   0.352886
		colorDistFreq   2.76862e-006
		detailScale     2.96887
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00545913
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428556
		terraceProb     0.157865
		erosion         0
		montesMagn      0.277411
		montesFreq      3.15227
		montesSpiky     0.904728
		montesFraction  0.634579
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.16346e-005
		hillsFraction   0.682906
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249341
		craterFreq      0.220082
		craterDensity   0.779629
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558779
		volcanoTemp     1598.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.203, 0.230, 0.050)
		colorShelf     (0.234, 0.237, 0.264, 0.040)
		colorBeach     (0.270, 0.272, 0.299, 0.030)
		colorDesert    (0.305, 0.307, 0.339, 0.020)
		colorLowland   (0.340, 0.342, 0.373, 0.030)
		colorUpland    (0.375, 0.376, 0.408, 0.050)
		colorRock      (0.410, 0.411, 0.454, 0.020)
		colorSnow      (0.410, 0.411, 0.454, 1.000)
		BumpHeight      0.0978511
		BumpOffset      0.0195702
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0438826
		Period          0.0141299
		Eccentricity    0.099479
		Inclination     -0.698278
		AscendingNode   154.132
		ArgOfPericenter 90.6607
		MeanAnomaly     -168.553
	}
}

Asteroid	"S79"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.15098e-012
	Radius          0.967517
	InertiaMoment   0.398632

	RotationPeriod  225.936
	Obliquity       3.08631
	EqAscendNode    57.488
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.435 0.429 0.427)

	Surface
	{
		SurfStyle       0.884176
		OceanStyle      0.518447
		Randomize      (-0.039, 0.586, -0.425)
		colorDistMagn   0.340635
		colorDistFreq   0.000505574
		detailScale     26.4197
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0943062
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709968
		terraceProb     0.19557
		erosion         0
		montesMagn      0.597353
		montesFreq      3.30001
		montesSpiky     0.946736
		montesFraction  0.464543
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00170918
		hillsFraction   0.546946
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240466
		craterFreq      0.156129
		craterDensity   0.897973
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486059
		volcanoTemp     1904.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.148, 0.150, 0.171, 0.050)
		colorShelf     (0.174, 0.176, 0.196, 0.040)
		colorBeach     (0.200, 0.202, 0.222, 0.030)
		colorDesert    (0.226, 0.227, 0.252, 0.020)
		colorLowland   (0.252, 0.253, 0.277, 0.030)
		colorUpland    (0.279, 0.279, 0.303, 0.050)
		colorRock      (0.305, 0.305, 0.337, 0.020)
		colorSnow      (0.305, 0.305, 0.337, 1.000)
		BumpHeight      0.870766
		BumpOffset      0.174153
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0412708
		Period          0.0128874
		Eccentricity    0.117423
		Inclination     3.08631
		AscendingNode   57.488
		ArgOfPericenter 56.1723
		MeanAnomaly     5.95779
	}
}

Asteroid	"S80"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.1084e-009
	Radius          12.3605
	InertiaMoment   0.399624

	RotationPeriod  288.438
	Obliquity       -0.549638
	EqAscendNode    -67.8963
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.428 0.422 0.416)

	Surface
	{
		SurfStyle       0.27499
		OceanStyle      0.698125
		Randomize      (-0.470, 0.397, 0.742)
		colorDistMagn   0.023084
		colorDistFreq   0.0446774
		detailScale     337.523
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0159155
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.760041
		terraceProb     0.216323
		erosion         0
		montesMagn      0.613081
		montesFreq      3.28563
		montesSpiky     0.87762
		montesFraction  0.536208
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.462713
		hillsFraction   0.564172
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222104
		craterFreq      0.215348
		craterDensity   1.00528
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51542
		volcanoTemp     1369.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.169, 0.166, 0.000)
		colorShelf     (0.182, 0.179, 0.177, 0.000)
		colorBeach     (0.192, 0.190, 0.187, 0.000)
		colorDesert    (0.203, 0.200, 0.197, 0.000)
		colorLowland   (0.214, 0.211, 0.208, 0.000)
		colorUpland    (0.224, 0.221, 0.218, 0.000)
		colorRock      (0.235, 0.232, 0.229, 0.000)
		colorSnow      (0.246, 0.243, 0.239, 1.000)
		BumpHeight      11.1244
		BumpOffset      2.22489
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0418549
		Period          0.013162
		Eccentricity    0.13392
		Inclination     -0.549638
		AscendingNode   -67.8963
		ArgOfPericenter -116.352
		MeanAnomaly     76.7526
	}
}

Asteroid	"S81"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.57852e-017
	Radius          0.0253571
	InertiaMoment   0.397479

	Obliquity       0.00731884
	EqAscendNode    175.219
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.656 0.621 0.571)

	Surface
	{
		SurfStyle       0.75087
		OceanStyle      0.78156
		Randomize      (-0.009, 0.780, 0.667)
		colorDistMagn   0.27646
		colorDistFreq   3.01175e-007
		detailScale     0.692417
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631749
		terraceProb     0.480265
		erosion         0
		montesMagn      0.32574
		montesFreq      2.89857
		montesSpiky     0.980719
		montesFraction  0.485598
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.9645e-007
		hillsFraction   0.808608
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243407
		craterFreq      0.195728
		craterDensity   0.844693
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.39733
		volcanoTemp     1625.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.211, 0.160, 0.000)
		colorShelf     (0.262, 0.217, 0.183, 0.000)
		colorBeach     (0.308, 0.255, 0.217, 0.000)
		colorDesert    (0.335, 0.273, 0.211, 0.000)
		colorLowland   (0.367, 0.292, 0.240, 0.000)
		colorUpland    (0.407, 0.354, 0.291, 0.000)
		colorRock      (0.440, 0.385, 0.314, 0.000)
		colorSnow      (0.479, 0.410, 0.331, 1.000)
		BumpHeight      0.0228214
		BumpOffset      0.00456427
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0559293
		Period          0.0203311
		Eccentricity    0.11487
		Inclination     0.00731884
		AscendingNode   175.219
		ArgOfPericenter -126.802
		MeanAnomaly     -138.595
	}
}

Asteroid	"S82"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.26598e-014
	Radius          0.22565
	InertiaMoment   0.398847

	Obliquity       -0.750107
	EqAscendNode    -5.71302
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.790 0.788)

	Surface
	{
		SurfStyle       0.238999
		OceanStyle      0.024539
		Randomize      (0.028, 0.615, 0.143)
		colorDistMagn   0.339902
		colorDistFreq   3.9026e-005
		detailScale     6.16176
		colorConversion true
		snowLevel       2
		tropicLatitude  0.026147
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500977
		terraceProb     0.136274
		erosion         0
		montesMagn      0.462145
		montesFreq      2.89512
		montesSpiky     0.985004
		montesFraction  0.517649
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000149311
		hillsFraction   0.603497
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237942
		craterFreq      0.264344
		craterDensity   0.873453
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.588118
		volcanoTemp     1454.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.316, 0.315, 0.000)
		colorShelf     (0.336, 0.336, 0.335, 0.000)
		colorBeach     (0.356, 0.355, 0.354, 0.000)
		colorDesert    (0.376, 0.375, 0.374, 0.000)
		colorLowland   (0.396, 0.395, 0.394, 0.000)
		colorUpland    (0.415, 0.415, 0.414, 0.000)
		colorRock      (0.435, 0.434, 0.433, 0.000)
		colorSnow      (0.455, 0.454, 0.453, 1.000)
		BumpHeight      0.203085
		BumpOffset      0.0406171
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0399605
		Period          0.0122785
		Eccentricity    0.0928597
		Inclination     -0.750107
		AscendingNode   -5.71302
		ArgOfPericenter 22.1561
		MeanAnomaly     -72.9778
	}
}

Asteroid	"S83"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.74917e-011
	Radius          2.8829
	InertiaMoment   0.399802

	Obliquity       -2.75968
	EqAscendNode    -138.706
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.778 0.776 0.774)

	Surface
	{
		SurfStyle       0.488749
		OceanStyle      0.41966
		Randomize      (-0.811, -0.392, 0.856)
		colorDistMagn   0.307753
		colorDistFreq   0.00340905
		detailScale     78.7224
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0339491
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541525
		terraceProb     0.212081
		erosion         0
		montesMagn      0.619475
		montesFreq      3.76645
		montesSpiky     0.952942
		montesFraction  0.461424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0176311
		hillsFraction   0.662239
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227411
		craterFreq      0.227077
		craterDensity   0.92869
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535711
		volcanoTemp     1627.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.310, 0.310, 0.000)
		colorShelf     (0.331, 0.330, 0.329, 0.000)
		colorBeach     (0.350, 0.349, 0.349, 0.000)
		colorDesert    (0.370, 0.368, 0.368, 0.000)
		colorLowland   (0.389, 0.388, 0.387, 0.000)
		colorUpland    (0.409, 0.407, 0.407, 0.000)
		colorRock      (0.428, 0.427, 0.426, 0.000)
		colorSnow      (0.448, 0.446, 0.445, 1.000)
		BumpHeight      2.59461
		BumpOffset      0.518922
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0379403
		Period          0.0113593
		Eccentricity    0.0445584
		Inclination     -2.75968
		AscendingNode   -138.706
		ArgOfPericenter -108.694
		MeanAnomaly     27.8338
	}
}

Asteroid	"S84"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.14033e-007
	Radius          37.3081
	InertiaMoment   0.397829

	RotationPeriod  252.408
	Obliquity       0.0221346
	EqAscendNode    -10.1432
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.425 0.422 0.419)

	Surface
	{
		SurfStyle       0.162811
		OceanStyle      0.552962
		Randomize      (0.613, -0.515, 0.614)
		colorDistMagn   0.846464
		colorDistFreq   0.617334
		detailScale     1018.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00077204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592822
		terraceProb     0.280957
		erosion         0
		montesMagn      0.593947
		montesFreq      2.92497
		montesSpiky     0.938594
		montesFraction  0.35162
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.27071
		hillsFraction   0.611335
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242504
		craterFreq      0.242252
		craterDensity   0.841099
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.617358
		volcanoTemp     1299.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.169, 0.167, 0.000)
		colorShelf     (0.181, 0.179, 0.178, 0.000)
		colorBeach     (0.191, 0.190, 0.188, 0.000)
		colorDesert    (0.202, 0.200, 0.199, 0.000)
		colorLowland   (0.213, 0.211, 0.209, 0.000)
		colorUpland    (0.223, 0.221, 0.220, 0.000)
		colorRock      (0.234, 0.232, 0.230, 0.000)
		colorSnow      (0.244, 0.242, 0.241, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0444345
		Period          0.0143973
		Eccentricity    0.103608
		Inclination     0.0221346
		AscendingNode   -10.1432
		ArgOfPericenter 134.468
		MeanAnomaly     -81.0157
	}
}

Asteroid	"S85"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.68046e-016
	Radius          0.0526274
	InertiaMoment   0.399049

	RotationPeriod  366.335
	Obliquity       2.93686
	EqAscendNode    122.172
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.626 0.623)

	Surface
	{
		SurfStyle       0.820904
		OceanStyle      0.936436
		Randomize      (0.650, -0.451, -0.985)
		colorDistMagn   0.804031
		colorDistFreq   1.0746e-006
		detailScale     1.43708
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0495291
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.395168
		terraceProb     0.103584
		erosion         0
		montesMagn      0.552791
		montesFreq      2.71671
		montesSpiky     0.966573
		montesFraction  0.609534
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.19383e-006
		hillsFraction   0.662524
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253003
		craterFreq      0.185639
		craterDensity   0.891259
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520107
		volcanoTemp     1514.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.213, 0.174, 0.000)
		colorShelf     (0.252, 0.219, 0.199, 0.000)
		colorBeach     (0.296, 0.257, 0.237, 0.000)
		colorDesert    (0.321, 0.275, 0.231, 0.000)
		colorLowland   (0.353, 0.294, 0.262, 0.000)
		colorUpland    (0.390, 0.357, 0.318, 0.000)
		colorRock      (0.422, 0.388, 0.343, 0.000)
		colorSnow      (0.460, 0.413, 0.361, 1.000)
		BumpHeight      0.0473647
		BumpOffset      0.00947293
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0490867
		Period          0.0167165
		Eccentricity    0.130983
		Inclination     2.93686
		AscendingNode   122.172
		ArgOfPericenter 17.4387
		MeanAnomaly     155.975
	}
}

Asteroid	"S86"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            9.83066e-013
	Radius          0.672371
	InertiaMoment   0.399978

	RotationPeriod  387.075
	Obliquity       -3.73962
	EqAscendNode    -1.40588
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.424 0.420 0.418)

	Surface
	{
		SurfStyle       0.560672
		OceanStyle      0.221824
		Randomize      (0.562, -0.042, -0.447)
		colorDistMagn   0.695307
		colorDistFreq   0.000278943
		detailScale     18.3602
		colorConversion true
		snowLevel       2
		tropicLatitude  0.130157
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400701
		terraceProb     0.146954
		erosion         0
		montesMagn      0.525524
		montesFreq      3.17583
		montesSpiky     0.995345
		montesFraction  0.260103
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00123947
		hillsFraction   0.600253
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.287255
		craterFreq      0.232764
		craterDensity   0.976881
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480658
		volcanoTemp     1565.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.143, 0.117, 0.000)
		colorShelf     (0.170, 0.147, 0.134, 0.000)
		colorBeach     (0.199, 0.172, 0.159, 0.000)
		colorDesert    (0.216, 0.185, 0.155, 0.000)
		colorLowland   (0.238, 0.198, 0.176, 0.000)
		colorUpland    (0.263, 0.240, 0.213, 0.000)
		colorRock      (0.284, 0.261, 0.230, 0.000)
		colorSnow      (0.310, 0.277, 0.242, 1.000)
		BumpHeight      0.605134
		BumpOffset      0.121027
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0509223
		Period          0.0176629
		Eccentricity    0.106378
		Inclination     -3.73962
		AscendingNode   -1.40588
		ArgOfPericenter 33.1002
		MeanAnomaly     -96.7158
	}
}

Asteroid	"S87"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.44663e-009
	Radius          8.70238
	InertiaMoment   0.398123

	RotationPeriod  801.296
	Obliquity       -1.52584
	EqAscendNode    -55.5656
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.569 0.561 0.556)

	Surface
	{
		SurfStyle       0.631548
		OceanStyle      0.778176
		Randomize      (0.043, 0.099, -0.004)
		colorDistMagn   0.417905
		colorDistFreq   0.044979
		detailScale     237.633
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0471029
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62119
		terraceProb     0.329358
		erosion         0
		montesMagn      0.618798
		montesFreq      2.68231
		montesSpiky     0.980216
		montesFraction  0.838551
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.264058
		hillsFraction   0.706123
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250333
		craterFreq      0.242343
		craterDensity   0.783841
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461024
		volcanoTemp     1603.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.191, 0.156, 0.000)
		colorShelf     (0.227, 0.196, 0.178, 0.000)
		colorBeach     (0.267, 0.230, 0.211, 0.000)
		colorDesert    (0.290, 0.247, 0.206, 0.000)
		colorLowland   (0.318, 0.264, 0.234, 0.000)
		colorUpland    (0.353, 0.320, 0.284, 0.000)
		colorRock      (0.381, 0.348, 0.306, 0.000)
		colorSnow      (0.415, 0.370, 0.323, 1.000)
		BumpHeight      7.83214
		BumpOffset      1.56643
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0461424
		Period          0.0152353
		Eccentricity    0.167963
		Inclination     -1.52584
		AscendingNode   -55.5656
		ArgOfPericenter 61.4717
		MeanAnomaly     -40.2508
	}
}

Asteroid	"S88"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            8.47491e-018
	Radius          0.0122741
	InertiaMoment   0.399242

	Obliquity       1.66894
	EqAscendNode    122.652
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.532 0.525 0.520)

	Surface
	{
		SurfStyle       0.130865
		OceanStyle      0.726154
		Randomize      (0.114, 0.135, -0.224)
		colorDistMagn   0.60638
		colorDistFreq   5.55873e-008
		detailScale     0.335163
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0279468
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347557
		terraceProb     0.292717
		erosion         0
		montesMagn      0.592594
		montesFreq      4.10161
		montesSpiky     0.950545
		montesFraction  0.390361
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.5052e-007
		hillsFraction   0.744194
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266007
		craterFreq      0.158432
		craterDensity   0.844912
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505435
		volcanoTemp     1323.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.210, 0.208, 0.000)
		colorShelf     (0.226, 0.223, 0.221, 0.000)
		colorBeach     (0.239, 0.236, 0.234, 0.000)
		colorDesert    (0.252, 0.249, 0.247, 0.000)
		colorLowland   (0.266, 0.263, 0.260, 0.000)
		colorUpland    (0.279, 0.276, 0.273, 0.000)
		colorRock      (0.292, 0.289, 0.286, 0.000)
		colorSnow      (0.306, 0.302, 0.299, 1.000)
		BumpHeight      0.0110466
		BumpOffset      0.00220933
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0487658
		Period          0.0165529
		Eccentricity    0.0527758
		Inclination     1.66894
		AscendingNode   122.652
		ArgOfPericenter 170.472
		MeanAnomaly     -89.5059
	}
}

Asteroid	"S89"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.24713e-014
	Radius          0.156814
	InertiaMoment   0.39626

	Obliquity       3.69008
	EqAscendNode    45.4655
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.642 0.639 0.638)

	Surface
	{
		SurfStyle       0.288246
		OceanStyle      0.201469
		Randomize      (-0.164, -0.763, -0.049)
		colorDistMagn   0.895031
		colorDistFreq   8.2185e-006
		detailScale     4.28208
		colorConversion true
		snowLevel       2
		tropicLatitude  0.11851
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531665
		terraceProb     0.101668
		erosion         0
		montesMagn      0.281314
		montesFreq      3.14896
		montesSpiky     0.969121
		montesFraction  0.39941
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.79841e-005
		hillsFraction   0.674761
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233842
		craterFreq      0.254049
		craterDensity   0.792601
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537679
		volcanoTemp     1282.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.256, 0.255, 0.000)
		colorShelf     (0.273, 0.272, 0.271, 0.000)
		colorBeach     (0.289, 0.288, 0.287, 0.000)
		colorDesert    (0.305, 0.304, 0.303, 0.000)
		colorLowland   (0.321, 0.320, 0.319, 0.000)
		colorUpland    (0.337, 0.336, 0.335, 0.000)
		colorRock      (0.353, 0.352, 0.351, 0.000)
		colorSnow      (0.369, 0.368, 0.367, 1.000)
		BumpHeight      0.141133
		BumpOffset      0.0282266
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0512938
		Period          0.0178565
		Eccentricity    0.0979658
		Inclination     3.69008
		AscendingNode   45.4655
		ArgOfPericenter 31.4076
		MeanAnomaly     -26.6708
	}
}

Asteroid	"S90"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.83522e-011
	Radius          2.02967
	InertiaMoment   0.398381

	RotationPeriod  488.319
	Obliquity       -2.54225
	EqAscendNode    39.9
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.608 0.505)

	Surface
	{
		SurfStyle       0.514575
		OceanStyle      0.0498428
		Randomize      (0.307, -0.744, 0.030)
		colorDistMagn   0.293847
		colorDistFreq   0.00212587
		detailScale     55.4234
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0833157
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435526
		terraceProb     0.213541
		erosion         0
		montesMagn      0.425094
		montesFreq      2.74677
		montesSpiky     0.837674
		montesFraction  0.575484
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0107526
		hillsFraction   0.542027
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23437
		craterFreq      0.200366
		craterDensity   0.867992
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481743
		volcanoTemp     1466.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.207, 0.141, 0.000)
		colorShelf     (0.272, 0.213, 0.162, 0.000)
		colorBeach     (0.319, 0.249, 0.192, 0.000)
		colorDesert    (0.347, 0.268, 0.187, 0.000)
		colorLowland   (0.380, 0.286, 0.212, 0.000)
		colorUpland    (0.421, 0.347, 0.257, 0.000)
		colorRock      (0.455, 0.377, 0.278, 0.000)
		colorSnow      (0.496, 0.402, 0.293, 1.000)
		BumpHeight      1.8267
		BumpOffset      0.36534
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0434611
		Period          0.0139268
		Eccentricity    0.112989
		Inclination     -2.54225
		AscendingNode   39.9
		ArgOfPericenter 93.6695
		MeanAnomaly     81.1159
	}
}

Asteroid	"S91"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.70061e-008
	Radius          18.0602
	InertiaMoment   0.399428

	RotationPeriod  527.972
	Obliquity       -2.64999
	EqAscendNode    91.6731
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.784 0.784 0.782)

	Surface
	{
		SurfStyle       0.831709
		OceanStyle      0.380222
		Randomize      (-0.667, -0.257, 0.670)
		colorDistMagn   0.192054
		colorDistFreq   0.213316
		detailScale     493.165
		colorConversion true
		snowLevel       2
		tropicLatitude  0.064391
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63019
		terraceProb     0.299552
		erosion         0
		montesMagn      0.489329
		montesFreq      2.26135
		montesSpiky     0.905555
		montesFraction  0.596076
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.623275
		hillsFraction   0.468069
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26502
		craterFreq      0.238229
		craterDensity   0.756072
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429038
		volcanoTemp     1248.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.266, 0.219, 0.000)
		colorShelf     (0.314, 0.274, 0.250, 0.000)
		colorBeach     (0.369, 0.321, 0.297, 0.000)
		colorDesert    (0.400, 0.345, 0.289, 0.000)
		colorLowland   (0.439, 0.368, 0.328, 0.000)
		colorUpland    (0.486, 0.447, 0.399, 0.000)
		colorRock      (0.526, 0.486, 0.430, 0.000)
		colorSnow      (0.573, 0.517, 0.454, 1.000)
		BumpHeight      16.2542
		BumpOffset      3.25084
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0394547
		Period          0.0120462
		Eccentricity    0.0812314
		Inclination     -2.65
		AscendingNode   91.6731
		ArgOfPericenter 116.674
		MeanAnomaly     -16.6225
	}
}

Asteroid	"S92"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.58212e-016
	Radius          0.0365731
	InertiaMoment   0.396986

	Obliquity       3.74704
	EqAscendNode    69.0076
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.625 0.621 0.615)

	Surface
	{
		SurfStyle       0.952783
		OceanStyle      0.914434
		Randomize      (0.642, -0.980, 0.773)
		colorDistMagn   0.959498
		colorDistFreq   3.35129e-007
		detailScale     0.998689
		colorConversion true
		snowLevel       2
		tropicLatitude  0.107554
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.34826
		terraceProb     0.280169
		erosion         0
		montesMagn      0.451477
		montesFreq      1.89003
		montesSpiky     0.985459
		montesFraction  0.495132
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.53438e-006
		hillsFraction   0.737918
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248399
		craterFreq      0.178433
		craterDensity   0.8762
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515675
		volcanoTemp     1695.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.217, 0.246, 0.050)
		colorShelf     (0.250, 0.255, 0.283, 0.040)
		colorBeach     (0.288, 0.292, 0.320, 0.030)
		colorDesert    (0.325, 0.329, 0.363, 0.020)
		colorLowland   (0.363, 0.366, 0.400, 0.030)
		colorUpland    (0.400, 0.404, 0.437, 0.050)
		colorRock      (0.438, 0.441, 0.486, 0.020)
		colorSnow      (0.438, 0.441, 0.486, 1.000)
		BumpHeight      0.0329158
		BumpOffset      0.00658316
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0449592
		Period          0.0146531
		Eccentricity    0.0619441
		Inclination     3.74704
		AscendingNode   69.0076
		ArgOfPericenter 131.962
		MeanAnomaly     101.974
	}
}

Asteroid	"S93"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.32817e-013
	Radius          0.473372
	InertiaMoment   0.398615

	Obliquity       2.726
	EqAscendNode    -162.798
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.545 0.541 0.537)

	Surface
	{
		SurfStyle       0.410733
		OceanStyle      0.597857
		Randomize      (0.258, -0.919, -0.812)
		colorDistMagn   0.787159
		colorDistFreq   0.000145363
		detailScale     12.9262
		colorConversion true
		snowLevel       2
		tropicLatitude  0.014227
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.299398
		terraceProb     0.559265
		erosion         0
		montesMagn      0.543196
		montesFreq      2.38875
		montesSpiky     0.967753
		montesFraction  0.621903
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000431246
		hillsFraction   0.761003
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226345
		craterFreq      0.238421
		craterDensity   0.837569
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484283
		volcanoTemp     1406.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.216, 0.215, 0.000)
		colorShelf     (0.232, 0.230, 0.228, 0.000)
		colorBeach     (0.245, 0.243, 0.242, 0.000)
		colorDesert    (0.259, 0.257, 0.255, 0.000)
		colorLowland   (0.273, 0.270, 0.268, 0.000)
		colorUpland    (0.286, 0.284, 0.282, 0.000)
		colorRock      (0.300, 0.297, 0.295, 0.000)
		colorSnow      (0.314, 0.311, 0.309, 1.000)
		BumpHeight      0.426035
		BumpOffset      0.0852069
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0416391
		Period          0.0130603
		Eccentricity    0.0759188
		Inclination     2.726
		AscendingNode   -162.798
		ArgOfPericenter 123.405
		MeanAnomaly     -168.833
	}
}

Asteroid	"S94"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.42602e-010
	Radius          4.21243
	InertiaMoment   0.39961

	Obliquity       -7.02007
	EqAscendNode    -14.6003
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.659 0.655 0.652)

	Surface
	{
		SurfStyle       0.753416
		OceanStyle      0.190934
		Randomize      (0.400, 0.791, 0.124)
		colorDistMagn   0.577414
		colorDistFreq   0.00505082
		detailScale     115.027
		colorConversion true
		snowLevel       2
		tropicLatitude  0.240665
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378465
		terraceProb     0.422333
		erosion         0
		montesMagn      0.477019
		montesFreq      2.67314
		montesSpiky     0.948016
		montesFraction  0.121042
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0408021
		hillsFraction   0.591058
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246418
		craterFreq      0.171555
		craterDensity   0.820089
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507946
		volcanoTemp     1741.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.223, 0.182, 0.000)
		colorShelf     (0.264, 0.229, 0.209, 0.000)
		colorBeach     (0.310, 0.268, 0.248, 0.000)
		colorDesert    (0.336, 0.288, 0.241, 0.000)
		colorLowland   (0.369, 0.308, 0.274, 0.000)
		colorUpland    (0.409, 0.373, 0.332, 0.000)
		colorRock      (0.442, 0.406, 0.358, 0.000)
		colorSnow      (0.481, 0.432, 0.378, 1.000)
		BumpHeight      3.79119
		BumpOffset      0.758237
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0476653
		Period          0.0159957
		Eccentricity    0.0255951
		Inclination     -7.02007
		AscendingNode   -14.6003
		ArgOfPericenter -87.0372
		MeanAnomaly     -129.974
	}
}

Asteroid	"S95"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.04158e-007
	Radius          47.9002
	InertiaMoment   0.397448

	Obliquity       -4.64788
	EqAscendNode    -11.0352
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.779 0.777 0.776)

	Surface
	{
		SurfStyle       0.497043
		OceanStyle      0.914419
		Randomize      (-0.994, -0.827, 0.863)
		colorDistMagn   0.597657
		colorDistFreq   0.599347
		detailScale     1308
		colorConversion true
		snowLevel       2
		tropicLatitude  0.160787
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522372
		terraceProb     0.252106
		erosion         0
		montesMagn      0.481243
		montesFreq      3.49493
		montesSpiky     0.949341
		montesFraction  0.544407
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.95687
		hillsFraction   0.784593
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248736
		craterFreq      0.21198
		craterDensity   0.743428
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504716
		volcanoTemp     1274.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.311, 0.310, 0.000)
		colorShelf     (0.331, 0.330, 0.330, 0.000)
		colorBeach     (0.351, 0.350, 0.349, 0.000)
		colorDesert    (0.370, 0.369, 0.368, 0.000)
		colorLowland   (0.390, 0.388, 0.388, 0.000)
		colorUpland    (0.409, 0.408, 0.407, 0.000)
		colorRock      (0.429, 0.427, 0.427, 0.000)
		colorSnow      (0.448, 0.447, 0.446, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0503338
		Period          0.0173576
		Eccentricity    0.0800584
		Inclination     -4.64788
		AscendingNode   -11.0352
		ArgOfPericenter -162.65
		MeanAnomaly     -24.3998
	}
}

Asteroid	"S96"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.95354e-015
	Radius          0.0970204
	InertiaMoment   0.398831

	Obliquity       -7.24716
	EqAscendNode    -177.934
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.532 0.524 0.521)

	Surface
	{
		SurfStyle       0.431178
		OceanStyle      0.173702
		Randomize      (0.607, -0.448, -0.699)
		colorDistMagn   0.934745
		colorDistFreq   2.86457e-006
		detailScale     2.6493
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00454127
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.731509
		terraceProb     0.624969
		erosion         0
		montesMagn      0.45308
		montesFreq      4.149
		montesSpiky     0.946831
		montesFraction  0.338502
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.34005e-005
		hillsFraction   0.535401
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243247
		craterFreq      0.278639
		craterDensity   1.01952
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.382214
		volcanoTemp     1273.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.209, 0.208, 0.000)
		colorShelf     (0.226, 0.223, 0.221, 0.000)
		colorBeach     (0.239, 0.236, 0.234, 0.000)
		colorDesert    (0.253, 0.249, 0.247, 0.000)
		colorLowland   (0.266, 0.262, 0.260, 0.000)
		colorUpland    (0.279, 0.275, 0.273, 0.000)
		colorRock      (0.292, 0.288, 0.286, 0.000)
		colorSnow      (0.306, 0.301, 0.300, 1.000)
		BumpHeight      0.0873183
		BumpOffset      0.0174637
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0455369
		Period          0.0149364
		Eccentricity    0.137129
		Inclination     -7.24715
		AscendingNode   -177.934
		ArgOfPericenter -104.748
		MeanAnomaly     71.698
	}
}

Asteroid	"S97"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.34629e-012
	Radius          1.25575
	InertiaMoment   0.399788

	RotationPeriod  537.412
	Obliquity       -6.70276
	EqAscendNode    -138.66
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.710 0.709 0.707)

	Surface
	{
		SurfStyle       0.548655
		OceanStyle      0.937653
		Randomize      (-0.678, 0.856, 0.856)
		colorDistMagn   0.294936
		colorDistFreq   0.000610694
		detailScale     34.2903
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0823289
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419586
		terraceProb     0.4071
		erosion         0
		montesMagn      0.389315
		montesFreq      2.98723
		montesSpiky     0.891784
		montesFraction  0.654452
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00393095
		hillsFraction   0.652633
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22202
		craterFreq      0.276732
		craterDensity   0.987674
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470708
		volcanoTemp     1666.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.241, 0.198, 0.000)
		colorShelf     (0.284, 0.248, 0.226, 0.000)
		colorBeach     (0.334, 0.291, 0.269, 0.000)
		colorDesert    (0.362, 0.312, 0.262, 0.000)
		colorLowland   (0.398, 0.333, 0.297, 0.000)
		colorUpland    (0.440, 0.404, 0.360, 0.000)
		colorRock      (0.476, 0.439, 0.389, 0.000)
		colorSnow      (0.518, 0.468, 0.410, 1.000)
		BumpHeight      1.13017
		BumpOffset      0.226035
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0399237
		Period          0.0122616
		Eccentricity    0.0920234
		Inclination     -6.70276
		AscendingNode   -138.66
		ArgOfPericenter 45.2435
		MeanAnomaly     1.62163
	}
}

Asteroid	"S98"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.39581e-009
	Radius          11.1742
	InertiaMoment   0.397804

	RotationPeriod  784.658
	Obliquity       -6.79647
	EqAscendNode    42.5527
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.633 0.630 0.628)

	Surface
	{
		SurfStyle       0.278005
		OceanStyle      0.757066
		Randomize      (0.152, 0.963, -0.355)
		colorDistMagn   0.729793
		colorDistFreq   0.10364
		detailScale     305.131
		colorConversion true
		snowLevel       2
		tropicLatitude  0.219208
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494776
		terraceProb     0.144163
		erosion         0
		montesMagn      0.47634
		montesFreq      2.95093
		montesSpiky     0.883799
		montesFraction  0.513301
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.323545
		hillsFraction   0.529181
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249104
		craterFreq      0.262119
		craterDensity   1.08692
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463533
		volcanoTemp     1420.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.252, 0.251, 0.000)
		colorShelf     (0.269, 0.268, 0.267, 0.000)
		colorBeach     (0.285, 0.284, 0.283, 0.000)
		colorDesert    (0.301, 0.299, 0.298, 0.000)
		colorLowland   (0.317, 0.315, 0.314, 0.000)
		colorUpland    (0.333, 0.331, 0.330, 0.000)
		colorRock      (0.348, 0.347, 0.345, 0.000)
		colorSnow      (0.364, 0.362, 0.361, 1.000)
		BumpHeight      10.0568
		BumpOffset      2.01136
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0455014
		Period          0.0149189
		Eccentricity    0.0947426
		Inclination     -6.79647
		AscendingNode   42.5527
		ArgOfPericenter -10.64
		MeanAnomaly     -106.153
	}
}

Asteroid	"S99"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.7469e-017
	Radius          0.0226276
	InertiaMoment   0.399034

	Obliquity       -3.58213
	EqAscendNode    -51.3817
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.735 0.731 0.728)

	Surface
	{
		SurfStyle       0.463159
		OceanStyle      0.574136
		Randomize      (-0.564, -0.839, 0.034)
		colorDistMagn   0.64269
		colorDistFreq   3.39584e-007
		detailScale     0.617885
		colorConversion true
		snowLevel       2
		tropicLatitude  0.112427
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.6937
		terraceProb     0.64674
		erosion         0
		montesMagn      0.419232
		montesFreq      3.01922
		montesSpiky     0.902181
		montesFraction  0.477289
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.06469e-006
		hillsFraction   0.94922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232329
		craterFreq      0.21719
		craterDensity   0.908902
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520995
		volcanoTemp     1410.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.292, 0.291, 0.000)
		colorShelf     (0.312, 0.311, 0.310, 0.000)
		colorBeach     (0.331, 0.329, 0.328, 0.000)
		colorDesert    (0.349, 0.347, 0.346, 0.000)
		colorLowland   (0.367, 0.365, 0.364, 0.000)
		colorUpland    (0.386, 0.384, 0.382, 0.000)
		colorRock      (0.404, 0.402, 0.401, 0.000)
		colorSnow      (0.423, 0.420, 0.419, 1.000)
		BumpHeight      0.0203649
		BumpOffset      0.00407297
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0385311
		Period          0.0116257
		Eccentricity    0.0261146
		Inclination     -3.58213
		AscendingNode   -51.3817
		ArgOfPericenter -63.4028
		MeanAnomaly     -168.342
	}
}

Asteroid	"S100"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.51376e-014
	Radius          0.292874
	InertiaMoment   0.399964

	RotationPeriod  326.112
	Obliquity       -4.20362
	EqAscendNode    -62.2823
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.714 0.711 0.708)

	Surface
	{
		SurfStyle       0.275388
		OceanStyle      0.0484761
		Randomize      (-0.496, 0.305, -0.208)
		colorDistMagn   0.97809
		colorDistFreq   2.6499e-005
		detailScale     7.9974
		colorConversion true
		snowLevel       2
		tropicLatitude  0.125229
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589602
		terraceProb     0.299248
		erosion         0
		montesMagn      0.514678
		montesFreq      2.85166
		montesSpiky     0.964322
		montesFraction  0.463505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000117205
		hillsFraction   0.789839
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27288
		craterFreq      0.241195
		craterDensity   0.978157
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543673
		volcanoTemp     1631.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.284, 0.283, 0.000)
		colorShelf     (0.303, 0.302, 0.301, 0.000)
		colorBeach     (0.321, 0.320, 0.319, 0.000)
		colorDesert    (0.339, 0.338, 0.336, 0.000)
		colorLowland   (0.357, 0.355, 0.354, 0.000)
		colorUpland    (0.375, 0.373, 0.372, 0.000)
		colorRock      (0.393, 0.391, 0.389, 0.000)
		colorSnow      (0.411, 0.409, 0.407, 1.000)
		BumpHeight      0.263586
		BumpOffset      0.0527172
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0402256
		Period          0.0124009
		Eccentricity    0.0988388
		Inclination     -4.20362
		AscendingNode   -62.2823
		ArgOfPericenter -122.187
		MeanAnomaly     -96.0972
	}
}

Comet	"C1"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.29085e-009
	Radius          15.0854
	InertiaMoment   0.397093

	Oblateness      0.0707716

	RotationPeriod  18.8429
	Obliquity       319.141
	EqAscendNode    284.44
	Precession      0

	AbsMagn         13.3286
	SlopeParam      3.66504
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.756 0.711 0.623)

	Surface
	{
		SurfStyle       0.436785
		OceanStyle      0.703946
		Randomize      (-0.540, -0.919, -0.572)
		colorDistMagn   0.346947
		colorDistFreq   0.121955
		detailScale     411.932
		colorConversion true
		snowLevel       2
		tropicLatitude  0.721274
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552111
		terraceProb     0.381635
		erosion         0
		montesMagn      0.510702
		montesFreq      2.92626
		montesSpiky     0.92947
		montesFraction  0.600889
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.475237
		hillsFraction   0.843044
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208869
		craterFreq      0.227903
		craterDensity   0.81955
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535448
		volcanoTemp     1176.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.284, 0.249, 0.000)
		colorShelf     (0.321, 0.302, 0.265, 0.000)
		colorBeach     (0.340, 0.320, 0.280, 0.000)
		colorDesert    (0.359, 0.338, 0.296, 0.000)
		colorLowland   (0.378, 0.355, 0.312, 0.000)
		colorUpland    (0.397, 0.373, 0.327, 0.000)
		colorRock      (0.416, 0.391, 0.343, 0.000)
		colorSnow      (0.435, 0.409, 0.358, 1.000)
		BumpHeight      13.5769
		BumpOffset      2.71537
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.766221
		GasToDust   0.25
		Particles   2527
		GasBright   0.305013
		DustBright  0.417984
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.61967
		Period          38.8988
		Eccentricity    0.969663
		Inclination     11.7892
		AscendingNode   -110.917
		ArgOfPericenter 102.449
		MeanAnomaly     -14.9973
	}
}

Comet	"C2"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.97463e-017
	Radius          0.0524041
	InertiaMoment   0.399309

	Oblateness      0.130547

	RotationPeriod  16.2555
	Obliquity       272.347
	EqAscendNode    269.018
	Precession      0

	AbsMagn         8.71412
	SlopeParam      4.22897
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.580 0.575 0.572)

	Surface
	{
		SurfStyle       0.483458
		OceanStyle      0.359236
		Randomize      (0.018, 0.023, -0.381)
		colorDistMagn   0.980805
		colorDistFreq   1.21378e-006
		detailScale     1.43098
		colorConversion true
		snowLevel       2
		tropicLatitude  0.478729
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671867
		terraceProb     0.275539
		erosion         0
		montesMagn      0.578155
		montesFreq      2.43146
		montesSpiky     0.943338
		montesFraction  0.256007
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.92866e-006
		hillsFraction   0.539581
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270734
		craterFreq      0.245716
		craterDensity   0.717297
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.440442
		volcanoTemp     1006.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.230, 0.229, 0.000)
		colorShelf     (0.247, 0.244, 0.243, 0.000)
		colorBeach     (0.261, 0.259, 0.258, 0.000)
		colorDesert    (0.276, 0.273, 0.272, 0.000)
		colorLowland   (0.290, 0.287, 0.286, 0.000)
		colorUpland    (0.305, 0.302, 0.300, 0.000)
		colorRock      (0.319, 0.316, 0.315, 0.000)
		colorSnow      (0.334, 0.331, 0.329, 1.000)
		BumpHeight      0.0471637
		BumpOffset      0.00943273
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.195966
		DustBright  0.211517
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.87384
		Period          47.6903
		Eccentricity    0.983361
		Inclination     107.943
		AscendingNode   155.554
		ArgOfPericenter 127.842
		MeanAnomaly     38.6776
	}
}

Comet	"C3"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.07409e-013
	Radius          0.934421
	InertiaMoment   0.397983

	Oblateness      0.138204

	RotationPeriod  13.4927
	Obliquity       225.553
	EqAscendNode    253.595
	Precession      0

	AbsMagn         5.08526
	SlopeParam      4.81212
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.482 0.477 0.473)

	Surface
	{
		SurfStyle       0.283565
		OceanStyle      0.922544
		Randomize      (0.582, -0.894, 0.168)
		colorDistMagn   0.222589
		colorDistFreq   0.000401146
		detailScale     25.5159
		colorConversion true
		snowLevel       2
		tropicLatitude  0.843743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382666
		terraceProb     0.597961
		erosion         0
		montesMagn      0.318949
		montesFreq      2.20705
		montesSpiky     0.971871
		montesFraction  0.397075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.001442
		hillsFraction   0.791513
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238579
		craterFreq      0.268106
		craterDensity   0.926341
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489934
		volcanoTemp     1722.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.191, 0.189, 0.000)
		colorShelf     (0.205, 0.203, 0.201, 0.000)
		colorBeach     (0.217, 0.215, 0.213, 0.000)
		colorDesert    (0.229, 0.227, 0.224, 0.000)
		colorLowland   (0.241, 0.239, 0.236, 0.000)
		colorUpland    (0.253, 0.251, 0.248, 0.000)
		colorRock      (0.265, 0.262, 0.260, 0.000)
		colorSnow      (0.277, 0.274, 0.272, 1.000)
		BumpHeight      0.840979
		BumpOffset      0.168196
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.317855
		GasToDust   0.25
		Particles   1621
		GasBright   0.035646
		DustBright  0.856324
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.0003
		Period          48.6092
		Eccentricity    0.977933
		Inclination     -21.3214
		AscendingNode   -116.44
		ArgOfPericenter -44.264
		MeanAnomaly     -170.638
	}
}

Comet	"C4"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.37759e-009
	Radius          20.4642
	InertiaMoment   0.39974

	Oblateness      0.249

	RotationPeriod  10.51
	Obliquity       178.758
	EqAscendNode    238.172
	Precession      0

	AbsMagn         12.8594
	SlopeParam      5.47589
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.580 0.492 0.334)

	Surface
	{
		SurfStyle       0.648169
		OceanStyle      0.897643
		Randomize      (0.063, -0.344, 0.559)
		colorDistMagn   0.335065
		colorDistFreq   0.282733
		detailScale     558.809
		colorConversion true
		snowLevel       2
		tropicLatitude  0.614768
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534777
		terraceProb     0.274713
		erosion         0
		montesMagn      0.422766
		montesFreq      3.556
		montesSpiky     0.89126
		montesFraction  0.657244
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.906901
		hillsFraction   0.513019
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262329
		craterFreq      0.216109
		craterDensity   0.969927
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515132
		volcanoTemp     1507.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.167, 0.094, 0.000)
		colorShelf     (0.232, 0.172, 0.107, 0.000)
		colorBeach     (0.273, 0.202, 0.127, 0.000)
		colorDesert    (0.296, 0.217, 0.124, 0.000)
		colorLowland   (0.325, 0.231, 0.140, 0.000)
		colorUpland    (0.360, 0.281, 0.171, 0.000)
		colorRock      (0.389, 0.305, 0.184, 0.000)
		colorSnow      (0.424, 0.325, 0.194, 1.000)
		BumpHeight      18.4178
		BumpOffset      3.68355
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.799047
		GasToDust   0.25
		Particles   2594
		GasBright   0.0570741
		DustBright  0.519383
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.4596
		Period          51.9961
		Eccentricity    0.967696
		Inclination     37.1836
		AscendingNode   126.592
		ArgOfPericenter -79.1289
		MeanAnomaly     142.726
	}
}

Comet	"C5"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.32078e-017
	Radius          0.0578799
	InertiaMoment   0.398588

	Oblateness      0.249

	RotationPeriod  7.24492
	Obliquity       131.964
	EqAscendNode    222.75
	Precession      0

	AbsMagn         8.50303
	SlopeParam      6.3681
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.584 0.576 0.573)

	Surface
	{
		SurfStyle       0.933955
		OceanStyle      0.639062
		Randomize      (0.963, 0.863, -0.198)
		colorDistMagn   0.823817
		colorDistFreq   1.48174e-006
		detailScale     1.58051
		colorConversion true
		snowLevel       2
		tropicLatitude  0.881742
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.757921
		terraceProb     0.216294
		erosion         0
		montesMagn      0.35341
		montesFreq      2.30063
		montesSpiky     0.853836
		montesFraction  0.496845
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.25605e-006
		hillsFraction   0.888689
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262982
		craterFreq      0.156871
		craterDensity   0.765195
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482412
		volcanoTemp     1611.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.202, 0.229, 0.050)
		colorShelf     (0.234, 0.236, 0.264, 0.040)
		colorBeach     (0.269, 0.271, 0.298, 0.030)
		colorDesert    (0.304, 0.305, 0.338, 0.020)
		colorLowland   (0.339, 0.340, 0.372, 0.030)
		colorUpland    (0.374, 0.375, 0.407, 0.050)
		colorRock      (0.409, 0.409, 0.453, 0.020)
		colorSnow      (0.409, 0.409, 0.453, 1.000)
		BumpHeight      0.0520919
		BumpOffset      0.0104184
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0412431
		DustBright  0.2197
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.186
		Period          36.0005
		Eccentricity    0.969648
		Inclination     -107.581
		AscendingNode   161.886
		ArgOfPericenter 89.3777
		MeanAnomaly     128.072
	}
}

Comet	"C6"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.66208e-013
	Radius          1.2666
	InertiaMoment   0.39629

	Oblateness      0.249

	RotationPeriod  3.60481
	Obliquity       85.1696
	EqAscendNode    207.327
	Precession      0

	AbsMagn         4.80598
	SlopeParam      9.01029
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.759 0.758 0.756)

	Surface
	{
		SurfStyle       0.569659
		OceanStyle      0.412216
		Randomize      (0.246, 0.770, -0.239)
		colorDistMagn   0.913043
		colorDistFreq   0.00122462
		detailScale     34.5865
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962539
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.6543
		terraceProb     0.564151
		erosion         0
		montesMagn      0.508855
		montesFreq      2.39465
		montesSpiky     0.843204
		montesFraction  0.405399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00199178
		hillsFraction   0.542165
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258513
		craterFreq      0.260322
		craterDensity   0.870147
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462169
		volcanoTemp     1559.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.258, 0.212, 0.000)
		colorShelf     (0.304, 0.265, 0.242, 0.000)
		colorBeach     (0.357, 0.311, 0.287, 0.000)
		colorDesert    (0.387, 0.334, 0.280, 0.000)
		colorLowland   (0.425, 0.356, 0.318, 0.000)
		colorUpland    (0.471, 0.432, 0.386, 0.000)
		colorRock      (0.509, 0.470, 0.416, 0.000)
		colorSnow      (0.554, 0.501, 0.439, 1.000)
		BumpHeight      1.13994
		BumpOffset      0.227987
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.350681
		GasToDust   0.25
		Particles   1688
		GasBright   0.161832
		DustBright  0.583598
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.83837
		Period          33.7318
		Eccentricity    0.979581
		Inclination     -157.332
		AscendingNode   -24.7174
		ArgOfPericenter 15.7821
		MeanAnomaly     158.141
	}
}

Comet	"C7"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.37922e-009
	Radius          22.621
	InertiaMoment   0.399084

	Oblateness      0.00155593

	RotationPeriod  127.168
	Obliquity       38.3753
	EqAscendNode    191.905
	Precession      0

	AbsMagn         12.4489
	SlopeParam      2.74162
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.605 0.523 0.432)

	Surface
	{
		SurfStyle       0.286373
		OceanStyle      0.223487
		Randomize      (0.920, -0.393, 0.863)
		colorDistMagn   0.845853
		colorDistFreq   0.331331
		detailScale     617.704
		colorConversion true
		snowLevel       2
		tropicLatitude  0.734983
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441778
		terraceProb     0.29105
		erosion         0
		montesMagn      0.304138
		montesFreq      2.49067
		montesSpiky     0.844161
		montesFraction  0.843529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.50714
		hillsFraction   0.669745
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264328
		craterFreq      0.224474
		craterDensity   0.912336
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.410659
		volcanoTemp     1156.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.209, 0.173, 0.000)
		colorShelf     (0.257, 0.222, 0.183, 0.000)
		colorBeach     (0.272, 0.235, 0.194, 0.000)
		colorDesert    (0.287, 0.249, 0.205, 0.000)
		colorLowland   (0.303, 0.262, 0.216, 0.000)
		colorUpland    (0.318, 0.275, 0.227, 0.000)
		colorRock      (0.333, 0.288, 0.237, 0.000)
		colorSnow      (0.348, 0.301, 0.248, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.831873
		GasToDust   0.25
		Particles   2660
		GasBright   0.118719
		DustBright  0.311198
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.86411
		Period          40.5652
		Eccentricity    0.990251
		Inclination     16.7795
		AscendingNode   66.1396
		ArgOfPericenter -159.482
		MeanAnomaly     -24.4795
	}
}

Comet	"C8"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.34839e-016
	Radius          0.0783963
	InertiaMoment   0.397603

	Oblateness      0.00261626

	RotationPeriod  113.708
	Obliquity       351.581
	EqAscendNode    176.482
	Precession      0

	AbsMagn         8.29334
	SlopeParam      3.37162
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.799 0.796 0.795)

	Surface
	{
		SurfStyle       0.0844603
		OceanStyle      0.557111
		Randomize      (-0.955, -0.237, -0.461)
		colorDistMagn   0.0898956
		colorDistFreq   4.59516e-006
		detailScale     2.14074
		colorConversion true
		snowLevel       2
		tropicLatitude  0.386884
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429577
		terraceProb     0.376795
		erosion         0
		montesMagn      0.444738
		montesFreq      3.25622
		montesSpiky     0.870063
		montesFraction  0.332217
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.7256e-005
		hillsFraction   0.586151
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278701
		craterFreq      0.20161
		craterDensity   0.89792
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525404
		volcanoTemp     1488.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.318, 0.318, 0.000)
		colorShelf     (0.340, 0.338, 0.338, 0.000)
		colorBeach     (0.359, 0.358, 0.358, 0.000)
		colorDesert    (0.379, 0.378, 0.377, 0.000)
		colorLowland   (0.399, 0.398, 0.397, 0.000)
		colorUpland    (0.419, 0.418, 0.417, 0.000)
		colorRock      (0.439, 0.438, 0.437, 0.000)
		colorSnow      (0.459, 0.458, 0.457, 1.000)
		BumpHeight      0.0705567
		BumpOffset      0.0141113
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.306498
		DustBright  0.607905
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.41419
		Period          31.031
		Eccentricity    0.958843
		Inclination     -18.7717
		AscendingNode   -72.1053
		ArgOfPericenter -168.928
		MeanAnomaly     -173.718
	}
}

Comet	"C9"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.04289e-012
	Radius          1.40118
	InertiaMoment   0.39953

	Oblateness      0.00224489

	RotationPeriod  105.85
	Obliquity       304.787
	EqAscendNode    161.059
	Precession      0

	AbsMagn         4.51019
	SlopeParam      3.94367
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.732 0.685 0.614)

	Surface
	{
		SurfStyle       0.890791
		OceanStyle      0.368892
		Randomize      (-0.509, -0.614, -0.060)
		colorDistMagn   0.63006
		colorDistFreq   0.00112714
		detailScale     38.2617
		colorConversion true
		snowLevel       2
		tropicLatitude  0.922212
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539706
		terraceProb     0.345838
		erosion         0
		montesMagn      0.519174
		montesFreq      2.20047
		montesSpiky     0.948713
		montesFraction  0.39533
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0038911
		hillsFraction   0.556588
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221139
		craterFreq      0.183361
		craterDensity   0.905336
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534471
		volcanoTemp     1694.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.240, 0.246, 0.050)
		colorShelf     (0.293, 0.281, 0.283, 0.040)
		colorBeach     (0.337, 0.322, 0.319, 0.030)
		colorDesert    (0.380, 0.363, 0.362, 0.020)
		colorLowland   (0.424, 0.404, 0.399, 0.030)
		colorUpland    (0.468, 0.445, 0.436, 0.050)
		colorRock      (0.512, 0.486, 0.485, 0.020)
		colorSnow      (0.512, 0.486, 0.485, 1.000)
		BumpHeight      1.26107
		BumpOffset      0.252213
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.383507
		GasToDust   0.25
		Particles   1754
		GasBright   0.236103
		DustBright  0.362787
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.95139
		Period          28.1714
		Eccentricity    0.953805
		Inclination     -78.8734
		AscendingNode   -110.073
		ArgOfPericenter -120.114
		MeanAnomaly     131.466
	}
}

Comet	"C10"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            8.06597e-009
	Radius          30.6173
	InertiaMoment   0.398308

	Oblateness      0.00337351

	RotationPeriod  100.058
	Obliquity       257.992
	EqAscendNode    145.637
	Precession      0

	AbsMagn         12.0806
	SlopeParam      4.51105
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.576 0.570 0.567)

	Surface
	{
		SurfStyle       0.144102
		OceanStyle      0.44028
		Randomize      (0.256, -0.388, -0.258)
		colorDistMagn   0.335887
		colorDistFreq   0.683181
		detailScale     836.056
		colorConversion true
		snowLevel       2
		tropicLatitude  0.895518
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622482
		terraceProb     0.102133
		erosion         0
		montesMagn      0.584419
		montesFreq      2.92566
		montesSpiky     0.897949
		montesFraction  0.356094
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.63838
		hillsFraction   0.593772
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244686
		craterFreq      0.220229
		craterDensity   0.901158
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492851
		volcanoTemp     1283.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.228, 0.227, 0.000)
		colorShelf     (0.245, 0.242, 0.241, 0.000)
		colorBeach     (0.259, 0.257, 0.255, 0.000)
		colorDesert    (0.273, 0.271, 0.269, 0.000)
		colorLowland   (0.288, 0.285, 0.283, 0.000)
		colorUpland    (0.302, 0.299, 0.298, 0.000)
		colorRock      (0.317, 0.314, 0.312, 0.000)
		colorSnow      (0.331, 0.328, 0.326, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.864699
		GasToDust   0.25
		Particles   2726
		GasBright   0.128449
		DustBright  0.154928
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.74714
		Period          46.7753
		Eccentricity    0.964218
		Inclination     -86.6992
		AscendingNode   -63.6745
		ArgOfPericenter -157.856
		MeanAnomaly     17.0474
	}
}

Comet	"C11"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.48357e-016
	Radius          0.0867917
	InertiaMoment   0.399953

	Oblateness      0.00276428

	RotationPeriod  95.3669
	Obliquity       211.198
	EqAscendNode    130.214
	Precession      0

	AbsMagn         8.08445
	SlopeParam      5.12386
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.518 0.513 0.508)

	Surface
	{
		SurfStyle       0.663221
		OceanStyle      0.691295
		Randomize      (0.560, 0.389, -0.881)
		colorDistMagn   0.736676
		colorDistFreq   5.27279e-006
		detailScale     2.36999
		colorConversion true
		snowLevel       2
		tropicLatitude  0.773428
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628608
		terraceProb     0.20184
		erosion         0
		montesMagn      0.436954
		montesFreq      2.83414
		montesSpiky     0.843853
		montesFraction  0.629852
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.96058e-005
		hillsFraction   0.561867
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218247
		craterFreq      0.201688
		craterDensity   0.953627
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463872
		volcanoTemp     1857.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.174, 0.142, 0.000)
		colorShelf     (0.207, 0.179, 0.163, 0.000)
		colorBeach     (0.244, 0.210, 0.193, 0.000)
		colorDesert    (0.264, 0.226, 0.188, 0.000)
		colorLowland   (0.290, 0.241, 0.213, 0.000)
		colorUpland    (0.321, 0.292, 0.259, 0.000)
		colorRock      (0.347, 0.318, 0.279, 0.000)
		colorSnow      (0.378, 0.338, 0.295, 1.000)
		BumpHeight      0.0781125
		BumpOffset      0.0156225
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.00946413
		DustBright  0.758399
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.67264
		Period          20.7672
		Eccentricity    0.945975
		Inclination     19.566
		AscendingNode   7.20518
		ArgOfPericenter -113.436
		MeanAnomaly     152.997
	}
}

Comet	"C12"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.92087e-012
	Radius          1.89518
	InertiaMoment   0.398848

	Oblateness      0.00403745

	RotationPeriod  91.3657
	Obliquity       164.404
	EqAscendNode    114.792
	Precession      0

	AbsMagn         4.19395
	SlopeParam      5.86914
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.413 0.410 0.407)

	Surface
	{
		SurfStyle       0.735338
		OceanStyle      0.730011
		Randomize      (0.952, -0.435, 0.160)
		colorDistMagn   0.894011
		colorDistFreq   0.000686086
		detailScale     51.751
		colorConversion true
		snowLevel       2
		tropicLatitude  0.888455
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.682392
		terraceProb     0.468844
		erosion         0
		montesMagn      0.553852
		montesFreq      3.25478
		montesSpiky     0.776736
		montesFraction  0.314492
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0105154
		hillsFraction   0.575477
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238556
		craterFreq      0.189372
		craterDensity   1.0312
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437039
		volcanoTemp     1711.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.139, 0.114, 0.000)
		colorShelf     (0.165, 0.143, 0.130, 0.000)
		colorBeach     (0.194, 0.168, 0.155, 0.000)
		colorDesert    (0.211, 0.180, 0.151, 0.000)
		colorLowland   (0.231, 0.193, 0.171, 0.000)
		colorUpland    (0.256, 0.233, 0.208, 0.000)
		colorRock      (0.277, 0.254, 0.224, 0.000)
		colorSnow      (0.302, 0.270, 0.236, 1.000)
		BumpHeight      1.70566
		BumpOffset      0.341132
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.416333
		GasToDust   0.25
		Particles   1820
		GasBright   0.0322844
		DustBright  0.420065
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.64835
		Period          39.0932
		Eccentricity    0.975065
		Inclination     58.3199
		AscendingNode   -101.823
		ArgOfPericenter 122.326
		MeanAnomaly     -37.9239
	}
}

Comet	"C13"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.48565e-008
	Radius          33.9203
	InertiaMoment   0.397108

	Oblateness      0.0032172

	RotationPeriod  87.8387
	Obliquity       117.61
	EqAscendNode    99.3691
	Precession      0

	AbsMagn         11.744
	SlopeParam      7.0613
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.681 0.657)

	Surface
	{
		SurfStyle       0.0262402
		OceanStyle      0.641476
		Randomize      (0.898, -0.396, 0.969)
		colorDistMagn   0.903106
		colorDistFreq   0.955528
		detailScale     926.251
		colorConversion true
		snowLevel       2
		tropicLatitude  0.728333
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.487887
		terraceProb     0.138457
		erosion         0
		montesMagn      0.275071
		montesFreq      3.17935
		montesSpiky     0.85441
		montesFraction  0.940937
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.3771
		hillsFraction   0.615214
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22031
		craterFreq      0.223051
		craterDensity   0.831896
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55205
		volcanoTemp     1658.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.272, 0.263, 0.000)
		colorShelf     (0.309, 0.289, 0.279, 0.000)
		colorBeach     (0.327, 0.306, 0.296, 0.000)
		colorDesert    (0.345, 0.323, 0.312, 0.000)
		colorLowland   (0.363, 0.341, 0.328, 0.000)
		colorUpland    (0.381, 0.358, 0.345, 0.000)
		colorRock      (0.399, 0.375, 0.361, 0.000)
		colorSnow      (0.418, 0.392, 0.378, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.897525
		GasToDust   0.25
		Particles   2792
		GasBright   0.122178
		DustBright  0.814658
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.72447
		Period          39.6104
		Eccentricity    0.960795
		Inclination     162.583
		AscendingNode   -156.384
		ArgOfPericenter -64.7479
		MeanAnomaly     -131.021
	}
}

Comet	"C14"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.57442e-016
	Radius          0.117313
	InertiaMoment   0.399314

	Oblateness      0.00469187

	RotationPeriod  84.6576
	Obliquity       70.8153
	EqAscendNode    83.9465
	Precession      0

	AbsMagn         7.87579
	SlopeParam      2.37187
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.724 0.665 0.624)

	Surface
	{
		SurfStyle       0.0952489
		OceanStyle      0.399528
		Randomize      (0.269, -0.096, -0.955)
		colorDistMagn   0.949277
		colorDistFreq   9.86244e-006
		detailScale     3.20342
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99138
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587942
		terraceProb     0.151359
		erosion         0
		montesMagn      0.56067
		montesFreq      4.05359
		montesSpiky     0.989747
		montesFraction  0.458485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.03625e-005
		hillsFraction   0.706064
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259086
		craterFreq      0.204979
		craterDensity   0.988119
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436852
		volcanoTemp     1257.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.266, 0.250, 0.000)
		colorShelf     (0.308, 0.283, 0.265, 0.000)
		colorBeach     (0.326, 0.299, 0.281, 0.000)
		colorDesert    (0.344, 0.316, 0.296, 0.000)
		colorLowland   (0.362, 0.333, 0.312, 0.000)
		colorUpland    (0.380, 0.349, 0.328, 0.000)
		colorRock      (0.398, 0.366, 0.343, 0.000)
		colorSnow      (0.417, 0.383, 0.359, 1.000)
		BumpHeight      0.105581
		BumpOffset      0.0211163
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.117716
		DustBright  0.503606
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.55989
		Period          20.1511
		Eccentricity    0.952591
		Inclination     82.6067
		AscendingNode   79.337
		ArgOfPericenter 76.38
		MeanAnomaly     -89.5491
	}
}

Comet	"C15"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.53799e-012
	Radius          2.10107
	InertiaMoment   0.397991

	Oblateness      0.00371985

	RotationPeriod  81.7397
	Obliquity       24.021
	EqAscendNode    68.5239
	Precession      0

	AbsMagn         3.85193
	SlopeParam      3.06393
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.639 0.533 0.459)

	Surface
	{
		SurfStyle       0.106057
		OceanStyle      0.362678
		Randomize      (-0.552, -0.618, 0.983)
		colorDistMagn   0.399889
		colorDistFreq   0.000335861
		detailScale     57.3733
		colorConversion true
		snowLevel       2
		tropicLatitude  0.599681
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543386
		terraceProb     0.136811
		erosion         0
		montesMagn      0.445206
		montesFreq      2.51125
		montesSpiky     0.883485
		montesFraction  0.43917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0112272
		hillsFraction   0.548412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211419
		craterFreq      0.211908
		craterDensity   0.92741
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445805
		volcanoTemp     1277.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.213, 0.184, 0.000)
		colorShelf     (0.271, 0.227, 0.195, 0.000)
		colorBeach     (0.287, 0.240, 0.207, 0.000)
		colorDesert    (0.303, 0.253, 0.218, 0.000)
		colorLowland   (0.319, 0.267, 0.230, 0.000)
		colorUpland    (0.335, 0.280, 0.241, 0.000)
		colorRock      (0.351, 0.293, 0.253, 0.000)
		colorSnow      (0.367, 0.307, 0.264, 1.000)
		BumpHeight      1.89096
		BumpOffset      0.378193
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.449159
		GasToDust   0.25
		Particles   1887
		GasBright   0.0759955
		DustBright  0.229814
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.20278
		Period          36.1112
		Eccentricity    0.973696
		Inclination     -38.8183
		AscendingNode   -69.6884
		ArgOfPericenter -163.968
		MeanAnomaly     157.012
	}
}

Comet	"C16"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.73638e-008
	Radius          45.8196
	InertiaMoment   0.399745

	Oblateness      0.0053715

	RotationPeriod  79.0282
	Obliquity       337.227
	EqAscendNode    53.1014
	Precession      0

	AbsMagn         11.432
	SlopeParam      3.65721
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.412 0.406 0.401)

	Surface
	{
		SurfStyle       0.140295
		OceanStyle      0.745057
		Randomize      (-0.547, 0.939, -0.627)
		colorDistMagn   0.60684
		colorDistFreq   1.49408
		detailScale     1251.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.388973
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441027
		terraceProb     0.467939
		erosion         0
		montesMagn      0.497048
		montesFreq      3.02087
		montesSpiky     0.776994
		montesFraction  0.556542
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.56921
		hillsFraction   0.688691
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243504
		craterFreq      0.146237
		craterDensity   0.909714
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439057
		volcanoTemp     1074.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.162, 0.160, 0.000)
		colorShelf     (0.175, 0.173, 0.170, 0.000)
		colorBeach     (0.185, 0.183, 0.180, 0.000)
		colorDesert    (0.196, 0.193, 0.190, 0.000)
		colorLowland   (0.206, 0.203, 0.200, 0.000)
		colorUpland    (0.216, 0.213, 0.210, 0.000)
		colorRock      (0.227, 0.223, 0.220, 0.000)
		colorSnow      (0.237, 0.233, 0.230, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.930351
		GasToDust   0.25
		Particles   2859
		GasBright   0.243057
		DustBright  0.547239
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.001
		Period          17.1904
		Eccentricity    0.962066
		Inclination     -0.239724
		AscendingNode   -60.9478
		ArgOfPericenter 86.5251
		MeanAnomaly     -153.099
	}
}

Comet	"C17"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            8.42552e-016
	Radius          0.130143
	InertiaMoment   0.398594

	Oblateness      0.00424965

	RotationPeriod  76.4823
	Obliquity       290.432
	EqAscendNode    37.6788
	Precession      0

	AbsMagn         7.66679
	SlopeParam      4.2212
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.771 0.747 0.701)

	Surface
	{
		SurfStyle       0.953509
		OceanStyle      0.00797438
		Randomize      (0.536, -0.858, 0.151)
		colorDistMagn   0.536702
		colorDistFreq   1.23495e-005
		detailScale     3.55378
		colorConversion true
		snowLevel       2
		tropicLatitude  0.378589
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570187
		terraceProb     0.233581
		erosion         0
		montesMagn      0.648621
		montesFreq      2.93697
		montesSpiky     0.97937
		montesFraction  0.561856
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.70106e-005
		hillsFraction   0.520641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22708
		craterFreq      0.23621
		craterDensity   0.846899
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510801
		volcanoTemp     1538.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.261, 0.280, 0.050)
		colorShelf     (0.308, 0.306, 0.322, 0.040)
		colorBeach     (0.354, 0.351, 0.364, 0.030)
		colorDesert    (0.401, 0.396, 0.414, 0.020)
		colorLowland   (0.447, 0.441, 0.456, 0.030)
		colorUpland    (0.493, 0.485, 0.498, 0.050)
		colorRock      (0.539, 0.530, 0.554, 0.020)
		colorSnow      (0.539, 0.530, 0.554, 1.000)
		BumpHeight      0.117129
		BumpOffset      0.0234258
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.174054
		DustBright  0.300729
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.30288
		Period          30.3348
		Eccentricity    0.989764
		Inclination     123.529
		AscendingNode   -159.72
		ArgOfPericenter 26.6357
		MeanAnomaly     142.881
	}
}

Comet	"C18"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.51653e-012
	Radius          2.83641
	InertiaMoment   0.396319

	Oblateness      0.006013

	RotationPeriod  74.0714
	Obliquity       243.638
	EqAscendNode    22.2562
	Precession      0

	AbsMagn         3.47653
	SlopeParam      4.80374
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.491 0.486 0.479)

	Surface
	{
		SurfStyle       0.0645061
		OceanStyle      0.282441
		Randomize      (-0.791, -0.024, 0.673)
		colorDistMagn   0.765949
		colorDistFreq   0.00706746
		detailScale     77.4529
		colorConversion true
		snowLevel       2
		tropicLatitude  0.546066
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.648882
		terraceProb     0.292771
		erosion         0
		montesMagn      0.532994
		montesFreq      3.11117
		montesSpiky     0.892491
		montesFraction  0.379733
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0270118
		hillsFraction   0.61006
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218267
		craterFreq      0.233758
		craterDensity   0.800798
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553374
		volcanoTemp     1733.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.194, 0.192, 0.000)
		colorShelf     (0.209, 0.207, 0.204, 0.000)
		colorBeach     (0.221, 0.219, 0.215, 0.000)
		colorDesert    (0.233, 0.231, 0.227, 0.000)
		colorLowland   (0.246, 0.243, 0.239, 0.000)
		colorUpland    (0.258, 0.255, 0.251, 0.000)
		colorRock      (0.270, 0.267, 0.263, 0.000)
		colorSnow      (0.282, 0.279, 0.275, 1.000)
		BumpHeight      2.55277
		BumpOffset      0.510554
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.481985
		GasToDust   0.25
		Particles   1953
		GasBright   0.408305
		DustBright  0.550964
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.63154
		Period          26.2496
		Eccentricity    0.975132
		Inclination     123.548
		AscendingNode   37.5112
		ArgOfPericenter 30.948
		MeanAnomaly     32.5075
	}
}

Comet	"C19"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.04006e-008
	Radius          50.8629
	InertiaMoment   0.39909

	Oblateness      0.00482468

	RotationPeriod  71.7722
	Obliquity       196.844
	EqAscendNode    6.83358
	Precession      0

	AbsMagn         11.1396
	SlopeParam      5.46578
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.639 0.635 0.630)

	Surface
	{
		SurfStyle       0.757395
		OceanStyle      0.543802
		Randomize      (0.060, -0.788, 0.691)
		colorDistMagn   0.333162
		colorDistFreq   2.24626
		detailScale     1388.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.794449
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423116
		terraceProb     0.122595
		erosion         0
		montesMagn      0.533721
		montesFreq      3.06927
		montesSpiky     0.871467
		montesFraction  0.681378
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.13919
		hillsFraction   0.506851
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214148
		craterFreq      0.157917
		craterDensity   0.831653
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5656
		volcanoTemp     1843.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.216, 0.176, 0.000)
		colorShelf     (0.256, 0.222, 0.202, 0.000)
		colorBeach     (0.300, 0.260, 0.239, 0.000)
		colorDesert    (0.326, 0.279, 0.233, 0.000)
		colorLowland   (0.358, 0.298, 0.265, 0.000)
		colorUpland    (0.396, 0.362, 0.321, 0.000)
		colorRock      (0.428, 0.394, 0.346, 0.000)
		colorSnow      (0.467, 0.419, 0.365, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.963176
		GasToDust   0.25
		Particles   2925
		GasBright   0.31202
		DustBright  0.331735
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.29892
		Period          30.3102
		Eccentricity    0.957586
		Inclination     124.091
		AscendingNode   -72.8217
		ArgOfPericenter 57.2097
		MeanAnomaly     -177.488
	}
}

Comet	"C20"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.55188e-015
	Radius          0.175589
	InertiaMoment   0.397613

	Oblateness      0.00682413

	RotationPeriod  69.5661
	Obliquity       150.049
	EqAscendNode    351.411
	Precession      0

	AbsMagn         7.45687
	SlopeParam      6.35262
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.778 0.776)

	Surface
	{
		SurfStyle       0.980964
		OceanStyle      0.5737
		Randomize      (-0.211, 0.683, 0.364)
		colorDistMagn   0.759294
		colorDistFreq   1.8797e-005
		detailScale     4.79474
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992808
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.311768
		terraceProb     0.284969
		erosion         0
		montesMagn      0.499272
		montesFreq      2.35134
		montesSpiky     0.915795
		montesFraction  0.41059
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.98016e-005
		hillsFraction   0.937657
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223243
		craterFreq      0.218504
		craterDensity   0.939786
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468322
		volcanoTemp     1536.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.272, 0.310, 0.050)
		colorShelf     (0.312, 0.319, 0.357, 0.040)
		colorBeach     (0.359, 0.366, 0.403, 0.030)
		colorDesert    (0.406, 0.412, 0.458, 0.020)
		colorLowland   (0.453, 0.459, 0.504, 0.030)
		colorUpland    (0.500, 0.506, 0.551, 0.050)
		colorRock      (0.547, 0.552, 0.613, 0.020)
		colorSnow      (0.547, 0.552, 0.613, 1.000)
		BumpHeight      0.15803
		BumpOffset      0.031606
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0336185
		GasToDust   0.25
		Particles   1047
		GasBright   0.0143549
		DustBright  0.313887
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.59508
		Period          20.3428
		Eccentricity    0.965222
		Inclination     -126.703
		AscendingNode   -174.08
		ArgOfPericenter 74.8207
		MeanAnomaly     127.902
	}
}

Comet	"C21"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.20027e-011
	Radius          3.1505
	InertiaMoment   0.399535

	Oblateness      0.00546247

	RotationPeriod  67.4382
	Obliquity       103.255
	EqAscendNode    335.988
	Precession      0

	AbsMagn         3.05639
	SlopeParam      8.84952
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.677 0.674 0.671)

	Surface
	{
		SurfStyle       0.746045
		OceanStyle      0.0241435
		Randomize      (0.699, -0.043, 0.632)
		colorDistMagn   0.751364
		colorDistFreq   0.00854431
		detailScale     86.0297
		colorConversion true
		snowLevel       2
		tropicLatitude  0.816215
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381905
		terraceProb     0.401217
		erosion         0
		montesMagn      0.418222
		montesFreq      3.13403
		montesSpiky     0.862617
		montesFraction  0.333747
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.026606
		hillsFraction   0.649657
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270162
		craterFreq      0.271184
		craterDensity   0.895653
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.403559
		volcanoTemp     1416.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.229, 0.188, 0.000)
		colorShelf     (0.271, 0.236, 0.215, 0.000)
		colorBeach     (0.318, 0.276, 0.255, 0.000)
		colorDesert    (0.345, 0.296, 0.248, 0.000)
		colorLowland   (0.379, 0.317, 0.282, 0.000)
		colorUpland    (0.420, 0.384, 0.342, 0.000)
		colorRock      (0.453, 0.418, 0.369, 0.000)
		colorSnow      (0.494, 0.445, 0.389, 1.000)
		BumpHeight      2.83545
		BumpOffset      0.56709
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.514811
		GasToDust   0.25
		Particles   2019
		GasBright   0.0835305
		DustBright  0.729198
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.70816
		Period          39.4994
		Eccentricity    0.972767
		Inclination     125.276
		AscendingNode   26.6567
		ArgOfPericenter 67.5802
		MeanAnomaly     -173.579
	}
}

Comet	"C22"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            9.28318e-008
	Radius          68.5858
	InertiaMoment   0.398316

	Oblateness      0.00771826

	RotationPeriod  65.3762
	Obliquity       56.4609
	EqAscendNode    320.566
	Precession      0

	AbsMagn         10.8631
	SlopeParam      2.7322
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.508 0.503 0.498)

	Surface
	{
		SurfStyle       0.0949738
		OceanStyle      0.520287
		Randomize      (-0.562, 0.734, 0.504)
		colorDistMagn   0.900766
		colorDistFreq   2.64371
		detailScale     1872.85
		colorConversion true
		snowLevel       2
		tropicLatitude  0.613254
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390929
		terraceProb     0.370425
		erosion         0
		montesMagn      0.484794
		montesFreq      2.61476
		montesSpiky     0.956141
		montesFraction  0.554549
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.4216
		hillsFraction   0.739443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268711
		craterFreq      0.247902
		craterDensity   0.999857
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496705
		volcanoTemp     1455.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.201, 0.199, 0.000)
		colorShelf     (0.216, 0.214, 0.212, 0.000)
		colorBeach     (0.229, 0.226, 0.224, 0.000)
		colorDesert    (0.241, 0.239, 0.237, 0.000)
		colorLowland   (0.254, 0.252, 0.249, 0.000)
		colorUpland    (0.267, 0.264, 0.262, 0.000)
		colorRock      (0.279, 0.277, 0.274, 0.000)
		colorSnow      (0.292, 0.289, 0.286, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.996002
		GasToDust   0.25
		Particles   2991
		GasBright   0.0804609
		DustBright  0.416754
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.79745
		Period          27.2408
		Eccentricity    0.965858
		Inclination     111.782
		AscendingNode   -40.9189
		ArgOfPericenter 133.816
		MeanAnomaly     138.974
	}
}

Comet	"C23"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.85835e-015
	Radius          0.195145
	InertiaMoment   0.399958

	Oblateness      0.00618328

	RotationPeriod  63.3697
	Obliquity       9.66659
	EqAscendNode    305.143
	Precession      0

	AbsMagn         7.24545
	SlopeParam      3.36351
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.747 0.745)

	Surface
	{
		SurfStyle       0.489671
		OceanStyle      0.0356947
		Randomize      (0.504, -0.091, -0.503)
		colorDistMagn   0.40316
		colorDistFreq   2.07227e-005
		detailScale     5.32875
		colorConversion true
		snowLevel       2
		tropicLatitude  0.844199
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436146
		terraceProb     0.145204
		erosion         0
		montesMagn      0.481831
		montesFreq      2.86532
		montesSpiky     0.888853
		montesFraction  0.676434
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.34313e-005
		hillsFraction   0.858261
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239014
		craterFreq      0.212785
		craterDensity   0.720264
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482556
		volcanoTemp     1984.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.299, 0.298, 0.000)
		colorShelf     (0.319, 0.317, 0.317, 0.000)
		colorBeach     (0.337, 0.336, 0.335, 0.000)
		colorDesert    (0.356, 0.355, 0.354, 0.000)
		colorLowland   (0.375, 0.373, 0.373, 0.000)
		colorUpland    (0.394, 0.392, 0.391, 0.000)
		colorRock      (0.412, 0.411, 0.410, 0.000)
		colorSnow      (0.431, 0.429, 0.429, 1.000)
		BumpHeight      0.17563
		BumpOffset      0.035126
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0664443
		GasToDust   0.25
		Particles   1114
		GasBright   0.216827
		DustBright  0.764875
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.2762
		Period          43.4266
		Eccentricity    0.963983
		Inclination     -48.4229
		AscendingNode   160.189
		ArgOfPericenter -142.98
		MeanAnomaly     126.67
	}
}

Comet	"C24"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.21073e-011
	Radius          4.246
	InertiaMoment   0.398854

	Oblateness      0.00873291

	RotationPeriod  61.4099
	Obliquity       322.872
	EqAscendNode    289.721
	Precession      0

	AbsMagn         2.57322
	SlopeParam      3.93595
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.657 0.650 0.647)

	Surface
	{
		SurfStyle       0.519409
		OceanStyle      0.246687
		Randomize      (-0.051, -0.517, 0.996)
		colorDistMagn   0.636319
		colorDistFreq   0.00533151
		detailScale     115.944
		colorConversion true
		snowLevel       2
		tropicLatitude  0.7492
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567079
		terraceProb     0.762157
		erosion         0
		montesMagn      0.593331
		montesFreq      2.97393
		montesSpiky     0.971577
		montesFraction  0.375736
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0305624
		hillsFraction   0.634758
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277444
		craterFreq      0.250952
		craterDensity   0.79368
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.569983
		volcanoTemp     1811.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.221, 0.181, 0.000)
		colorShelf     (0.263, 0.227, 0.207, 0.000)
		colorBeach     (0.309, 0.266, 0.246, 0.000)
		colorDesert    (0.335, 0.286, 0.239, 0.000)
		colorLowland   (0.368, 0.305, 0.272, 0.000)
		colorUpland    (0.407, 0.370, 0.330, 0.000)
		colorRock      (0.440, 0.403, 0.356, 0.000)
		colorSnow      (0.480, 0.429, 0.375, 1.000)
		BumpHeight      3.8214
		BumpOffset      0.764281
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.547636
		GasToDust   0.25
		Particles   2086
		GasBright   0.186475
		DustBright  0.479713
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.2564
		Period          50.4884
		Eccentricity    0.983344
		Inclination     15.6216
		AscendingNode   130.471
		ArgOfPericenter 170.121
		MeanAnomaly     -54.9263
	}
}

Comet	"C25"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.70984e-007
	Radius          76.2664
	InertiaMoment   0.397123

	Oblateness      0.00692755

	RotationPeriod  59.4891
	Obliquity       276.078
	EqAscendNode    274.298
	Precession      0

	AbsMagn         10.5997
	SlopeParam      4.50309
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.735 0.732 0.729)

	Surface
	{
		SurfStyle       0.684175
		OceanStyle      0.300447
		Randomize      (0.347, 0.780, 0.364)
		colorDistMagn   0.782169
		colorDistFreq   4.60541
		detailScale     2082.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.952623
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518345
		terraceProb     0.135003
		erosion         0
		montesMagn      0.508855
		montesFreq      2.98048
		montesSpiky     0.980681
		montesFraction  0.415545
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.7087
		hillsFraction   0.582996
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209954
		craterFreq      0.210864
		craterDensity   0.885235
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534033
		volcanoTemp     1476.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.249, 0.204, 0.000)
		colorShelf     (0.294, 0.256, 0.233, 0.000)
		colorBeach     (0.346, 0.300, 0.277, 0.000)
		colorDesert    (0.375, 0.322, 0.270, 0.000)
		colorLowland   (0.412, 0.344, 0.306, 0.000)
		colorUpland    (0.456, 0.417, 0.372, 0.000)
		colorRock      (0.493, 0.454, 0.401, 0.000)
		colorSnow      (0.537, 0.483, 0.423, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.118864
		DustBright  0.231811
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.496
		Period          59.9132
		Eccentricity    0.981846
		Inclination     156.208
		AscendingNode   1.39875
		ArgOfPericenter -133.489
		MeanAnomaly     -153.678
	}
}

Comet	"C26"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.26474e-015
	Radius          0.262867
	InertiaMoment   0.39932

	Oblateness      0.00990762

	RotationPeriod  57.6004
	Obliquity       229.284
	EqAscendNode    258.875
	Precession      0

	AbsMagn         7.0319
	SlopeParam      5.11484
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.612 0.608 0.603)

	Surface
	{
		SurfStyle       0.285069
		OceanStyle      0.949
		Randomize      (-0.682, 0.270, 0.571)
		colorDistMagn   0.673978
		colorDistFreq   1.32094e-005
		detailScale     7.17802
		colorConversion true
		snowLevel       2
		tropicLatitude  0.736988
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502052
		terraceProb     0.615732
		erosion         0
		montesMagn      0.447609
		montesFreq      3.60581
		montesSpiky     0.924872
		montesFraction  0.516937
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000157796
		hillsFraction   0.740096
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234801
		craterFreq      0.163584
		craterDensity   0.711649
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489037
		volcanoTemp     1620.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.243, 0.241, 0.000)
		colorShelf     (0.260, 0.258, 0.256, 0.000)
		colorBeach     (0.275, 0.273, 0.271, 0.000)
		colorDesert    (0.291, 0.289, 0.287, 0.000)
		colorLowland   (0.306, 0.304, 0.302, 0.000)
		colorUpland    (0.321, 0.319, 0.317, 0.000)
		colorRock      (0.337, 0.334, 0.332, 0.000)
		colorSnow      (0.352, 0.349, 0.347, 1.000)
		BumpHeight      0.23658
		BumpOffset      0.0473161
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0992703
		GasToDust   0.25
		Particles   1180
		GasBright   0.332398
		DustBright  0.502764
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.53264
		Period          31.7776
		Eccentricity    0.98439
		Inclination     -1.83799
		AscendingNode   -10.1812
		ArgOfPericenter -119.043
		MeanAnomaly     -70.289
	}
}

Comet	"C27"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.0719e-011
	Radius          4.72399
	InertiaMoment   0.398

	Oblateness      0.00790075

	RotationPeriod  55.7378
	Obliquity       182.489
	EqAscendNode    243.453
	Precession      0

	AbsMagn         1.99454
	SlopeParam      5.85723
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.662 0.659)

	Surface
	{
		SurfStyle       0.779331
		OceanStyle      0.591096
		Randomize      (0.421, -0.908, 0.801)
		colorDistMagn   0.868688
		colorDistFreq   0.00611359
		detailScale     128.996
		colorConversion true
		snowLevel       2
		tropicLatitude  0.60676
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.724326
		terraceProb     0.231298
		erosion         0
		montesMagn      0.388612
		montesFreq      2.98257
		montesSpiky     0.822736
		montesFraction  0.823503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0446661
		hillsFraction   0.717651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2478
		craterFreq      0.201602
		craterDensity   0.997646
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46259
		volcanoTemp     1696.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.225, 0.185, 0.000)
		colorShelf     (0.266, 0.232, 0.211, 0.000)
		colorBeach     (0.312, 0.271, 0.251, 0.000)
		colorDesert    (0.339, 0.291, 0.244, 0.000)
		colorLowland   (0.372, 0.311, 0.277, 0.000)
		colorUpland    (0.412, 0.377, 0.336, 0.000)
		colorRock      (0.445, 0.410, 0.363, 0.000)
		colorSnow      (0.485, 0.437, 0.382, 1.000)
		BumpHeight      4.25159
		BumpOffset      0.850318
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.580462
		GasToDust   0.25
		Particles   2152
		GasBright   0.237505
		DustBright  0.282143
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.53976
		Period          45.2905
		Eccentricity    0.984527
		Inclination     140.246
		AscendingNode   -15.1098
		ArgOfPericenter 113.516
		MeanAnomaly     -28.6124
	}
}

Comet	"C28"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.14932e-007
	Radius          102.683
	InertiaMoment   0.399751

	Oblateness      0.0112945

	RotationPeriod  53.8958
	Obliquity       135.695
	EqAscendNode    228.03
	Precession      0

	AbsMagn         10.3471
	SlopeParam      7.03664
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.533 0.527 0.519)

	Surface
	{
		SurfStyle       0.674118
		OceanStyle      0.0606711
		Randomize      (0.892, -0.500, -0.504)
		colorDistMagn   0.659189
		colorDistFreq   2.73537
		detailScale     2803.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973467
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474733
		terraceProb     0.134929
		erosion         0
		montesMagn      0.576712
		montesFreq      2.9057
		montesSpiky     0.870398
		montesFraction  0.223768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.9536
		hillsFraction   0.655354
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244309
		craterFreq      0.419955
		craterDensity   0.800752
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459786
		volcanoTemp     1415.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.179, 0.145, 0.000)
		colorShelf     (0.213, 0.185, 0.166, 0.000)
		colorBeach     (0.251, 0.216, 0.197, 0.000)
		colorDesert    (0.272, 0.232, 0.192, 0.000)
		colorLowland   (0.299, 0.248, 0.218, 0.000)
		colorUpland    (0.331, 0.301, 0.265, 0.000)
		colorRock      (0.357, 0.327, 0.285, 0.000)
		colorSnow      (0.389, 0.348, 0.301, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.00328547
		DustBright  0.200849
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.50666
		Period          45.055
		Eccentricity    0.971454
		Inclination     -115.127
		AscendingNode   -96.8158
		ArgOfPericenter -60.4083
		MeanAnomaly     -166.236
	}
}

Comet	"C29"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            9.697e-015
	Radius          0.292606
	InertiaMoment   0.398601

	Oblateness      0.00905465

	RotationPeriod  52.069
	Obliquity       88.9008
	EqAscendNode    212.608
	Precession      0

	AbsMagn         6.81555
	SlopeParam      2.3611
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.571 0.569 0.565)

	Surface
	{
		SurfStyle       0.0730453
		OceanStyle      0.978922
		Randomize      (-0.207, 0.867, -0.878)
		colorDistMagn   0.869753
		colorDistFreq   1.03788e-005
		detailScale     7.99009
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999851
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.710399
		terraceProb     0.206023
		erosion         0
		montesMagn      0.519511
		montesFreq      2.87302
		montesSpiky     0.937968
		montesFraction  0.653299
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000237408
		hillsFraction   0.801949
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22276
		craterFreq      0.253224
		craterDensity   0.740162
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519217
		volcanoTemp     1374
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.227, 0.226, 0.000)
		colorShelf     (0.243, 0.242, 0.240, 0.000)
		colorBeach     (0.257, 0.256, 0.254, 0.000)
		colorDesert    (0.271, 0.270, 0.268, 0.000)
		colorLowland   (0.286, 0.284, 0.282, 0.000)
		colorUpland    (0.300, 0.299, 0.296, 0.000)
		colorRock      (0.314, 0.313, 0.311, 0.000)
		colorSnow      (0.329, 0.327, 0.325, 1.000)
		BumpHeight      0.263345
		BumpOffset      0.0526691
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.132096
		GasToDust   0.25
		Particles   1246
		GasBright   0.0517429
		DustBright  0.636878
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.92098
		Period          34.2665
		Eccentricity    0.9774
		Inclination     164.275
		AscendingNode   97.5735
		ArgOfPericenter -40.762
		MeanAnomaly     -34.7147
	}
}

Comet	"C30"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.49992e-011
	Radius          6.3573
	InertiaMoment   0.396347

	Oblateness      0.0127818

	RotationPeriod  50.2527
	Obliquity       42.1065
	EqAscendNode    197.185
	Precession      0

	AbsMagn         1.25285
	SlopeParam      3.05532
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.795 0.792 0.789)

	Surface
	{
		SurfStyle       0.525157
		OceanStyle      0.354162
		Randomize      (-0.835, -0.640, -0.955)
		colorDistMagn   0.982922
		colorDistFreq   0.0157446
		detailScale     173.597
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917076
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486183
		terraceProb     0.432339
		erosion         0
		montesMagn      0.51707
		montesFreq      2.8931
		montesSpiky     0.859136
		montesFraction  0.339341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0466792
		hillsFraction   0.720397
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215171
		craterFreq      0.192856
		craterDensity   0.831723
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472149
		volcanoTemp     1538
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.269, 0.221, 0.000)
		colorShelf     (0.318, 0.277, 0.253, 0.000)
		colorBeach     (0.374, 0.325, 0.300, 0.000)
		colorDesert    (0.405, 0.349, 0.292, 0.000)
		colorLowland   (0.445, 0.372, 0.332, 0.000)
		colorUpland    (0.493, 0.452, 0.403, 0.000)
		colorRock      (0.533, 0.491, 0.434, 0.000)
		colorSnow      (0.580, 0.523, 0.458, 1.000)
		BumpHeight      5.72157
		BumpOffset      1.14431
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.613288
		GasToDust   0.25
		Particles   2218
		GasBright   0.0500655
		DustBright  0.323042
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.30642
		Period          18.789
		Eccentricity    0.963983
		Inclination     -98.7648
		AscendingNode   115.535
		ArgOfPericenter 108.855
		MeanAnomaly     151.178
	}
}

Comet	"C31"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.80065e-007
	Radius          114.355
	InertiaMoment   0.399096

	Oblateness      0.0104585

	RotationPeriod  48.442
	Obliquity       355.312
	EqAscendNode    181.763
	Precession      0

	AbsMagn         10.1035
	SlopeParam      3.64938
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.496 0.493 0.489)

	Surface
	{
		SurfStyle       0.691262
		OceanStyle      0.305871
		Randomize      (0.602, -0.574, 0.773)
		colorDistMagn   0.982632
		colorDistFreq   4.68664
		detailScale     3122.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.759729
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560012
		terraceProb     0.604981
		erosion         0
		montesMagn      0.619665
		montesFreq      2.16781
		montesSpiky     0.954082
		montesFraction  0.219738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.2869
		hillsFraction   0.607094
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23633
		craterFreq      0.472003
		craterDensity   0.806476
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520563
		volcanoTemp     1236.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.168, 0.137, 0.000)
		colorShelf     (0.198, 0.173, 0.156, 0.000)
		colorBeach     (0.233, 0.202, 0.186, 0.000)
		colorDesert    (0.253, 0.217, 0.181, 0.000)
		colorLowland   (0.278, 0.232, 0.205, 0.000)
		colorUpland    (0.307, 0.281, 0.249, 0.000)
		colorRock      (0.332, 0.306, 0.269, 0.000)
		colorSnow      (0.362, 0.325, 0.284, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.165713
		DustBright  0.691881
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.50409
		Period          38.1191
		Eccentricity    0.959998
		Inclination     52.5215
		AscendingNode   -47.5056
		ArgOfPericenter 148.388
		MeanAnomaly     165.79
	}
}

Comet	"C32"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.78606e-014
	Radius          0.393598
	InertiaMoment   0.397624

	Oblateness      0.0148632

	RotationPeriod  46.6325
	Obliquity       308.518
	EqAscendNode    166.34
	Precession      0

	AbsMagn         6.59567
	SlopeParam      4.21344
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.415 0.413 0.410)

	Surface
	{
		SurfStyle       0.936808
		OceanStyle      0.215475
		Randomize      (0.602, 0.768, -0.574)
		colorDistMagn   0.252132
		colorDistFreq   1.71891e-005
		detailScale     10.7478
		colorConversion true
		snowLevel       2
		tropicLatitude  0.70462
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421978
		terraceProb     0.405233
		erosion         0
		montesMagn      0.58685
		montesFreq      2.99169
		montesSpiky     0.858939
		montesFraction  0.559051
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000202143
		hillsFraction   0.618011
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22598
		craterFreq      0.193493
		craterDensity   0.741738
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520363
		volcanoTemp     1784.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.141, 0.145, 0.164, 0.050)
		colorShelf     (0.166, 0.169, 0.189, 0.040)
		colorBeach     (0.191, 0.194, 0.213, 0.030)
		colorDesert    (0.216, 0.219, 0.242, 0.020)
		colorLowland   (0.241, 0.244, 0.266, 0.030)
		colorUpland    (0.266, 0.269, 0.291, 0.050)
		colorRock      (0.290, 0.293, 0.324, 0.020)
		colorSnow      (0.290, 0.293, 0.324, 1.000)
		BumpHeight      0.354238
		BumpOffset      0.0708476
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.164922
		GasToDust   0.25
		Particles   1312
		GasBright   0.136754
		DustBright  0.405327
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.62534
		Period          45.9013
		Eccentricity    0.979624
		Inclination     153.133
		AscendingNode   115.828
		ArgOfPericenter -12.8429
		MeanAnomaly     -52.8292
	}
}

Comet	"C33"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.38139e-010
	Radius          7.08316
	InertiaMoment   0.399541

	Oblateness      0.0122118

	RotationPeriod  44.8196
	Obliquity       261.724
	EqAscendNode    150.917
	Precession      0

	AbsMagn         0.161094
	SlopeParam      4.79538
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.716 0.648 0.518)

	Surface
	{
		SurfStyle       0.272459
		OceanStyle      0.464932
		Randomize      (-0.523, 0.110, -0.983)
		colorDistMagn   0.893104
		colorDistFreq   0.025393
		detailScale     193.418
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999979
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.670718
		terraceProb     0.15687
		erosion         0
		montesMagn      0.609925
		montesFreq      3.47258
		montesSpiky     0.938862
		montesFraction  0.588515
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0718395
		hillsFraction   0.628243
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233657
		craterFreq      0.188913
		craterDensity   0.940504
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509723
		volcanoTemp     1404.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.259, 0.207, 0.000)
		colorShelf     (0.304, 0.275, 0.220, 0.000)
		colorBeach     (0.322, 0.292, 0.233, 0.000)
		colorDesert    (0.340, 0.308, 0.246, 0.000)
		colorLowland   (0.358, 0.324, 0.259, 0.000)
		colorUpland    (0.376, 0.340, 0.272, 0.000)
		colorRock      (0.394, 0.356, 0.285, 0.000)
		colorSnow      (0.412, 0.373, 0.298, 1.000)
		BumpHeight      6.37485
		BumpOffset      1.27497
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.646114
		GasToDust   0.25
		Particles   2285
		GasBright   0.0705352
		DustBright  0.156032
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.2577
		Period          50.4979
		Eccentricity    0.988055
		Inclination     -10.5
		AscendingNode   145.162
		ArgOfPericenter -78.5484
		MeanAnomaly     -115.511
	}
}

Comet	"C34"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.25341e-018
	Radius          0.0243692
	InertiaMoment   0.398323

	Oblateness      0.0174681

	RotationPeriod  42.9985
	Obliquity       214.929
	EqAscendNode    135.495
	Precession      0

	AbsMagn         9.86749
	SlopeParam      5.45571
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.491 0.489 0.485)

	Surface
	{
		SurfStyle       0.645323
		OceanStyle      0.860718
		Randomize      (0.600, 0.278, 0.205)
		colorDistMagn   0.277306
		colorDistFreq   4.62634e-007
		detailScale     0.665441
		colorConversion true
		snowLevel       2
		tropicLatitude  0.964118
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.75831
		terraceProb     0.454028
		erosion         0
		montesMagn      0.566058
		montesFreq      2.83427
		montesSpiky     0.892811
		montesFraction  0.702381
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.25568e-006
		hillsFraction   0.593641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248679
		craterFreq      0.24523
		craterDensity   0.953158
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509501
		volcanoTemp     1807.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.166, 0.136, 0.000)
		colorShelf     (0.196, 0.171, 0.155, 0.000)
		colorBeach     (0.231, 0.200, 0.184, 0.000)
		colorDesert    (0.250, 0.215, 0.180, 0.000)
		colorLowland   (0.275, 0.230, 0.204, 0.000)
		colorUpland    (0.304, 0.279, 0.248, 0.000)
		colorRock      (0.329, 0.303, 0.267, 0.000)
		colorSnow      (0.358, 0.323, 0.282, 1.000)
		BumpHeight      0.0219323
		BumpOffset      0.00438645
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.26335
		DustBright  0.447704
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.73774
		Period          39.7008
		Eccentricity    0.987182
		Inclination     39.7451
		AscendingNode   4.58128
		ArgOfPericenter -132.999
		MeanAnomaly     98.9364
	}
}

Comet	"C35"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.28971e-014
	Radius          0.43873
	InertiaMoment   0.399963

	Oblateness      0.0144686

	RotationPeriod  41.1646
	Obliquity       168.135
	EqAscendNode    120.072
	Precession      0

	AbsMagn         6.37147
	SlopeParam      6.33727
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.589 0.584 0.578)

	Surface
	{
		SurfStyle       0.739208
		OceanStyle      0.898129
		Randomize      (-0.274, -0.372, 0.106)
		colorDistMagn   0.65606
		colorDistFreq   8.05375e-005
		detailScale     11.9803
		colorConversion true
		snowLevel       2
		tropicLatitude  0.110946
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489945
		terraceProb     0.17485
		erosion         0
		montesMagn      0.43091
		montesFreq      2.6287
		montesSpiky     0.976275
		montesFraction  0.462757
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000426728
		hillsFraction   0.503936
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240561
		craterFreq      0.272251
		craterDensity   0.794989
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466315
		volcanoTemp     1533.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.199, 0.162, 0.000)
		colorShelf     (0.236, 0.205, 0.185, 0.000)
		colorBeach     (0.277, 0.240, 0.220, 0.000)
		colorDesert    (0.300, 0.257, 0.214, 0.000)
		colorLowland   (0.330, 0.275, 0.243, 0.000)
		colorUpland    (0.365, 0.333, 0.295, 0.000)
		colorRock      (0.395, 0.362, 0.318, 0.000)
		colorSnow      (0.430, 0.386, 0.335, 1.000)
		BumpHeight      0.394857
		BumpOffset      0.0789715
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.197748
		GasToDust   0.25
		Particles   1379
		GasBright   0.16985
		DustBright  0.225691
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.3575
		Period          51.2366
		Eccentricity    0.968979
		Inclination     169.15
		AscendingNode   -147.623
		ArgOfPericenter -0.545595
		MeanAnomaly     -151.269
	}
}

Comet	"C36"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.54435e-010
	Radius          9.51998
	InertiaMoment   0.398861

	Oblateness      0.0208692

	RotationPeriod  39.3127
	Obliquity       121.341
	EqAscendNode    104.65
	Precession      0

	AbsMagn         18.844
	SlopeParam      8.71507
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.689 0.685 0.680)

	Surface
	{
		SurfStyle       0.583182
		OceanStyle      0.772652
		Randomize      (-0.746, -0.981, 0.477)
		colorDistMagn   0.582196
		colorDistFreq   0.0212618
		detailScale     259.959
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94388
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418886
		terraceProb     0.21304
		erosion         0
		montesMagn      0.392414
		montesFreq      2.99564
		montesSpiky     0.939209
		montesFraction  0.331225
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.125657
		hillsFraction   0.46669
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250293
		craterFreq      0.178661
		craterDensity   0.794509
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.576142
		volcanoTemp     1229.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.233, 0.190, 0.000)
		colorShelf     (0.276, 0.240, 0.218, 0.000)
		colorBeach     (0.324, 0.281, 0.258, 0.000)
		colorDesert    (0.351, 0.302, 0.252, 0.000)
		colorLowland   (0.386, 0.322, 0.286, 0.000)
		colorUpland    (0.427, 0.391, 0.347, 0.000)
		colorRock      (0.462, 0.425, 0.374, 0.000)
		colorSnow      (0.503, 0.452, 0.394, 1.000)
		BumpHeight      8.56798
		BumpOffset      1.7136
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.67894
		GasToDust   0.25
		Particles   2351
		GasBright   0.429855
		DustBright  0.450172
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.86227
		Period          40.5526
		Eccentricity    0.972034
		Inclination     118.932
		AscendingNode   -96.0409
		ArgOfPericenter -94.0011
		MeanAnomaly     78.8456
	}
}

Comet	"C37"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.83425e-018
	Radius          0.0271748
	InertiaMoment   0.397138

	Oblateness      0.0172713

	RotationPeriod  37.4375
	Obliquity       74.5464
	EqAscendNode    89.227
	Precession      0

	AbsMagn         9.63781
	SlopeParam      2.72275
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.783 0.782)

	Surface
	{
		SurfStyle       0.329266
		OceanStyle      0.491921
		Randomize      (0.514, -0.995, 0.401)
		colorDistMagn   0.509799
		colorDistFreq   2.34075e-007
		detailScale     0.742054
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999616
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637847
		terraceProb     0.230506
		erosion         0
		montesMagn      0.471948
		montesFreq      2.09778
		montesSpiky     0.954452
		montesFraction  0.683352
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3122e-006
		hillsFraction   0.686937
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241963
		craterFreq      0.160313
		craterDensity   0.873232
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505118
		volcanoTemp     1556.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.313, 0.000)
		colorShelf     (0.334, 0.333, 0.332, 0.000)
		colorBeach     (0.353, 0.352, 0.352, 0.000)
		colorDesert    (0.373, 0.372, 0.372, 0.000)
		colorLowland   (0.393, 0.392, 0.391, 0.000)
		colorUpland    (0.412, 0.411, 0.411, 0.000)
		colorRock      (0.432, 0.431, 0.430, 0.000)
		colorSnow      (0.452, 0.450, 0.450, 1.000)
		BumpHeight      0.0244574
		BumpOffset      0.00489147
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0268155
		DustBright  0.537698
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.331
		Period          51.0404
		Eccentricity    0.976266
		Inclination     16.4767
		AscendingNode   33.5593
		ArgOfPericenter -78.7735
		MeanAnomaly     -13.9141
	}
}

Comet	"C38"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.05923e-014
	Radius          0.589438
	InertiaMoment   0.399325

	Oblateness      0.0255051

	RotationPeriod  35.5332
	Obliquity       27.7521
	EqAscendNode    73.8044
	Precession      0

	AbsMagn         6.14202
	SlopeParam      3.35539
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.742 0.738 0.735)

	Surface
	{
		SurfStyle       0.552388
		OceanStyle      0.68303
		Randomize      (-0.156, -0.184, 0.173)
		colorDistMagn   0.852315
		colorDistFreq   0.000159231
		detailScale     16.0956
		colorConversion true
		snowLevel       2
		tropicLatitude  0.766995
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53797
		terraceProb     0.347686
		erosion         0
		montesMagn      0.241967
		montesFreq      3.20716
		montesSpiky     0.944953
		montesFraction  0.851401
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000746204
		hillsFraction   0.589254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240284
		craterFreq      0.260324
		craterDensity   0.918636
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453334
		volcanoTemp     1663.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.251, 0.206, 0.000)
		colorShelf     (0.297, 0.258, 0.235, 0.000)
		colorBeach     (0.349, 0.303, 0.279, 0.000)
		colorDesert    (0.379, 0.325, 0.272, 0.000)
		colorLowland   (0.416, 0.347, 0.309, 0.000)
		colorUpland    (0.460, 0.421, 0.375, 0.000)
		colorRock      (0.497, 0.458, 0.405, 0.000)
		colorSnow      (0.542, 0.487, 0.427, 1.000)
		BumpHeight      0.530494
		BumpOffset      0.106099
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.230574
		GasToDust   0.25
		Particles   1445
		GasBright   0.0265303
		DustBright  0.22247
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.18825
		Period          42.8104
		Eccentricity    0.979399
		Inclination     -54.8696
		AscendingNode   -69.6544
		ArgOfPericenter 130.391
		MeanAnomaly     160.151
	}
}

Comet	"C39"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.68637e-010
	Radius          10.6202
	InertiaMoment   0.398009

	Oblateness      0.021474

	RotationPeriod  33.5933
	Obliquity       340.958
	EqAscendNode    58.3818
	Precession      0

	AbsMagn         15.898
	SlopeParam      3.92823
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.677 0.675 0.674)

	Surface
	{
		SurfStyle       0.637786
		OceanStyle      0.0781535
		Randomize      (0.117, -0.201, -0.944)
		colorDistMagn   0.655111
		colorDistFreq   0.0792427
		detailScale     290.003
		colorConversion true
		snowLevel       2
		tropicLatitude  0.387472
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393104
		terraceProb     0.15289
		erosion         0
		montesMagn      0.590725
		montesFreq      3.24201
		montesSpiky     0.917376
		montesFraction  0.387852
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.223963
		hillsFraction   0.85375
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258073
		craterFreq      0.207101
		craterDensity   0.807715
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525347
		volcanoTemp     1307.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.230, 0.189, 0.000)
		colorShelf     (0.271, 0.236, 0.216, 0.000)
		colorBeach     (0.318, 0.277, 0.256, 0.000)
		colorDesert    (0.345, 0.297, 0.249, 0.000)
		colorLowland   (0.379, 0.317, 0.283, 0.000)
		colorUpland    (0.420, 0.385, 0.344, 0.000)
		colorRock      (0.454, 0.419, 0.371, 0.000)
		colorSnow      (0.495, 0.446, 0.391, 1.000)
		BumpHeight      9.55821
		BumpOffset      1.91164
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.711766
		GasToDust   0.25
		Particles   2417
		GasBright   0.12146
		DustBright  0.612027
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.43466
		Period          25.0893
		Eccentricity    0.991997
		Inclination     -138.305
		AscendingNode   -5.42268
		ArgOfPericenter 173.169
		MeanAnomaly     111.291
	}
}

Comet	"C40"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.44297e-017
	Radius          0.0364961
	InertiaMoment   0.399756

	Oblateness      0.0321747

	RotationPeriod  31.6106
	Obliquity       294.164
	EqAscendNode    42.9592
	Precession      0

	AbsMagn         9.41341
	SlopeParam      4.49513
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.543 0.538 0.533)

	Surface
	{
		SurfStyle       0.880752
		OceanStyle      0.0759528
		Randomize      (-0.729, 0.127, 0.092)
		colorDistMagn   0.880325
		colorDistFreq   5.85157e-007
		detailScale     0.996586
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997377
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67669
		terraceProb     0.130568
		erosion         0
		montesMagn      0.56389
		montesFreq      3.02121
		montesSpiky     0.919342
		montesFraction  0.6102
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.75502e-006
		hillsFraction   0.606323
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202615
		craterFreq      0.173167
		craterDensity   0.812827
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502111
		volcanoTemp     1428.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.188, 0.213, 0.050)
		colorShelf     (0.217, 0.221, 0.245, 0.040)
		colorBeach     (0.250, 0.253, 0.277, 0.030)
		colorDesert    (0.282, 0.285, 0.315, 0.020)
		colorLowland   (0.315, 0.318, 0.347, 0.030)
		colorUpland    (0.348, 0.350, 0.379, 0.050)
		colorRock      (0.380, 0.382, 0.421, 0.020)
		colorSnow      (0.380, 0.382, 0.421, 1.000)
		BumpHeight      0.0328465
		BumpOffset      0.00656929
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0938926
		DustBright  0.324081
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.38416
		Period          44.1869
		Eccentricity    0.99221
		Inclination     159.742
		AscendingNode   9.42437
		ArgOfPericenter -168.943
		MeanAnomaly     45.1899
	}
}

Comet	"C41"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.11603e-013
	Radius          0.657809
	InertiaMoment   0.398608

	Oblateness      0.0277042

	RotationPeriod  29.577
	Obliquity       247.369
	EqAscendNode    27.5366
	Precession      0

	AbsMagn         5.90629
	SlopeParam      5.10584
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.469 0.464 0.459)

	Surface
	{
		SurfStyle       0.852913
		OceanStyle      0.84731
		Randomize      (-0.853, 0.547, -0.414)
		colorDistMagn   0.227294
		colorDistFreq   0.000374608
		detailScale     17.9626
		colorConversion true
		snowLevel       2
		tropicLatitude  0.949551
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519832
		terraceProb     0.442491
		erosion         0
		montesMagn      0.317149
		montesFreq      2.61949
		montesSpiky     0.948013
		montesFraction  0.639844
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000818252
		hillsFraction   0.525223
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241233
		craterFreq      0.193011
		craterDensity   0.848661
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477098
		volcanoTemp     1733.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.162, 0.184, 0.050)
		colorShelf     (0.188, 0.190, 0.211, 0.040)
		colorBeach     (0.216, 0.218, 0.239, 0.030)
		colorDesert    (0.244, 0.246, 0.271, 0.020)
		colorLowland   (0.272, 0.273, 0.298, 0.030)
		colorUpland    (0.300, 0.301, 0.326, 0.050)
		colorRock      (0.328, 0.329, 0.363, 0.020)
		colorSnow      (0.328, 0.329, 0.363, 1.000)
		BumpHeight      0.592028
		BumpOffset      0.118406
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.2634
		GasToDust   0.25
		Particles   1511
		GasBright   0.256012
		DustBright  0.646448
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.3871
		Period          51.457
		Eccentricity    0.970511
		Inclination     26.8679
		AscendingNode   -85.9253
		ArgOfPericenter 111.52
		MeanAnomaly     -84.2927
	}
}

Comet	"C42"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            8.6317e-010
	Radius          14.2581
	InertiaMoment   0.396375

	Oblateness      0.0418951

	RotationPeriod  27.4827
	Obliquity       200.575
	EqAscendNode    12.114
	Precession      0

	AbsMagn         14.7828
	SlopeParam      5.84539
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.830 0.766 0.716)

	Surface
	{
		SurfStyle       0.184325
		OceanStyle      0.000920607
		Randomize      (-0.011, -0.071, 0.704)
		colorDistMagn   0.451882
		colorDistFreq   0.103982
		detailScale     389.341
		colorConversion true
		snowLevel       2
		tropicLatitude  0.362129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.363682
		terraceProb     0.444271
		erosion         0
		montesMagn      0.435201
		montesFreq      3.16798
		montesSpiky     0.90356
		montesFraction  0.716784
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.637659
		hillsFraction   0.481859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252645
		craterFreq      0.164861
		craterDensity   0.75466
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526133
		volcanoTemp     1518.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.332, 0.306, 0.286, 0.000)
		colorShelf     (0.353, 0.325, 0.304, 0.000)
		colorBeach     (0.374, 0.344, 0.322, 0.000)
		colorDesert    (0.394, 0.364, 0.340, 0.000)
		colorLowland   (0.415, 0.383, 0.358, 0.000)
		colorUpland    (0.436, 0.402, 0.376, 0.000)
		colorRock      (0.457, 0.421, 0.394, 0.000)
		colorSnow      (0.478, 0.440, 0.411, 1.000)
		BumpHeight      12.8323
		BumpOffset      2.56646
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.744592
		GasToDust   0.25
		Particles   2484
		GasBright   0.201163
		DustBright  0.385784
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.36221
		Period          44.032
		Eccentricity    0.974137
		Inclination     -165.975
		AscendingNode   -106.243
		ArgOfPericenter -47.9674
		MeanAnomaly     36.0869
	}
}

Comet	"C43"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.65777e-017
	Radius          0.0407441
	InertiaMoment   0.399102

	Oblateness      0.037801

	RotationPeriod  25.3165
	Obliquity       153.781
	EqAscendNode    356.691
	Precession      0

	AbsMagn         9.19338
	SlopeParam      7.01242
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.780 0.779)

	Surface
	{
		SurfStyle       0.211721
		OceanStyle      0.462285
		Randomize      (0.943, 0.377, 0.435)
		colorDistMagn   0.672522
		colorDistFreq   1.31377e-006
		detailScale     1.11259
		colorConversion true
		snowLevel       2
		tropicLatitude  0.206937
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418708
		terraceProb     0.458047
		erosion         0
		montesMagn      0.547657
		montesFreq      2.93048
		montesSpiky     0.97451
		montesFraction  0.248495
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.19636e-006
		hillsFraction   0.641867
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234618
		craterFreq      0.19948
		craterDensity   0.875123
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529272
		volcanoTemp     1671.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.312, 0.311, 0.000)
		colorShelf     (0.332, 0.331, 0.331, 0.000)
		colorBeach     (0.351, 0.351, 0.350, 0.000)
		colorDesert    (0.371, 0.370, 0.370, 0.000)
		colorLowland   (0.391, 0.390, 0.389, 0.000)
		colorUpland    (0.410, 0.409, 0.409, 0.000)
		colorRock      (0.430, 0.429, 0.428, 0.000)
		colorSnow      (0.449, 0.448, 0.448, 1.000)
		BumpHeight      0.0366697
		BumpOffset      0.00733394
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.109055
		DustBright  0.162379
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.99897
		Period          48.5997
		Eccentricity    0.992463
		Inclination     -154.955
		AscendingNode   -27.7005
		ArgOfPericenter -42.8817
		MeanAnomaly     59.2743
	}
}

Comet	"C44"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.05559e-013
	Radius          0.882842
	InertiaMoment   0.397635

	Oblateness      0.0595737

	RotationPeriod  23.0648
	Obliquity       106.986
	EqAscendNode    341.269
	Precession      0

	AbsMagn         5.66305
	SlopeParam      2.35028
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.674 0.671 0.667)

	Surface
	{
		SurfStyle       0.246861
		OceanStyle      0.0243408
		Randomize      (0.554, 0.805, -0.513)
		colorDistMagn   0.388458
		colorDistFreq   0.000364019
		detailScale     24.1075
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998241
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608347
		terraceProb     0.388063
		erosion         0
		montesMagn      0.365456
		montesFreq      3.63694
		montesSpiky     0.822089
		montesFraction  0.655792
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00205594
		hillsFraction   0.816149
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229732
		craterFreq      0.217663
		craterDensity   1.00371
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453925
		volcanoTemp     1428.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.268, 0.267, 0.000)
		colorShelf     (0.286, 0.285, 0.283, 0.000)
		colorBeach     (0.303, 0.302, 0.300, 0.000)
		colorDesert    (0.320, 0.319, 0.317, 0.000)
		colorLowland   (0.337, 0.335, 0.334, 0.000)
		colorUpland    (0.354, 0.352, 0.350, 0.000)
		colorRock      (0.370, 0.369, 0.367, 0.000)
		colorSnow      (0.387, 0.386, 0.384, 1.000)
		BumpHeight      0.794558
		BumpOffset      0.158912
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.296226
		GasToDust   0.25
		Particles   1578
		GasBright   0.348342
		DustBright  0.407578
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.5337
		Period          52.5498
		Eccentricity    0.980339
		Inclination     -135.517
		AscendingNode   102.859
		ArgOfPericenter -168.472
		MeanAnomaly     67.9574
	}
}

Comet	"C45"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.58985e-009
	Radius          15.9231
	InertiaMoment   0.399546

	Oblateness      0.0564515

	RotationPeriod  20.7111
	Obliquity       60.192
	EqAscendNode    325.846
	Precession      0

	AbsMagn         14.0319
	SlopeParam      3.04668
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.779 0.778)

	Surface
	{
		SurfStyle       0.0247789
		OceanStyle      0.33764
		Randomize      (-0.221, 0.552, -0.727)
		colorDistMagn   0.958032
		colorDistFreq   0.107954
		detailScale     434.807
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996509
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613101
		terraceProb     0.162181
		erosion         0
		montesMagn      0.634499
		montesFreq      3.04688
		montesSpiky     0.996471
		montesFraction  0.842001
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.507764
		hillsFraction   0.731188
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224761
		craterFreq      0.228596
		craterDensity   0.847043
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530588
		volcanoTemp     1640.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.312, 0.311, 0.000)
		colorShelf     (0.332, 0.331, 0.331, 0.000)
		colorBeach     (0.351, 0.351, 0.350, 0.000)
		colorDesert    (0.371, 0.370, 0.370, 0.000)
		colorLowland   (0.390, 0.389, 0.389, 0.000)
		colorUpland    (0.410, 0.409, 0.409, 0.000)
		colorRock      (0.429, 0.428, 0.428, 0.000)
		colorSnow      (0.449, 0.448, 0.448, 1.000)
		BumpHeight      14.3308
		BumpOffset      2.86616
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.777418
		GasToDust   0.25
		Particles   2550
		GasBright   0.00874821
		DustBright  0.431658
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.8604
		Period          33.8741
		Eccentricity    0.959667
		Inclination     -148.093
		AscendingNode   42.4315
		ArgOfPericenter 22.6717
		MeanAnomaly     44.9599
	}
}

Comet	"C46"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.89528e-017
	Radius          0.0546651
	InertiaMoment   0.398331

	Oblateness      0.0952674

	RotationPeriod  18.2345
	Obliquity       13.3978
	EqAscendNode    310.424
	Precession      0

	AbsMagn         8.9769
	SlopeParam      3.64154
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.701 0.649 0.582)

	Surface
	{
		SurfStyle       0.360164
		OceanStyle      0.977307
		Randomize      (-0.242, -0.098, -0.199)
		colorDistMagn   0.770571
		colorDistFreq   1.26805e-006
		detailScale     1.49272
		colorConversion true
		snowLevel       2
		tropicLatitude  0.21889
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508152
		terraceProb     0.116293
		erosion         0
		montesMagn      0.448188
		montesFreq      3.24295
		montesSpiky     0.943284
		montesFraction  0.718654
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.36954e-006
		hillsFraction   0.602931
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242622
		craterFreq      0.200083
		craterDensity   0.906182
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509225
		volcanoTemp     1544.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.260, 0.233, 0.000)
		colorShelf     (0.298, 0.276, 0.247, 0.000)
		colorBeach     (0.316, 0.292, 0.262, 0.000)
		colorDesert    (0.333, 0.308, 0.276, 0.000)
		colorLowland   (0.351, 0.325, 0.291, 0.000)
		colorUpland    (0.368, 0.341, 0.305, 0.000)
		colorRock      (0.386, 0.357, 0.320, 0.000)
		colorSnow      (0.403, 0.373, 0.335, 1.000)
		BumpHeight      0.0491986
		BumpOffset      0.00983972
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0729826
		DustBright  0.85191
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.17622
		Period          23.5931
		Eccentricity    0.944043
		Inclination     -179.242
		AscendingNode   -174.218
		ArgOfPericenter 175.439
		MeanAnomaly     -155.389
	}
}

Comet	"C47"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.78614e-013
	Radius          0.986253
	InertiaMoment   0.399969

	Oblateness      0.0993359

	RotationPeriod  15.6082
	Obliquity       326.603
	EqAscendNode    295.001
	Precession      0

	AbsMagn         5.41084
	SlopeParam      4.20568
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.689 0.687)

	Surface
	{
		SurfStyle       0.977944
		OceanStyle      0.733869
		Randomize      (-0.259, 0.467, -0.294)
		colorDistMagn   0.181303
		colorDistFreq   0.000404959
		detailScale     26.9313
		colorConversion true
		snowLevel       2
		tropicLatitude  0.954889
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.663245
		terraceProb     0.202845
		erosion         0
		montesMagn      0.421651
		montesFreq      3.0392
		montesSpiky     0.9515
		montesFraction  0.617957
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00292884
		hillsFraction   0.604029
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192952
		craterFreq      0.251891
		craterDensity   0.756561
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.428144
		volcanoTemp     1617.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.241, 0.275, 0.050)
		colorShelf     (0.277, 0.282, 0.316, 0.040)
		colorBeach     (0.319, 0.324, 0.357, 0.030)
		colorDesert    (0.360, 0.365, 0.405, 0.020)
		colorLowland   (0.402, 0.406, 0.446, 0.030)
		colorUpland    (0.444, 0.448, 0.488, 0.050)
		colorRock      (0.485, 0.489, 0.543, 0.020)
		colorSnow      (0.485, 0.489, 0.543, 1.000)
		BumpHeight      0.887628
		BumpOffset      0.177526
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.329052
		GasToDust   0.25
		Particles   1644
		GasBright   0.0840666
		DustBright  0.525313
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.69106
		Period          39.3831
		Eccentricity    0.964882
		Inclination     -50.0955
		AscendingNode   -55.5889
		ArgOfPericenter 52.5207
		MeanAnomaly     75.7152
	}
}

Comet	"C48"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.92831e-009
	Radius          21.3571
	InertiaMoment   0.398867

	Oblateness      0.193214

	RotationPeriod  12.7971
	Obliquity       279.809
	EqAscendNode    279.578
	Precession      0

	AbsMagn         13.4483
	SlopeParam      4.78704
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.491 0.487 0.479)

	Surface
	{
		SurfStyle       0.560022
		OceanStyle      0.838162
		Randomize      (-0.329, -0.284, 0.059)
		colorDistMagn   0.089681
		colorDistFreq   0.403172
		detailScale     583.192
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975138
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344946
		terraceProb     0.298642
		erosion         0
		montesMagn      0.509582
		montesFreq      3.6119
		montesSpiky     0.972948
		montesFraction  0.625312
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.812822
		hillsFraction   0.643897
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246354
		craterFreq      0.196183
		craterDensity   0.868834
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514189
		volcanoTemp     1471.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.165, 0.134, 0.000)
		colorShelf     (0.196, 0.170, 0.153, 0.000)
		colorBeach     (0.231, 0.200, 0.182, 0.000)
		colorDesert    (0.250, 0.214, 0.177, 0.000)
		colorLowland   (0.275, 0.229, 0.201, 0.000)
		colorUpland    (0.304, 0.277, 0.244, 0.000)
		colorRock      (0.329, 0.302, 0.263, 0.000)
		colorSnow      (0.358, 0.321, 0.278, 1.000)
		BumpHeight      19.2214
		BumpOffset      3.84428
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.810244
		GasToDust   0.25
		Particles   2616
		GasBright   0.0578915
		DustBright  0.235975
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.0115
		Period          63.9875
		Eccentricity    0.974304
		Inclination     126.019
		AscendingNode   66.1875
		ArgOfPericenter 23.3673
		MeanAnomaly     76.7531
	}
}

Comet	"C49"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            9.01647e-017
	Radius          0.0610868
	InertiaMoment   0.397152

	Oblateness      0.249

	RotationPeriod  9.75307
	Obliquity       233.015
	EqAscendNode    264.156
	Precession      0

	AbsMagn         8.76324
	SlopeParam      5.44567
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.407 0.404 0.401)

	Surface
	{
		SurfStyle       0.88193
		OceanStyle      0.82111
		Randomize      (-0.267, -0.543, -0.900)
		colorDistMagn   0.825647
		colorDistFreq   1.1551e-006
		detailScale     1.66808
		colorConversion true
		snowLevel       2
		tropicLatitude  0.802425
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537684
		terraceProb     0.290111
		erosion         0
		montesMagn      0.528397
		montesFreq      3.08245
		montesSpiky     0.910858
		montesFraction  0.608704
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.43585e-006
		hillsFraction   0.6324
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239536
		craterFreq      0.165697
		craterDensity   0.799631
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556519
		volcanoTemp     1220.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.139, 0.141, 0.160, 0.050)
		colorShelf     (0.163, 0.166, 0.184, 0.040)
		colorBeach     (0.187, 0.190, 0.209, 0.030)
		colorDesert    (0.212, 0.214, 0.237, 0.020)
		colorLowland   (0.236, 0.238, 0.261, 0.030)
		colorUpland    (0.261, 0.263, 0.285, 0.050)
		colorRock      (0.285, 0.287, 0.317, 0.020)
		colorSnow      (0.285, 0.287, 0.317, 1.000)
		BumpHeight      0.0549781
		BumpOffset      0.0109956
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.199293
		DustBright  0.579059
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.2094
		Period          57.6863
		Eccentricity    0.982203
		Inclination     24.8982
		AscendingNode   -98.733
		ArgOfPericenter 114.905
		MeanAnomaly     53.9275
	}
}

Comet	"C50"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.97359e-013
	Radius          1.32246
	InertiaMoment   0.399331

	Oblateness      0.249

	RotationPeriod  6.40768
	Obliquity       186.221
	EqAscendNode    248.733
	Precession      0

	AbsMagn         5.14788
	SlopeParam      6.32207
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.472 0.468 0.465)

	Surface
	{
		SurfStyle       0.853547
		OceanStyle      0.183071
		Randomize      (0.813, 0.448, 0.442)
		colorDistMagn   0.370315
		colorDistFreq   0.000770211
		detailScale     36.1119
		colorConversion true
		snowLevel       2
		tropicLatitude  0.417084
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382653
		terraceProb     0.407146
		erosion         0
		montesMagn      0.326584
		montesFreq      3.32359
		montesSpiky     0.916496
		montesFraction  0.588096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00558691
		hillsFraction   0.796682
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250721
		craterFreq      0.207874
		craterDensity   0.912336
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477737
		volcanoTemp     1335.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.164, 0.186, 0.050)
		colorShelf     (0.189, 0.192, 0.214, 0.040)
		colorBeach     (0.217, 0.220, 0.242, 0.030)
		colorDesert    (0.245, 0.248, 0.274, 0.020)
		colorLowland   (0.274, 0.276, 0.302, 0.030)
		colorUpland    (0.302, 0.304, 0.330, 0.050)
		colorRock      (0.330, 0.332, 0.368, 0.020)
		colorSnow      (0.330, 0.332, 0.368, 1.000)
		BumpHeight      1.19021
		BumpOffset      0.238042
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.361878
		GasToDust   0.25
		Particles   1710
		GasBright   0.145836
		DustBright  0.317003
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.36653
		Period          24.6919
		Eccentricity    0.964015
		Inclination     -150.146
		AscendingNode   149.928
		ArgOfPericenter -52.8678
		MeanAnomaly     142.691
	}
}

Comet	"C51"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.39357e-009
	Radius          23.8729
	InertiaMoment   0.398017

	Oblateness      0.249

	RotationPeriod  2.65833
	Obliquity       139.426
	EqAscendNode    233.311
	Precession      0

	AbsMagn         12.962
	SlopeParam      8.59905
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.794 0.777 0.745)

	Surface
	{
		SurfStyle       0.166155
		OceanStyle      0.00440052
		Randomize      (-0.303, -0.138, -0.164)
		colorDistMagn   0.736459
		colorDistFreq   0.102796
		detailScale     651.889
		colorConversion true
		snowLevel       2
		tropicLatitude  0.656534
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.715449
		terraceProb     0.125862
		erosion         0
		montesMagn      0.519744
		montesFreq      2.3795
		montesSpiky     0.986923
		montesFraction  0.543862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.26734
		hillsFraction   0.615614
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249826
		craterFreq      0.234384
		craterDensity   0.938019
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511141
		volcanoTemp     1172.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.311, 0.298, 0.000)
		colorShelf     (0.337, 0.330, 0.317, 0.000)
		colorBeach     (0.357, 0.350, 0.335, 0.000)
		colorDesert    (0.377, 0.369, 0.354, 0.000)
		colorLowland   (0.397, 0.389, 0.372, 0.000)
		colorUpland    (0.417, 0.408, 0.391, 0.000)
		colorRock      (0.437, 0.427, 0.410, 0.000)
		colorSnow      (0.456, 0.447, 0.428, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.84307
		GasToDust   0.25
		Particles   2682
		GasBright   0.354428
		DustBright  0.592898
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.37428
		Period          37.2496
		Eccentricity    0.985469
		Inclination     135.3
		AscendingNode   117.944
		ArgOfPericenter 166.728
		MeanAnomaly     43.3729
	}
}

Comet	"C52"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.66072e-016
	Radius          0.081889
	InertiaMoment   0.399761

	Oblateness      0.0020898

	RotationPeriod  122.883
	Obliquity       92.632
	EqAscendNode    217.888
	Precession      0

	AbsMagn         8.55175
	SlopeParam      2.71327
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.633 0.628 0.626)

	Surface
	{
		SurfStyle       0.0777026
		OceanStyle      0.209112
		Randomize      (0.281, -0.338, 0.749)
		colorDistMagn   0.925808
		colorDistFreq   3.76988e-006
		detailScale     2.23611
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983091
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347583
		terraceProb     0.364053
		erosion         0
		montesMagn      0.525706
		montesFreq      3.52658
		montesSpiky     0.854164
		montesFraction  0.7385
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.84311e-005
		hillsFraction   0.653875
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231646
		craterFreq      0.203494
		craterDensity   0.810247
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514031
		volcanoTemp     1193.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.251, 0.250, 0.000)
		colorShelf     (0.269, 0.267, 0.266, 0.000)
		colorBeach     (0.285, 0.282, 0.282, 0.000)
		colorDesert    (0.301, 0.298, 0.297, 0.000)
		colorLowland   (0.317, 0.314, 0.313, 0.000)
		colorUpland    (0.333, 0.330, 0.329, 0.000)
		colorRock      (0.348, 0.345, 0.344, 0.000)
		colorSnow      (0.364, 0.361, 0.360, 1.000)
		BumpHeight      0.0737001
		BumpOffset      0.01474
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.273689
		DustBright  0.358123
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.68249
		Period          26.5527
		Eccentricity    0.966606
		Inclination     -166.34
		AscendingNode   -164.877
		ArgOfPericenter -38.2115
		MeanAnomaly     91.5337
	}
}

Comet	"C53"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.28445e-012
	Radius          1.47863
	InertiaMoment   0.398615

	Oblateness      0.00192278

	RotationPeriod  111.529
	Obliquity       45.8377
	EqAscendNode    202.466
	Precession      0

	AbsMagn         4.87197
	SlopeParam      3.34725
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.598 0.463 0.331)

	Surface
	{
		SurfStyle       0.26591
		OceanStyle      0.385611
		Randomize      (-0.610, -0.885, 0.217)
		colorDistMagn   0.325422
		colorDistFreq   0.000637994
		detailScale     40.3765
		colorConversion true
		snowLevel       2
		tropicLatitude  0.788068
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.746459
		terraceProb     0.256741
		erosion         0
		montesMagn      0.454009
		montesFreq      2.52852
		montesSpiky     0.896204
		montesFraction  0.574529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00468759
		hillsFraction   0.597853
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254387
		craterFreq      0.220211
		craterDensity   1.00011
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450852
		volcanoTemp     1715.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.185, 0.132, 0.000)
		colorShelf     (0.254, 0.197, 0.141, 0.000)
		colorBeach     (0.269, 0.209, 0.149, 0.000)
		colorDesert    (0.284, 0.220, 0.157, 0.000)
		colorLowland   (0.299, 0.232, 0.165, 0.000)
		colorUpland    (0.314, 0.243, 0.174, 0.000)
		colorRock      (0.329, 0.255, 0.182, 0.000)
		colorSnow      (0.344, 0.267, 0.190, 1.000)
		BumpHeight      1.33077
		BumpOffset      0.266154
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.394704
		GasToDust   0.25
		Particles   1777
		GasBright   0.155691
		DustBright  0.160608
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.6903
		Period          53.7263
		Eccentricity    0.982155
		Inclination     -86.2847
		AscendingNode   -157.367
		ArgOfPericenter 90.8246
		MeanAnomaly     33.6701
	}
}

Comet	"C54"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            9.93428e-009
	Radius          31.9944
	InertiaMoment   0.396402

	Oblateness      0.00285487

	RotationPeriod  104.32
	Obliquity       359.043
	EqAscendNode    187.043
	Precession      0

	AbsMagn         12.5397
	SlopeParam      3.92051
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.579 0.573 0.570)

	Surface
	{
		SurfStyle       0.268029
		OceanStyle      0.944773
		Randomize      (0.116, 0.645, -0.801)
		colorDistMagn   0.988272
		colorDistFreq   0.248044
		detailScale     873.661
		colorConversion true
		snowLevel       2
		tropicLatitude  0.182475
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565188
		terraceProb     0.247355
		erosion         0
		montesMagn      0.617249
		montesFreq      2.18895
		montesSpiky     0.989168
		montesFraction  0.39937
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.98319
		hillsFraction   0.522655
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27468
		craterFreq      0.184014
		craterDensity   0.991993
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524239
		volcanoTemp     1675.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.229, 0.228, 0.000)
		colorShelf     (0.246, 0.244, 0.242, 0.000)
		colorBeach     (0.261, 0.258, 0.256, 0.000)
		colorDesert    (0.275, 0.272, 0.271, 0.000)
		colorLowland   (0.290, 0.287, 0.285, 0.000)
		colorUpland    (0.304, 0.301, 0.299, 0.000)
		colorRock      (0.318, 0.315, 0.313, 0.000)
		colorSnow      (0.333, 0.330, 0.328, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.875896
		GasToDust   0.25
		Particles   2749
		GasBright   0.0410573
		DustBright  0.759728
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.1046
		Period          49.372
		Eccentricity    0.978166
		Inclination     -11.467
		AscendingNode   -175.26
		ArgOfPericenter 69.1413
		MeanAnomaly     148.897
	}
}

Comet	"C55"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.05885e-016
	Radius          0.0915828
	InertiaMoment   0.399108

	Oblateness      0.00244671

	RotationPeriod  98.8491
	Obliquity       312.249
	EqAscendNode    171.62
	Precession      0

	AbsMagn         8.34178
	SlopeParam      4.48717
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.811 0.717 0.661)

	Surface
	{
		SurfStyle       0.193502
		OceanStyle      0.57799
		Randomize      (0.567, -0.494, -0.936)
		colorDistMagn   0.16598
		colorDistFreq   1.26127e-006
		detailScale     2.50082
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996282
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561907
		terraceProb     0.105217
		erosion         0
		montesMagn      0.531126
		montesFreq      2.34823
		montesSpiky     0.964135
		montesFraction  0.393857
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.40143e-005
		hillsFraction   0.671281
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254021
		craterFreq      0.184701
		craterDensity   0.86305
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518139
		volcanoTemp     1599.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.324, 0.287, 0.264, 0.000)
		colorShelf     (0.345, 0.305, 0.281, 0.000)
		colorBeach     (0.365, 0.323, 0.298, 0.000)
		colorDesert    (0.385, 0.341, 0.314, 0.000)
		colorLowland   (0.405, 0.359, 0.331, 0.000)
		colorUpland    (0.426, 0.377, 0.347, 0.000)
		colorRock      (0.446, 0.394, 0.364, 0.000)
		colorSnow      (0.466, 0.412, 0.380, 1.000)
		BumpHeight      0.0824245
		BumpOffset      0.0164849
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0535335
		DustBright  0.431739
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.75552
		Period          26.9891
		Eccentricity    0.96838
		Inclination     61.0796
		AscendingNode   -129.405
		ArgOfPericenter -154.275
		MeanAnomaly     87.2331
	}
}

Comet	"C56"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.36579e-012
	Radius          1.9812
	InertiaMoment   0.397645

	Oblateness      0.00349601

	RotationPeriod  94.3513
	Obliquity       265.455
	EqAscendNode    156.198
	Precession      0

	AbsMagn         4.58031
	SlopeParam      5.09686
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.695 0.596 0.445)

	Surface
	{
		SurfStyle       0.663683
		OceanStyle      0.97461
		Randomize      (0.568, -0.000, -0.628)
		colorDistMagn   0.701834
		colorDistFreq   0.00123468
		detailScale     54.0999
		colorConversion true
		snowLevel       2
		tropicLatitude  0.73178
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.620347
		terraceProb     0.205168
		erosion         0
		montesMagn      0.458028
		montesFreq      2.62923
		montesSpiky     0.996082
		montesFraction  0.539303
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00912696
		hillsFraction   0.686841
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2311
		craterFreq      0.218751
		craterDensity   0.851706
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509886
		volcanoTemp     1328.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.203, 0.125, 0.000)
		colorShelf     (0.278, 0.209, 0.142, 0.000)
		colorBeach     (0.327, 0.244, 0.169, 0.000)
		colorDesert    (0.354, 0.262, 0.165, 0.000)
		colorLowland   (0.389, 0.280, 0.187, 0.000)
		colorUpland    (0.431, 0.340, 0.227, 0.000)
		colorRock      (0.466, 0.369, 0.245, 0.000)
		colorSnow      (0.507, 0.393, 0.258, 1.000)
		BumpHeight      1.78308
		BumpOffset      0.356616
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.427529
		GasToDust   0.25
		Particles   1843
		GasBright   0.16424
		DustBright  0.805519
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.62274
		Period          32.3495
		Eccentricity    0.977141
		Inclination     125.66
		AscendingNode   -38.3311
		ArgOfPericenter -166.238
		MeanAnomaly     -114.893
	}
}

Comet	"C57"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.82977e-008
	Radius          35.7903
	InertiaMoment   0.399551

	Oblateness      0.00291852

	RotationPeriod  90.4796
	Obliquity       218.66
	EqAscendNode    140.775
	Precession      0

	AbsMagn         12.1627
	SlopeParam      5.83361
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.499 0.494 0.491)

	Surface
	{
		SurfStyle       0.0771943
		OceanStyle      0.000401613
		Randomize      (-0.122, 0.631, 0.289)
		colorDistMagn   0.0898036
		colorDistFreq   1.05681
		detailScale     977.313
		colorConversion true
		snowLevel       2
		tropicLatitude  0.701411
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553302
		terraceProb     0.166953
		erosion         0
		montesMagn      0.629216
		montesFreq      3.39956
		montesSpiky     0.782352
		montesFraction  0.865906
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.01352
		hillsFraction   0.479066
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241858
		craterFreq      0.170063
		craterDensity   0.819312
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.585597
		volcanoTemp     1461.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.198, 0.196, 0.000)
		colorShelf     (0.212, 0.210, 0.209, 0.000)
		colorBeach     (0.224, 0.222, 0.221, 0.000)
		colorDesert    (0.237, 0.235, 0.233, 0.000)
		colorLowland   (0.249, 0.247, 0.245, 0.000)
		colorUpland    (0.262, 0.259, 0.258, 0.000)
		colorRock      (0.274, 0.272, 0.270, 0.000)
		colorSnow      (0.287, 0.284, 0.282, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.908722
		GasToDust   0.25
		Particles   2815
		GasBright   0.149434
		DustBright  0.504811
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.5291
		Period          60.1721
		Eccentricity    0.991444
		Inclination     173.303
		AscendingNode   -149.506
		ArgOfPericenter 87.9196
		MeanAnomaly     148.725
	}
}

Comet	"C58"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.634e-016
	Radius          0.122684
	InertiaMoment   0.398338

	Oblateness      0.00410622

	RotationPeriod  87.0454
	Obliquity       171.866
	EqAscendNode    125.353
	Precession      0

	AbsMagn         8.13276
	SlopeParam      6.98865
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.434 0.430 0.425)

	Surface
	{
		SurfStyle       0.542266
		OceanStyle      0.380849
		Randomize      (0.391, -0.880, -0.965)
		colorDistMagn   0.910442
		colorDistFreq   1.10758e-005
		detailScale     3.35008
		colorConversion true
		snowLevel       2
		tropicLatitude  0.130341
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.318446
		terraceProb     0.218524
		erosion         0
		montesMagn      0.447784
		montesFreq      2.61198
		montesSpiky     0.881647
		montesFraction  0.485607
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.25866e-005
		hillsFraction   0.573413
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246383
		craterFreq      0.213458
		craterDensity   0.853039
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473532
		volcanoTemp     1661.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.146, 0.119, 0.000)
		colorShelf     (0.174, 0.151, 0.136, 0.000)
		colorBeach     (0.204, 0.176, 0.161, 0.000)
		colorDesert    (0.222, 0.189, 0.157, 0.000)
		colorLowland   (0.243, 0.202, 0.178, 0.000)
		colorUpland    (0.269, 0.245, 0.217, 0.000)
		colorRock      (0.291, 0.267, 0.234, 0.000)
		colorSnow      (0.317, 0.284, 0.246, 1.000)
		BumpHeight      0.110415
		BumpOffset      0.0220831
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0973692
		DustBright  0.241363
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.94698
		Period          34.4353
		Eccentricity    0.964386
		Inclination     -0.790026
		AscendingNode   146.303
		ArgOfPericenter -128.496
		MeanAnomaly     -74.0983
	}
}

Comet	"C59"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.35749e-012
	Radius          2.21674
	InertiaMoment   0.399974

	Oblateness      0.00338909

	RotationPeriod  83.934
	Obliquity       125.072
	EqAscendNode    109.93
	Precession      0

	AbsMagn         4.26921
	SlopeParam      2.33941
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.572 0.468 0.393)

	Surface
	{
		SurfStyle       0.858967
		OceanStyle      0.572274
		Randomize      (-0.337, -0.301, 0.249)
		colorDistMagn   0.0820808
		colorDistFreq   0.00177846
		detailScale     60.5317
		colorConversion true
		snowLevel       2
		tropicLatitude  0.906963
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574689
		terraceProb     0.106143
		erosion         0
		montesMagn      0.417713
		montesFreq      3.03998
		montesSpiky     0.913094
		montesFraction  0.635582
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0123389
		hillsFraction   0.703102
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221708
		craterFreq      0.25865
		craterDensity   0.823022
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509104
		volcanoTemp     1246.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.164, 0.157, 0.050)
		colorShelf     (0.229, 0.192, 0.181, 0.040)
		colorBeach     (0.263, 0.220, 0.204, 0.030)
		colorDesert    (0.297, 0.248, 0.232, 0.020)
		colorLowland   (0.332, 0.276, 0.255, 0.030)
		colorUpland    (0.366, 0.304, 0.279, 0.050)
		colorRock      (0.400, 0.332, 0.310, 0.020)
		colorSnow      (0.400, 0.332, 0.310, 1.000)
		BumpHeight      1.99506
		BumpOffset      0.399013
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.460356
		GasToDust   0.25
		Particles   1909
		GasBright   0.285243
		DustBright  0.537975
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.05134
		Period          28.7811
		Eccentricity    0.970161
		Inclination     100.409
		AscendingNode   113.222
		ArgOfPericenter 26.628
		MeanAnomaly     -122.991
	}
}

Comet	"C60"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.37021e-008
	Radius          47.9347
	InertiaMoment   0.398873

	Oblateness      0.00472968

	RotationPeriod  81.0702
	Obliquity       78.2776
	EqAscendNode    94.5074
	Precession      0

	AbsMagn         11.8195
	SlopeParam      3.03803
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.719 0.560 0.498)

	Surface
	{
		SurfStyle       0.278108
		OceanStyle      0.707217
		Randomize      (-0.011, 0.936, -0.560)
		colorDistMagn   0.432703
		colorDistFreq   1.49967
		detailScale     1308.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984586
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387005
		terraceProb     0.159402
		erosion         0
		montesMagn      0.47119
		montesFreq      3.18861
		montesSpiky     0.842806
		montesFraction  0.903714
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.49385
		hillsFraction   0.488124
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249081
		craterFreq      0.2346
		craterDensity   1.00988
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4791
		volcanoTemp     1658.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.224, 0.199, 0.000)
		colorShelf     (0.306, 0.238, 0.212, 0.000)
		colorBeach     (0.324, 0.252, 0.224, 0.000)
		colorDesert    (0.342, 0.266, 0.237, 0.000)
		colorLowland   (0.360, 0.280, 0.249, 0.000)
		colorUpland    (0.378, 0.294, 0.262, 0.000)
		colorRock      (0.396, 0.308, 0.274, 0.000)
		colorSnow      (0.413, 0.322, 0.287, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.941548
		GasToDust   0.25
		Particles   2881
		GasBright   0.205896
		DustBright  0.301809
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.0547
		Period          49.0065
		Eccentricity    0.970561
		Inclination     1.7211
		AscendingNode   16.6161
		ArgOfPericenter -149.484
		MeanAnomaly     85.634
	}
}

Comet	"C61"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.03771e-015
	Radius          0.137297
	InertiaMoment   0.397166

	Oblateness      0.00383473

	RotationPeriod  78.4018
	Obliquity       31.4833
	EqAscendNode    79.0848
	Precession      0

	AbsMagn         7.92409
	SlopeParam      3.6337
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.733 0.730 0.725)

	Surface
	{
		SurfStyle       0.725939
		OceanStyle      0.219537
		Randomize      (0.954, -0.245, -0.158)
		colorDistMagn   0.813407
		colorDistFreq   1.0691e-005
		detailScale     3.74912
		colorConversion true
		snowLevel       2
		tropicLatitude  0.664556
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.4939
		terraceProb     0.435878
		erosion         0
		montesMagn      0.476478
		montesFreq      2.99769
		montesSpiky     0.906867
		montesFraction  0.297695
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.2299e-005
		hillsFraction   0.69811
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21748
		craterFreq      0.18998
		craterDensity   0.888984
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.598165
		volcanoTemp     1889.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.248, 0.203, 0.000)
		colorShelf     (0.293, 0.255, 0.232, 0.000)
		colorBeach     (0.344, 0.299, 0.276, 0.000)
		colorDesert    (0.374, 0.321, 0.268, 0.000)
		colorLowland   (0.410, 0.343, 0.305, 0.000)
		colorUpland    (0.454, 0.416, 0.370, 0.000)
		colorRock      (0.491, 0.452, 0.399, 0.000)
		colorSnow      (0.535, 0.482, 0.421, 1.000)
		BumpHeight      0.123567
		BumpOffset      0.0247135
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0119895
		GasToDust   0.25
		Particles   1004
		GasBright   0.46096
		DustBright  0.531231
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.19428
		Period          42.8526
		Eccentricity    0.963938
		Inclination     158.176
		AscendingNode   103.23
		ArgOfPericenter 71.0611
		MeanAnomaly     -60.3959
	}
}

Comet	"C62"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            8.02597e-012
	Radius          2.96837
	InertiaMoment   0.399336

	Oblateness      0.00539131

	RotationPeriod  75.8908
	Obliquity       344.689
	EqAscendNode    63.6622
	Precession      0

	AbsMagn         3.93374
	SlopeParam      4.19793
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.490 0.484)

	Surface
	{
		SurfStyle       0.163213
		OceanStyle      0.141903
		Randomize      (0.214, -0.624, -0.949)
		colorDistMagn   0.416695
		colorDistFreq   0.00524074
		detailScale     81.0563
		colorConversion true
		snowLevel       2
		tropicLatitude  0.29778
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.388111
		terraceProb     0.302035
		erosion         0
		montesMagn      0.47367
		montesFreq      2.87783
		montesSpiky     0.973254
		montesFraction  0.61002
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.016242
		hillsFraction   0.517847
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240837
		craterFreq      0.236933
		craterDensity   1.05311
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465551
		volcanoTemp     1414.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.196, 0.194, 0.000)
		colorShelf     (0.210, 0.208, 0.206, 0.000)
		colorBeach     (0.223, 0.221, 0.218, 0.000)
		colorDesert    (0.235, 0.233, 0.230, 0.000)
		colorLowland   (0.247, 0.245, 0.242, 0.000)
		colorUpland    (0.260, 0.257, 0.254, 0.000)
		colorRock      (0.272, 0.270, 0.266, 0.000)
		colorSnow      (0.284, 0.282, 0.278, 1.000)
		BumpHeight      2.67153
		BumpOffset      0.534307
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.493182
		GasToDust   0.25
		Particles   1976
		GasBright   0.0159921
		DustBright  0.660686
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.9352
		Period          55.5828
		Eccentricity    0.981385
		Inclination     -8.00455
		AscendingNode   -89.2596
		ArgOfPericenter -155.236
		MeanAnomaly     42.9769
	}
}

Comet	"C63"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.2075e-008
	Radius          53.6544
	InertiaMoment   0.398026

	Oblateness      0.00436618

	RotationPeriod  73.5087
	Obliquity       297.895
	EqAscendNode    48.2396
	Precession      0

	AbsMagn         11.5023
	SlopeParam      4.77871
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.723 0.667 0.597)

	Surface
	{
		SurfStyle       0.773125
		OceanStyle      0.0988977
		Randomize      (-0.205, -0.180, 0.936)
		colorDistMagn   0.96833
		colorDistFreq   1.00014
		detailScale     1465.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.916438
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541998
		terraceProb     0.299446
		erosion         0
		montesMagn      0.5114
		montesFreq      2.40229
		montesSpiky     0.940587
		montesFraction  0.502075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.91599
		hillsFraction   0.755694
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225308
		craterFreq      0.243343
		craterDensity   0.693746
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543756
		volcanoTemp     1624.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.227, 0.167, 0.000)
		colorShelf     (0.289, 0.233, 0.191, 0.000)
		colorBeach     (0.340, 0.273, 0.227, 0.000)
		colorDesert    (0.369, 0.293, 0.221, 0.000)
		colorLowland   (0.405, 0.313, 0.251, 0.000)
		colorUpland    (0.448, 0.380, 0.305, 0.000)
		colorRock      (0.484, 0.414, 0.328, 0.000)
		colorSnow      (0.528, 0.440, 0.346, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.974373
		GasToDust   0.25
		Particles   2948
		GasBright   0.0298606
		DustBright  0.331304
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.1725
		Period          57.4017
		Eccentricity    0.96804
		Inclination     -167.724
		AscendingNode   -107.649
		ArgOfPericenter -89.8118
		MeanAnomaly     89.6382
	}
}

Comet	"C64"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.91134e-015
	Radius          0.183819
	InertiaMoment   0.399767

	Oblateness      0.00611198

	RotationPeriod  71.2335
	Obliquity       251.1
	EqAscendNode    32.817
	Precession      0

	AbsMagn         7.71522
	SlopeParam      5.43567
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.656 0.655 0.653)

	Surface
	{
		SurfStyle       0.933354
		OceanStyle      0.859717
		Randomize      (0.088, -0.129, 0.533)
		colorDistMagn   0.660375
		colorDistFreq   1.23017e-005
		detailScale     5.01949
		colorConversion true
		snowLevel       2
		tropicLatitude  0.798845
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586893
		terraceProb     0.312077
		erosion         0
		montesMagn      0.621531
		montesFreq      3.61685
		montesSpiky     0.965221
		montesFraction  0.626602
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.25238e-005
		hillsFraction   0.617954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218631
		craterFreq      0.206193
		craterDensity   0.949514
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497
		volcanoTemp     1343.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.229, 0.261, 0.050)
		colorShelf     (0.263, 0.269, 0.300, 0.040)
		colorBeach     (0.302, 0.308, 0.339, 0.030)
		colorDesert    (0.341, 0.347, 0.385, 0.020)
		colorLowland   (0.381, 0.386, 0.424, 0.030)
		colorUpland    (0.420, 0.426, 0.463, 0.050)
		colorRock      (0.460, 0.465, 0.515, 0.020)
		colorSnow      (0.460, 0.465, 0.515, 1.000)
		BumpHeight      0.165437
		BumpOffset      0.0330874
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0448155
		GasToDust   0.25
		Particles   1070
		GasBright   0.119849
		DustBright  0.725802
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.31975
		Period          36.8864
		Eccentricity    0.964394
		Inclination     -144.512
		AscendingNode   -127.955
		ArgOfPericenter 0.0384699
		MeanAnomaly     39.1249
	}
}

Comet	"C65"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.47828e-011
	Radius          3.32313
	InertiaMoment   0.398621

	Oblateness      0.00494811

	RotationPeriod  69.0474
	Obliquity       204.306
	EqAscendNode    17.3944
	Precession      0

	AbsMagn         3.5669
	SlopeParam      6.30699
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.513 0.511 0.506)

	Surface
	{
		SurfStyle       0.919634
		OceanStyle      0.765184
		Randomize      (0.234, 0.879, -0.652)
		colorDistMagn   0.727455
		colorDistFreq   0.0088139
		detailScale     90.7435
		colorConversion true
		snowLevel       2
		tropicLatitude  0.452109
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.286127
		terraceProb     0.138548
		erosion         0
		montesMagn      0.644896
		montesFreq      3.08149
		montesSpiky     0.831607
		montesFraction  0.742802
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0131353
		hillsFraction   0.71631
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236072
		craterFreq      0.189674
		craterDensity   0.856327
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.600764
		volcanoTemp     1622.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.179, 0.202, 0.050)
		colorShelf     (0.205, 0.209, 0.233, 0.040)
		colorBeach     (0.236, 0.240, 0.263, 0.030)
		colorDesert    (0.267, 0.271, 0.299, 0.020)
		colorLowland   (0.298, 0.301, 0.329, 0.030)
		colorUpland    (0.328, 0.332, 0.359, 0.050)
		colorRock      (0.359, 0.363, 0.400, 0.020)
		colorSnow      (0.359, 0.363, 0.400, 1.000)
		BumpHeight      2.99081
		BumpOffset      0.598163
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.526007
		GasToDust   0.25
		Particles   2042
		GasBright   0.106435
		DustBright  0.423703
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.30221
		Period          36.7698
		Eccentricity    0.975832
		Inclination     14.9189
		AscendingNode   96.1344
		ArgOfPericenter -54.9971
		MeanAnomaly     145.299
	}
}

Comet	"C66"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.14334e-007
	Radius          71.8235
	InertiaMoment   0.396428

	Oblateness      0.00681674

	RotationPeriod  66.9365
	Obliquity       157.512
	EqAscendNode    1.97185
	Precession      0

	AbsMagn         11.2058
	SlopeParam      8.49671
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.676 0.674 0.671)

	Surface
	{
		SurfStyle       0.415453
		OceanStyle      0.120731
		Randomize      (-0.245, -0.313, 0.474)
		colorDistMagn   0.791394
		colorDistFreq   0.477959
		detailScale     1961.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.404727
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346059
		terraceProb     0.13993
		erosion         0
		montesMagn      0.512528
		montesFreq      2.2653
		montesSpiky     0.974617
		montesFraction  0.332843
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.5069
		hillsFraction   0.629722
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274637
		craterFreq      0.190704
		craterDensity   1.04681
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520779
		volcanoTemp     1618.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.270, 0.269, 0.000)
		colorShelf     (0.287, 0.286, 0.285, 0.000)
		colorBeach     (0.304, 0.303, 0.302, 0.000)
		colorDesert    (0.321, 0.320, 0.319, 0.000)
		colorLowland   (0.338, 0.337, 0.336, 0.000)
		colorUpland    (0.355, 0.354, 0.352, 0.000)
		colorRock      (0.372, 0.371, 0.369, 0.000)
		colorSnow      (0.388, 0.387, 0.386, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0557625
		DustBright  0.158862
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.43241
		Period          31.1455
		Eccentricity    0.956416
		Inclination     -2.80478
		AscendingNode   -63.2849
		ArgOfPericenter -47.5242
		MeanAnomaly     158.498
	}
}

Comet	"C67"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.52044e-015
	Radius          0.205819
	InertiaMoment   0.399114

	Oblateness      0.00559985

	RotationPeriod  64.8887
	Obliquity       110.718
	EqAscendNode    346.549
	Precession      0

	AbsMagn         7.50557
	SlopeParam      2.70377
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.576 0.420 0.340)

	Surface
	{
		SurfStyle       0.788862
		OceanStyle      0.956688
		Randomize      (-0.415, -0.151, -0.186)
		colorDistMagn   0.511405
		colorDistFreq   3.04635e-005
		detailScale     5.62024
		colorConversion true
		snowLevel       2
		tropicLatitude  0.431193
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531309
		terraceProb     0.143367
		erosion         0
		montesMagn      0.457148
		montesFreq      3.28714
		montesSpiky     0.965507
		montesFraction  0.67816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000131967
		hillsFraction   0.599741
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259317
		craterFreq      0.22089
		craterDensity   0.945418
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541223
		volcanoTemp     1497.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.143, 0.095, 0.000)
		colorShelf     (0.231, 0.147, 0.109, 0.000)
		colorBeach     (0.271, 0.172, 0.129, 0.000)
		colorDesert    (0.294, 0.185, 0.126, 0.000)
		colorLowland   (0.323, 0.197, 0.143, 0.000)
		colorUpland    (0.357, 0.239, 0.174, 0.000)
		colorRock      (0.386, 0.260, 0.187, 0.000)
		colorSnow      (0.421, 0.277, 0.197, 1.000)
		BumpHeight      0.185237
		BumpOffset      0.0370475
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0776413
		GasToDust   0.25
		Particles   1136
		GasBright   0.222918
		DustBright  0.476193
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.93547
		Period          41.056
		Eccentricity    0.982006
		Inclination     133.989
		AscendingNode   -167.331
		ArgOfPericenter -46.7118
		MeanAnomaly     -88.2123
	}
}

Comet	"C68"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.72281e-011
	Radius          4.44782
	InertiaMoment   0.397656

	Oblateness      0.00773537

	RotationPeriod  62.8942
	Obliquity       63.9232
	EqAscendNode    331.127
	Precession      0

	AbsMagn         3.15841
	SlopeParam      3.33911
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.554 0.548 0.542)

	Surface
	{
		SurfStyle       0.568851
		OceanStyle      0.356486
		Randomize      (0.679, 0.435, 0.723)
		colorDistMagn   0.839648
		colorDistFreq   0.0128304
		detailScale     121.455
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948648
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459252
		terraceProb     0.416841
		erosion         0
		montesMagn      0.609257
		montesFreq      3.14703
		montesSpiky     0.963212
		montesFraction  0.760873
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0590978
		hillsFraction   0.657406
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225017
		craterFreq      0.165229
		craterDensity   0.788511
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527565
		volcanoTemp     1573.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.186, 0.152, 0.000)
		colorShelf     (0.221, 0.192, 0.173, 0.000)
		colorBeach     (0.260, 0.225, 0.206, 0.000)
		colorDesert    (0.282, 0.241, 0.201, 0.000)
		colorLowland   (0.310, 0.258, 0.228, 0.000)
		colorUpland    (0.343, 0.313, 0.276, 0.000)
		colorRock      (0.371, 0.340, 0.298, 0.000)
		colorSnow      (0.404, 0.362, 0.314, 1.000)
		BumpHeight      4.00304
		BumpOffset      0.800607
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.558833
		GasToDust   0.25
		Particles   2108
		GasBright   0.144963
		DustBright  0.238634
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.37916
		Period          24.7654
		Eccentricity    0.96383
		Inclination     -32.9494
		AscendingNode   -96.1733
		ArgOfPericenter 159.572
		MeanAnomaly     -8.05712
	}
}

Comet	"C69"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.1059e-007
	Radius          80.4309
	InertiaMoment   0.399557

	Oblateness      0.00634363

	RotationPeriod  60.9444
	Obliquity       17.1289
	EqAscendNode    315.704
	Precession      0

	AbsMagn         10.9259
	SlopeParam      3.91278
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.699 0.696 0.695)

	Surface
	{
		SurfStyle       0.178305
		OceanStyle      0.0689366
		Randomize      (-0.559, -0.848, 0.967)
		colorDistMagn   0.473502
		colorDistFreq   4.68919
		detailScale     2196.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504614
		terraceProb     0.316922
		erosion         0
		montesMagn      0.525992
		montesFreq      2.60582
		montesSpiky     0.958688
		montesFraction  0.519328
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.3863
		hillsFraction   0.769577
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238449
		craterFreq      0.185395
		craterDensity   0.951068
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477232
		volcanoTemp     1557.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.279, 0.278, 0.000)
		colorShelf     (0.297, 0.296, 0.295, 0.000)
		colorBeach     (0.314, 0.313, 0.313, 0.000)
		colorDesert    (0.332, 0.331, 0.330, 0.000)
		colorLowland   (0.349, 0.348, 0.347, 0.000)
		colorUpland    (0.367, 0.366, 0.365, 0.000)
		colorRock      (0.384, 0.383, 0.382, 0.000)
		colorSnow      (0.402, 0.400, 0.400, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.379309
		DustBright  0.488775
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.9259
		Period          63.3053
		Eccentricity    0.976191
		Inclination     -105.312
		AscendingNode   -76.0847
		ArgOfPericenter 26.8821
		MeanAnomaly     -154.225
	}
}

Comet	"C70"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.48422e-015
	Radius          0.275443
	InertiaMoment   0.398346

	Oblateness      0.0087794

	RotationPeriod  59.0319
	Obliquity       330.335
	EqAscendNode    300.281
	Precession      0

	AbsMagn         7.29455
	SlopeParam      4.47923
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.538 0.535)

	Surface
	{
		SurfStyle       0.244779
		OceanStyle      0.647693
		Randomize      (0.718, 0.441, 0.656)
		colorDistMagn   0.454688
		colorDistFreq   5.70811e-005
		detailScale     7.52142
		colorConversion true
		snowLevel       2
		tropicLatitude  0.791705
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551777
		terraceProb     0.411883
		erosion         0
		montesMagn      0.46892
		montesFreq      3.40111
		montesSpiky     0.942591
		montesFraction  0.582058
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000184348
		hillsFraction   0.671903
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250472
		craterFreq      0.207796
		craterDensity   0.878011
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.431825
		volcanoTemp     1513.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.215, 0.214, 0.000)
		colorShelf     (0.232, 0.229, 0.228, 0.000)
		colorBeach     (0.246, 0.242, 0.241, 0.000)
		colorDesert    (0.259, 0.256, 0.254, 0.000)
		colorLowland   (0.273, 0.269, 0.268, 0.000)
		colorUpland    (0.287, 0.282, 0.281, 0.000)
		colorRock      (0.300, 0.296, 0.294, 0.000)
		colorSnow      (0.314, 0.309, 0.308, 1.000)
		BumpHeight      0.247899
		BumpOffset      0.0495797
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.110467
		GasToDust   0.25
		Particles   1202
		GasBright   0.274072
		DustBright  0.278498
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.39498
		Period          37.3878
		Eccentricity    0.984534
		Inclination     -102.19
		AscendingNode   27.9286
		ArgOfPericenter 103.699
		MeanAnomaly     122.44
	}
}

Comet	"C71"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.01507e-011
	Radius          4.98146
	InertiaMoment   0.399979

	Oblateness      0.0072081

	RotationPeriod  57.1501
	Obliquity       283.54
	EqAscendNode    284.859
	Precession      0

	AbsMagn         2.69202
	SlopeParam      5.0879
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.519 0.511 0.506)

	Surface
	{
		SurfStyle       0.448703
		OceanStyle      0.0406513
		Randomize      (0.062, 0.463, -0.288)
		colorDistMagn   0.561388
		colorDistFreq   0.0202194
		detailScale     136.027
		colorConversion true
		snowLevel       2
		tropicLatitude  0.764554
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.767027
		terraceProb     0.169227
		erosion         0
		montesMagn      0.42093
		montesFreq      3.41613
		montesSpiky     0.909037
		montesFraction  0.57516
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0535147
		hillsFraction   0.46437
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209481
		craterFreq      0.254686
		craterDensity   1.04538
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.609115
		volcanoTemp     1579.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.205, 0.202, 0.000)
		colorShelf     (0.221, 0.217, 0.215, 0.000)
		colorBeach     (0.234, 0.230, 0.228, 0.000)
		colorDesert    (0.247, 0.243, 0.240, 0.000)
		colorLowland   (0.260, 0.256, 0.253, 0.000)
		colorUpland    (0.273, 0.268, 0.266, 0.000)
		colorRock      (0.286, 0.281, 0.278, 0.000)
		colorSnow      (0.299, 0.294, 0.291, 1.000)
		BumpHeight      4.48331
		BumpOffset      0.896662
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.591659
		GasToDust   0.25
		Particles   2175
		GasBright   0.0130478
		DustBright  0.224009
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.1635
		Period          49.8045
		Eccentricity    0.987693
		Inclination     -126.325
		AscendingNode   179.529
		ArgOfPericenter -178.556
		MeanAnomaly     -57.6506
	}
}

Comet	"C72"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.87879e-007
	Radius          107.627
	InertiaMoment   0.398879

	Oblateness      0.00999984

	RotationPeriod  55.2929
	Obliquity       236.746
	EqAscendNode    269.436
	Precession      0

	AbsMagn         10.6596
	SlopeParam      5.8219
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.457 0.449 0.444)

	Surface
	{
		SurfStyle       0.547967
		OceanStyle      0.771775
		Randomize      (-0.834, -0.618, 0.098)
		colorDistMagn   0.741382
		colorDistFreq   7.35703
		detailScale     2938.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.883442
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544078
		terraceProb     0.348832
		erosion         0
		montesMagn      0.608658
		montesFreq      4.16857
		montesSpiky     0.93409
		montesFraction  0.644771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.2026
		hillsFraction   0.802169
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254639
		craterFreq      0.353459
		craterDensity   0.91734
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.36967
		volcanoTemp     1278.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.153, 0.124, 0.000)
		colorShelf     (0.183, 0.157, 0.142, 0.000)
		colorBeach     (0.215, 0.184, 0.169, 0.000)
		colorDesert    (0.233, 0.198, 0.164, 0.000)
		colorLowland   (0.256, 0.211, 0.186, 0.000)
		colorUpland    (0.283, 0.256, 0.226, 0.000)
		colorRock      (0.306, 0.279, 0.244, 0.000)
		colorSnow      (0.333, 0.297, 0.257, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0823179
		DustBright  0.639226
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.11347
		Period          29.1624
		Eccentricity    0.975431
		Inclination     75.4466
		AscendingNode   114.119
		ArgOfPericenter -151.88
		MeanAnomaly     33.3026
	}
}

Comet	"C73"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.19431e-014
	Radius          0.308523
	InertiaMoment   0.397181

	Oblateness      0.00813341

	RotationPeriod  53.455
	Obliquity       189.952
	EqAscendNode    254.014
	Precession      0

	AbsMagn         7.08155
	SlopeParam      6.96529
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.459 0.456 0.451)

	Surface
	{
		SurfStyle       0.717875
		OceanStyle      0.0992764
		Randomize      (-0.181, 0.758, -0.662)
		colorDistMagn   0.744864
		colorDistFreq   5.02611e-005
		detailScale     8.42473
		colorConversion true
		snowLevel       2
		tropicLatitude  0.870914
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.462868
		terraceProb     0.113506
		erosion         0
		montesMagn      0.54216
		montesFreq      3.46611
		montesSpiky     0.879592
		montesFraction  0.653483
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000223282
		hillsFraction   0.837145
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221021
		craterFreq      0.263528
		craterDensity   1.01642
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481857
		volcanoTemp     1425.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.155, 0.126, 0.000)
		colorShelf     (0.184, 0.160, 0.144, 0.000)
		colorBeach     (0.216, 0.187, 0.172, 0.000)
		colorDesert    (0.234, 0.201, 0.167, 0.000)
		colorLowland   (0.257, 0.214, 0.190, 0.000)
		colorUpland    (0.285, 0.260, 0.230, 0.000)
		colorRock      (0.308, 0.283, 0.248, 0.000)
		colorSnow      (0.335, 0.301, 0.262, 1.000)
		BumpHeight      0.277671
		BumpOffset      0.0555341
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.143293
		GasToDust   0.25
		Particles   1269
		GasBright   0.0702965
		DustBright  0.335734
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.68506
		Period          39.3423
		Eccentricity    0.968788
		Inclination     -114.292
		AscendingNode   123.194
		ArgOfPericenter 78.7182
		MeanAnomaly     84.4751
	}
}

Comet	"C74"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            9.23714e-011
	Radius          6.66517
	InertiaMoment   0.399342

	Oblateness      0.0114577

	RotationPeriod  51.6312
	Obliquity       143.157
	EqAscendNode    238.591
	Precession      0

	AbsMagn         2.1396
	SlopeParam      2.3285
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.721 0.717 0.714)

	Surface
	{
		SurfStyle       0.564167
		OceanStyle      0.937066
		Randomize      (-0.505, 0.367, -0.621)
		colorDistMagn   0.69648
		colorDistFreq   0.0248533
		detailScale     182.004
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99933
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.666351
		terraceProb     0.261613
		erosion         0
		montesMagn      0.42176
		montesFreq      3.61381
		montesSpiky     0.841349
		montesFraction  0.689369
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.127313
		hillsFraction   0.461179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259247
		craterFreq      0.208313
		craterDensity   1.01202
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489188
		volcanoTemp     1604.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.244, 0.200, 0.000)
		colorShelf     (0.289, 0.251, 0.228, 0.000)
		colorBeach     (0.339, 0.294, 0.271, 0.000)
		colorDesert    (0.368, 0.315, 0.264, 0.000)
		colorLowland   (0.404, 0.337, 0.300, 0.000)
		colorUpland    (0.447, 0.409, 0.364, 0.000)
		colorRock      (0.483, 0.444, 0.393, 0.000)
		colorSnow      (0.527, 0.473, 0.414, 1.000)
		BumpHeight      5.99865
		BumpOffset      1.19973
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.624485
		GasToDust   0.25
		Particles   2241
		GasBright   0.206757
		DustBright  0.68376
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.3899
		Period          30.8786
		Eccentricity    0.966745
		Inclination     82.0373
		AscendingNode   -104.378
		ArgOfPericenter -94.4971
		MeanAnomaly     -1.11811
	}
}

Comet	"C75"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.14425e-007
	Radius          120.563
	InertiaMoment   0.398034

	Oblateness      0.00937201

	RotationPeriod  49.8166
	Obliquity       96.3631
	EqAscendNode    223.169
	Precession      0

	AbsMagn         10.4047
	SlopeParam      3.02936
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.572 0.567 0.564)

	Surface
	{
		SurfStyle       0.71437
		OceanStyle      0.919918
		Randomize      (-0.076, -0.999, -0.209)
		colorDistMagn   0.648095
		colorDistFreq   9.94446
		detailScale     3292.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998872
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491976
		terraceProb     0.328239
		erosion         0
		montesMagn      0.407131
		montesFreq      4.61703
		montesSpiky     0.858414
		montesFraction  0.534097
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.3276
		hillsFraction   0.524492
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247561
		craterFreq      0.5817
		craterDensity   0.856226
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496775
		volcanoTemp     1221.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.158, 0.000)
		colorShelf     (0.229, 0.199, 0.180, 0.000)
		colorBeach     (0.269, 0.233, 0.214, 0.000)
		colorDesert    (0.292, 0.250, 0.209, 0.000)
		colorLowland   (0.320, 0.267, 0.237, 0.000)
		colorUpland    (0.355, 0.323, 0.288, 0.000)
		colorRock      (0.383, 0.352, 0.310, 0.000)
		colorSnow      (0.418, 0.374, 0.327, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.167453
		DustBright  0.40755
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.72379
		Period          32.9949
		Eccentricity    0.971357
		Inclination     162.783
		AscendingNode   -78.5529
		ArgOfPericenter -58.6968
		MeanAnomaly     54.9419
	}
}

Comet	"C76"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.19977e-014
	Radius          0.412769
	InertiaMoment   0.399772

	Oblateness      0.0132393

	RotationPeriod  48.0067
	Obliquity       49.5688
	EqAscendNode    207.746
	Precession      0

	AbsMagn         6.86591
	SlopeParam      3.62585
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.739 0.713 0.664)

	Surface
	{
		SurfStyle       0.730092
		OceanStyle      0.485534
		Randomize      (-0.703, 0.986, 0.913)
		colorDistMagn   0.984019
		colorDistFreq   9.81553e-005
		detailScale     11.2713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979507
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529875
		terraceProb     0.117836
		erosion         0
		montesMagn      0.413046
		montesFreq      3.26647
		montesSpiky     0.921399
		montesFraction  0.658441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000361759
		hillsFraction   0.536988
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231828
		craterFreq      0.177054
		craterDensity   0.813797
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492323
		volcanoTemp     1225.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.243, 0.186, 0.000)
		colorShelf     (0.295, 0.250, 0.212, 0.000)
		colorBeach     (0.347, 0.292, 0.252, 0.000)
		colorDesert    (0.377, 0.314, 0.246, 0.000)
		colorLowland   (0.414, 0.335, 0.279, 0.000)
		colorUpland    (0.458, 0.407, 0.339, 0.000)
		colorRock      (0.495, 0.442, 0.365, 0.000)
		colorSnow      (0.539, 0.471, 0.385, 1.000)
		BumpHeight      0.371492
		BumpOffset      0.0742983
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.176119
		GasToDust   0.25
		Particles   1335
		GasBright   0.0908908
		DustBright  0.168599
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.4443
		Period          51.8825
		Eccentricity    0.981699
		Inclination     31.1571
		AscendingNode   -26.1307
		ArgOfPericenter 138.941
		MeanAnomaly     117.77
	}
}

Comet	"C77"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.70136e-010
	Radius          7.46688
	InertiaMoment   0.398628

	Oblateness      0.0108958

	RotationPeriod  46.1968
	Obliquity       2.77454
	EqAscendNode    192.323
	Precession      0

	AbsMagn         1.44522
	SlopeParam      4.19018
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.511 0.504 0.500)

	Surface
	{
		SurfStyle       0.592311
		OceanStyle      0.0532792
		Randomize      (-0.642, -0.114, 0.335)
		colorDistMagn   0.190405
		colorDistFreq   0.0114301
		detailScale     203.896
		colorConversion true
		snowLevel       2
		tropicLatitude  0.8044
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446103
		terraceProb     0.321415
		erosion         0
		montesMagn      0.633722
		montesFreq      3.50079
		montesSpiky     0.9849
		montesFraction  0.565726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.125594
		hillsFraction   0.679105
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236072
		craterFreq      0.243106
		craterDensity   0.820226
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539797
		volcanoTemp     1105.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.171, 0.140, 0.000)
		colorShelf     (0.204, 0.176, 0.160, 0.000)
		colorBeach     (0.240, 0.207, 0.190, 0.000)
		colorDesert    (0.261, 0.222, 0.185, 0.000)
		colorLowland   (0.286, 0.237, 0.210, 0.000)
		colorUpland    (0.317, 0.287, 0.255, 0.000)
		colorRock      (0.343, 0.313, 0.275, 0.000)
		colorSnow      (0.373, 0.333, 0.290, 1.000)
		BumpHeight      6.72019
		BumpOffset      1.34404
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.657311
		GasToDust   0.25
		Particles   2307
		GasBright   0.304519
		DustBright  0.439458
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.3036
		Period          24.3267
		Eccentricity    0.945185
		Inclination     -54.2243
		AscendingNode   75.0069
		ArgOfPericenter 139.914
		MeanAnomaly     -69.1805
	}
}

Comet	"C78"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.23863e-018
	Radius          0.0255626
	InertiaMoment   0.396453

	Oblateness      0.0152581

	RotationPeriod  44.3823
	Obliquity       315.98
	EqAscendNode    176.901
	Precession      0

	AbsMagn         10.1592
	SlopeParam      4.77039
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.443 0.438 0.431)

	Surface
	{
		SurfStyle       0.0802545
		OceanStyle      0.799991
		Randomize      (-0.923, -0.471, 0.236)
		colorDistMagn   0.276791
		colorDistFreq   5.02875e-007
		detailScale     0.69803
		colorConversion true
		snowLevel       2
		tropicLatitude  0.976499
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450145
		terraceProb     0.369817
		erosion         0
		montesMagn      0.465854
		montesFreq      2.13649
		montesSpiky     0.862778
		montesFraction  0.619163
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.48315e-006
		hillsFraction   0.551569
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213125
		craterFreq      0.232455
		craterDensity   1.00076
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504593
		volcanoTemp     1294.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.175, 0.172, 0.000)
		colorShelf     (0.188, 0.186, 0.183, 0.000)
		colorBeach     (0.199, 0.197, 0.194, 0.000)
		colorDesert    (0.210, 0.208, 0.205, 0.000)
		colorLowland   (0.221, 0.219, 0.216, 0.000)
		colorUpland    (0.233, 0.230, 0.226, 0.000)
		colorRock      (0.244, 0.241, 0.237, 0.000)
		colorSnow      (0.255, 0.252, 0.248, 1.000)
		BumpHeight      0.0230064
		BumpOffset      0.00460127
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.200674
		DustBright  0.227789
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.2444
		Period          65.8581
		Eccentricity    0.981575
		Inclination     -64.2322
		AscendingNode   81.0751
		ArgOfPericenter -144.537
		MeanAnomaly     88.5026
	}
}

Comet	"C79"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.0517e-014
	Radius          0.462445
	InertiaMoment   0.399119

	Oblateness      0.0128301

	RotationPeriod  42.5586
	Obliquity       269.186
	EqAscendNode    161.478
	Precession      0

	AbsMagn         6.64692
	SlopeParam      5.4257
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.438 0.435 0.431)

	Surface
	{
		SurfStyle       0.494179
		OceanStyle      0.287751
		Randomize      (0.404, -0.930, 0.096)
		colorDistMagn   0.658959
		colorDistFreq   5.0786e-005
		detailScale     12.6278
		colorConversion true
		snowLevel       2
		tropicLatitude  0.952533
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422183
		terraceProb     0.29166
		erosion         0
		montesMagn      0.326214
		montesFreq      2.84642
		montesSpiky     0.931305
		montesFraction  0.330949
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000332031
		hillsFraction   0.862495
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239869
		craterFreq      0.221053
		craterDensity   1.00119
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.414116
		volcanoTemp     1482.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.174, 0.172, 0.000)
		colorShelf     (0.186, 0.185, 0.183, 0.000)
		colorBeach     (0.197, 0.196, 0.194, 0.000)
		colorDesert    (0.208, 0.207, 0.205, 0.000)
		colorLowland   (0.219, 0.217, 0.215, 0.000)
		colorUpland    (0.230, 0.228, 0.226, 0.000)
		colorRock      (0.241, 0.239, 0.237, 0.000)
		colorSnow      (0.252, 0.250, 0.248, 1.000)
		BumpHeight      0.416201
		BumpOffset      0.0832401
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.208945
		GasToDust   0.25
		Particles   1401
		GasBright   0.0250172
		DustBright  0.887933
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.404
		Period          59.1951
		Eccentricity    0.974328
		Inclination     -31.4184
		AscendingNode   -127.397
		ArgOfPericenter 173.148
		MeanAnomaly     140.411
	}
}

Comet	"C80"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.1337e-010
	Radius          9.98867
	InertiaMoment   0.397666

	Oblateness      0.0181605

	RotationPeriod  40.7208
	Obliquity       222.392
	EqAscendNode    146.056
	Precession      0

	AbsMagn         0.46681
	SlopeParam      6.29205
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.656 0.652 0.648)

	Surface
	{
		SurfStyle       0.321039
		OceanStyle      0.457399
		Randomize      (0.109, -0.887, 0.397)
		colorDistMagn   0.226601
		colorDistFreq   0.0572841
		detailScale     272.757
		colorConversion true
		snowLevel       2
		tropicLatitude  0.964647
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535128
		terraceProb     0.320406
		erosion         0
		montesMagn      0.58302
		montesFreq      4.06117
		montesSpiky     0.850938
		montesFraction  0.619837
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.263765
		hillsFraction   0.692616
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267441
		craterFreq      0.210157
		craterDensity   0.996696
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.408269
		volcanoTemp     1259.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.261, 0.259, 0.000)
		colorShelf     (0.279, 0.277, 0.275, 0.000)
		colorBeach     (0.295, 0.293, 0.292, 0.000)
		colorDesert    (0.312, 0.310, 0.308, 0.000)
		colorLowland   (0.328, 0.326, 0.324, 0.000)
		colorUpland    (0.345, 0.342, 0.340, 0.000)
		colorRock      (0.361, 0.358, 0.356, 0.000)
		colorSnow      (0.377, 0.375, 0.373, 1.000)
		BumpHeight      8.9898
		BumpOffset      1.79796
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.690137
		GasToDust   0.25
		Particles   2374
		GasBright   0.0516471
		DustBright  0.545789
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.02167
		Period          17.2971
		Eccentricity    0.953557
		Inclination     88.6091
		AscendingNode   65.3156
		ArgOfPericenter 172.053
		MeanAnomaly     87.7626
	}
}

Comet	"C81"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            9.64887e-018
	Radius          0.0286403
	InertiaMoment   0.399562

	Oblateness      0.0153726

	RotationPeriod  38.8638
	Obliquity       175.597
	EqAscendNode    130.633
	Precession      0

	AbsMagn         9.92151
	SlopeParam      8.40495
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.613 0.611)

	Surface
	{
		SurfStyle       0.235195
		OceanStyle      0.740711
		Randomize      (-0.988, -0.585, -0.800)
		colorDistMagn   0.691257
		colorDistFreq   4.58683e-007
		detailScale     0.78207
		colorConversion true
		snowLevel       2
		tropicLatitude  0.180604
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596264
		terraceProb     0.306702
		erosion         0
		montesMagn      0.44654
		montesFreq      2.28268
		montesSpiky     0.911974
		montesFraction  0.539635
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0426e-006
		hillsFraction   0.417169
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235422
		craterFreq      0.226348
		craterDensity   0.848595
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496679
		volcanoTemp     1588.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.245, 0.244, 0.000)
		colorShelf     (0.262, 0.261, 0.260, 0.000)
		colorBeach     (0.278, 0.276, 0.275, 0.000)
		colorDesert    (0.293, 0.291, 0.290, 0.000)
		colorLowland   (0.308, 0.307, 0.305, 0.000)
		colorUpland    (0.324, 0.322, 0.321, 0.000)
		colorRock      (0.339, 0.337, 0.336, 0.000)
		colorSnow      (0.355, 0.353, 0.351, 1.000)
		BumpHeight      0.0257762
		BumpOffset      0.00515525
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0410179
		DustBright  0.240905
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.81075
		Period          40.1994
		Eccentricity    0.971404
		Inclination     -165.243
		AscendingNode   7.30317
		ArgOfPericenter -80.246
		MeanAnomaly     102.704
	}
}

Comet	"C82"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.46271e-014
	Radius          0.618604
	InertiaMoment   0.398353

	Oblateness      0.0220177

	RotationPeriod  36.9822
	Obliquity       128.803
	EqAscendNode    115.21
	Precession      0

	AbsMagn         6.42379
	SlopeParam      2.69423
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.501 0.444)

	Surface
	{
		SurfStyle       0.968445
		OceanStyle      0.889655
		Randomize      (-0.261, -0.499, 0.375)
		colorDistMagn   0.540907
		colorDistFreq   0.000172356
		detailScale     16.892
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898154
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431445
		terraceProb     0.377112
		erosion         0
		montesMagn      0.508647
		montesFreq      1.95762
		montesSpiky     0.954023
		montesFraction  0.430507
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000874501
		hillsFraction   0.58457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216333
		craterFreq      0.186774
		craterDensity   0.921396
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.416398
		volcanoTemp     2100.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.175, 0.178, 0.050)
		colorShelf     (0.257, 0.205, 0.204, 0.040)
		colorBeach     (0.295, 0.235, 0.231, 0.030)
		colorDesert    (0.334, 0.265, 0.262, 0.020)
		colorLowland   (0.372, 0.295, 0.289, 0.030)
		colorUpland    (0.411, 0.325, 0.315, 0.050)
		colorRock      (0.449, 0.355, 0.351, 0.020)
		colorSnow      (0.449, 0.355, 0.351, 1.000)
		BumpHeight      0.556744
		BumpOffset      0.111349
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.241771
		GasToDust   0.25
		Particles   1468
		GasBright   0.15676
		DustBright  0.609649
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.047
		Period          48.9502
		Eccentricity    0.981953
		Inclination     -64.9111
		AscendingNode   -1.89312
		ArgOfPericenter 14.1641
		MeanAnomaly     -128.917
	}
}

Comet	"C83"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.77188e-010
	Radius          11.1916
	InertiaMoment   0.399984

	Oblateness      0.0188607

	RotationPeriod  35.0699
	Obliquity       82.0088
	EqAscendNode    99.7878
	Precession      0

	AbsMagn         -1.45891
	SlopeParam      3.33096
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.468 0.461 0.456)

	Surface
	{
		SurfStyle       0.733929
		OceanStyle      0.236756
		Randomize      (-0.879, 0.071, 0.111)
		colorDistMagn   0.0475227
		colorDistFreq   0.0543001
		detailScale     305.605
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.425328
		terraceProb     0.120764
		erosion         0
		montesMagn      0.57117
		montesFreq      1.96936
		montesSpiky     0.792957
		montesFraction  0.688842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.240319
		hillsFraction   0.501259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24322
		craterFreq      0.253451
		craterDensity   1.08558
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523114
		volcanoTemp     1557.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.157, 0.128, 0.000)
		colorShelf     (0.187, 0.161, 0.146, 0.000)
		colorBeach     (0.220, 0.189, 0.173, 0.000)
		colorDesert    (0.239, 0.203, 0.169, 0.000)
		colorLowland   (0.262, 0.217, 0.191, 0.000)
		colorUpland    (0.290, 0.263, 0.232, 0.000)
		colorRock      (0.314, 0.286, 0.251, 0.000)
		colorSnow      (0.342, 0.304, 0.264, 1.000)
		BumpHeight      10.0724
		BumpOffset      2.01448
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.722963
		GasToDust   0.25
		Particles   2440
		GasBright   0.118849
		DustBright  0.332047
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.18914
		Period          18.1695
		Eccentricity    0.964862
		Inclination     6.65979
		AscendingNode   -4.65851
		ArgOfPericenter -76.6071
		MeanAnomaly     129.328
	}
}

Comet	"C84"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.7772e-017
	Radius          0.0383108
	InertiaMoment   0.398885

	Oblateness      0.0274357

	RotationPeriod  33.1204
	Obliquity       35.2145
	EqAscendNode    84.3652
	Precession      0

	AbsMagn         9.69047
	SlopeParam      3.90506
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.487 0.483 0.475)

	Surface
	{
		SurfStyle       0.954895
		OceanStyle      0.509465
		Randomize      (0.369, -0.394, 0.755)
		colorDistMagn   0.365127
		colorDistFreq   6.58358e-007
		detailScale     1.04614
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99441
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709162
		terraceProb     0.179954
		erosion         0
		montesMagn      0.583553
		montesFreq      3.09186
		montesSpiky     0.757751
		montesFraction  0.645541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.14306e-006
		hillsFraction   0.404132
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241267
		craterFreq      0.231978
		craterDensity   0.836023
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.414241
		volcanoTemp     1403.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.169, 0.190, 0.050)
		colorShelf     (0.195, 0.198, 0.219, 0.040)
		colorBeach     (0.224, 0.227, 0.247, 0.030)
		colorDesert    (0.253, 0.256, 0.280, 0.020)
		colorLowland   (0.282, 0.285, 0.309, 0.030)
		colorUpland    (0.312, 0.314, 0.337, 0.050)
		colorRock      (0.341, 0.343, 0.375, 0.020)
		colorSnow      (0.341, 0.343, 0.375, 1.000)
		BumpHeight      0.0344797
		BumpOffset      0.00689595
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.301781
		DustBright  0.633601
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.79195
		Period          33.4326
		Eccentricity    0.978476
		Inclination     118.675
		AscendingNode   124.483
		ArgOfPericenter 146.733
		MeanAnomaly     56.0497
	}
}

Comet	"C85"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.37454e-013
	Radius          0.693108
	InertiaMoment   0.397195

	Oblateness      0.023633

	RotationPeriod  31.1263
	Obliquity       348.42
	EqAscendNode    68.9426
	Precession      0

	AbsMagn         6.19565
	SlopeParam      4.47129
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.462 0.400 0.358)

	Surface
	{
		SurfStyle       0.791322
		OceanStyle      0.73863
		Randomize      (-0.455, 0.853, -0.063)
		colorDistMagn   0.581371
		colorDistFreq   0.00027451
		detailScale     18.9265
		colorConversion true
		snowLevel       2
		tropicLatitude  0.747211
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.708173
		terraceProb     0.335123
		erosion         0
		montesMagn      0.663516
		montesFreq      2.56747
		montesSpiky     0.847086
		montesFraction  0.633738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00125487
		hillsFraction   0.730551
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281341
		craterFreq      0.220661
		craterDensity   0.876159
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476253
		volcanoTemp     1276.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.136, 0.100, 0.000)
		colorShelf     (0.185, 0.140, 0.114, 0.000)
		colorBeach     (0.217, 0.164, 0.136, 0.000)
		colorDesert    (0.236, 0.176, 0.132, 0.000)
		colorLowland   (0.259, 0.188, 0.150, 0.000)
		colorUpland    (0.287, 0.228, 0.182, 0.000)
		colorRock      (0.310, 0.248, 0.197, 0.000)
		colorSnow      (0.337, 0.264, 0.207, 1.000)
		BumpHeight      0.623797
		BumpOffset      0.124759
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.274597
		GasToDust   0.25
		Particles   1534
		GasBright   0.236588
		DustBright  0.383281
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.73651
		Period          21.1189
		Eccentricity    0.956927
		Inclination     127.089
		AscendingNode   117.447
		ArgOfPericenter -10.093
		MeanAnomaly     109.001
	}
}

Comet	"C86"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.06311e-009
	Radius          14.9704
	InertiaMoment   0.399348

	Oblateness      0.035563

	RotationPeriod  29.079
	Obliquity       301.626
	EqAscendNode    53.52
	Precession      0

	AbsMagn         16.2698
	SlopeParam      5.07896
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.713 0.568 0.519)

	Surface
	{
		SurfStyle       0.97478
		OceanStyle      0.994321
		Randomize      (-0.945, -0.366, 0.385)
		colorDistMagn   0.910569
		colorDistFreq   0.129941
		detailScale     408.791
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988345
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.318318
		terraceProb     0.304898
		erosion         0
		montesMagn      0.417176
		montesFreq      2.62248
		montesSpiky     0.747858
		montesFraction  0.414159
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.545589
		hillsFraction   0.516625
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245098
		craterFreq      0.238016
		craterDensity   0.957375
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514949
		volcanoTemp     1882.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.199, 0.208, 0.050)
		colorShelf     (0.285, 0.233, 0.239, 0.040)
		colorBeach     (0.328, 0.267, 0.270, 0.030)
		colorDesert    (0.371, 0.301, 0.306, 0.020)
		colorLowland   (0.413, 0.335, 0.337, 0.030)
		colorUpland    (0.456, 0.369, 0.369, 0.050)
		colorRock      (0.499, 0.404, 0.410, 0.020)
		colorSnow      (0.499, 0.404, 0.410, 1.000)
		BumpHeight      13.4733
		BumpOffset      2.69467
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.755789
		GasToDust   0.25
		Particles   2506
		GasBright   0.134136
		DustBright  0.17022
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.88403
		Period          34.027
		Eccentricity    0.972845
		Inclination     138.783
		AscendingNode   -64.4246
		ArgOfPericenter 117.698
		MeanAnomaly     -171.995
	}
}

Comet	"C87"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.27339e-017
	Radius          0.0429247
	InertiaMoment   0.398043

	Oblateness      0.0315006

	RotationPeriod  26.9685
	Obliquity       254.832
	EqAscendNode    38.0975
	Precession      0

	AbsMagn         9.46493
	SlopeParam      5.81024
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.707 0.672 0.626)

	Surface
	{
		SurfStyle       0.0868778
		OceanStyle      0.562406
		Randomize      (0.834, -0.566, -0.520)
		colorDistMagn   0.689355
		colorDistFreq   8.99524e-007
		detailScale     1.17213
		colorConversion true
		snowLevel       2
		tropicLatitude  0.816508
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418607
		terraceProb     0.316754
		erosion         0
		montesMagn      0.52792
		montesFreq      1.73943
		montesSpiky     0.990959
		montesFraction  0.284488
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.54314e-006
		hillsFraction   0.715824
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243795
		craterFreq      0.278256
		craterDensity   0.925005
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553283
		volcanoTemp     1365.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.269, 0.250, 0.000)
		colorShelf     (0.301, 0.286, 0.266, 0.000)
		colorBeach     (0.318, 0.302, 0.282, 0.000)
		colorDesert    (0.336, 0.319, 0.297, 0.000)
		colorLowland   (0.354, 0.336, 0.313, 0.000)
		colorUpland    (0.371, 0.353, 0.329, 0.000)
		colorRock      (0.389, 0.370, 0.344, 0.000)
		colorSnow      (0.407, 0.386, 0.360, 1.000)
		BumpHeight      0.0386322
		BumpOffset      0.00772644
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.394236
		DustBright  0.394607
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.33191
		Period          24.4908
		Eccentricity    0.958987
		Inclination     153.427
		AscendingNode   -37.3292
		ArgOfPericenter 57.0841
		MeanAnomaly     14.4909
	}
}

Comet	"C88"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.53173e-013
	Radius          0.927145
	InertiaMoment   0.399777

	Oblateness      0.0489157

	RotationPeriod  24.7831
	Obliquity       208.037
	EqAscendNode    22.6749
	Precession      0

	AbsMagn         5.96147
	SlopeParam      6.94232
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.502 0.493 0.487)

	Surface
	{
		SurfStyle       0.710436
		OceanStyle      0.258479
		Randomize      (0.285, 0.158, -0.618)
		colorDistMagn   0.613707
		colorDistFreq   0.000294422
		detailScale     25.3172
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971068
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.527635
		terraceProb     0.162308
		erosion         0
		montesMagn      0.316717
		montesFreq      3.45048
		montesSpiky     0.941851
		montesFraction  0.203267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00205938
		hillsFraction   0.678794
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268707
		craterFreq      0.26437
		craterDensity   1.07532
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492857
		volcanoTemp     1568.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.168, 0.136, 0.000)
		colorShelf     (0.201, 0.173, 0.156, 0.000)
		colorBeach     (0.236, 0.202, 0.185, 0.000)
		colorDesert    (0.256, 0.217, 0.180, 0.000)
		colorLowland   (0.281, 0.232, 0.205, 0.000)
		colorUpland    (0.311, 0.281, 0.249, 0.000)
		colorRock      (0.336, 0.306, 0.268, 0.000)
		colorSnow      (0.366, 0.326, 0.283, 1.000)
		BumpHeight      0.83443
		BumpOffset      0.166886
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.307423
		GasToDust   0.25
		Particles   1600
		GasBright   0.0278364
		DustBright  0.445493
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.08153
		Period          17.6073
		Eccentricity    0.943589
		Inclination     -98.8289
		AscendingNode   -36.3123
		ArgOfPericenter -5.98745
		MeanAnomaly     68.2521
	}
}

Comet	"C89"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.95811e-009
	Radius          16.7729
	InertiaMoment   0.398635

	Oblateness      0.045203

	RotationPeriod  22.5085
	Obliquity       161.243
	EqAscendNode    7.25228
	Precession      0

	AbsMagn         14.9956
	SlopeParam      2.31753
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.699 0.624)

	Surface
	{
		SurfStyle       0.878974
		OceanStyle      0.644621
		Randomize      (-0.837, -0.438, 0.403)
		colorDistMagn   0.756061
		colorDistFreq   0.162412
		detailScale     458.012
		colorConversion true
		snowLevel       2
		tropicLatitude  0.508372
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37317
		terraceProb     0.462461
		erosion         0
		montesMagn      0.506368
		montesFreq      3.05832
		montesSpiky     0.869123
		montesFraction  0.512823
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.649211
		hillsFraction   0.671196
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227177
		craterFreq      0.175097
		craterDensity   0.907202
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446685
		volcanoTemp     1505.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.245, 0.250, 0.050)
		colorShelf     (0.316, 0.287, 0.287, 0.040)
		colorBeach     (0.363, 0.329, 0.325, 0.030)
		colorDesert    (0.411, 0.371, 0.368, 0.020)
		colorLowland   (0.458, 0.413, 0.406, 0.030)
		colorUpland    (0.505, 0.455, 0.443, 0.050)
		colorRock      (0.553, 0.497, 0.493, 0.020)
		colorSnow      (0.553, 0.497, 0.493, 1.000)
		BumpHeight      15.0956
		BumpOffset      3.01912
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.788615
		GasToDust   0.25
		Particles   2572
		GasBright   0.112884
		DustBright  0.844932
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.98245
		Period          22.4916
		Eccentricity    0.955764
		Inclination     -15.7217
		AscendingNode   54.7159
		ArgOfPericenter 96.9236
		MeanAnomaly     72.0606
	}
}

Comet	"C90"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.02916e-017
	Radius          0.0574202
	InertiaMoment   0.396479

	Oblateness      0.073068

	RotationPeriod  20.1273
	Obliquity       114.449
	EqAscendNode    351.83
	Precession      0

	AbsMagn         9.24396
	SlopeParam      3.02067
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.584 0.581 0.579)

	Surface
	{
		SurfStyle       0.772689
		OceanStyle      0.14383
		Randomize      (0.242, 0.816, 0.601)
		colorDistMagn   0.15235
		colorDistFreq   5.15373e-007
		detailScale     1.56795
		colorConversion true
		snowLevel       2
		tropicLatitude  0.111116
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473316
		terraceProb     0.166596
		erosion         0
		montesMagn      0.615944
		montesFreq      3.37035
		montesSpiky     0.891552
		montesFraction  0.610684
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.9484e-006
		hillsFraction   0.419247
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23065
		craterFreq      0.179016
		craterDensity   0.859585
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563468
		volcanoTemp     1121.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.198, 0.162, 0.000)
		colorShelf     (0.234, 0.203, 0.185, 0.000)
		colorBeach     (0.274, 0.238, 0.220, 0.000)
		colorDesert    (0.298, 0.256, 0.214, 0.000)
		colorLowland   (0.327, 0.273, 0.243, 0.000)
		colorUpland    (0.362, 0.331, 0.295, 0.000)
		colorRock      (0.391, 0.360, 0.318, 0.000)
		colorSnow      (0.426, 0.384, 0.336, 1.000)
		BumpHeight      0.0516782
		BumpOffset      0.0103356
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.113624
		DustBright  0.528679
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.75521
		Period          39.8199
		Eccentricity    0.971392
		Inclination     120.827
		AscendingNode   179.878
		ArgOfPericenter 50.1635
		MeanAnomaly     24.7541
	}
}

Comet	"C91"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.66312e-013
	Radius          1.03874
	InertiaMoment   0.399125

	Oblateness      0.0737273

	RotationPeriod  17.6174
	Obliquity       67.6544
	EqAscendNode    336.407
	Precession      0

	AbsMagn         5.72009
	SlopeParam      3.61799
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.672 0.539 0.414)

	Surface
	{
		SurfStyle       0.428458
		OceanStyle      0.548018
		Randomize      (-0.500, 0.837, -0.444)
		colorDistMagn   0.0451182
		colorDistFreq   0.000834431
		detailScale     28.3644
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97903
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.762786
		terraceProb     0.24979
		erosion         0
		montesMagn      0.357961
		montesFreq      1.59432
		montesSpiky     0.834754
		montesFraction  0.487706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00274916
		hillsFraction   0.66998
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237157
		craterFreq      0.233714
		craterDensity   0.846424
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446979
		volcanoTemp     1081.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.216, 0.165, 0.000)
		colorShelf     (0.286, 0.229, 0.176, 0.000)
		colorBeach     (0.302, 0.242, 0.186, 0.000)
		colorDesert    (0.319, 0.256, 0.197, 0.000)
		colorLowland   (0.336, 0.269, 0.207, 0.000)
		colorUpland    (0.353, 0.283, 0.217, 0.000)
		colorRock      (0.369, 0.296, 0.228, 0.000)
		colorSnow      (0.386, 0.310, 0.238, 1.000)
		BumpHeight      0.934863
		BumpOffset      0.186973
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.340249
		GasToDust   0.25
		Particles   1667
		GasBright   0.0771044
		DustBright  0.249684
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.45768
		Period          9.88277
		Eccentricity    0.927169
		Inclination     98.6123
		AscendingNode   80.7636
		ArgOfPericenter 130.402
		MeanAnomaly     -126.574
	}
}

Comet	"C92"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.60659e-009
	Radius          22.438
	InertiaMoment   0.397676

	Oblateness      0.1327

	RotationPeriod  14.9503
	Obliquity       20.8601
	EqAscendNode    320.984
	Precession      0

	AbsMagn         14.187
	SlopeParam      4.18243
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.531 0.527 0.523)

	Surface
	{
		SurfStyle       0.0152433
		OceanStyle      0.0880693
		Randomize      (0.751, -0.693, 0.840)
		colorDistMagn   0.0551131
		colorDistFreq   0.137227
		detailScale     612.708
		colorConversion true
		snowLevel       2
		tropicLatitude  0.46117
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512253
		terraceProb     0.369302
		erosion         0
		montesMagn      0.375366
		montesFreq      2.72012
		montesSpiky     0.998763
		montesFraction  0.674459
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12842
		hillsFraction   0.59608
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238496
		craterFreq      0.279026
		craterDensity   0.901988
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511054
		volcanoTemp     1614.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.211, 0.209, 0.000)
		colorShelf     (0.226, 0.224, 0.222, 0.000)
		colorBeach     (0.239, 0.237, 0.235, 0.000)
		colorDesert    (0.252, 0.250, 0.248, 0.000)
		colorLowland   (0.266, 0.264, 0.261, 0.000)
		colorUpland    (0.279, 0.277, 0.274, 0.000)
		colorRock      (0.292, 0.290, 0.287, 0.000)
		colorSnow      (0.305, 0.303, 0.301, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.821441
		GasToDust   0.25
		Particles   2639
		GasBright   0.239319
		DustBright  0.571956
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.445
		Period          67.4826
		Eccentricity    0.994179
		Inclination     137.362
		AscendingNode   34.0329
		ArgOfPericenter -150.816
		MeanAnomaly     125.342
	}
}

Comet	"C93"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.1105e-016
	Radius          0.0643277
	InertiaMoment   0.399568

	Oblateness      0.156441

	RotationPeriod  12.0881
	Obliquity       334.066
	EqAscendNode    305.562
	Precession      0

	AbsMagn         9.02672
	SlopeParam      4.76209
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.689 0.617 0.531)

	Surface
	{
		SurfStyle       0.673472
		OceanStyle      0.00678829
		Randomize      (0.606, -0.205, -0.026)
		colorDistMagn   0.385277
		colorDistFreq   2.04019e-006
		detailScale     1.75658
		colorConversion true
		snowLevel       2
		tropicLatitude  0.222946
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.556306
		terraceProb     0.103556
		erosion         0
		montesMagn      0.34535
		montesFreq      3.23301
		montesSpiky     0.739665
		montesFraction  0.454399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.00999e-005
		hillsFraction   0.586493
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268144
		craterFreq      0.248093
		craterDensity   0.832613
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536898
		volcanoTemp     977.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.210, 0.149, 0.000)
		colorShelf     (0.276, 0.216, 0.170, 0.000)
		colorBeach     (0.324, 0.253, 0.202, 0.000)
		colorDesert    (0.351, 0.272, 0.196, 0.000)
		colorLowland   (0.386, 0.290, 0.223, 0.000)
		colorUpland    (0.427, 0.352, 0.271, 0.000)
		colorRock      (0.462, 0.383, 0.292, 0.000)
		colorSnow      (0.503, 0.408, 0.308, 1.000)
		BumpHeight      0.0578949
		BumpOffset      0.011579
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.175518
		DustBright  0.320244
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.73858
		Period          33.0897
		Eccentricity    0.984606
		Inclination     -32.5978
		AscendingNode   -157.198
		ArgOfPericenter -5.26229
		MeanAnomaly     30.2077
	}
}

Comet	"C94"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            8.5889e-013
	Radius          1.38966
	InertiaMoment   0.39836

	Oblateness      0.249

	RotationPeriod  8.9788
	Obliquity       287.271
	EqAscendNode    290.139
	Precession      0

	AbsMagn         5.4701
	SlopeParam      5.41577
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.539 0.440 0.353)

	Surface
	{
		SurfStyle       0.652746
		OceanStyle      0.545214
		Randomize      (0.393, 0.633, 0.628)
		colorDistMagn   0.430972
		colorDistFreq   0.000870087
		detailScale     37.9469
		colorConversion true
		snowLevel       2
		tropicLatitude  0.871346
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32587
		terraceProb     0.142926
		erosion         0
		montesMagn      0.544561
		montesFreq      2.44543
		montesSpiky     0.928721
		montesFraction  0.354503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0033708
		hillsFraction   0.669866
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241734
		craterFreq      0.190032
		craterDensity   0.953409
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421342
		volcanoTemp     1485.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.150, 0.099, 0.000)
		colorShelf     (0.216, 0.154, 0.113, 0.000)
		colorBeach     (0.253, 0.180, 0.134, 0.000)
		colorDesert    (0.275, 0.193, 0.131, 0.000)
		colorLowland   (0.302, 0.207, 0.148, 0.000)
		colorUpland    (0.334, 0.251, 0.180, 0.000)
		colorRock      (0.361, 0.273, 0.194, 0.000)
		colorSnow      (0.393, 0.290, 0.205, 1.000)
		BumpHeight      1.25069
		BumpOffset      0.250138
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.373075
		GasToDust   0.25
		Particles   1733
		GasBright   0.404922
		DustBright  0.575326
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.12805
		Period          42.3904
		Eccentricity    0.978185
		Inclination     -17.1045
		AscendingNode   137.45
		ArgOfPericenter -43.8309
		MeanAnomaly     133.414
	}
}

Comet	"C95"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.64288e-009
	Radius          25.1354
	InertiaMoment   0.39999

	Oblateness      0.249

	RotationPeriod  5.54731
	Obliquity       240.477
	EqAscendNode    274.717
	Precession      0

	AbsMagn         13.573
	SlopeParam      6.27723
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.488 0.486 0.482)

	Surface
	{
		SurfStyle       0.731332
		OceanStyle      0.934295
		Randomize      (0.550, 0.192, 0.922)
		colorDistMagn   0.763116
		colorDistFreq   0.343096
		detailScale     686.364
		colorConversion true
		snowLevel       2
		tropicLatitude  0.858072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424358
		terraceProb     0.353031
		erosion         0
		montesMagn      0.44501
		montesFreq      3.67473
		montesSpiky     0.956561
		montesFraction  0.428833
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.39965
		hillsFraction   0.698504
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234534
		craterFreq      0.172462
		craterDensity   1.03592
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565275
		volcanoTemp     1390.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.165, 0.135, 0.000)
		colorShelf     (0.195, 0.170, 0.154, 0.000)
		colorBeach     (0.230, 0.199, 0.183, 0.000)
		colorDesert    (0.249, 0.214, 0.178, 0.000)
		colorLowland   (0.274, 0.229, 0.203, 0.000)
		colorUpland    (0.303, 0.277, 0.246, 0.000)
		colorRock      (0.327, 0.301, 0.265, 0.000)
		colorSnow      (0.357, 0.321, 0.280, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.854267
		GasToDust   0.25
		Particles   2705
		GasBright   0.313839
		DustBright  0.350896
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.3848
		Period          51.4396
		Eccentricity    0.974078
		Inclination     -2.23374
		AscendingNode   51.4563
		ArgOfPericenter -56.8414
		MeanAnomaly     -109.116
	}
}

Comet	"C96"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.0454e-016
	Radius          0.0860664
	InertiaMoment   0.398891

	Oblateness      0.00141082

	RotationPeriod  144.968
	Obliquity       193.683
	EqAscendNode    259.294
	Precession      0

	AbsMagn         8.81248
	SlopeParam      8.32162
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.540 0.533 0.529)

	Surface
	{
		SurfStyle       0.640636
		OceanStyle      0.801635
		Randomize      (0.944, 0.738, 0.604)
		colorDistMagn   0.643222
		colorDistFreq   1.59835e-006
		detailScale     2.35019
		colorConversion true
		snowLevel       2
		tropicLatitude  0.48407
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.493244
		terraceProb     0.447246
		erosion         0
		montesMagn      0.445397
		montesFreq      3.17163
		montesSpiky     0.960024
		montesFraction  0.220529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.09266e-005
		hillsFraction   0.575808
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250748
		craterFreq      0.160206
		craterDensity   1.01382
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471035
		volcanoTemp     1482.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.181, 0.148, 0.000)
		colorShelf     (0.216, 0.186, 0.169, 0.000)
		colorBeach     (0.254, 0.218, 0.201, 0.000)
		colorDesert    (0.275, 0.234, 0.196, 0.000)
		colorLowland   (0.302, 0.250, 0.222, 0.000)
		colorUpland    (0.335, 0.304, 0.270, 0.000)
		colorRock      (0.362, 0.330, 0.291, 0.000)
		colorSnow      (0.394, 0.352, 0.307, 1.000)
		BumpHeight      0.0774597
		BumpOffset      0.0154919
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0108859
		DustBright  0.338336
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.77085
		Period          39.9267
		Eccentricity    0.969944
		Inclination     -137.546
		AscendingNode   -172.088
		ArgOfPericenter 164.295
		MeanAnomaly     -153.857
	}
}

Comet	"C97"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.58197e-012
	Radius          1.55657
	InertiaMoment   0.397209

	Oblateness      0.0015793

	RotationPeriod  119.453
	Obliquity       146.889
	EqAscendNode    243.872
	Precession      0

	AbsMagn         5.2098
	SlopeParam      2.68467
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.593 0.591 0.587)

	Surface
	{
		SurfStyle       0.452651
		OceanStyle      0.758632
		Randomize      (0.831, 0.575, -0.787)
		colorDistMagn   0.880251
		colorDistFreq   0.00131548
		detailScale     42.5047
		colorConversion true
		snowLevel       2
		tropicLatitude  0.585475
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479469
		terraceProb     0.34303
		erosion         0
		montesMagn      0.266996
		montesFreq      2.44781
		montesSpiky     0.970505
		montesFraction  0.538851
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00657374
		hillsFraction   0.852197
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257022
		craterFreq      0.146374
		craterDensity   0.905293
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523791
		volcanoTemp     1388.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.236, 0.235, 0.000)
		colorShelf     (0.252, 0.251, 0.249, 0.000)
		colorBeach     (0.267, 0.266, 0.264, 0.000)
		colorDesert    (0.282, 0.281, 0.279, 0.000)
		colorLowland   (0.297, 0.295, 0.293, 0.000)
		colorUpland    (0.311, 0.310, 0.308, 0.000)
		colorRock      (0.326, 0.325, 0.323, 0.000)
		colorSnow      (0.341, 0.340, 0.337, 1.000)
		BumpHeight      1.40091
		BumpOffset      0.280182
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.405901
		GasToDust   0.25
		Particles   1799
		GasBright   0.0752148
		DustBright  0.758493
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.79393
		Period          40.0844
		Eccentricity    0.969317
		Inclination     169.608
		AscendingNode   82.3125
		ArgOfPericenter -82.8343
		MeanAnomaly     -39.755
	}
}

Comet	"C98"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.22354e-008
	Radius          33.6327
	InertiaMoment   0.399353

	Oblateness      0.00246833

	RotationPeriod  109.56
	Obliquity       100.094
	EqAscendNode    228.449
	Precession      0

	AbsMagn         13.068
	SlopeParam      3.32279
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.733 0.731 0.730)

	Surface
	{
		SurfStyle       0.873561
		OceanStyle      0.613029
		Randomize      (0.614, 0.329, -0.666)
		colorDistMagn   0.455772
		colorDistFreq   0.310437
		detailScale     918.396
		colorConversion true
		snowLevel       2
		tropicLatitude  0.574918
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.742607
		terraceProb     0.231833
		erosion         0
		montesMagn      0.44294
		montesFreq      3.29353
		montesSpiky     0.977257
		montesFraction  0.569224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.7855
		hillsFraction   0.717351
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228228
		craterFreq      0.149585
		craterDensity   0.958308
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47707
		volcanoTemp     1523.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.256, 0.292, 0.050)
		colorShelf     (0.293, 0.300, 0.336, 0.040)
		colorBeach     (0.337, 0.343, 0.380, 0.030)
		colorDesert    (0.381, 0.387, 0.431, 0.020)
		colorLowland   (0.425, 0.431, 0.474, 0.030)
		colorUpland    (0.469, 0.475, 0.518, 0.050)
		colorRock      (0.513, 0.519, 0.577, 0.020)
		colorSnow      (0.513, 0.519, 0.577, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.887093
		GasToDust   0.25
		Particles   2771
		GasBright   0.077347
		DustBright  0.440848
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.1076
		Period          49.3939
		Eccentricity    0.982888
		Inclination     -73.1446
		AscendingNode   -22.7326
		ArgOfPericenter -6.66996
		MeanAnomaly     175.174
	}
}

Comet	"C99"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.76736e-016
	Radius          0.0963929
	InertiaMoment   0.398051

	Oblateness      0.00212968

	RotationPeriod  102.885
	Obliquity       53.3
	EqAscendNode    213.026
	Precession      0

	AbsMagn         8.60054
	SlopeParam      3.89733
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.665 0.663 0.660)

	Surface
	{
		SurfStyle       0.0664362
		OceanStyle      0.0265658
		Randomize      (0.779, -0.315, 0.554)
		colorDistMagn   0.0775429
		colorDistFreq   5.93461e-006
		detailScale     2.63217
		colorConversion true
		snowLevel       2
		tropicLatitude  0.819655
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.293056
		terraceProb     0.196237
		erosion         0
		montesMagn      0.493244
		montesFreq      2.80488
		montesSpiky     0.92005
		montesFraction  0.568425
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.74232e-005
		hillsFraction   0.653777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21462
		craterFreq      0.195619
		craterDensity   0.895048
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450651
		volcanoTemp     1460.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.265, 0.264, 0.000)
		colorShelf     (0.283, 0.282, 0.281, 0.000)
		colorBeach     (0.299, 0.298, 0.297, 0.000)
		colorDesert    (0.316, 0.315, 0.314, 0.000)
		colorLowland   (0.333, 0.331, 0.330, 0.000)
		colorUpland    (0.349, 0.348, 0.347, 0.000)
		colorRock      (0.366, 0.365, 0.363, 0.000)
		colorSnow      (0.383, 0.381, 0.380, 1.000)
		BumpHeight      0.0867536
		BumpOffset      0.0173507
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0422201
		DustBright  0.160461
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.91187
		Period          22.0947
		Eccentricity    0.956576
		Inclination     44.7588
		AscendingNode   -105.25
		ArgOfPericenter 11.2998
		MeanAnomaly     21.3438
	}
}

Comet	"C100"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.91378e-012
	Radius          2.08301
	InertiaMoment   0.399782

	Oblateness      0.00310181

	RotationPeriod  97.695
	Obliquity       6.5057
	EqAscendNode    197.604
	Precession      0

	AbsMagn         4.93712
	SlopeParam      4.46336
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.406 0.402 0.397)

	Surface
	{
		SurfStyle       0.240552
		OceanStyle      0.846532
		Randomize      (-0.490, -0.483, -0.862)
		colorDistMagn   0.298879
		colorDistFreq   0.00213821
		detailScale     56.8801
		colorConversion true
		snowLevel       2
		tropicLatitude  0.432329
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476313
		terraceProb     0.193524
		erosion         0
		montesMagn      0.531041
		montesFreq      3.06143
		montesSpiky     0.88874
		montesFraction  0.655942
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00934979
		hillsFraction   0.571467
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234614
		craterFreq      0.243394
		craterDensity   0.86139
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533394
		volcanoTemp     1554.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.161, 0.159, 0.000)
		colorShelf     (0.173, 0.171, 0.169, 0.000)
		colorBeach     (0.183, 0.181, 0.179, 0.000)
		colorDesert    (0.193, 0.191, 0.189, 0.000)
		colorLowland   (0.203, 0.201, 0.199, 0.000)
		colorUpland    (0.213, 0.211, 0.208, 0.000)
		colorRock      (0.223, 0.221, 0.218, 0.000)
		colorSnow      (0.234, 0.231, 0.228, 1.000)
		BumpHeight      1.87471
		BumpOffset      0.374942
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.438726
		GasToDust   0.25
		Particles   1866
		GasBright   0.183716
		DustBright  0.503452
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.80583
		Period          33.522
		Eccentricity    0.957738
		Inclination     -21.898
		AscendingNode   -118.493
		ArgOfPericenter 20.6534
		MeanAnomaly     -70.1692
	}
}

Comet	"C101"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.2536e-008
	Radius          37.6632
	InertiaMoment   0.398641

	Oblateness      0.00258422

	RotationPeriod  93.3714
	Obliquity       319.711
	EqAscendNode    182.181
	Precession      0

	AbsMagn         12.6329
	SlopeParam      5.07005
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.708 0.593 0.506)

	Surface
	{
		SurfStyle       0.994868
		OceanStyle      0.23693
		Randomize      (0.960, -0.039, -0.563)
		colorDistMagn   0.0898414
		colorDistFreq   1.12168
		detailScale     1028.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94851
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.732907
		terraceProb     0.282045
		erosion         0
		montesMagn      0.471942
		montesFreq      2.88479
		montesSpiky     0.960389
		montesFraction  0.553781
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.913
		hillsFraction   0.732687
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255858
		craterFreq      0.222632
		craterDensity   1.00059
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.604184
		volcanoTemp     1744.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.207, 0.202, 0.050)
		colorShelf     (0.283, 0.243, 0.233, 0.040)
		colorBeach     (0.326, 0.279, 0.263, 0.030)
		colorDesert    (0.368, 0.314, 0.298, 0.020)
		colorLowland   (0.411, 0.350, 0.329, 0.030)
		colorUpland    (0.453, 0.385, 0.359, 0.050)
		colorRock      (0.496, 0.421, 0.399, 0.020)
		colorSnow      (0.496, 0.421, 0.399, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.919918
		GasToDust   0.25
		Particles   2838
		GasBright   0.121307
		DustBright  0.250347
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.6272
		Period          53.2514
		Eccentricity    0.969787
		Inclination     148.615
		AscendingNode   -6.73388
		ArgOfPericenter -29.593
		MeanAnomaly     159.951
	}
}

Comet	"C102"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.93901e-016
	Radius          0.12901
	InertiaMoment   0.396503

	Oblateness      0.00363231

	RotationPeriod  89.6185
	Obliquity       272.917
	EqAscendNode    166.759
	Precession      0

	AbsMagn         8.39027
	SlopeParam      5.79865
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.655 0.652 0.647)

	Surface
	{
		SurfStyle       0.251932
		OceanStyle      0.610037
		Randomize      (0.595, 0.494, -0.880)
		colorDistMagn   0.749932
		colorDistFreq   8.50118e-006
		detailScale     3.52284
		colorConversion true
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.27226
		terraceProb     0.142188
		erosion         0
		montesMagn      0.508174
		montesFreq      3.55347
		montesSpiky     0.996897
		montesFraction  0.835514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.71606e-005
		hillsFraction   0.759633
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236447
		craterFreq      0.216062
		craterDensity   0.988987
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441179
		volcanoTemp     1720.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.261, 0.259, 0.000)
		colorShelf     (0.278, 0.277, 0.275, 0.000)
		colorBeach     (0.295, 0.293, 0.291, 0.000)
		colorDesert    (0.311, 0.310, 0.307, 0.000)
		colorLowland   (0.327, 0.326, 0.324, 0.000)
		colorUpland    (0.344, 0.342, 0.340, 0.000)
		colorRock      (0.360, 0.358, 0.356, 0.000)
		colorSnow      (0.377, 0.375, 0.372, 1.000)
		BumpHeight      0.116109
		BumpOffset      0.0232219
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.329994
		DustBright  0.526147
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.7708
		Period          62.0739
		Eccentricity    0.974691
		Inclination     -172.729
		AscendingNode   113.344
		ArgOfPericenter 84.7693
		MeanAnomaly     -177.18
	}
}

Comet	"C103"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            5.36683e-012
	Radius          2.33229
	InertiaMoment   0.399131

	Oblateness      0.00302402

	RotationPeriod  86.2705
	Obliquity       226.123
	EqAscendNode    151.336
	Precession      0

	AbsMagn         4.64939
	SlopeParam      6.91974
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.466 0.462 0.459)

	Surface
	{
		SurfStyle       0.745614
		OceanStyle      0.142841
		Randomize      (-0.233, 0.640, 0.767)
		colorDistMagn   0.664697
		colorDistFreq   5.90804e-005
		detailScale     63.687
		colorConversion true
		snowLevel       2
		tropicLatitude  0.347474
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542369
		terraceProb     0.128021
		erosion         0
		montesMagn      0.426815
		montesFreq      3.70048
		montesSpiky     0.98348
		montesFraction  0.799525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.013444
		hillsFraction   0.81353
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235752
		craterFreq      0.202345
		craterDensity   0.936556
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.572571
		volcanoTemp     1425.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.157, 0.128, 0.000)
		colorShelf     (0.186, 0.162, 0.147, 0.000)
		colorBeach     (0.219, 0.189, 0.174, 0.000)
		colorDesert    (0.237, 0.203, 0.170, 0.000)
		colorLowland   (0.261, 0.217, 0.193, 0.000)
		colorUpland    (0.289, 0.263, 0.234, 0.000)
		colorRock      (0.312, 0.286, 0.252, 0.000)
		colorSnow      (0.340, 0.305, 0.266, 1.000)
		BumpHeight      2.09906
		BumpOffset      0.419812
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.471553
		GasToDust   0.25
		Particles   1932
		GasBright   0.240303
		DustBright  0.300325
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.20157
		Period          18.2349
		Eccentricity    0.951751
		Inclination     44.2806
		AscendingNode   151.308
		ArgOfPericenter -120.596
		MeanAnomaly     11.5094
	}
}

Comet	"C104"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.15085e-008
	Radius          50.415
	InertiaMoment   0.397687

	Oblateness      0.00422054

	RotationPeriod  83.2245
	Obliquity       179.329
	EqAscendNode    135.913
	Precession      0

	AbsMagn         12.2466
	SlopeParam      2.30651
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.718 0.674 0.596)

	Surface
	{
		SurfStyle       0.137496
		OceanStyle      0.250168
		Randomize      (-0.842, -0.560, -0.695)
		colorDistMagn   0.234476
		colorDistFreq   0.964161
		detailScale     1376.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.813356
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405344
		terraceProb     0.449142
		erosion         0
		montesMagn      0.445442
		montesFreq      2.18674
		montesSpiky     0.886862
		montesFraction  0.250331
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.68127
		hillsFraction   0.713951
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280177
		craterFreq      0.205319
		craterDensity   0.723902
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462512
		volcanoTemp     1167.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.270, 0.238, 0.000)
		colorShelf     (0.305, 0.286, 0.253, 0.000)
		colorBeach     (0.323, 0.303, 0.268, 0.000)
		colorDesert    (0.341, 0.320, 0.283, 0.000)
		colorLowland   (0.359, 0.337, 0.298, 0.000)
		colorUpland    (0.377, 0.354, 0.313, 0.000)
		colorRock      (0.395, 0.371, 0.328, 0.000)
		colorSnow      (0.413, 0.387, 0.343, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.952744
		GasToDust   0.25
		Particles   2904
		GasBright   0.000795549
		DustBright  0.224319
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.89046
		Period          34.0686
		Eccentricity    0.9871
		Inclination     -55.0959
		AscendingNode   177.29
		ArgOfPericenter 121.323
		MeanAnomaly     18.4324
	}
}

Comet	"C105"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.27808e-015
	Radius          0.144425
	InertiaMoment   0.399573

	Oblateness      0.00347638

	RotationPeriod  80.4119
	Obliquity       132.534
	EqAscendNode    120.491
	Precession      0

	AbsMagn         8.18108
	SlopeParam      3.01196
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.468 0.466 0.463)

	Surface
	{
		SurfStyle       0.470175
		OceanStyle      0.110754
		Randomize      (0.647, -0.288, 0.588)
		colorDistMagn   0.571489
		colorDistFreq   3.86739e-006
		detailScale     3.94376
		colorConversion true
		snowLevel       2
		tropicLatitude  0.59349
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431583
		terraceProb     0.331488
		erosion         0
		montesMagn      0.547354
		montesFreq      2.5278
		montesSpiky     0.965649
		montesFraction  0.377349
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.54239e-005
		hillsFraction   0.608584
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21373
		craterFreq      0.222295
		craterDensity   0.916657
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502499
		volcanoTemp     1848.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.187, 0.185, 0.000)
		colorShelf     (0.199, 0.198, 0.197, 0.000)
		colorBeach     (0.211, 0.210, 0.208, 0.000)
		colorDesert    (0.222, 0.221, 0.220, 0.000)
		colorLowland   (0.234, 0.233, 0.232, 0.000)
		colorUpland    (0.246, 0.245, 0.243, 0.000)
		colorRock      (0.258, 0.256, 0.255, 0.000)
		colorSnow      (0.269, 0.268, 0.266, 1.000)
		BumpHeight      0.129982
		BumpOffset      0.0259965
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0231865
		GasToDust   0.25
		Particles   1026
		GasBright   0.0444063
		DustBright  0.665194
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.2902
		Period          30.2559
		Eccentricity    0.961725
		Inclination     -60.7907
		AscendingNode   137.598
		ArgOfPericenter -114.456
		MeanAnomaly     -169.418
	}
}

Comet	"C106"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            9.88502e-012
	Radius          3.12246
	InertiaMoment   0.398368

	Oblateness      0.00483244

	RotationPeriod  77.7844
	Obliquity       85.7399
	EqAscendNode    105.068
	Precession      0

	AbsMagn         4.34318
	SlopeParam      3.61013
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.796 0.792 0.791)

	Surface
	{
		SurfStyle       0.820372
		OceanStyle      0.663876
		Randomize      (0.666, 0.856, 0.742)
		colorDistMagn   0.0683085
		colorDistFreq   0.00327436
		detailScale     85.264
		colorConversion true
		snowLevel       2
		tropicLatitude  0.693582
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633921
		terraceProb     0.156153
		erosion         0
		montesMagn      0.437299
		montesFreq      2.20597
		montesSpiky     0.833677
		montesFraction  0.126514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0159353
		hillsFraction   0.781379
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249276
		craterFreq      0.232057
		craterDensity   0.996685
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523629
		volcanoTemp     1356.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.269, 0.221, 0.000)
		colorShelf     (0.318, 0.277, 0.253, 0.000)
		colorBeach     (0.374, 0.325, 0.300, 0.000)
		colorDesert    (0.406, 0.349, 0.293, 0.000)
		colorLowland   (0.446, 0.372, 0.332, 0.000)
		colorUpland    (0.493, 0.452, 0.403, 0.000)
		colorRock      (0.533, 0.491, 0.435, 0.000)
		colorSnow      (0.581, 0.523, 0.459, 1.000)
		BumpHeight      2.81022
		BumpOffset      0.562043
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.504378
		GasToDust   0.25
		Particles   1998
		GasBright   0.0479307
		DustBright  0.346157
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.6541
		Period          46.1072
		Eccentricity    0.987984
		Inclination     -116.1
		AscendingNode   -32.7659
		ArgOfPericenter 31.618
		MeanAnomaly     -136.755
	}
}

Comet	"C107"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.64535e-008
	Radius          56.4279
	InertiaMoment   0.399995

	Oblateness      0.00395826

	RotationPeriod  75.3068
	Obliquity       38.9456
	EqAscendNode    89.6457
	Precession      0

	AbsMagn         11.8964
	SlopeParam      4.17468
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.552 0.548 0.541)

	Surface
	{
		SurfStyle       0.871484
		OceanStyle      0.85582
		Randomize      (-0.778, 0.496, 0.612)
		colorDistMagn   0.48409
		colorDistFreq   2.48543
		detailScale     1540.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98169
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483946
		terraceProb     0.294305
		erosion         0
		montesMagn      0.285504
		montesFreq      3.04639
		montesSpiky     0.894614
		montesFraction  0.681706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.7769
		hillsFraction   0.545554
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235464
		craterFreq      0.23977
		craterDensity   0.89722
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501523
		volcanoTemp     1546.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.192, 0.216, 0.050)
		colorShelf     (0.221, 0.225, 0.249, 0.040)
		colorBeach     (0.254, 0.257, 0.281, 0.030)
		colorDesert    (0.287, 0.290, 0.319, 0.020)
		colorLowland   (0.320, 0.323, 0.352, 0.030)
		colorUpland    (0.353, 0.356, 0.384, 0.050)
		colorRock      (0.386, 0.389, 0.428, 0.020)
		colorSnow      (0.386, 0.389, 0.428, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.98557
		GasToDust   0.25
		Particles   2970
		GasBright   0.158732
		DustBright  0.719842
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.31231
		Period          36.8369
		Eccentricity    0.970428
		Inclination     64.3424
		AscendingNode   -75.0394
		ArgOfPericenter 33.1816
		MeanAnomaly     142.812
	}
}

Comet	"C108"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.35406e-015
	Radius          0.193391
	InertiaMoment   0.398897

	Oblateness      0.00549182

	RotationPeriod  72.9522
	Obliquity       352.151
	EqAscendNode    74.2231
	Precession      0

	AbsMagn         7.97238
	SlopeParam      4.7538
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.711 0.709 0.707)

	Surface
	{
		SurfStyle       0.308687
		OceanStyle      0.658635
		Randomize      (0.924, -0.865, 0.658)
		colorDistMagn   0.57369
		colorDistFreq   5.10605e-006
		detailScale     5.28087
		colorConversion true
		snowLevel       2
		tropicLatitude  0.734871
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.351757
		terraceProb     0.18737
		erosion         0
		montesMagn      0.449486
		montesFreq      2.99842
		montesSpiky     0.974408
		montesFraction  0.691211
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000104973
		hillsFraction   0.644
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25026
		craterFreq      0.267407
		craterDensity   0.987877
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454894
		volcanoTemp     1621.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.283, 0.283, 0.000)
		colorShelf     (0.302, 0.301, 0.300, 0.000)
		colorBeach     (0.320, 0.319, 0.318, 0.000)
		colorDesert    (0.338, 0.337, 0.336, 0.000)
		colorLowland   (0.356, 0.354, 0.353, 0.000)
		colorUpland    (0.373, 0.372, 0.371, 0.000)
		colorRock      (0.391, 0.390, 0.389, 0.000)
		colorSnow      (0.409, 0.407, 0.406, 1.000)
		BumpHeight      0.174052
		BumpOffset      0.0348104
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0560123
		GasToDust   0.25
		Particles   1092
		GasBright   0.134974
		DustBright  0.428086
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.29738
		Period          43.5754
		Eccentricity    0.992784
		Inclination     -125.095
		AscendingNode   -13.4791
		ArgOfPericenter 23.6275
		MeanAnomaly     159.326
	}
}

Comet	"C109"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.82069e-011
	Radius          3.49413
	InertiaMoment   0.397223

	Oblateness      0.00443115

	RotationPeriod  70.6999
	Obliquity       305.357
	EqAscendNode    58.8005
	Precession      0

	AbsMagn         4.01388
	SlopeParam      5.40587
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.616 0.432 0.343)

	Surface
	{
		SurfStyle       0.715287
		OceanStyle      0.799746
		Randomize      (-0.489, 0.896, 0.316)
		colorDistMagn   0.736214
		colorDistFreq   0.00444937
		detailScale     95.4131
		colorConversion true
		snowLevel       2
		tropicLatitude  0.798932
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571442
		terraceProb     0.337577
		erosion         0
		montesMagn      0.438991
		montesFreq      2.39135
		montesSpiky     0.911567
		montesFraction  0.73824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0323922
		hillsFraction   0.725447
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237387
		craterFreq      0.218481
		craterDensity   0.779233
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48989
		volcanoTemp     1648.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.147, 0.096, 0.000)
		colorShelf     (0.246, 0.151, 0.110, 0.000)
		colorBeach     (0.290, 0.177, 0.130, 0.000)
		colorDesert    (0.314, 0.190, 0.127, 0.000)
		colorLowland   (0.345, 0.203, 0.144, 0.000)
		colorUpland    (0.382, 0.246, 0.175, 0.000)
		colorRock      (0.413, 0.268, 0.189, 0.000)
		colorSnow      (0.450, 0.285, 0.199, 1.000)
		BumpHeight      3.14472
		BumpOffset      0.628944
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.537204
		GasToDust   0.25
		Particles   2065
		GasBright   0.0739572
		DustBright  0.17359
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.31232
		Period          43.6805
		Eccentricity    0.964719
		Inclination     -14.2492
		AscendingNode   101.655
		ArgOfPericenter -148.959
		MeanAnomaly     -20.6298
	}
}

Comet	"C110"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.40818e-007
	Radius          75.5751
	InertiaMoment   0.399359

	Oblateness      0.00621912

	RotationPeriod  68.5331
	Obliquity       258.563
	EqAscendNode    43.3779
	Precession      0

	AbsMagn         11.5737
	SlopeParam      6.26254
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.764 0.763 0.761)

	Surface
	{
		SurfStyle       0.630153
		OceanStyle      0.175318
		Randomize      (0.836, 0.110, -0.545)
		colorDistMagn   0.572313
		colorDistFreq   2.26185
		detailScale     2063.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999854
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709195
		terraceProb     0.215917
		erosion         0
		montesMagn      0.55307
		montesFreq      2.94081
		montesSpiky     0.942387
		montesFraction  0.32421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.2025
		hillsFraction   0.538954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252449
		craterFreq      0.272099
		craterDensity   0.811164
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46429
		volcanoTemp     1397.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.213, 0.000)
		colorShelf     (0.306, 0.267, 0.243, 0.000)
		colorBeach     (0.359, 0.313, 0.289, 0.000)
		colorDesert    (0.390, 0.336, 0.281, 0.000)
		colorLowland   (0.428, 0.358, 0.319, 0.000)
		colorUpland    (0.474, 0.435, 0.388, 0.000)
		colorRock      (0.512, 0.473, 0.418, 0.000)
		colorSnow      (0.558, 0.503, 0.441, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.261926
		DustBright  0.470108
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.71302
		Period          20.9894
		Eccentricity    0.973902
		Inclination     -165.801
		AscendingNode   -29.471
		ArgOfPericenter -14.4852
		MeanAnomaly     59.939
	}
}

Comet	"C111"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.33588e-015
	Radius          0.21636
	InertiaMoment   0.39806

	Oblateness      0.00501825

	RotationPeriod  66.4384
	Obliquity       211.768
	EqAscendNode    27.9553
	Precession      0

	AbsMagn         7.76361
	SlopeParam      8.24517
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.451 0.449 0.447)

	Surface
	{
		SurfStyle       0.81016
		OceanStyle      0.731966
		Randomize      (-0.825, -0.321, 0.879)
		colorDistMagn   0.738433
		colorDistFreq   2.87333e-005
		detailScale     5.90807
		colorConversion true
		snowLevel       2
		tropicLatitude  0.63285
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50446
		terraceProb     0.308635
		erosion         0
		montesMagn      0.391586
		montesFreq      2.66636
		montesSpiky     0.983428
		montesFraction  0.336657
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.45679e-005
		hillsFraction   0.591203
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262258
		craterFreq      0.247245
		craterDensity   0.855682
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51989
		volcanoTemp     1668.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.153, 0.125, 0.000)
		colorShelf     (0.180, 0.157, 0.143, 0.000)
		colorBeach     (0.212, 0.184, 0.170, 0.000)
		colorDesert    (0.230, 0.197, 0.165, 0.000)
		colorLowland   (0.253, 0.211, 0.188, 0.000)
		colorUpland    (0.280, 0.256, 0.228, 0.000)
		colorRock      (0.302, 0.278, 0.246, 0.000)
		colorSnow      (0.329, 0.296, 0.259, 1.000)
		BumpHeight      0.194724
		BumpOffset      0.0389448
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0888383
		GasToDust   0.25
		Particles   1159
		GasBright   0.173627
		DustBright  0.242893
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.3805
		Period          51.4076
		Eccentricity    0.973385
		Inclination     8.7754
		AscendingNode   -34.8001
		ArgOfPericenter -148.023
		MeanAnomaly     173.91
	}
}

Comet	"C112"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.35349e-011
	Radius          4.68082
	InertiaMoment   0.399788

	Oblateness      0.00703705

	RotationPeriod  64.4043
	Obliquity       164.974
	EqAscendNode    12.5327
	Precession      0

	AbsMagn         3.65507
	SlopeParam      2.67508
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.515 0.506 0.502)

	Surface
	{
		SurfStyle       0.77552
		OceanStyle      0.118514
		Randomize      (0.886, -0.918, 0.643)
		colorDistMagn   0.187291
		colorDistFreq   0.0184163
		detailScale     127.818
		colorConversion true
		snowLevel       2
		tropicLatitude  0.920458
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584785
		terraceProb     0.183834
		erosion         0
		montesMagn      0.638561
		montesFreq      4.11738
		montesSpiky     0.971823
		montesFraction  0.555841
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0419739
		hillsFraction   0.736363
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260263
		craterFreq      0.272088
		craterDensity   0.943639
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483551
		volcanoTemp     1421.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.172, 0.141, 0.000)
		colorShelf     (0.206, 0.177, 0.161, 0.000)
		colorBeach     (0.242, 0.208, 0.191, 0.000)
		colorDesert    (0.262, 0.223, 0.186, 0.000)
		colorLowland   (0.288, 0.238, 0.211, 0.000)
		colorUpland    (0.319, 0.289, 0.256, 0.000)
		colorRock      (0.345, 0.314, 0.276, 0.000)
		colorSnow      (0.376, 0.334, 0.291, 1.000)
		BumpHeight      4.21274
		BumpOffset      0.842548
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.57003
		GasToDust   0.25
		Particles   2131
		GasBright   0.428786
		DustBright  0.472221
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.1865
		Period          18.1556
		Eccentricity    0.959802
		Inclination     104.093
		AscendingNode   -128.251
		ArgOfPericenter 51.6459
		MeanAnomaly     107.742
	}
}

Comet	"C113"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.59368e-007
	Radius          84.5293
	InertiaMoment   0.398648

	Oblateness      0.00567981

	RotationPeriod  62.4212
	Obliquity       118.18
	EqAscendNode    357.11
	Precession      0

	AbsMagn         11.2728
	SlopeParam      3.31461
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.628 0.626)

	Surface
	{
		SurfStyle       0.0329565
		OceanStyle      0.20977
		Randomize      (0.804, -0.534, -0.308)
		colorDistMagn   0.157645
		colorDistFreq   3.89015
		detailScale     2308.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0.846909
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504126
		terraceProb     0.11928
		erosion         0
		montesMagn      0.483066
		montesFreq      1.5442
		montesSpiky     0.946092
		montesFraction  0.383754
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.7783
		hillsFraction   0.545758
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253555
		craterFreq      0.223467
		craterDensity   0.928395
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483466
		volcanoTemp     1333.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.251, 0.250, 0.000)
		colorShelf     (0.268, 0.267, 0.266, 0.000)
		colorBeach     (0.284, 0.282, 0.282, 0.000)
		colorDesert    (0.300, 0.298, 0.297, 0.000)
		colorLowland   (0.315, 0.314, 0.313, 0.000)
		colorUpland    (0.331, 0.329, 0.328, 0.000)
		colorRock      (0.347, 0.345, 0.344, 0.000)
		colorSnow      (0.363, 0.361, 0.360, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0204579
		DustBright  0.565035
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.2264
		Period          65.7126
		Eccentricity    0.98681
		Inclination     -5.33208
		AscendingNode   138.701
		ArgOfPericenter -94.7541
		MeanAnomaly     -157.977
	}
}

Comet	"C114"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            7.98613e-015
	Radius          0.289913
	InertiaMoment   0.396527

	Oblateness      0.00786444

	RotationPeriod  60.4811
	Obliquity       71.3855
	EqAscendNode    341.688
	Precession      0

	AbsMagn         7.55419
	SlopeParam      3.88961
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.771 0.725 0.699)

	Surface
	{
		SurfStyle       0.0279729
		OceanStyle      0.883762
		Randomize      (0.884, 0.166, -0.229)
		colorDistMagn   0.889013
		colorDistFreq   5.57447e-005
		detailScale     7.91656
		colorConversion true
		snowLevel       2
		tropicLatitude  0.701736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.33184
		terraceProb     0.189545
		erosion         0
		montesMagn      0.371934
		montesFreq      4.04502
		montesSpiky     0.946501
		montesFraction  0.612918
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000206561
		hillsFraction   0.475592
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234127
		craterFreq      0.275397
		craterDensity   0.806542
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443171
		volcanoTemp     1470.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.290, 0.280, 0.000)
		colorShelf     (0.328, 0.308, 0.297, 0.000)
		colorBeach     (0.347, 0.326, 0.315, 0.000)
		colorDesert    (0.366, 0.344, 0.332, 0.000)
		colorLowland   (0.386, 0.363, 0.350, 0.000)
		colorUpland    (0.405, 0.381, 0.367, 0.000)
		colorRock      (0.424, 0.399, 0.385, 0.000)
		colorSnow      (0.444, 0.417, 0.402, 1.000)
		BumpHeight      0.260922
		BumpOffset      0.0521843
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.121664
		GasToDust   0.25
		Particles   1225
		GasBright   0.0253745
		DustBright  0.244605
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.61313
		Period          45.814
		Eccentricity    0.986744
		Inclination     -34.185
		AscendingNode   -32.6393
		ArgOfPericenter -158.894
		MeanAnomaly     -104.504
	}
}

Comet	"C115"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            6.17671e-011
	Radius          5.23394
	InertiaMoment   0.399137

	Oblateness      0.00644128

	RotationPeriod  58.5765
	Obliquity       24.5912
	EqAscendNode    326.265
	Precession      0

	AbsMagn         3.25739
	SlopeParam      4.45544
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.741 0.739 0.736)

	Surface
	{
		SurfStyle       0.352439
		OceanStyle      0.520774
		Randomize      (0.403, 0.645, 0.357)
		colorDistMagn   0.34345
		colorDistFreq   0.0137341
		detailScale     142.922
		colorConversion true
		snowLevel       2
		tropicLatitude  0.914254
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448281
		terraceProb     0.190119
		erosion         0
		montesMagn      0.290363
		montesFreq      2.80151
		montesSpiky     0.975642
		montesFraction  0.594286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0666412
		hillsFraction   0.464393
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237867
		craterFreq      0.186663
		craterDensity   0.922958
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497124
		volcanoTemp     1726.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.296, 0.294, 0.000)
		colorShelf     (0.315, 0.314, 0.313, 0.000)
		colorBeach     (0.334, 0.333, 0.331, 0.000)
		colorDesert    (0.352, 0.351, 0.350, 0.000)
		colorLowland   (0.371, 0.370, 0.368, 0.000)
		colorUpland    (0.389, 0.388, 0.386, 0.000)
		colorRock      (0.408, 0.407, 0.405, 0.000)
		colorSnow      (0.426, 0.425, 0.423, 1.000)
		BumpHeight      4.71055
		BumpOffset      0.94211
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.602856
		GasToDust   0.25
		Particles   2197
		GasBright   0.115457
		DustBright  0.639009
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.49108
		Period          38.0317
		Eccentricity    0.961333
		Inclination     -90.2688
		AscendingNode   -10.3172
		ArgOfPericenter -118.733
		MeanAnomaly     83.188
	}
}

Comet	"C116"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            4.77725e-007
	Radius          113.296
	InertiaMoment   0.397697

	Oblateness      0.00896667

	RotationPeriod  56.7012
	Obliquity       337.797
	EqAscendNode    310.842
	Precession      0

	AbsMagn         10.9894
	SlopeParam      5.06116
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.446 0.442 0.433)

	Surface
	{
		SurfStyle       0.84948
		OceanStyle      0.492459
		Randomize      (0.618, 0.206, -0.766)
		colorDistMagn   0.251839
		colorDistFreq   9.8115
		detailScale     3093.75
		colorConversion true
		snowLevel       2
		tropicLatitude  0.75216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496909
		terraceProb     0.130082
		erosion         0
		montesMagn      0.458333
		montesFreq      2.31928
		montesSpiky     0.898885
		montesFraction  0.370746
		dunesFraction   0
		hillsMagn       0
		hillsFreq       41.6527
		hillsFraction   0.745737
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268833
		craterFreq      0.501324
		craterDensity   0.827181
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461747
		volcanoTemp     1486.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.150, 0.121, 0.000)
		colorShelf     (0.178, 0.155, 0.139, 0.000)
		colorBeach     (0.210, 0.181, 0.165, 0.000)
		colorDesert    (0.227, 0.194, 0.160, 0.000)
		colorLowland   (0.250, 0.208, 0.182, 0.000)
		colorUpland    (0.277, 0.252, 0.221, 0.000)
		colorRock      (0.299, 0.274, 0.238, 0.000)
		colorSnow      (0.326, 0.291, 0.251, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0930919
		DustBright  0.345861
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.53146
		Period          25.6576
		Eccentricity    0.950194
		Inclination     44.9032
		AscendingNode   89.3128
		ArgOfPericenter -31.2835
		MeanAnomaly     69.2627
	}
}

Comet	"C117"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.47095e-014
	Radius          0.324072
	InertiaMoment   0.399578

	Oblateness      0.00733496

	RotationPeriod  54.8491
	Obliquity       291.003
	EqAscendNode    295.42
	Precession      0

	AbsMagn         7.34354
	SlopeParam      5.78712
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.496 0.488 0.484)

	Surface
	{
		SurfStyle       0.906389
		OceanStyle      0.864084
		Randomize      (0.956, -0.655, -0.570)
		colorDistMagn   0.745081
		colorDistFreq   2.81487e-005
		detailScale     8.84933
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998383
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485644
		terraceProb     0.178533
		erosion         0
		montesMagn      0.46663
		montesFreq      3.56469
		montesSpiky     0.826541
		montesFraction  0.829234
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000296353
		hillsFraction   0.823904
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224225
		craterFreq      0.24069
		craterDensity   0.808351
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486223
		volcanoTemp     1461.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.171, 0.194, 0.050)
		colorShelf     (0.198, 0.200, 0.223, 0.040)
		colorBeach     (0.228, 0.229, 0.252, 0.030)
		colorDesert    (0.258, 0.259, 0.285, 0.020)
		colorLowland   (0.288, 0.288, 0.314, 0.030)
		colorUpland    (0.318, 0.317, 0.343, 0.050)
		colorRock      (0.347, 0.346, 0.382, 0.020)
		colorSnow      (0.347, 0.346, 0.382, 1.000)
		BumpHeight      0.291665
		BumpOffset      0.058333
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.15449
		GasToDust   0.25
		Particles   1291
		GasBright   0.250365
		DustBright  0.673075
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.8505
		Period          47.5213
		Eccentricity    0.980861
		Inclination     -53.0401
		AscendingNode   -68.5878
		ArgOfPericenter 48.8899
		MeanAnomaly     145.227
	}
}

Comet	"C118"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            1.13767e-010
	Radius          7.01722
	InertiaMoment   0.398375

	Oblateness      0.0102596

	RotationPeriod  53.015
	Obliquity       244.208
	EqAscendNode    279.997
	Precession      0

	AbsMagn         2.80631
	SlopeParam      6.89752
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.830 0.787 0.757)

	Surface
	{
		SurfStyle       0.984392
		OceanStyle      0.105576
		Randomize      (-0.002, -0.247, 0.613)
		colorDistMagn   0.291173
		colorDistFreq   0.0215627
		detailScale     191.617
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999364
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585548
		terraceProb     0.138075
		erosion         0
		montesMagn      0.645592
		montesFreq      3.06602
		montesSpiky     0.844197
		montesFraction  0.402466
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.120749
		hillsFraction   0.515772
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228779
		craterFreq      0.254396
		craterDensity   0.896814
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496121
		volcanoTemp     1545.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.276, 0.303, 0.050)
		colorShelf     (0.332, 0.323, 0.348, 0.040)
		colorBeach     (0.382, 0.370, 0.394, 0.030)
		colorDesert    (0.432, 0.417, 0.446, 0.020)
		colorLowland   (0.481, 0.465, 0.492, 0.030)
		colorUpland    (0.531, 0.512, 0.537, 0.050)
		colorRock      (0.581, 0.559, 0.598, 0.020)
		colorSnow      (0.581, 0.559, 0.598, 1.000)
		BumpHeight      6.3155
		BumpOffset      1.2631
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.635682
		GasToDust   0.25
		Particles   2264
		GasBright   0.200718
		DustBright  0.407209
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.82874
		Period          40.3226
		Eccentricity    0.966675
		Inclination     -30.9057
		AscendingNode   136.9
		ArgOfPericenter 68.5471
		MeanAnomaly     34.1112
	}
}

Comet	"C119"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            3.50298e-018
	Radius          0.0200653
	InertiaMoment   0.391146

	Oblateness      0.00813094

	RotationPeriod  51.1939
	Obliquity       197.414
	EqAscendNode    264.575
	Precession      0

	AbsMagn         10.7202
	SlopeParam      2.29544
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.494 0.490 0.484)

	Surface
	{
		SurfStyle       0.579101
		OceanStyle      0.997365
		Randomize      (-0.981, -0.121, -0.490)
		colorDistMagn   0.595756
		colorDistFreq   2.75675e-007
		detailScale     0.547916
		colorConversion true
		snowLevel       2
		tropicLatitude  0.823345
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.753253
		terraceProb     0.424306
		erosion         0
		montesMagn      0.490956
		montesFreq      3.19927
		montesSpiky     0.99264
		montesFraction  0.592218
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12002e-006
		hillsFraction   0.413847
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22063
		craterFreq      0.145128
		craterDensity   0.851515
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511918
		volcanoTemp     1721.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.167, 0.135, 0.000)
		colorShelf     (0.198, 0.171, 0.155, 0.000)
		colorBeach     (0.232, 0.201, 0.184, 0.000)
		colorDesert    (0.252, 0.216, 0.179, 0.000)
		colorLowland   (0.277, 0.230, 0.203, 0.000)
		colorUpland    (0.306, 0.279, 0.247, 0.000)
		colorRock      (0.331, 0.304, 0.266, 0.000)
		colorSnow      (0.361, 0.323, 0.280, 1.000)
		BumpHeight      0.0180587
		BumpOffset      0.00361175
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.113811
		DustBright  0.178602
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.43659
		Period          37.6661
		Eccentricity    0.981661
		Inclination     -139.819
		AscendingNode   -33.2698
		ArgOfPericenter 145.161
		MeanAnomaly     91.2562
	}
}

Comet	"C120"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.7093e-014
	Radius          0.434627
	InertiaMoment   0.398903

	Oblateness      0.0118218

	RotationPeriod  49.3809
	Obliquity       150.62
	EqAscendNode    249.152
	Precession      0

	AbsMagn         7.13106
	SlopeParam      3.00323
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.820 0.756 0.687)

	Surface
	{
		SurfStyle       0.937621
		OceanStyle      0.6492
		Randomize      (-0.834, -0.803, 0.042)
		colorDistMagn   0.664164
		colorDistFreq   9.90532e-005
		detailScale     11.8682
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999818
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.321555
		terraceProb     0.11872
		erosion         0
		montesMagn      0.484607
		montesFreq      2.21853
		montesSpiky     0.939075
		montesFraction  0.223422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000365255
		hillsFraction   0.56751
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247839
		craterFreq      0.141566
		craterDensity   0.857773
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475133
		volcanoTemp     1666.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.265, 0.275, 0.050)
		colorShelf     (0.328, 0.310, 0.316, 0.040)
		colorBeach     (0.377, 0.355, 0.357, 0.030)
		colorDesert    (0.426, 0.401, 0.405, 0.020)
		colorLowland   (0.475, 0.446, 0.447, 0.030)
		colorUpland    (0.524, 0.492, 0.488, 0.050)
		colorRock      (0.574, 0.537, 0.543, 0.020)
		colorSnow      (0.574, 0.537, 0.543, 1.000)
		BumpHeight      0.391164
		BumpOffset      0.0782329
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.187316
		GasToDust   0.25
		Particles   1358
		GasBright   0.348251
		DustBright  0.428648
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.92383
		Period          22.1618
		Eccentricity    0.960005
		Inclination     -81.284
		AscendingNode   71.84
		ArgOfPericenter 169.935
		MeanAnomaly     2.3202
	}
}

Comet	"C121"
{
	ParentBody     "HIP 23518"
	Class	       "Asteroid"

	Mass            2.09545e-010
	Radius          7.83859
	InertiaMoment   0.397236

	Oblateness      0.00960153

	RotationPeriod  47.5714
	Obliquity       103.825
	EqAscendNode    233.729
	Precession      0

	AbsMagn         2.27733
	SlopeParam      3.60226
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.726 0.725)

	Surface
	{
		SurfStyle       0.269325
		OceanStyle      0.758129
		Randomize      (-0.830, -0.967, -0.949)
		colorDistMagn   0.715866
		colorDistFreq   0.028409
		detailScale     214.046
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382468
		terraceProb     0.381286
		erosion         0
		montesMagn      0.499364
		montesFreq      2.82533
		montesSpiky     0.920841
		montesFraction  0.450529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.154801
		hillsFraction   0.669933
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214607
		craterFreq      0.199697
		craterDensity   0.901779
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.602683
		volcanoTemp     1215.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.290, 0.000)
		colorShelf     (0.311, 0.309, 0.308, 0.000)
		colorBeach     (0.329, 0.327, 0.326, 0.000)
		colorDesert    (0.347, 0.345, 0.344, 0.000)
		colorLowland   (0.365, 0.363, 0.362, 0.000)
		colorUpland    (0.384, 0.381, 0.380, 0.000)
		colorRock      (0.402, 0.400, 0.398, 0.000)
		colorSnow      (0.420, 0.418, 0.417, 1.000)
		BumpHeight      7.05473
		BumpOffset      1.41095
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.668508
		GasToDust   0.25
		Particles   2330
		GasBright   0.00336965
		DustBright  0.458016
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.3274
		Period          58.5999
		Eccentricity    0.975699
		Inclination     30.6962
		AscendingNode   -125.622
		ArgOfPericenter -2.414
		MeanAnomaly     -110.858
	}
}

