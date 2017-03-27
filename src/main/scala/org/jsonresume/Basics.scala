package org.jsonresume

/**
  * Created by mmwaikar on 27-03-17.
  */
case class Basics(name: String, label: String, picture: String, email: String, phone: String, website: String,
                  summary: String, location: Location, profiles: Seq[Profile])
