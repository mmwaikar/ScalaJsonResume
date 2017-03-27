package org.jsonresume

import java.time.LocalDate

/**
  * Created by mmwaikar on 27-03-17.
  */
case class Education(institution: String, area: String, studyType: String, startDate: LocalDate, endDate: LocalDate,
                     gpa: Float, courses: Seq[String])
